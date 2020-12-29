package mx.com.uteach.uteach;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MisClases extends AppCompatActivity implements Adapter.OnClassListener{


    private static final String URL_clases="http://www.uteach.com.mx/public/img/clases/clases.php";

    List<Clases> clasesList;
    RecyclerView recyclerView;
    int idglobal = 0;
    RequestQueue rq;
    JsonRequest jrq;
    DatosClase x = new DatosClase();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_clases);

        recyclerView=(RecyclerView)findViewById(R.id.recyclerClases);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        clasesList= new ArrayList<>();


        loadclases();

    }
    private void loadclases(){



    StringRequest stringRequest = new StringRequest(Request.Method.GET, URL_clases, new Response.Listener<String>() {
        @Override
        public void onResponse(String response) {
            try {
                Clases clases = new Clases();

                JSONArray array = new JSONArray(response);
                for (int i = 0; i < array.length(); i++) {
                    JSONObject clase = array.getJSONObject(i);
                    clasesList.add(new Clases(
                            idglobal= clase.getInt("id"),
                            clase.getString("nombre"),
                            clase.getString("precio"),
                            clase.getString("imagen")


                    ));

                }

                Adapter adapter = new Adapter(MisClases.this, clasesList,MisClases.this);
                recyclerView.setAdapter(adapter);

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    },
            new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            });

    Volley.newRequestQueue(this).add(stringRequest);
}

    @Override
    public void onClassClick(int position) {
         int otherid = clasesList.get(position).getId();
        String URL="http://www.uteach.com.mx/datosclase.php?id="+otherid;

        ObtenerClase("http://www.uteach.com.mx/datosclase.php?id="+otherid);
        Intent intent = new Intent(MisClases.this,PerfilClase.class);
        startActivity(intent);


    }

    private void ObtenerClase(String URL){
        final JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                JSONObject jsonObject = null;

                try {
                    jsonObject = response.getJSONObject(0);
                    x.setId(jsonObject.getInt("id"));
                    x.setNombre(jsonObject.getString("nombre"));
                    x.setDescripcion(jsonObject.getString("descripcion"));
                    x.setCantidad(jsonObject.getString("cantidad_alumno"));
                    x.setObjetivo(jsonObject.getString("objetivo"));
                    x.setImagen(jsonObject.getString("imagen"));
                    x.setTipo(jsonObject.getString("tipo"));
                    x.setPrecio(jsonObject.getString("precio"));

                } catch (JSONException e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();
            }
        });

        rq=Volley.newRequestQueue(this);
        rq.add(jsonArrayRequest);
    }
}
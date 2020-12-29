package mx.com.uteach.uteach;

import android.app.DownloadManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PerfilUser extends AppCompatActivity {

    RequestQueue rq;
    JsonRequest jrq;

    TextView pu_nombre,pu_apellido,pu_edad,pu_sexo;
    ImageView pu_imagen;
    Button regresar,prueba;

    private static final String url_img="http://www.uteach.com.mx/public/img/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_user);

        pu_nombre=(TextView)findViewById(R.id.pu_nombre);
        pu_apellido=(TextView)findViewById(R.id.pu_apellidos);
        pu_edad=(TextView)findViewById(R.id.pu_edad);
        pu_sexo=(TextView)findViewById(R.id.pu_sexo);
        pu_imagen=(ImageView)findViewById(R.id.pu_imagen);
        regresar=(Button)findViewById(R.id.regresar);


        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perfil("http://www.uteach.com.mx/perfil.php?id="+Constants.getId_usuario()+"");

            }
        });
        perfil("http://www.uteach.com.mx/perfil.php?id="+Constants.getId_usuario()+"");


    }


        private void perfil(String URL){

            final JsonArrayRequest jsonArrayRequest=new JsonArrayRequest(URL, new Response.Listener<JSONArray>() {
                @Override
                public void onResponse(JSONArray response) {
                    User x = new User();
                    JSONObject jsonObject = null;


                        try {
                            jsonObject = response.getJSONObject(0);
                                x.setNombre(jsonObject.getString("nombre"));
                                pu_nombre.setText(jsonObject.getString("nombre"));
                                pu_apellido.setText(jsonObject.getString("apellidos"));
                                pu_edad.setText(jsonObject.getString("edad"));
                                pu_sexo.setText(jsonObject.getString("sexo"));

                                String imgname= jsonObject.getString("imagen");
                            Glide.with(getApplicationContext())
                                    .load(url_img+imgname)
                                    .into(pu_imagen);




                        } catch (JSONException e) {
                            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                        }

                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();

                }
            }
            );
            rq=Volley.newRequestQueue(this);
            rq.add(jsonArrayRequest);
        }

}

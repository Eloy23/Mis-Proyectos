package mx.com.uteach.uteach;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class SessionFragment extends Fragment implements Response.Listener<JSONObject>, Response.ErrorListener{

    RequestQueue rq;
    JsonRequest jrq;

    EditText cajaUser, cajaPass;
    Button btnSesion;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                         Bundle savedInstanceState) {
       //return inflater.inflate(R.layout.fragment_session,container,false);
        View vista = inflater.inflate(R.layout.fragment_session,container,false);
       cajaUser=(EditText) vista.findViewById(R.id.txtUser);
       cajaPass=(EditText) vista.findViewById(R.id.txtPass);
       btnSesion=(Button) vista.findViewById(R.id.btn_sesion);
         rq = Volley.newRequestQueue(getContext());

       btnSesion.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               iniciarSession();
           }
       });

       return vista;
    }


    @Override
    public void onErrorResponse(VolleyError error) {
        Toast.makeText(getContext(), "No se ha encontrado el usuario ",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onResponse(JSONObject response) {
        User usuario = new User();
        Toast.makeText(getContext(), "Se ha encontrado el usuario " +cajaUser.getText().toString(),Toast.LENGTH_LONG).show();

        JSONArray jsonArray = response.optJSONArray("datos");
        JSONObject jsonObject = null ;

        try {
            jsonObject = jsonArray.getJSONObject(0);
            usuario.setId(jsonObject.optInt("id"));
            usuario.setUser(jsonObject.optString("email"));
            usuario.setPass(jsonObject.optString("password"));
            usuario.setNombre(jsonObject.optString("nombre"));
        }catch (JSONException e){
            e.printStackTrace();
        }
        Intent intencion = new Intent(getContext(),MainActivity.class);

        intencion.putExtra("id",Constants.getId_usuario());
        startActivity(intencion);
        Constants.setId_usuario(usuario.getId());

    }

    private void iniciarSession(){
        //https://asesorias2311.000webhostapp.com
        String url="http://www.uteach.com.mx/sesion.php?email="+cajaUser.getText().toString()+
                     "&password="+cajaPass.getText().toString();

       // String url="http://192.168.0.12/login/sesion.php?email="+cajaUser.getText().toString()+
         //       "pass="+cajaPass.getText().toString();

        jrq = new JsonObjectRequest(Request.Method.GET,url,null,this,this);
        rq.add(jrq);
    }
}

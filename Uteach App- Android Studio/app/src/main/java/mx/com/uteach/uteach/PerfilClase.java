package mx.com.uteach.uteach;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonRequest;
import com.bumptech.glide.Glide;

import java.net.URI;

public class PerfilClase extends AppCompatActivity {


    RequestQueue rq;
    JsonRequest jrq;


    TextView txtClaseNo,txtDescrip,txtPrecio,txtCantidad, txtObjetivo,txtTipo;
    Button btnContratar;
    ImageView imgPerClass;

    private static final String url_img="http://www.uteach.com.mx/public/img/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_clase);

        txtClaseNo=(TextView)findViewById(R.id.txtClaseNo);
        txtDescrip=(TextView)findViewById(R.id.txtDescrip);
        txtPrecio=(TextView)findViewById(R.id.txtPrecio);
        txtCantidad=(TextView)findViewById(R.id.txtCantidad);
        txtObjetivo=(TextView)findViewById(R.id.txtObtetivo);
        txtTipo=(TextView)findViewById(R.id.txtTipo);
        btnContratar=(Button)findViewById(R.id.btnContratar);
        imgPerClass=(ImageView)findViewById(R.id.imgPerClass);
        DatosClase x = new DatosClase();
      

        txtClaseNo.setText(x.getNombre());
        txtTipo.setText(x.getTipo());
        txtObjetivo.setText(x.getObjetivo());
        txtCantidad.setText(x.getCantidad()+" Alumnos");
        txtPrecio.setText("$ "+x.getPrecio());
        txtDescrip.setText(x.getDescripcion());

        Glide.with(getApplicationContext())
                .load(url_img+x.getImagen())
                .into(imgPerClass);

        btnContratar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.uteach.com.mx";
                Uri uri =  Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });
    }



}

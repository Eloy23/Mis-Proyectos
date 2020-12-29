package mx.com.uteach.uteach;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.CardView;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    TextView cajaWel;
    Button test;

    private CardView clasesdis;
    private CardView miagendita1;
    private CardView perfil;
    private  CardView about,contacto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int id= getIntent().getExtras().getInt("id");


        clasesdis=(CardView)findViewById(R.id.clasesdis);
        miagendita1=(CardView)findViewById(R.id.miagendita);
        perfil=(CardView)findViewById(R.id.perfil);
        about=(CardView)findViewById(R.id.about);
        contacto=(CardView)findViewById(R.id.contacto);
        clasesdis.setOnClickListener(this);
        miagendita1.setOnClickListener(this);
        perfil.setOnClickListener(this);
        about.setOnClickListener(this);
        contacto.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        Intent i ;
        switch (v.getId()){
            case R.id.clasesdis : i = new Intent(this,MisClases.class);startActivity(i);break;
            case R.id.miagendita : i = new Intent(this,Fingerprint.class);startActivity(i);break;
            case R.id.perfil : i = new Intent(this,PerfilUser.class);startActivity(i);break;
            case R.id.about : i = new Intent(this,Aboutus.class);startActivity(i);break;
            case R.id.contacto : i = new Intent(this,Contacto.class);startActivity(i);break;
            default:break;
        }
    }
}

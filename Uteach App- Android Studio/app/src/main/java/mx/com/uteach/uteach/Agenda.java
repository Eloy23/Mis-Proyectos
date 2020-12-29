package mx.com.uteach.uteach;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Agenda extends AppCompatActivity {

    TextView alumn;
    Button redirec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);


        alumn=(TextView)findViewById(R.id.txt_alx);
        redirec=(Button)findViewById(R.id.redirec) ;
        perfilCl x = new perfilCl();
        User x1 = new User();
        alumn.setText(x1.getNombre());


        redirec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.uteach.com.mx/chat";
                Uri uri=  Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });


    }
}

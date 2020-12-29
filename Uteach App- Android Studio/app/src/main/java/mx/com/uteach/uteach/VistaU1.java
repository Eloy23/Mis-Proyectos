package mx.com.uteach.uteach;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class VistaU1 extends AppCompatActivity {


    private ImageButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_u1);
        btn= (ImageButton)findViewById(R.id.correo1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                String[] recipiente ={"16610010@utgz.edu.mx"};
                intent.putExtra(Intent.EXTRA_EMAIL,recipiente);
                intent.putExtra(Intent.EXTRA_SUBJECT,"Subject text here...");
                intent.putExtra(Intent.EXTRA_TEXT,"Body of the content here...");
                intent.putExtra(Intent.EXTRA_CC,"16610410@utgz.edu.mx");
                intent.setType("text/html");
                intent.setPackage("com.google.android.gm");
                startActivity(Intent.createChooser(intent, "Send mail"));
            }
        });


    }
}

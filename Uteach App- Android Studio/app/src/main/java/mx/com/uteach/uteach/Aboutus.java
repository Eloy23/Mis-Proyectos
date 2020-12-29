package mx.com.uteach.uteach;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Aboutus extends AppCompatActivity {

    private ImageButton im1,im2,im3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        im1 =(ImageButton)findViewById(R.id.user1);

        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),VistaU1.class);
                startActivity(intent);
            }
        });
    }
}

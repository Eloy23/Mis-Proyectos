package mx.com.uteach.uteach;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Contacto extends AppCompatActivity {

    private ImageButton img1,img2,img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        img1= (ImageButton)findViewById(R.id.face);
        img2= (ImageButton)findViewById(R.id.gmail);
        img3= (ImageButton)findViewById(R.id.insta);


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://web.facebook.com/UTeach.com.mx/?_rdc=1&_rdr");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                try{
                    startActivity(intent);
                }catch(Exception e){
                    e.printStackTrace();
                }finally {
                    finish();
                }


            }
        });

    img2.setOnClickListener(new View.OnClickListener() {
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


        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.instagram.com/uteach.com.mx/?hl=es-la");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                try{
                    startActivity(intent);
                }catch(Exception e){
                    e.printStackTrace();
                }finally {
                    finish();
                }


            }
        });



    }
}

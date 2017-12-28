package my.edu.tarc.lab51googlemapintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextlat,editTextlong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextlat=(EditText)findViewById(R.id.editTextLat);
        editTextlong=(EditText)findViewById(R.id.editTextLong);

        Button buttonshowmap=(Button)findViewById(R.id.buttonshowmap);

        buttonshowmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double lat,lon;
                lat=Double.parseDouble(editTextlat.getText().toString());
                lon=Double.parseDouble(editTextlong.getText().toString());
                Uri gmmIntentUri = Uri.parse("geo:"+lat+","+lon+"?z=18");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

                startActivity(mapIntent);

            }
        }
        );









    }
}

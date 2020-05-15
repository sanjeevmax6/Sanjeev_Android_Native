package android.example.rps_spider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        final GlobalClass globalClass = (GlobalClass) getApplicationContext();



        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                final EditText editText2 = (EditText) findViewById(R.id.editText2);
                globalClass.setPlayer2Name(editText2.getText().toString());

                final EditText editText3 = (EditText) findViewById(R.id.editText3);
                globalClass.setPlayer1Name(editText3.getText().toString());

                Intent intent = new Intent(Main5Activity.this,Main3Activity.class);
                startActivity(intent);


            }
        });

    }
}

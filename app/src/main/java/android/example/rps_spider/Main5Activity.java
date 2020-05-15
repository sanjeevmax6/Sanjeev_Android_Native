package android.example.rps_spider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    private static final int TIME_INTERVAL = 2000;
    private long mBackPressed;

    @Override
    public void onBackPressed() {
        if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) {
            super.onBackPressed();
            return;
        } else {
            Toast.makeText(getBaseContext(), "Click two times to close an activity", Toast.LENGTH_SHORT).show();
        }
        mBackPressed = System.currentTimeMillis();
    }


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

                if(editText2.getText().toString().length() == 0) {
                    globalClass.setPlayer2Name("PLAYER 2");
                }
                else{
                    globalClass.setPlayer2Name(editText2.getText().toString());
                }

                final EditText editText3 = (EditText) findViewById(R.id.editText3);


                if(editText3.getText().toString().length() == 0) {
                    globalClass.setPlayer1Name("PLAYER 1");
                }
                else{
                    globalClass.setPlayer1Name(editText3.getText().toString());
                }

                Intent intent = new Intent(Main5Activity.this,Main3Activity.class);
                startActivity(intent);
                finish();


            }
        });

    }
}

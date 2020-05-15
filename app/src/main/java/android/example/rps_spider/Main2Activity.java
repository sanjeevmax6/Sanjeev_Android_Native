package android.example.rps_spider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private static final int TIME_INTERVAL = 2000;
    private long mBackPressed;

    @Override
    public void onBackPressed() {
        if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) {
            super.onBackPressed();
            return;
        } else {
            Toast.makeText(getBaseContext(), "Click two times to quit", Toast.LENGTH_SHORT).show();
        }
        mBackPressed = System.currentTimeMillis();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getIntent();


        final GlobalClass globalClass = (GlobalClass) getApplicationContext();


        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);




        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                globalClass.setPlayer2Choice("ROCK");

                int temp =globalClass.getNumRounds();
                globalClass.setNumRounds(temp - 1);

                Intent intent = new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(intent);
                finish();


            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                globalClass.setPlayer2Choice("PAPER");

                int temp =globalClass.getNumRounds();
                globalClass.setNumRounds(temp - 1);

                Intent intent = new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(intent);
                finish();


            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                globalClass.setPlayer2Choice("SCISSOR");

                int temp =globalClass.getNumRounds();
                globalClass.setNumRounds(temp - 1);

                Intent intent = new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(intent);
                finish();


            }
        });




    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
    }

    private void hideSystemUI() {

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE

                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }


    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }
}

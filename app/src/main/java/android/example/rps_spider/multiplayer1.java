package android.example.rps_spider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Random;

public class multiplayer1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplayer1);

        getIntent();

        final GlobalClass globalClass = (GlobalClass) getApplicationContext();

        ImageButton imageButton19 = (ImageButton) findViewById(R.id.imageButton19);
        ImageButton imageButton20 = (ImageButton) findViewById(R.id.imageButton20);
        ImageButton imageButton21 = (ImageButton) findViewById(R.id.imageButton21);



        imageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                globalClass.setSinglePlayerChoice("ROCK");

                String[] choices = {"ROCK","PAPER","SCISSOR"};

                Random random = new Random();
                int randomChoice = random.nextInt(3);

                globalClass.setBotChoice(choices[randomChoice]);

                int temp =globalClass.getNumRounds();
                globalClass.setNumRounds(temp - 1);

                Intent intent = new Intent(multiplayer1.this,Main4Activity.class);
                startActivity(intent);

            }
        });

        imageButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                globalClass.setSinglePlayerChoice("PAPER");

                String[] choices = {"ROCK","PAPER","SCISSOR"};

                Random random = new Random();
                int randomChoice = random.nextInt(3);

                globalClass.setBotChoice(choices[randomChoice]);

                int temp =globalClass.getNumRounds();
                globalClass.setNumRounds(temp - 1);

                Intent intent = new Intent(multiplayer1.this,Main4Activity.class);
                startActivity(intent);

            }
        });

        imageButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                globalClass.setSinglePlayerChoice("SCISSOR");

                String[] choices = {"ROCK","PAPER","SCISSOR"};

                Random random = new Random();
                int randomChoice = random.nextInt(3);

                globalClass.setBotChoice(choices[randomChoice]);

                int temp =globalClass.getNumRounds();
                globalClass.setNumRounds(temp - 1);

                Intent intent = new Intent(multiplayer1.this,Main4Activity.class);
                startActivity(intent);

            }
        });

    }

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

package android.example.rps_spider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Multiplayer2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplayer2);

        getIntent();

        final GlobalClass globalClass = (GlobalClass) getApplicationContext();

        TextView textView51 = (TextView) findViewById(R.id.textView51);
        TextView textView53 = (TextView) findViewById(R.id.textView53);
        TextView textView54 = (TextView) findViewById(R.id.textView54);
        TextView textView55 = (TextView) findViewById(R.id.textView55);
        TextView textView56 = (TextView) findViewById(R.id.textView56);

        Button button50 = (Button) findViewById(R.id.button50);





        if(globalClass.getSinglePlayerChoice() == globalClass.getBotChoice()) {
            globalClass.setSinglePlayerScore( (globalClass.getSinglePlayerScore()) + 0 );
            globalClass.setBotScore( (globalClass.getBotScore()) + 0 );
        }
        else if (globalClass.getSinglePlayerChoice() == "ROCK" && globalClass.getBotChoice() == "PAPER"){
            globalClass.setSinglePlayerScore( (globalClass.getSinglePlayerScore()) + 0 );
            globalClass.setBotScore( (globalClass.getBotScore()) + 1 );
        }
        else if(globalClass.getSinglePlayerChoice() == "ROCK" && globalClass.getBotChoice() == "SCISSOR"){
            globalClass.setSinglePlayerScore( (globalClass.getSinglePlayerScore()) + 1 );
            globalClass.setBotScore( (globalClass.getBotScore()) + 0 );
        }
        else if(globalClass.getSinglePlayerChoice() == "PAPER" && globalClass.getBotChoice() == "ROCK"){
            globalClass.setSinglePlayerScore( (globalClass.getSinglePlayerScore()) + 1 );
            globalClass.setBotScore( (globalClass.getBotScore()) + 0 );
        }
        else if(globalClass.getSinglePlayerChoice() == "PAPER" && globalClass.getBotChoice() == "SCISSOR"){
            globalClass.setSinglePlayerScore( (globalClass.getSinglePlayerScore()) + 0 );
            globalClass.setBotScore( (globalClass.getBotScore()) + 1 );
        }
        else if(globalClass.getSinglePlayerChoice() == "SCISSOR" && globalClass.getBotChoice() == "ROCK"){
            globalClass.setSinglePlayerScore( (globalClass.getSinglePlayerScore()) + 0 );
            globalClass.setBotScore( (globalClass.getBotScore()) + 1 );
        }
        else if(globalClass.getSinglePlayerChoice() == "SCISSOR" && globalClass.getBotChoice() == "PAPER"){
            globalClass.setSinglePlayerScore( (globalClass.getSinglePlayerScore()) + 1 );
            globalClass.setBotScore((globalClass.getBotScore()) + 0 );
        }

        if(globalClass.getSinglePlayerScore() > globalClass.getBotScore()){
            globalClass.setWinner(globalClass.getPlayer1Name());
            Toast toast = Toast.makeText(getApplicationContext(), globalClass.getWinner() + "WINS", Toast.LENGTH_SHORT);
            toast.show();
            textView51.setText(globalClass.getWinner());
        }
        else if(globalClass.getSinglePlayerScore() < globalClass.getBotScore()){
            globalClass.setWinner(globalClass.getPlayer2Name());
            Toast toast = Toast.makeText(getApplicationContext(), globalClass.getWinner() + "WINS", Toast.LENGTH_SHORT);
            toast.show();
            textView51.setText(globalClass.getWinner());

        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(), "DRAW", Toast.LENGTH_SHORT);
            toast.show();
            textView51.setText("DRAW");

        }

        textView53.setText(globalClass.getSinglePlayerName());
        textView54.setText("BOT");
        textView55.setText(globalClass.getSinglePlayerScore());
        textView56.setText(globalClass.getBotScore());

        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                globalClass.setNumRounds( (globalClass.getNumRounds()) - 1 );

                if(globalClass.getNumRounds() == 0){
                    Intent intent = new Intent(Multiplayer2.this,MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Intent intent = new Intent(Multiplayer2.this,multiplayer1.class);
                    startActivity(intent);
                }
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

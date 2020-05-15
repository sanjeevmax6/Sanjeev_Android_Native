package android.example.rps_spider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        getIntent();

        final GlobalClass globalClass = (GlobalClass) getApplicationContext();

        TextView textView14 = (TextView) findViewById(R.id.textView14);
        TextView textView18 = (TextView) findViewById(R.id.textView18);
        TextView textView19 = (TextView) findViewById(R.id.textView19);
        TextView textView20 = (TextView) findViewById(R.id.textView20);
        TextView textView21 = (TextView) findViewById(R.id.textView21);
        Button button4 = (Button) findViewById(R.id.button4);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);

        if(globalClass.getModeOfGame() == true) {


            if (globalClass.getPlayer1Choice() == globalClass.getPlayer2Choice()) {
                globalClass.setPlayer1Score((globalClass.getPlayer1Score()) + 0);
                globalClass.setPlayer2Score((globalClass.getPlayer2Score()) + 0);
            } else if (globalClass.getPlayer1Choice() == "ROCK" && globalClass.getPlayer2Choice() == "PAPER") {
                globalClass.setPlayer1Score((globalClass.getPlayer1Score()) + 0);
                globalClass.setPlayer2Score((globalClass.getPlayer2Score()) + 1);
            } else if (globalClass.getPlayer1Choice() == "ROCK" && globalClass.getPlayer2Choice() == "SCISSOR") {
                globalClass.setPlayer1Score((globalClass.getPlayer1Score()) + 1);
                globalClass.setPlayer2Score((globalClass.getPlayer2Score()) + 0);
            } else if (globalClass.getPlayer1Choice() == "PAPER" && globalClass.getPlayer2Choice() == "ROCK") {
                globalClass.setPlayer1Score((globalClass.getPlayer1Score()) + 1);
                globalClass.setPlayer2Score((globalClass.getPlayer2Score()) + 0);
            } else if (globalClass.getPlayer1Choice() == "PAPER" && globalClass.getPlayer2Choice() == "SCISSOR") {
                globalClass.setPlayer1Score((globalClass.getPlayer1Score()) + 0);
                globalClass.setPlayer2Score((globalClass.getPlayer2Score()) + 1);
            } else if (globalClass.getPlayer1Choice() == "SCISSOR" && globalClass.getPlayer2Choice() == "ROCK") {
                globalClass.setPlayer1Score((globalClass.getPlayer1Score()) + 0);
                globalClass.setPlayer2Score((globalClass.getPlayer2Score()) + 1);
            } else if (globalClass.getPlayer1Choice() == "SCISSOR" && globalClass.getPlayer2Choice() == "PAPER") {
                globalClass.setPlayer1Score((globalClass.getPlayer1Score()) + 1);
                globalClass.setPlayer2Score((globalClass.getPlayer2Score()) + 0);
            }

            if (globalClass.getPlayer1Score() > globalClass.getPlayer2Score()) {
                globalClass.setWinner(globalClass.getPlayer1Name());
                Toast toast = Toast.makeText(getApplicationContext(), globalClass.getWinner() + "WINS", Toast.LENGTH_SHORT);
                toast.show();
                textView14.setText(String.format("%sWINS", globalClass.getWinner()));

            } else if (globalClass.getPlayer2Score() < globalClass.getPlayer2Score()) {
                globalClass.setWinner(globalClass.getPlayer2Name());
                Toast toast = Toast.makeText(getApplicationContext(), globalClass.getWinner() + "WINS", Toast.LENGTH_SHORT);
                toast.show();
                textView14.setText(String.format("%sWINS", globalClass.getWinner()));

            } else if(globalClass.getPlayer1Score() == globalClass.getPlayer2Score()){
                Toast toast = Toast.makeText(getApplicationContext(), "DRAW", Toast.LENGTH_SHORT);
                toast.show();
                textView14.setText("DRAW");

            }

            textView18.setText(globalClass.getPlayer1Name());
            textView19.setText(globalClass.getPlayer2Name());
            textView20.setText(String.valueOf(globalClass.getPlayer1Score()));
            textView21.setText(String.valueOf(globalClass.getPlayer2Score()));

            if(globalClass.getPlayer1Choice() == "ROCK") {
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.rock));
            }
            else if(globalClass.getPlayer1Choice() == "PAPER"){
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.paper));
            }
            else if(globalClass.getPlayer1Choice() == "SCISSOR"){
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.scissor));
            }

            if(globalClass.getPlayer2Choice() == "ROCK") {
                imageView3.setImageDrawable(getResources().getDrawable(R.drawable.rock));
            }
            else if(globalClass.getPlayer2Choice() == "PAPER"){
                imageView3.setImageDrawable(getResources().getDrawable(R.drawable.paper));
            }
            else if(globalClass.getPlayer2Choice() == "SCISSOR"){
                imageView3.setImageDrawable(getResources().getDrawable(R.drawable.scissor));
            }

            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view){

                    if(globalClass.getNumRounds() == 0){
                        globalClass.setPlayer1Score(0);
                        globalClass.setPlayer2Score(0);

                        Intent intent = new Intent(Main4Activity.this,MainActivity.class);
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(Main4Activity.this,Main3Activity.class);
                        startActivity(intent);
                    }
                }
            });

        }
        else{



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
                globalClass.setWinner(globalClass.getSinglePlayerName());
                Toast toast = Toast.makeText(getApplicationContext(), globalClass.getWinner() + "WINS", Toast.LENGTH_SHORT);
                toast.show();
                textView14.setText(globalClass.getWinner());
            }
            else if(globalClass.getSinglePlayerScore() < globalClass.getBotScore()){
                globalClass.setWinner("BOT");
                Toast toast = Toast.makeText(getApplicationContext(), globalClass.getWinner() + "WINS", Toast.LENGTH_SHORT);
                toast.show();
                textView14.setText(globalClass.getWinner());

            }
            else{
                Toast toast = Toast.makeText(getApplicationContext(), "DRAW", Toast.LENGTH_SHORT);
                toast.show();
                textView14.setText("DRAW");

            }

            textView18.setText(globalClass.getSinglePlayerName());
            textView19.setText("BOT");
            textView20.setText(String.valueOf(globalClass.getSinglePlayerScore()) );
            textView21.setText(String.valueOf(globalClass.getBotScore()) );

            if(globalClass.getSinglePlayerChoice() == "ROCK") {
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.rock));
            }
            else if(globalClass.getSinglePlayerChoice() == "PAPER"){
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.paper));
            }
            else if(globalClass.getSinglePlayerChoice() == "SCISSOR"){
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.scissor));
            }

            if(globalClass.getBotChoice() == "ROCK") {
                imageView3.setImageDrawable(getResources().getDrawable(R.drawable.rock));
            }
            else if(globalClass.getBotChoice() == "PAPER"){
                imageView3.setImageDrawable(getResources().getDrawable(R.drawable.paper));
            }
            else if(globalClass.getBotChoice() == "SCISSOR"){
                imageView3.setImageDrawable(getResources().getDrawable(R.drawable.scissor));
            }

            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view){

                    if(globalClass.getNumRounds() == 0){
                        globalClass.setSinglePlayerScore(0);
                        globalClass.setBotScore(0);

                        Intent intent = new Intent(Main4Activity.this,MainActivity.class);
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent(Main4Activity.this,multiplayer1.class);
                        startActivity(intent);
                    }
                }
            });
        }





    }
}

package android.example.rps_spider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class modeOfGameName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_of_game_name);

        final GlobalClass globalClass = (GlobalClass) getApplicationContext();



        Button button6 = (Button) findViewById(R.id.button6);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                final EditText editText30 = (EditText) findViewById(R.id.editText30);
                globalClass.setSinglePlayerName(editText30.getText().toString());

                Intent intent = new Intent(modeOfGameName.this,multiplayer1.class);
                startActivity(intent);


            }
        });
    }
}

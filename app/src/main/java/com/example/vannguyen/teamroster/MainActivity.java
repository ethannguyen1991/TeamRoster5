package com.example.vannguyen.teamroster;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private LinearLayout playerList;
    private Button AddPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        this.playerList = (LinearLayout) this.findViewById(R.id.playerList);
        this.AddPlayer = (Button)this.findViewById(R.id.button);


    }

    public void addPlayerButtonPressed(View sender) {

        {
            Intent i = new Intent(this, AddPlayerActivity.class);
            if (Core.AddPlayerButton=true) {
                TextView tv = new TextView(this);
                this.playerList.addView(tv);
                tv.setText("Player"+Core.thePlayers);
            }
            this.startActivity(i);
        }
    }
}
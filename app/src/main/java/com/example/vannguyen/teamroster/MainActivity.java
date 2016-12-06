package com.example.vannguyen.teamroster;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

// Add the logic for Add Manager and update the MainActivity such that it always
// shows all of the managers first followed by all of the Players.
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        Core.managerList = (LinearLayout) this.findViewById(R.id.TeamRoster);
        Core.playerList = (LinearLayout) this.findViewById(R.id.TeamRoster);

        ArrayList<Human> team = new ArrayList<Human>();
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt();

            if (num <= 0) {
                team.add(new Player("Fname" + i, "Lname " + i, i, i * 2));
            } else
            {
               team.add(new Manager("Fname" + i, "Lname" + i,i*20));
            }
        }
        int numPlayers = 0;
        int numManager = 0;
        for (int i = 0; i < team.size(); i++) {
            Human h = team.get(i);
            if (h instanceof Player) {
                numPlayers++;
            } else {
                numManager++;
            }
        }
        System.out.println("***** Players:" + numPlayers);
        System.out.println("***** Manager:" + numManager);
    }

    public void addPlayerButtonPressed(View sender) {

        {
            Intent i = new Intent(this, AddPlayerActivity.class);

            this.startActivity(i);
        }
    }

    public void addManagerButtonPressed(View sender) {

        {
            Intent j = new Intent(this, AddManager.class);

            this.startActivity(j);
        }

    }
}
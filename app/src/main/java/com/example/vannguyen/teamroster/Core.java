package com.example.vannguyen.teamroster;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * Created by VanNguyen on 11/21/16.
 */

public class Core
{
    static ArrayList<Player> thePlayers = new ArrayList<Player>();
    static ArrayList<Manager> theManagers = new ArrayList<Manager>();
    static LinearLayout managerList;
    static LinearLayout playerList;

    public void ResetListView(){

    }

    public static void ResetListView(AddPlayerActivity addPlayerActivity, Player player) {
        Core.managerList.removeViews(2,thePlayers.size()+theManagers.size());
        for(int i=0;i<theManagers.size();i++){

            TextView tv = new TextView(addPlayerActivity);
            Manager m = theManagers.get(i);
            tv.setText(m.getFirst_name() + " " + m.getLast_name() + "->" + m.getSalary());

            Core.managerList.addView(tv);
        }
        thePlayers.add(player);
        for(int i=0;i<thePlayers.size();i++){

            TextView tv = new TextView(addPlayerActivity);
            Player p = thePlayers.get(i);
            tv.setText(p.getFirst_name() + " " + p.getLast_name() + p.getJerseyNumber() + " -> " + p.getSkillLevel());

            Core.playerList.addView(tv);
        }
    }

    public static void ResetListView(AddManager addManager, Manager manager) {
        Core.managerList.removeViews(2,thePlayers.size()+theManagers.size());
        theManagers.add(manager);
        for(int i=0;i<theManagers.size();i++){


            TextView tv = new TextView(addManager);
            Manager m = theManagers.get(i);
            tv.setText(m.getFirst_name() + " " + m.getLast_name() + "->" + m.getSalary());

            Core.managerList.addView(tv);
        }


        for(int i=0;i<thePlayers.size();i++){
            TextView tv = new TextView(addManager);
            Player p = thePlayers.get(i);
            tv.setText(p.getFirst_name() + " " + p.getLast_name() + p.getJerseyNumber() + " -> " + p.getSkillLevel());

            Core.playerList.addView(tv);
        }
    }
}
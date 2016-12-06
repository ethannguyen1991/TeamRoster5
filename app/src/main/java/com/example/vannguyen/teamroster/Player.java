package com.example.vannguyen.teamroster;

/**
 * Created by VanNguyen on 11/21/16.
 */

public class Player extends Human
{
    private int jerseyNumber;
    private int skillLevel;


    public Player(String first_name, String last_name, int jerseyNumber, int skillLevel)
    {
        super(first_name, last_name);
        this.jerseyNumber = jerseyNumber;
        this.skillLevel = skillLevel;

    }


    public int getJerseyNumber()
    {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber)
    {
        this.jerseyNumber = jerseyNumber;
    }

    public int getSkillLevel()
    {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel)
    {
        this.skillLevel = skillLevel;
    }

}


package com.example.vannguyen.teamroster;

/**
 * Created by VanNguyen on 11/21/16.
 */

public class Player
{
    private int jerseyNumber;
    private int skillLevel;
    private String name;

    public Player(int jerseyNumber, int skillLevel)
    {
        this.jerseyNumber = jerseyNumber;
        this.skillLevel = skillLevel;
        this.name=name;
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
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}


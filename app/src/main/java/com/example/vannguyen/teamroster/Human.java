package com.example.vannguyen.teamroster;

/**
 * Created by VanNguyen on 11/22/16.
 */

public abstract class Human
{
    protected String first_name;
    protected String last_name;
    public Human(String first_name, String last_name)
    {
        this.first_name = first_name;
        this.last_name = last_name;

    }
    public Human ()
    {}
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}

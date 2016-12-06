package com.example.vannguyen.teamroster;

/**
 * Created by VanNguyen on 12/2/16.
 */

public class Manager extends Human
{
    private int salary;

    public Manager (String first_name, String last_name, int salary) {

        super(first_name, last_name);
        this.salary = salary;

    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }
}

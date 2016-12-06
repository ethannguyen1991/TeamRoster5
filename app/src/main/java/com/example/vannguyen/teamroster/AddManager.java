package com.example.vannguyen.teamroster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddManager extends AppCompatActivity
{
    private EditText salaryET;
    private TextView errorTV1;
    private  EditText firstNameET1;
    private EditText lastNameET1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_manager);
        this.salaryET = (EditText) this.findViewById(R.id.salaryET);
        this.errorTV1 = (TextView) this.findViewById(R.id.errorTV);
        this.errorTV1.setText("");
        this.firstNameET1 = (EditText)this.findViewById(R.id.firstNameET1);
        this.lastNameET1 = (EditText)this.findViewById(R.id.lastNameET1);
    }
    public void addManagerButtonPressed(View v)
    {
        if (this.salaryET.getText().toString().length() == 0)
        {
            this.errorTV1.setText("You must enter a Manager salary number!");
        }
        else
        {
            //everything is cool, we should create our manager and add it
            this.errorTV1.setText("");
            int salaryET = Integer.parseInt(this.salaryET.getText().toString());
            String firstName = this.firstNameET1.getText().toString();
            String lastName = this.lastNameET1.getText().toString();

            Manager m = new Manager(firstName, lastName, salaryET);
            Core.ResetListView(this, m);
            this.finish();
        }
    }
}

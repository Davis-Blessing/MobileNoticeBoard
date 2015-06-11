package com.example.davis_pc.mobilenoticeboard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class CreateAccount extends ActionBarActivity {

    RadioButton radStud,radAdmin,radLecturer,radOthers;
    EditText Username,Password,Con_pass,Name,Phone;
    Button Submit;
    String username,password,con_pass,name,phone;
    Context CTX=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        radStud=(RadioButton)findViewById(R.id.radStudent);
        radAdmin=(RadioButton)findViewById(R.id.radAdministrator);
        radLecturer=(RadioButton)findViewById(R.id.radLecturer);
radOthers=(RadioButton)findViewById(R.id.radOthers);
        Username=(EditText)findViewById(R.id.edtUseroncreate);
        Name=(EditText)findViewById(R.id.edtName);
        Phone=(EditText)findViewById(R.id.edtPnone);
        Submit=(Button)findViewById(R.id.btnSubmitOncreate);

        radStud.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Username.setHint("enter your reg No.");

        }
        });

        radAdmin.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Username.setHint("enter your employee ID.");

        }
        });
        radLecturer.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Username.setHint("enter your staff ID.");

        }
        });

        radOthers.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Username.setHint("enter your employee ID.");

        }
        });

        Submit.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        name=Name.getText().toString();
        phone=Phone.getText().toString();

        username=Username.getText().toString();
        password=Password.getText().toString();
        con_pass=Con_pass.getText().toString();

        if ((username!=null)&&(password.equals(con_pass))){

        DataBaseOperations DOP=new DataBaseOperations(CTX);

        DOP.putInformation(DOP,name,phone,username,password);


        Toast.makeText(getBaseContext(),"registration was successfull...",Toast.LENGTH_LONG).show();

        Intent intent=new Intent(getBaseContext(),SignIn.class);
        startActivity(intent);
        finish();



        }else{

        Toast.makeText(getBaseContext(),"The entered PASSWORDS do not match or NO USERNAME entered..",Toast.LENGTH_LONG).show();

        }

        }
        });
        }
        }

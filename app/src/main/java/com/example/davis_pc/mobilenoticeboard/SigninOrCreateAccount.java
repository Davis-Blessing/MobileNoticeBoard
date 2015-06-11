package com.example.davis_pc.mobilenoticeboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class SigninOrCreateAccount extends ActionBarActivity {

    Button signin,createAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitysigninorcreate);

        signin=(Button)findViewById(R.id.btnSignin);
        createAccount=(Button)findViewById(R.id.btnCreateaccount);


        signin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intentSign=new Intent(getBaseContext(),SignIn.class);
                startActivity(intentSign);

            }
        });

        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCreate=new Intent(getBaseContext(),CreateAccount.class);
                startActivity(intentCreate);
            }
        });




    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_view__or__post__notice, menu);
        return true;
    }
}

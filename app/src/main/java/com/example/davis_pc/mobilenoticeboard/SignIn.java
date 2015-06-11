package com.example.davis_pc.mobilenoticeboard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SignIn extends ActionBarActivity {
    EditText USERNAME, PASSWORD;
    String username, password;
    Button SignIn;
    Context ctx = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        USERNAME = (EditText) findViewById(R.id.txtSignInusername);
        PASSWORD = (EditText) findViewById(R.id.signInPass);
        SignIn = (Button) findViewById(R.id.btnSigninSubmit);

        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getBaseContext(), "Please wait...", Toast.LENGTH_LONG).show();

                username = USERNAME.getText().toString();
                password = PASSWORD.getText().toString();

               // DataBaseOperations dop = new DataBaseOperations(ctx);

                //   Cursor CR=dop.getInformation(dop);

                //dop.getInformation(dop);

                if ((username.equals(TableData.TableInfo.USER_NAME))&&(password.equals(TableData.TableInfo.USER_PASS))){

                    Toast.makeText(getBaseContext(),"Login was successfull",Toast.LENGTH_LONG).show();

                    Intent intent=new Intent(getBaseContext(),View_Or_Post_Notice.class);
                    startActivity(intent);
                    finish();


                }
                else{
                    USERNAME.setText("");

                    PASSWORD.setText("");

                    Toast.makeText(getBaseContext(),"Incorrect user name or password",Toast.LENGTH_LONG).show();

                }
            }
        });
//                CR.moveToFirst();
//                boolean loginStatus=false;
//                String NAME="";

//               do{
//
//                   if(username.equals(CR.getString(0))&&password.equals(CR.getString(1))){
//
//                       loginStatus=true;
//                       NAME=CR.getString(0);
//
//
//                   }
//
//               }while (CR.moveToNext());
//
//
//                if(loginStatus){
//
//
//                    Toast.makeText(getBaseContext(),"Login successfull...\n Welcome "+NAME,Toast.LENGTH_LONG).show();
//
//                    Intent intent=new Intent(getBaseContext(),View_Or_Post_Notice.class);
//                    startActivity(intent);
//                    finish();
//                }
//                else{
//                    Toast.makeText(getBaseContext(),"Login Failed...",Toast.LENGTH_LONG).show();
//                    finish();
//
//                }
//            }
//        });


            }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sign_in, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }}


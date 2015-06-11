package com.example.davis_pc.mobilenoticeboard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Davis_pc on 5/28/2015.
 */
public class DataBaseOperations extends SQLiteOpenHelper {

    public static final int database_version=1;
    public String CREATE_QUERY="CREATE TABLE "+ TableData.TableInfo.TABLE_NAME +"("+ TableData.TableInfo.ID +" INTEGER PRIMARY KEY AUTOINCREMENT,"+
            TableData.TableInfo.NAME +" TEXT,"+ TableData.TableInfo.PHONE_NO +" TEXT, "+ TableData.TableInfo.USER_NAME +" TEXT,"+ TableData.TableInfo.USER_PASS +" TEXT );";


    public DataBaseOperations(Context context){

        super(context,TableData.TableInfo.DATABASE_NAME,null,database_version);
        Log.d("Database operations", "successfully created");


    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_QUERY);
        Log.d("Database operations","Table created");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    //method to insert information
    public void putInformation(DataBaseOperations dop,String Name,String phone,String name,String pass)
    {


        SQLiteDatabase SQ=dop.getWritableDatabase();

        ContentValues cv=new ContentValues();
        //use put to add values by specifying a key and value..
        cv.put(TableData.TableInfo.NAME,Name);
        cv.put(TableData.TableInfo.PHONE_NO,phone);

        cv.put(TableData.TableInfo.USER_NAME,name);
        cv.put(TableData.TableInfo.USER_PASS,pass);

        //insert the data and store the value inserted into a variable
        long k=SQ.insert(TableData.TableInfo.TABLE_NAME,null,cv);
        //log value
        Log.d("Database operations","one row inserted");

    }

    public Cursor getInformation(DataBaseOperations dop ){

        SQLiteDatabase SQ= dop.getReadableDatabase();

        String[] columns={TableData.TableInfo.USER_NAME, TableData.TableInfo.USER_PASS};

       // Cursor CR=SQ.query(TableData.TableInfo.TABLE_NAME,columns,null,null,null,null,null);
        Cursor CR=SQ.query(TableData.TableInfo.TABLE_NAME,columns,null,null,null,null,null);

        return CR;



    }




}

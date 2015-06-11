package com.example.davis_pc.mobilenoticeboard;

import android.provider.BaseColumns;

/**
 * Created by Davis_pc on 5/28/2015.
 */
public class TableData  {

    public TableData(){


    }


    public static abstract class TableInfo implements BaseColumns {

        public static final String ID="id";

        public static final String NAME="name";

        public static final String PHONE_NO="phone_no";

        public static final String USER_NAME="user_name";

        public static final String USER_PASS="user_pass";

        public static final String DATABASE_NAME="userInfo";

        public static final String TABLE_NAME="regInfo";






    }
}


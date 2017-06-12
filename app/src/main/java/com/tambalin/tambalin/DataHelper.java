package com.tambalin.tambalin;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Ryan on 31/05/2017.
 */

public class DataHelper extends SQLiteOpenHelper {
    private static final String Database_Name = "DataTambalBan.db";
    private static final int DATABASE_VERSION = 1;

    public DataHelper(Context context){
        super(context,Database_Name,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "Create table dataTB(no integer primary key, nama text not Null, deskripsiTB text not null," +
                "pemilik text not null, lat real not null, long real not null);";
        Log.d("Data","OnCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT Into dataTB(no, nama, deskripsiTB, pemilik, lat, long) VALUES ('1','ALI BAN','SUDAH LAMA BUKA','ALI','))";
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

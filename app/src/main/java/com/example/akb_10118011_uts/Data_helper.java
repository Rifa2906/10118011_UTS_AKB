package com.example.akb_10118011_uts;

//    tanggal pengerjaan 5/6/2021
//    Moch Rifa Maualana N
//    10118011
//    IF10

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class Data_helper extends SQLiteOpenHelper {
    private static  final String DATABASE_NAME = "Aktivitas_harian.db";
    private static  final int DATABASE_VERSION = 1;

    public Data_helper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        String sql = "create table aktivitas(no integer primary key,kegiatan text null);";
        Log.d("Data","onCreate: "+sql);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0,int arg1,int arg2){

    }

}

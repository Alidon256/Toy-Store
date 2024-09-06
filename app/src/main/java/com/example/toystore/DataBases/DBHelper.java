package com.example.toystore.DataBases;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(@Nullable Context context) {
        super(context, "ALiPractice.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table users(id INTEGER primary key autoincrement, username TEXT ,studentNumber TEXT,studentEmail TEXT, studentRegNumber TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists users");
    }

    public boolean insertData(String studentRegNumber,String studentNumber,String studentEmail){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("studentNumber",studentNumber);
        contentValues.put("studentEmail",studentEmail);
        contentValues.put("studentRegNumber",studentRegNumber);
        long result = db.insert("users",null,contentValues);
        if(result==-1){
            return false;
        }else
           return true;
    }

    public void deleteData(Integer id){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("users","id=?",new String[]{id.toString()});
    }
    public boolean updateData(Integer currentId, String newStudentNumber, String newStudentEmail, String newStudentRegNumber){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("studentNumber",newStudentNumber);
        contentValues.put("studentEmail",newStudentEmail);
        contentValues.put("studentRegNumber",newStudentRegNumber);
        long result = db.update("users",contentValues,"id=?",new String[]{currentId.toString()});
        if(result ==-1){
            return false;
        }else{
            return true;
        }

    }
    public Cursor getAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from users",null);
        return cursor;
    }
}

package com.example.user.mydb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by User on 15-09-2017.
 */

public class DBHelper extends SQLiteOpenHelper
{
    public static String dbname="school.db";
    public static int dbVersion=1;
    public static String table="login";
    public static String column1="username";
    public static String column2="password";
    public static String column3="contact";
    public static String createTable="create table login(_id integer primary key autoincrement,username text,password text,contact text)";
    public static String TAG="MyDB";
    SQLiteDatabase db;
    public DBHelper(Context context)
    {
        super(context, dbname, null, dbVersion);
        Log.i(TAG,"Database Created");
    }

    @Override
    public void onCreate(SQLiteDatabase arg0)
    {
        arg0.execSQL(createTable);
        Log.i(TAG,"Table Created");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void save(String uname,String pass,String contact)
    {
        db=getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(column1,uname);
        values.put(column2,pass);
        values.put(column3,contact);
        db.insert(table,null,values);
        Log.i(TAG,"Record inserted");
        db.close();
    }
    public void delete(String uname)
    {
        db=getWritableDatabase();
        String str[]={uname};
        db.delete(table,"username=?",str);
        Log.i(TAG,"Record deleted");
        db.close();
    }
    public int delete()
    {
        db=getWritableDatabase();
        int i=db.delete(table,null,null);
        Log.i(TAG,i+"Record deleted");
        db.close();
        return i;
    }
    public int update(String uname,String newpassword,String newcontact)
    {
        db=getWritableDatabase();
        //String query="update login set password=?,contact=? where username=?";
        ContentValues cv=new ContentValues();
        cv.put(column2,newpassword);
        cv.put(column3,newcontact);
        int i=db.update(table,cv,"username=?",new String[]{uname});
        db.close();
        return i;
    }
    public ArrayList<StringBuffer> viewAll()
    {
        ArrayList<StringBuffer> alist=new ArrayList<StringBuffer>();
        db=getWritableDatabase();
        Cursor c=db.query(table,null,null,null,null,null,"username");
        while(c.moveToNext())
        {
            String id=c.getString(0);//_id
            String uname=c.getString(1);//username
            String pass=c.getString(2);//password
            String contact=c.getString(3);//contact
            StringBuffer sb=new StringBuffer();
            String record=id+","+uname+","+pass+","+contact;
            sb.append(record);
            alist.add(sb);
        }
        db.close();
        return alist;
    }
}

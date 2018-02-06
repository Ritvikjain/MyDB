package com.example.user.mydb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DisplayAllRecords extends AppCompatActivity
{
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_all_records);
        list=(ListView) findViewById(R.id.listView);
        DBHelper db=new DBHelper(this);
        ArrayList<StringBuffer> a1=db.viewAll();
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,a1);
        list.setAdapter(adapter);
    }
}

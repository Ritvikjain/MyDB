package com.example.user.mydb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DeleteAllRecords extends AppCompatActivity {

    DBHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_all_records);
        db=new DBHelper(this);
    }
    public void deleteAll(View v)
    {
        int i=db.delete();
        Toast.makeText(this, i+" records deleted",Toast.LENGTH_SHORT).show();
    }
}

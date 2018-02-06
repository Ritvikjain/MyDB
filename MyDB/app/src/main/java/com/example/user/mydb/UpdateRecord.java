package com.example.user.mydb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateRecord extends AppCompatActivity
{
    EditText e1,e2,e3;
    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_record);
        e1=(EditText) findViewById(R.id.editText4);
        e2=(EditText) findViewById(R.id.editText5);
        e3=(EditText) findViewById(R.id.editText6);
    }
    public void updateRecord(View v)
    {
        String username=e1.getText().toString();
        String newpassword=e2.getText().toString();
        String newcontact=e3.getText().toString();
        int i=db.update(username,newpassword,newcontact);
        Toast.makeText(this,i+" record updated", Toast.LENGTH_SHORT).show();
        e2.setText(null);
        e3.setText(null);
    }
}

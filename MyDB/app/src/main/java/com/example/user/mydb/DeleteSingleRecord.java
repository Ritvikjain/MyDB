package com.example.user.mydb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteSingleRecord extends AppCompatActivity implements View.OnClickListener
{
    EditText t1;
    Button b1;
    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_single_record);
        t1=(EditText) findViewById(R.id.editText);
        b1=(Button) findViewById(R.id.button8);
        b1.setOnClickListener(this);
        db=new DBHelper(this);
    }

    @Override
    public void onClick(View view)
    {
        String s1=t1.getText().toString();
        db.delete(s1);
        Toast.makeText(this,"Record Deleted",Toast.LENGTH_SHORT).show();
        t1.setText(null);
    }
}

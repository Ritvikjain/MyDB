package com.example.user.mydb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewRecord extends AppCompatActivity implements View.OnClickListener {

    Button b1,b2;
    EditText t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_record);
        b1=(Button)findViewById(R.id.button6);
        b2=(Button)findViewById(R.id.button7);
        t1=(EditText)findViewById(R.id.editText1);
        t2=(EditText)findViewById(R.id.editText2);
        t3=(EditText)findViewById(R.id.editText3);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        if(view.getId()==R.id.button6)
        {
            DBHelper obj=new DBHelper(this);
            String s1=t1.getText().toString();
            String s2=t2.getText().toString();
            String s3=t3.getText().toString();
            obj.save(s1,s2,s3);
            Toast.makeText(this,b1.getText(),Toast.LENGTH_SHORT).show();
            t1.setText(null);
            t2.setText(null);
            t3.setText(null);
        }
        if(view.getId()==R.id.button7)
        {
            Toast.makeText(this,b2.getText(),Toast.LENGTH_SHORT).show();
            t1.setText(null);
            t2.setText(null);
            t3.setText(null);
        }
    }
}

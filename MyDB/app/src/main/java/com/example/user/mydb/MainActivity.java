package com.example.user.mydb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if(v.getId()==R.id.button)
        {
            Toast.makeText(this,b1.getText(),Toast.LENGTH_SHORT).show();
            Intent i=new Intent(this,NewRecord.class);
            startActivity(i);
        }
        if(v.getId()==R.id.button2)
        {
            Toast.makeText(this,b2.getText(),Toast.LENGTH_SHORT).show();
            Intent i=new Intent(this,DeleteSingleRecord.class);
            startActivity(i);
        }
        if(v.getId()==R.id.button3)
        {
            Toast.makeText(this,b3.getText(),Toast.LENGTH_SHORT).show();
            Intent i=new Intent(this,DeleteAllRecords.class);
            startActivity(i);
        }
        if(v.getId()==R.id.button4)
        {
            Toast.makeText(this,b4.getText(),Toast.LENGTH_SHORT).show();
            Intent i=new Intent(this,UpdateRecord.class);
            startActivity(i);
        }
        if(v.getId()==R.id.button5)
        {
            Toast.makeText(this,b5.getText(),Toast.LENGTH_SHORT).show();
            Intent i=new Intent(this,DisplayAllRecords.class);
            startActivity(i);
        }
    }
}

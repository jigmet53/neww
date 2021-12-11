package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class add extends AppCompatActivity {

    Button b1,b2;
    TextView a,s;
    int s1=8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= findViewById(R.id.b1);
        b2= findViewById(R.id.b2);
        a= findViewById(R.id.a);
        s= findViewById(R.id.s);

    }



    public void Check (View v)
    {
        switch(v.getId())
        {
            case R.id.b1:

                s1=s1+1;
                a.setText(Double.toString(s1));

                break;

            case R.id.b2:


                 s1=s1-1;
                s.setText(Double.toString(s1));



                break;


        }

    }
}
package com.example.calc_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    EditText e1,e2;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1=findViewById(R.id.e1);
                e2=findViewById(R.id.e2);
                String a=e1.getText().toString();
                int a1=Integer.parseInt(a);
                String b=e2.getText().toString();
                int b1=Integer.parseInt(b);
                int r=a1+b1;
                String re=Integer.toString(r);
                Intent i= new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("val",re);
                startActivity(i);


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1=findViewById(R.id.e1);
                e2=findViewById(R.id.e2);
                String a=e1.getText().toString();
                int a1=Integer.parseInt(a);
                String b=e2.getText().toString();
                int b1=Integer.parseInt(b);
                int r=a1-b1;
                String re=Integer.toString(r);
                Intent i= new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("val",re);
                startActivity(i);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1=findViewById(R.id.e1);
                e2=findViewById(R.id.e2);
                String a=e1.getText().toString();
                int a1=Integer.parseInt(a);
                String b=e2.getText().toString();
                int b1=Integer.parseInt(b);
                int r=a1*b1;
                String re=Integer.toString(r);
                Intent i= new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("val",re);
                startActivity(i);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1=findViewById(R.id.e1);
                e2=findViewById(R.id.e2);
                String a=e1.getText().toString();
                float a1=Float.parseFloat(a);
                String b=e2.getText().toString();
                float b1=Float.parseFloat(b);

                float r=a1/b1;
                String re=Float.toString(r);
                Intent i= new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("val",re);
                startActivity(i);

            }
        });


    }
}

package com.example.exercise8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
Button btminus,btadd;
TextView count,reset;
int mycount=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btminus=(Button)findViewById(R.id.buttonminus);
        btadd=(Button)findViewById(R.id.buttonadd);
        count=(TextView)findViewById(R.id.t2);
        reset=(TextView)findViewById(R.id.buttonreset);
        btminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycount--;
                count.setText(mycount +"");
            }
        });
        btadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycount++;
                count.setText(mycount +"");
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycount=0;
                count.setText(mycount +"");
            }
        });
    }
}

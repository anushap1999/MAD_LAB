package com.example.calc_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extra=getIntent().getExtras();
        String v=extra.getString("val");
        t=findViewById(R.id.text1);
        t.setText(v);

    }
}

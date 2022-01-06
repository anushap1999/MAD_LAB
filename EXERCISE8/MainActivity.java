package com.example.exercise8;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int countnum = 0;
    TextView count,reset;
    Button bplus,bminus;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bplus=(Button)findViewById(R.id.plus);
        bminus=(Button)findViewById(R.id.minus);
        count=(TextView)findViewById(R.id.txtvalue);
        reset=(TextView) findViewById(R.id.rst);

        bplus.setOnClickListener(new View.OnClickListener()
            {
            @Override
            public void onClick(View v) {
                countnum++;
                count.setText(countnum + "");
            }
        });

        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countnum--;
                count.setText(countnum + "");
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countnum = 0;
                count.setText(countnum + "");
            }
        });

    }

}



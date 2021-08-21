package com.example.abhinay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
   EditText a,b,c;
   TextView x1,x2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a =  findViewById(R.id.a);
        b =  findViewById(R.id.b);
        c =  findViewById(R.id.c);
        x1 = findViewById(R.id.x1);
        x2 = findViewById(R.id.x2);
        button = findViewById(R.id.button);


            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String s1 = a.getText().toString();
                    String s2 = b.getText().toString();
                    String s3 = c.getText().toString();
                    int a1 = Integer.parseInt(s1);
                    int b1 = Integer.parseInt(s2);
                    int c1 = Integer.parseInt(s3);
                    double u = -b1/(2.0*a1);
                    double z = Math.sqrt(b1*b1 - 4*a1*c1)/(2.0*a1);
                    double x = (u + z);
                    double y = (u - z);
                    x1.setText(String.valueOf(x));
                    x2.setText(String.valueOf(y));
                }
            });









    }
}
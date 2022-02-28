package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    TextView t1;
    Button b1,b2,b3,b4,b5;
    int result;
//    String num1,num2;
//    int n1,n2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        t1=findViewById(R.id.t1);

//        num1=ed1.getText().toString();
//        num2=ed2.getText().toString();
//
//        n1=Integer.parseInt(num1);
//        n2=Integer.parseInt(num2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String num1=ed1.getText().toString();
                 int n1=Integer.parseInt(num1);
               String num2=ed2.getText().toString();
                 int n2=Integer.parseInt(num2);



            result=n1+n2;
            t1.setText(Integer.toString(result));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=ed1.getText().toString();
                final int n1=Integer.parseInt(num1);
                String num2=ed2.getText().toString();
                final int n2=Integer.parseInt(num2);



                result=n1-n2;
                t1.setText(Integer.toString(result));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=ed1.getText().toString();
                final int n1=Integer.parseInt(num1);
                String num2=ed2.getText().toString();
                final int n2=Integer.parseInt(num2);



                result=n1*n2;
                t1.setText(Integer.toString(result));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=ed1.getText().toString();
                final int n1=Integer.parseInt(num1);
                String num2=ed2.getText().toString();
                final int n2=Integer.parseInt(num2);



                result=n1/n2;
                t1.setText(Integer.toString(result));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=ed1.getText().toString();
                final int n1=Integer.parseInt(num1);
                String num2=ed2.getText().toString();
                final int n2=Integer.parseInt(num2);



                result=n1%n2;
                t1.setText(Integer.toString(result));
            }
        });



    }
}

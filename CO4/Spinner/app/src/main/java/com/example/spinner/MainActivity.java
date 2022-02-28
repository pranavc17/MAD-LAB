package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Spinner sp;
TextView tv;
String[] name={"red","blue","yellow"};
String[] details={"apple is red","sky is blue","banana is yellow"};
ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner sp=findViewById(R.id.sp);
        TextView tv=findViewById(R.id.tv);
        adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,name);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 0:
                        tv.setText(details[i]);
                        break;
                    case 1:
                        tv.setText(details[i]);
                        break;
                    case 2:
                        tv.setText(details[i]);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
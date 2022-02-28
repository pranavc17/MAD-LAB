package com.example.madlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etuser,etpass;
    Button button;
    TextView t1;
    String username,password;
    int count=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etuser=findViewById(R.id.etuser);
        etpass=findViewById(R.id.etpass);
        t1=findViewById(R.id.text);
        button=findViewById(R.id.button);
    }

    public void signIn(View view) {
        username=etuser.getText().toString();
        password=etpass.getText().toString();

        if(username.equals("admin") && password.equals("admin"))

        {
            Toast.makeText(getApplicationContext(), "Login success", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this,MainActivity2.class));
        }
        else{
            Toast.makeText(getApplicationContext(), "Invalid", Toast.LENGTH_SHORT).show();
            count--;
            t1.setText("RemainingAttempt"+count);
            if(count==0)
            {
                t1.setText("LoginDisabled");
                button.setEnabled(false);
            }
        }
    }
}
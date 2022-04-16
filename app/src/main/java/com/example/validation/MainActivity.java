package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText entuser,entpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button);
        entuser=(EditText) findViewById(R.id.entuser);
        entpass=(EditText) findViewById(R.id.entpass);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(entuser.getText().toString().matches("[a-zA-Z]+") && entpass.getText().toString().matches("[0-9]+") && entpass.getText().toString().length()==4)
                    Toast.makeText(getApplicationContext(),"Success", Toast.LENGTH_LONG).show();
                else if(!entuser.getText().toString().matches("[a-zA-Z]+"))
                    Toast.makeText(getApplicationContext(),"Invalid UserName",Toast.LENGTH_LONG).show();
                else if(!entpass.getText().toString().matches("[0-9]+"))
                    Toast.makeText(getApplicationContext(),"Invalid Password",Toast.LENGTH_LONG).show();
                    // else if(!entpass.getText().toString().length()==4)

                else if(entuser.length()==0 && entpass.length()==0)
                    Toast.makeText(getApplicationContext(),"all fields required",Toast.LENGTH_LONG).show();



            }
        });

    }
}
package com.example.rickroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity 
{
    EditText userName;
    EditText userEmail;
    EditText userPassword;

    Button Create;
    Button AlreadyAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.userName);
        userEmail = findViewById(R.id.userEmail);
        userPassword = findViewById(R.id.userPassword);

        Create = findViewById(R.id.loginbtl);
        AlreadyAccount = findViewById(R.id.AlreadyAccount);

        Create.setOnClickListener(new View.OnClickListener() 
        {
            @Override
            public void onClick(View view) {
                if(userName.getText().toString().equals("") || userEmail.getText().toString().equals("") || userPassword.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this,"Please Enter All The Vital Information", Toast.LENGTH_SHORT).show();
                }
                else
            {
                Toast.makeText(MainActivity.this,"Account Created || Redricting You To The App", Toast.LENGTH_SHORT).show();


                    gotoUrl( "https://www.youtube.com/watch?v=BBJa32lCaaY");

            }


            }
        });

        AlreadyAccount.setOnClickListener(new View.OnClickListener() 
        {
            @Override
            public void onClick(View view) 
            {
                Toast.makeText(MainActivity.this, "Sorry Service is Not Available || Please Try again ",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void gotoUrl(String s)
    {
        Uri uri =  Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}

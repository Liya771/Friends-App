package com.example.friendsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    AppCompatButton bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       ed1=(EditText) findViewById(R.id.name);
       ed2=(EditText) findViewById(R.id.fname);
       ed3=(EditText) findViewById(R.id.nickname);
       ed4=(EditText) findViewById(R.id.des);
       bt1=(AppCompatButton) findViewById(R.id.enter);

       bt1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String getName=ed1.getText().toString();
               String getFriendName=ed1.getText().toString();
               String getNickName=ed1.getText().toString();
               String getDesc=ed1.getText().toString();
               Toast.makeText(getApplicationContext(),getName,Toast.LENGTH_LONG).show();
           }
       });
    }
}
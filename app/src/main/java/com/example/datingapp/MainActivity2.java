package com.example.datingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import view.OnClickListener;

public class MainActivity2 extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
openDialouge();
        }

           public void openDialouge() {
ExampleDialouge exampleDialouge = new ExampleDialouge();
exampleDialouge.show(getSupportFragmentManager(), "example dialog");
}
}}
}

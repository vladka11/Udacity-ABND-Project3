package com.example.android.myquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EndActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end_activity);


        Intent ii = getIntent();
        int omg = ii.getIntExtra("pocet",0);
        String filmy = ii.getStringExtra("typyFilmov");
        TextView c = findViewById(R.id.output);
        c.setText(omg + "/10 correctly :)");


    }

    public void jumpToStart(android.view.View view){
        startActivity(new Intent(this, MainActivity.class));
    }



}

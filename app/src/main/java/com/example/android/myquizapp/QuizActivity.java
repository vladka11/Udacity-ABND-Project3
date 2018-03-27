package com.example.android.myquizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {
    int pocetDobrych = 0;
    String movies= " ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Intent i = getIntent();
        String omg = i.getStringExtra("meno");
        TextView c = findViewById(R.id.welcome);
        c.setText("Welcome " + omg);
    }

    public void getSummary(android.view.View view){
        checkCorrectName();
        Intent ii = new Intent(this, EndActivity.class);
        ii.putExtra("pocet",pocetDobrych);
        startActivity(ii);
    }

    public int onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.forrestgump:
                if (checked)
                   pocetDobrych++;
                    break;
            case R.id.dirtydancing:
                if (checked)
                    pocetDobrych++;
                    break;
            case R.id.imitationgame:
                if (checked)
                    pocetDobrych++;
                break;
            case R.id.silence:
                if (checked)
                    pocetDobrych++;
                break;
            case R.id.godfather:
                if (checked)
                    pocetDobrych++;
                break;
            case R.id.starwars:
                if (checked)
                    pocetDobrych++;
                break;
        }
        return pocetDobrych;
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.correct1:
                if (checked)
                    pocetDobrych++;
                break;
            case R.id.correct2:
                if (checked)
                    pocetDobrych++;
                break;

        }
    }

    public void checkCorrectName(){
        TextView movie = findViewById(R.id.nemo);
        if (movie.getText().toString().equals("finding nemo")){
            pocetDobrych +=2;
        } else if(movie.getText().toString().equals("nemo")){
            pocetDobrych +=2;
        }
    }
}

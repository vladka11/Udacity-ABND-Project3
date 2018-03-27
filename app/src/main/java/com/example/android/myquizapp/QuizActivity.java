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
    int pocetDobrych;
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
        checkCheckbox();
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

    public void checkCheckbox() {
        CheckBox ok1 = findViewById(R.id.correct1);
        CheckBox ok2 = findViewById(R.id.correct2);

        CheckBox ko1 = findViewById(R.id.notcorrect1);
        CheckBox ko2 = findViewById(R.id.notcorrect2);
        CheckBox kO3 = findViewById(R.id.notcorrect3);

        if(ok1.isChecked() && ok2.isChecked() && !ko1.isChecked() && !ko2.isChecked() && kO3.isChecked()) {
            pocetDobrych += 2;
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

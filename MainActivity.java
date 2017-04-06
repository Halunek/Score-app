package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreA = 0;
    int scoreB = 0;


    public void plus3(View view) {
        scoreA = scoreA + 3;
        display(scoreA);
    }
    public void plus2(View view) {
        scoreA = scoreA + 2;
        display(scoreA);
    }
    public void plus1(View view) {
        scoreA = scoreA + 1;
        display(scoreA);
    }
    public void bplus3(View view){
        scoreB = scoreB + 3;
        displayB(scoreB);
    }
    public void bplus2(View view){
        scoreB = scoreB + 2;
        displayB(scoreB);
    }
    public void bplus1(View view){
        scoreB = scoreB + 1;
        displayB(scoreB);
    }
    public void reset (View view){
        scoreB = 0;
        scoreA = 0;
        display(scoreA);
        displayB(scoreB);

    }

    private void display (int score ) {
        TextView scoreTextView = (TextView) findViewById(R.id.score);
        scoreTextView.setText("Score: " + score);

    }
    private void displayB (int score ) {
        TextView scoreTextView = (TextView) findViewById(R.id.scoreB);
        scoreTextView.setText("Score: " + score);
    }

}

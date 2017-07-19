package com.hckim.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScoreboardActivity extends AppCompatActivity {

    private TextView mScoreTextView;
    private int mScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoreboard);

        mScoreTextView = (TextView) findViewById(R.id.score_text_a);
        mScoreTextView = (TextView) findViewById(R.id.score_text_b);

    }

    public void threePointsAClicked(View view) {

    }

    public void twoPointsAClicked(View view) {
    }

    public void freeThrowAClicked(View view) {
    }

    public void threePointsClicked(View view) {
    }

    public void twoPointsBClicked(View view) {
    }
}

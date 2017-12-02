package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /***RESET BUTTON****/
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /*** DISPLAY TEAM A METHOD****/

    public void displayForTeamA(int scorea) {
        TextView scoreView1 = (TextView) findViewById(R.id.team_a_score);
        scoreView1.setText(String.valueOf(scorea));
    }

    /*** DISPLAY TEAM B METHOD****/

    public void displayForTeamB(int scoreb) {
        TextView scoreView2 = (TextView) findViewById(R.id.team_b_score);
        scoreView2.setText(String.valueOf(scoreb));
        Log.d(, jhdj);
    }

/***  BUTTON METHODS FOR TEAM A****/

    public void threeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void twoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void oneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
/***  BUTTON METHODS FOR TEAM B****/


    public void threeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void twoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void oneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

}

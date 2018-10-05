package com.example.adam.rozpiskimeczowe.everyoneForEveryone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.adam.rozpiskimeczowe.R;

public class Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        TextView teamNameRes01 = findViewById(R.id.teamNameRes01);
        TextView teamNameRes02 = findViewById(R.id.teamNameRes02);
        TextView teamNameRes03 = findViewById(R.id.teamNameRes03);
        TextView teamNameRes04 = findViewById(R.id.teamNameRes04);
        TextView teamNameRes05 = findViewById(R.id.teamNameRes05);
        TextView teamNameRes06 = findViewById(R.id.teamNameRes06);

        TextView teamPoints1 = findViewById(R.id.teamPoints01);
        TextView teamPoints2 = findViewById(R.id.teamPoints02);
        TextView teamPoints3 = findViewById(R.id.teamPoints03);
        TextView teamPoints4 = findViewById(R.id.teamPoints04);
        TextView teamPoints5 = findViewById(R.id.teamPoints05);
        TextView teamPoints6 = findViewById(R.id.teamPoints06);

        TextView teamWins1 = findViewById(R.id.teamWins1);
        TextView teamWins2 = findViewById(R.id.teamWins2);
        TextView teamWins3 = findViewById(R.id.teamWins3);
        TextView teamWins4 = findViewById(R.id.teamWins4);
        TextView teamWins5 = findViewById(R.id.teamWins5);
        TextView teamWins6 = findViewById(R.id.teamWins6);




        teamNameRes01.append(getIntent().getStringExtra("NameOfTeam1"));
        teamNameRes02.append(getIntent().getStringExtra("NameOfTeam2"));
        teamNameRes03.append(getIntent().getStringExtra("NameOfTeam3"));

        String sTeamNameRes04 = getIntent().getStringExtra("NameOfTeam4");
        if (sTeamNameRes04!=null){teamNameRes04.append(sTeamNameRes04);}



        teamPoints1.setText(getIntent().getStringExtra("teamPoints1"));
        teamPoints2.setText(getIntent().getStringExtra("teamPoints2"));
        teamPoints3.setText(getIntent().getStringExtra("teamPoints3"));
        teamPoints4.setText(getIntent().getStringExtra("teamPoints4"));


        teamWins1.setText(getIntent().getStringExtra("teamWins1"));
        teamWins2.setText(getIntent().getStringExtra("teamWins2"));
        teamWins3.setText(getIntent().getStringExtra("teamWins3"));
        teamWins4.setText(getIntent().getStringExtra("teamWins4"));



        if(teamNameRes04.getText().equals("4.  ")){
            teamNameRes04.setVisibility(View.INVISIBLE);
        }
        if(teamNameRes05.getText().equals("5.  ")){
            teamNameRes05.setVisibility(View.INVISIBLE);
        }
        if(teamNameRes06.getText().equals("6.  ")){
            teamNameRes06.setVisibility(View.INVISIBLE);
        }

    }
}

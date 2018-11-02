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

        TextView teamSets1 = findViewById(R.id.teamSets1);
        TextView teamSets2 = findViewById(R.id.teamSets2);
        TextView teamSets3 = findViewById(R.id.teamSets3);
        TextView teamSets4 = findViewById(R.id.teamSets4);

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



        teamPoints1.setText(getIntent().getStringExtra("team1Points"));
        teamPoints2.setText(getIntent().getStringExtra("team2Points"));
        teamPoints3.setText(getIntent().getStringExtra("team3Points"));
        teamPoints4.setText(getIntent().getStringExtra("team4Points"));

        teamSets1.setText(getIntent().getStringExtra("team1Sets"));
        teamSets2.setText(getIntent().getStringExtra("team2Sets"));
        teamSets3.setText(getIntent().getStringExtra("team3Sets"));
        teamSets4.setText(getIntent().getStringExtra("team4Sets"));


        teamWins1.setText(getIntent().getStringExtra("team1Wins"));
        teamWins2.setText(getIntent().getStringExtra("team2Wins"));
        teamWins3.setText(getIntent().getStringExtra("team3Wins"));
        teamWins4.setText(getIntent().getStringExtra("team4Wins"));



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

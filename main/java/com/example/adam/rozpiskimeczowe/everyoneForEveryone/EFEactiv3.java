package com.example.adam.rozpiskimeczowe.everyoneForEveryone;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adam.rozpiskimeczowe.R;
import com.example.adam.rozpiskimeczowe.SetDetailedResultFor2Sets;
import com.example.adam.rozpiskimeczowe.SetResultsForGroups;
import com.example.adam.rozpiskimeczowe.brazylian.brazylian16.BRAZactiv16;

import org.w3c.dom.Text;

import java.io.FileReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class EFEactiv3 extends AppCompatActivity {
    String pktInTieBreak = "15";
    String typeOfTour = "Group_3";
    String pktInSet;
    LinearLayout linearLayout;
    TextView name1;
    TextView name2;
    TextView name3;

    TextView res12_1;
    EditText res12_1_1;
    EditText res12_1_2;
    EditText res12_1_3;

    TextView res12_2;
    EditText res12_2_1;
    EditText res12_2_2;
    EditText res12_2_3;

    TextView res13_1;
    EditText res13_1_1;
    EditText res13_1_2;
    EditText res13_1_3;

    TextView res13_3;
    EditText res13_3_1;
    EditText res13_3_2;
    EditText res13_3_3;

    TextView res23_2;
    EditText res23_2_1;
    EditText res23_2_2;
    EditText res23_2_3;

    TextView res23_3;
    EditText res23_3_1;
    EditText res23_3_2;
    EditText res23_3_3;

    Map<Integer,ArrayList<String>> mapResults;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_efe_activ3);
        ViewGroup vg = (ViewGroup) ((ViewGroup) this.findViewById(android.R.id.content)).getChildAt(0);
        linearLayout = findViewById(R.id.Efe3MainLayout);
        String nameOfTour = getIntent().getStringExtra("nameOfTour");
        mapResults = new HashMap<>();
        mapResults = (HashMap<Integer,ArrayList<String>>)getIntent().getSerializableExtra("resMap");


        getSupportActionBar().setTitle("Grupowy: 3");
        pktInSet = getIntent().getStringExtra("pktInSet");
        SetResultsForGroups setResultsForGroups = new SetResultsForGroups(nameOfTour,typeOfTour,this, vg, pktInSet, pktInTieBreak);


        final LinearLayout layoutSets12 = findViewById(R.id.efe3_linear_sets_12);
        res12_1 = findViewById(R.id.EFE_3_res12_1);
        res12_1_1 = findViewById(R.id.EFE_3_res12_1_1);
        res12_1_2 = findViewById(R.id.EFE_3_res12_1_2);
        res12_1_3 = findViewById(R.id.EFE_3_res12_1_3);

        res12_1_1.setVisibility(View.INVISIBLE);
        res12_1_2.setVisibility(View.INVISIBLE);
        res12_1_3.setVisibility(View.INVISIBLE);

        res12_2 = findViewById(R.id.EFE_3_res12_2);
        res12_2_1 = findViewById(R.id.EFE_3_res12_2_1);
        res12_2_2 = findViewById(R.id.EFE_3_res12_2_2);
        res12_2_3 = findViewById(R.id.EFE_3_res12_2_3);

        res12_2_1.setVisibility(View.INVISIBLE);
        res12_2_2.setVisibility(View.INVISIBLE);
        res12_2_3.setVisibility(View.INVISIBLE);


        final LinearLayout layoutSets13 = findViewById(R.id.efe3_linear_sets_13);
        res13_1 = findViewById(R.id.EFE_3_res13_1);
        res13_1_1 = findViewById(R.id.EFE_3_res13_1_1);
        res13_1_2 = findViewById(R.id.EFE_3_res13_1_2);
        res13_1_3 = findViewById(R.id.EFE_3_res13_1_3);

        res13_1_1.setVisibility(View.INVISIBLE);
        res13_1_2.setVisibility(View.INVISIBLE);
        res13_1_3.setVisibility(View.INVISIBLE);


        res13_3 = findViewById(R.id.EFE_3_res13_3);
        res13_3_1 = findViewById(R.id.EFE_3_res13_3_1);
        res13_3_2 = findViewById(R.id.EFE_3_res13_3_2);
        res13_3_3 = findViewById(R.id.EFE_3_res13_3_3);

        res13_3_1.setVisibility(View.INVISIBLE);
        res13_3_2.setVisibility(View.INVISIBLE);
        res13_3_3.setVisibility(View.INVISIBLE);


        final LinearLayout layoutSets23 = findViewById(R.id.efe3_linear_sets_23);
        res23_2 = findViewById(R.id.EFE_3_res23_2);
        res23_2_1 = findViewById(R.id.EFE_3_res23_2_1);
        res23_2_2 = findViewById(R.id.EFE_3_res23_2_2);
        res23_2_3 = findViewById(R.id.EFE_3_res23_2_3);

        res23_2_1.setVisibility(View.INVISIBLE);
        res23_2_2.setVisibility(View.INVISIBLE);
        res23_2_3.setVisibility(View.INVISIBLE);


        res23_3 = findViewById(R.id.EFE_3_res23_3);
        res23_3_1 = findViewById(R.id.EFE_3_res23_3_1);
        res23_3_2 = findViewById(R.id.EFE_3_res23_3_2);
        res23_3_3 = findViewById(R.id.EFE_3_res23_3_3);

        res23_3_1.setVisibility(View.INVISIBLE);
        res23_3_2.setVisibility(View.INVISIBLE);
        res23_3_3.setVisibility(View.INVISIBLE);

        //TextView only With Sets
        final TextView res21_2 = findViewById(R.id.EFE_3_res21_2 );
        final TextView res21_1 = findViewById(R.id.EFE_3_res21_1);
        final TextView res31_3 = findViewById(R.id.EFE_3_res31_3);
        final TextView res31_1 = findViewById(R.id.EFE_3_res31_1);
        final TextView res32_3 = findViewById(R.id.EFE_3_res32_3);
        final TextView res32_2 = findViewById(R.id.EFE_3_res32_2);


        final TextView TM1 = findViewById(R.id.TextMatches01);
        final TextView TM2 = findViewById(R.id.TextMatches02);
        final TextView TM3 = findViewById(R.id.TextMatches03);

        name1 = findViewById(R.id.TeamName01);
        name2 = findViewById(R.id.TeamName02);
        name3 = findViewById(R.id.TeamName03);


        // dodanie nazw
        name1.setText(getIntent().getStringExtra("NameOfTeam1"));
        name2.setText(getIntent().getStringExtra("NameOfTeam2"));
        name3.setText(getIntent().getStringExtra("NameOfTeam3"));

        if(mapResults!=null) {
            if (mapResults.get(1) != null) {
                res12_1.setText(mapResults.get(1).get(6));
                res21_1.setText(mapResults.get(1).get(6));
                res12_1_1.setText(mapResults.get(1).get(0));
                res12_1_2.setText(mapResults.get(1).get(1));
                res12_1_3.setText(mapResults.get(1).get(2));

                res12_2.setText(mapResults.get(1).get(7));
                res21_2.setText(mapResults.get(1).get(7));
                res12_2_1.setText(mapResults.get(1).get(3));
                res12_2_2.setText(mapResults.get(1).get(4));
                res12_2_3.setText(mapResults.get(1).get(5));
                TM1.setPaintFlags(TM1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            }

            if (mapResults.get(2) != null) {
                res13_1.setText(mapResults.get(2).get(6));
                res31_1.setText(mapResults.get(2).get(6));
                res13_1_1.setText(mapResults.get(2).get(0));
                res13_1_2.setText(mapResults.get(2).get(1));
                res13_1_3.setText(mapResults.get(2).get(2));

                res13_3.setText(mapResults.get(2).get(7));
                res31_3.setText(mapResults.get(2).get(7));
                res13_3_1.setText(mapResults.get(2).get(3));
                res13_3_2.setText(mapResults.get(2).get(4));
                res13_3_3.setText(mapResults.get(2).get(5));
                TM2.setPaintFlags(TM2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            }

            if (mapResults.get(3) != null) {
                res23_2.setText(mapResults.get(3).get(6));
                res32_2.setText(mapResults.get(3).get(6));
                res23_2_1.setText(mapResults.get(3).get(0));
                res23_2_2.setText(mapResults.get(3).get(1));
                res23_2_3.setText(mapResults.get(3).get(2));

                res23_3.setText(mapResults.get(3).get(7));
                res32_3.setText(mapResults.get(3).get(7));
                res23_3_1.setText(mapResults.get(3).get(3));
                res23_3_2.setText(mapResults.get(3).get(4));
                res23_3_3.setText(mapResults.get(3).get(5));
                TM3.setPaintFlags(TM3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            }
        }

        // dodanie wyników
        setResultsForGroups.set(layoutSets12, res12_1_1, res12_1_2, res12_1_3, res12_2_1, res12_2_2, res12_2_3, res12_1, res12_2, res21_1, res21_2, TM1);
        setResultsForGroups.set(layoutSets13, res13_1_1, res13_1_2, res13_1_3, res13_3_1, res13_3_2, res13_3_3, res13_1, res13_3, res31_1, res31_3, TM2);
        setResultsForGroups.set(layoutSets23, res23_2_1, res23_2_2, res23_2_3, res23_3_1, res23_3_2, res23_3_3, res23_2, res23_3, res32_2, res32_3, TM3);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar_with_wyniki_button, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menuWynikiButton:

                int team1Wins = 0;
                int team2Wins = 0;
                int team3Wins = 0;


                int sets12_1 = 0;
                int sets13_1 = 0;
                int sets12_2 = 0;
                int sets23_2 = 0;
                int sets23_3 = 0;
                int sets13_3 = 0;

                try {
                    sets12_1 = Integer.parseInt(res12_1.getText().toString());
                    sets13_1 = Integer.parseInt(res13_1.getText().toString());
                    sets12_2 = Integer.parseInt(res12_2.getText().toString());
                    sets23_2 = Integer.parseInt(res23_2.getText().toString());
                    sets23_3 = Integer.parseInt(res23_3.getText().toString());
                    sets13_3 = Integer.parseInt(res13_3.getText().toString());

                } catch (NumberFormatException e) {

                }



                    int team1Points = addPoints(res12_1_1,res12_1_2,res12_1_3,res13_1_1,res13_1_2,res13_1_3);

                    int team2Points = addPoints(res12_2_1,res12_2_2,res12_2_3,res23_2_1,res23_2_2,res23_2_3);

                    int team3Points = addPoints(res13_3_1,res13_3_2,res13_3_3,res23_3_1,res23_3_2,res23_3_3);



                if (sets12_1 > sets12_2) {
                    team1Wins++;
                } else if (sets12_1 < sets12_2) {
                    team2Wins++;
                }

                if (sets13_1 > sets13_3) {
                    team1Wins++;
                } else if (sets13_1 < sets13_3) {
                    team3Wins++;
                }
                if (sets23_2 > sets23_3) {
                    team2Wins++;
                } else if (sets23_2 < sets23_3) {
                    team3Wins++;
                }


                int team1Sets = sets12_1 + sets13_1;
                int team2Sets = sets12_2 + sets23_2;
                int team3Sets = sets13_3 + sets23_3;


                List<Score> scores = new ArrayList<>();

                scores.add(new Score(team1Wins, team1Sets, team1Points, name1.getText().toString()));
                scores.add(new Score(team2Wins, team2Sets, team2Points, name2.getText().toString()));
                scores.add(new Score(team3Wins, team3Sets, team3Points, name3.getText().toString()));

                Collections.sort(scores);


                Intent intent = new Intent(EFEactiv3.this, Results.class);
                intent.putExtra("team1Wins", Integer.toString(scores.get(2).getWins()));
                intent.putExtra("team2Wins", Integer.toString(scores.get(1).getWins()));
                intent.putExtra("team3Wins", Integer.toString(scores.get(0).getWins()));
                intent.putExtra("team1Sets", Integer.toString(scores.get(2).getSets()));
                intent.putExtra("team2Sets", Integer.toString(scores.get(1).getSets()));
                intent.putExtra("team3Sets", Integer.toString(scores.get(0).getSets()));
                intent.putExtra("team1Points", Integer.toString(scores.get(2).getPoints()));
                intent.putExtra("team2Points", Integer.toString(scores.get(1).getPoints()));
                intent.putExtra("team3Points", Integer.toString(scores.get(0).getPoints()));
                intent.putExtra("NameOfTeam1", scores.get(2).getName());
                intent.putExtra("NameOfTeam2", scores.get(1).getName());
                intent.putExtra("NameOfTeam3", scores.get(0).getName());
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }


    class Score implements Comparable<Score> {
        int points;
        int sets;
        int wins;
        String name;

        Score(int wins, int sets, int points, String name) {
            this.wins = wins;
            this.sets = sets;
            this.points = points;
            this.name = name;
        }

        int getPoints() {
            return points;
        }

        int getSets() {
            return sets;
        }

        public String getName() {
            return name;
        }

        int getWins() {
            return wins;
        }

        @Override
        public int compareTo(Score o) {
            int compareWins = Integer.compare(wins, o.wins);

            if (compareWins == 0) {
                int compareSets = Integer.compare(sets, o.sets);
                if (compareSets == 0) {
                    return Integer.compare(points, o.points);
                }
                return compareSets;
            } else {
                return compareWins;
            }
        }
    }
    int addPoints(EditText res1_1,EditText res1_2, EditText res1_3,EditText res2_1,EditText res2_2, EditText res2_3){
        int ires1_1=0;
        int ires1_2=0;
        int ires1_3=0;
        int ires2_1=0;
        int ires2_2=0;
        int ires2_3=0;

        if(!res1_1.getText().toString().equals("")){
            ires1_1 = Integer.parseInt(res1_1.getText().toString());
        }

        if(!res1_2.getText().toString().equals("")){
            ires1_2 = Integer.parseInt(res1_2.getText().toString());
        }

        if(!res1_3.getText().toString().equals("")){
            ires1_3 = Integer.parseInt(res1_3.getText().toString());
        }

        if(!res2_1.getText().toString().equals("")){
            ires2_1 = Integer.parseInt(res2_1.getText().toString());
        }

        if(!res2_2.getText().toString().equals("")){
            ires2_2 = Integer.parseInt(res2_2.getText().toString());
        }

        if(!res2_3.getText().toString().equals("")){
            ires2_3 = Integer.parseInt(res2_3.getText().toString());
        }


        return ires1_1 + ires1_2 + ires1_3 + ires2_1 + ires2_2 + ires2_3;
    }
}

package com.example.adam.rozpiskimeczowe.everyoneForEveryone;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adam.rozpiskimeczowe.R;

import org.w3c.dom.Text;

import java.io.FileReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EFEactiv3 extends AppCompatActivity {

    String pktInSet;
    TableLayout tableLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_efeactiv3);

        tableLayout = findViewById(R.id.layoutEfe3);
        final EditText res12_1 = findViewById(R.id.res12_1);
        final EditText res12_2 = findViewById(R.id.res12_2);
        final EditText res13_1 = findViewById(R.id.res13_1);
        final EditText res13_3 = findViewById(R.id.res13_3);
        final EditText res23_2 = findViewById(R.id.res23_2);
        final EditText res23_3 = findViewById(R.id.res23_3);

        final TextView res21_2 = findViewById(R.id.res21_2);
        final TextView res21_1 = findViewById(R.id.res21_1);
        final TextView res31_3 = findViewById(R.id.res31_3);
        final TextView res31_1 = findViewById(R.id.res31_1);
        final TextView res32_3 = findViewById(R.id.res32_3);
        final TextView res32_2 = findViewById(R.id.res32_2);


        final TextView TM1 = findViewById(R.id.TextMatches01);
        final TextView TM2 = findViewById(R.id.TextMatches02);
        final TextView TM3 = findViewById(R.id.TextMatches03);

        final TextView name1 = findViewById(R.id.TeamName01);
        final TextView name2 = findViewById(R.id.TeamName02);
        final TextView name3 = findViewById(R.id.TeamName03);

        pktInSet = getIntent().getStringExtra("pktInSet");

        // dodanie nazw
        name1.setText(getIntent().getStringExtra("NameOfTeam1"));
        name2.setText(getIntent().getStringExtra("NameOfTeam2"));
        name3.setText(getIntent().getStringExtra("NameOfTeam3"));

        // dodanie wyników
        addResults(res12_1, res12_2, res21_1, res21_2, TM1);

        addResults(res13_1, res13_3, res31_1, res31_3, TM2);

        addResults(res23_2, res23_3, res32_2, res32_3, TM3);


        /*final Boolean Bool3 = getIntent().getExtras().getBoolean("Bool3");*/


        Button finalResults = findViewById(R.id.buttonResults);
        finalResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Integer teamWins1 = 0;
                Integer teamWins2 = 0;
                Integer teamWins3 = 0;
                int intRes12_1 = 0;
                int intRes12_2 = 0;
                int intRes13_1 = 0;
                int intRes13_3 = 0;
                int intRes23_2 = 0;
                int intRes23_3 = 0;

                try {
                    intRes12_1 = Integer.parseInt(res12_1.getText().toString());
                } catch (NumberFormatException ignored) {
                }
                try {
                    intRes12_2 = Integer.parseInt(res12_2.getText().toString());
                } catch (NumberFormatException ignored) {
                }
                try {
                    intRes23_2 = Integer.parseInt(res23_2.getText().toString());
                } catch (NumberFormatException ignored) {
                }
                try {
                    intRes23_3 = Integer.parseInt(res23_3.getText().toString());
                } catch (NumberFormatException ignored) {
                }
                try {
                    intRes13_1 = Integer.parseInt(res13_1.getText().toString());
                } catch (NumberFormatException ignored) {
                }
                try {
                    intRes13_3 = Integer.parseInt(res13_3.getText().toString());
                } catch (NumberFormatException ignored) {
                }

                if (intRes12_1 > intRes12_2) {
                    teamWins1 += 1;
                } else if (intRes12_1 < intRes12_2) {
                    teamWins2 += 1;
                }

                if (intRes13_1 > intRes13_3) {
                    teamWins1 += 1;
                } else if (intRes13_1 < intRes13_3) {
                    teamWins3 += 1;
                }
                if (intRes23_2 > intRes23_3) {
                    teamWins2 += 1;
                } else if (intRes23_2 < intRes23_3) {
                    teamWins3 += 1;
                }


                Integer teamPoints1 = intRes12_1 + intRes13_1;
                Integer teamPoints2 = intRes12_2 + intRes23_2;
                Integer teamPoints3 = intRes13_3 + intRes23_3;

                List<Score> scores = new ArrayList<>();

                scores.add(new Score(teamWins1, teamPoints1, name1.getText().toString()));
                scores.add(new Score(teamWins2, teamPoints2, name2.getText().toString()));
                scores.add(new Score(teamWins3, teamPoints3, name3.getText().toString()));

                Collections.sort(scores);


                Intent intent = new Intent(EFEactiv3.this, Results.class);
                intent.putExtra("teamWins1", Integer.toString(scores.get(2).getWins()));
                intent.putExtra("teamWins2", Integer.toString(scores.get(1).getWins()));
                intent.putExtra("teamWins3", Integer.toString(scores.get(0).getWins()));
                intent.putExtra("teamPoints1", Integer.toString(scores.get(2).getPoints()));
                intent.putExtra("teamPoints2", Integer.toString(scores.get(1).getPoints()));
                intent.putExtra("teamPoints3", Integer.toString(scores.get(0).getPoints()));
                intent.putExtra("NameOfTeam1", scores.get(2).getName());
                intent.putExtra("NameOfTeam2", scores.get(1).getName());
                intent.putExtra("NameOfTeam3", scores.get(0).getName());
                startActivity(intent);
            }
        });


    }

    void addResults(final EditText firstPkt, final EditText secondPkt, final TextView firstPkt2, final TextView secondPkt2, final TextView matchNumber) {
        firstPkt.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {

                firstPkt2.setText(firstPkt.getText());
                if (firstPkt.getText().toString().length() == 2) {
                    secondPkt.requestFocus();
                }

            }

            public void afterTextChanged(Editable s) {

            }
        });

        secondPkt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(!b){
                    String res1 = firstPkt.getText().toString();
                    String res2 = secondPkt.getText().toString();
                    if((Math.abs(Integer.parseInt(res1)-Integer.parseInt(res2))>2&&(Integer.parseInt(pktInSet) == Integer.parseInt(res1)&&Integer.parseInt(res2)<Integer.parseInt(pktInSet))||(Integer.parseInt(pktInSet) == Integer.parseInt(res2)&&Integer.parseInt(res1)<Integer.parseInt(pktInSet)))||(Math.abs(Integer.parseInt(res1)-Integer.parseInt(res2))==2)){
                        if (res1.matches("") && res2.matches("")) {
                            matchNumber.setPaintFlags(matchNumber.getPaintFlags() | ~Paint.STRIKE_THRU_TEXT_FLAG);
                        } else {
                            matchNumber.setPaintFlags(matchNumber.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                        }
                    }else {
                        Toast.makeText(getApplicationContext(),"Wynik jest niepoprawny",Toast.LENGTH_SHORT).show();
                        firstPkt2.setText(null);
                        secondPkt2.setText(null);
                        firstPkt.setText(null);
                        secondPkt.setText(null);
                    }
                }
            }
        });

        secondPkt.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                secondPkt2.setText(secondPkt.getText());
                if (secondPkt.getText().toString().length() == 2) {
                    tableLayout.clearFocus();
                }
            }

            public void afterTextChanged(Editable s) {

            }

        });
    }


    class Score implements Comparable<Score> {
        int score;
        int wins;
        String name;

        Score(int wins, int score, String name) {
            this.wins = wins;
            this.score = score;
            this.name = name;
        }

        public int getPoints() {
            return score;
        }

        public String getName() {
            return name;
        }

        public int getWins() {
            return wins;
        }

        @Override
        public int compareTo(Score o) {
            int porownane = Integer.compare(wins, o.wins);

            if (porownane == 0) {
                return Integer.compare(score, o.score);
            } else {
                return porownane;
            }
        }
    }

}

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
import android.widget.TextView;

import com.example.adam.rozpiskimeczowe.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EFEactiv4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_efeactiv4);

        final EditText res12_1 = (EditText) findViewById(R.id.res12_1);
        final EditText res12_2 = (EditText) findViewById(R.id.res12_2);
        final EditText res13_1 = (EditText) findViewById(R.id.res13_1);
        final EditText res13_3 = (EditText) findViewById(R.id.res13_3);
        final EditText res23_2 = (EditText) findViewById(R.id.res23_2);
        final EditText res23_3 = (EditText) findViewById(R.id.res23_3);
/*
        DODANE DO 4
*/
        final EditText res14_4 = (EditText) findViewById(R.id.res14_4);
        final EditText res14_1 = (EditText) findViewById(R.id.res14_1);
        final EditText res24_4 = (EditText) findViewById(R.id.res24_4);
        final EditText res24_2 = (EditText) findViewById(R.id.res24_2);
        final EditText res34_4 = (EditText) findViewById(R.id.res34_4);
        final EditText res34_3 = (EditText) findViewById(R.id.res34_3);


        final TextView res21_2 = (TextView) findViewById(R.id.res21_2);
        final TextView res21_1 = (TextView) findViewById(R.id.res21_1);
        final TextView res31_3 = (TextView) findViewById(R.id.res31_3);
        final TextView res31_1 = (TextView) findViewById(R.id.res31_1);
        final TextView res32_3 = (TextView) findViewById(R.id.res32_3);
        final TextView res32_2 = (TextView) findViewById(R.id.res32_2);
/*
        DODANE DO 4
*/

        final TextView res41_1 = (TextView) findViewById(R.id.res41_1);
        final TextView res41_4 = (TextView) findViewById(R.id.res41_4);
        final TextView res42_2 = (TextView) findViewById(R.id.res42_2);
        final TextView res42_4 = (TextView) findViewById(R.id.res42_4);
        final TextView res43_3 = (TextView) findViewById(R.id.res43_3);
        final TextView res43_4 = (TextView) findViewById(R.id.res43_4);


        final TextView TM1 = (TextView) findViewById(R.id.TextMatches01);
        final TextView TM2 = (TextView) findViewById(R.id.TextMatches02);
        final TextView TM3 = (TextView) findViewById(R.id.TextMatches03);
        final TextView TM4 = (TextView) findViewById(R.id.TextMatches04);
        final TextView TM5 = (TextView) findViewById(R.id.TextMatches05);
        final TextView TM6 = (TextView) findViewById(R.id.TextMatches06);


        final TextView name1 = (TextView) findViewById(R.id.TeamName01);
        final TextView name2 = (TextView) findViewById(R.id.TeamName02);
        final TextView name3 = (TextView) findViewById(R.id.TeamName03);
        final TextView name4 = (TextView) findViewById(R.id.TeamName04);




        /* 6x DLA KAZDEGO EDITTEXTU*/

        res12_1.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                res21_1.setText(res12_1.getText());
                if(res12_1.getText().toString().length()==2){
                    res12_2.requestFocus();
                }

            }
            public void afterTextChanged(Editable s) {
                String Sres12_1 = res12_1.getText().toString();
                String Sres12_2 = res12_2.getText().toString();

                if(Sres12_1.matches("")&& Sres12_2.matches("")){
                    TM5.setPaintFlags(TM5.getPaintFlags() | ~Paint.STRIKE_THRU_TEXT_FLAG);
                }else{
                    TM5.setPaintFlags(TM5.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        res12_2.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                res21_2.setText(res12_2.getText());
            }
            public void afterTextChanged(Editable s) {
                String Sres12_1 = res12_1.getText().toString();
                String Sres12_2 = res12_2.getText().toString();

                if(Sres12_1.matches("")&& Sres12_2.matches("")){
                    TM5.setPaintFlags(TM5.getPaintFlags() | ~Paint.STRIKE_THRU_TEXT_FLAG);
                }else{
                    TM5.setPaintFlags(TM6.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        res13_1.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                res31_1.setText(res13_1.getText());
                if(res13_1.getText().toString().length()==2){
                    res13_3.requestFocus();
                }

            }
            public void afterTextChanged(Editable s) {
                String Sres13_1 = res13_1.getText().toString();
                String Sres13_3 = res13_3.getText().toString();

                if(Sres13_1.matches("")&& Sres13_3.matches("")){
                    TM3.setPaintFlags(TM3.getPaintFlags() | ~Paint.STRIKE_THRU_TEXT_FLAG);
                }else{
                    TM3.setPaintFlags(TM3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        res13_3.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                res31_3.setText(res13_3.getText());
            }
            public void afterTextChanged(Editable s) {
                String Sres13_1 = res13_1.getText().toString();
                String Sres13_3 = res13_3.getText().toString();

                if(Sres13_1.matches("")&& Sres13_3.matches("")){
                    TM3.setPaintFlags(TM3.getPaintFlags() | ~Paint.STRIKE_THRU_TEXT_FLAG);
                }else{
                    TM3.setPaintFlags(TM3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        res23_2.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                res32_2.setText(res23_2.getText());
                if(res23_2.getText().toString().length()==2){
                    res23_3.requestFocus();
                }

            }
            public void afterTextChanged(Editable s) {
                String Sres23_2 = res23_2.getText().toString();
                String Sres23_3 = res23_3.getText().toString();

                if(Sres23_2.matches("")&& Sres23_3.matches("")){
                    TM2.setPaintFlags(TM2.getPaintFlags() | ~Paint.STRIKE_THRU_TEXT_FLAG);
                }else{
                    TM2.setPaintFlags(TM2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        res23_3.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                res32_3.setText(res23_3.getText());
            }
            public void afterTextChanged(Editable s) {
                String Sres23_2 = res23_2.getText().toString();
                String Sres23_3 = res23_3.getText().toString();

                if(Sres23_2.matches("")&& Sres23_3.matches("")){
                    TM2.setPaintFlags(TM2.getPaintFlags() | ~Paint.STRIKE_THRU_TEXT_FLAG);

                }else{
                    TM2.setPaintFlags(TM2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        res14_1.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                res41_1.setText(res14_1.getText());
                if(res14_1.getText().toString().length()==2){
                    res14_4.requestFocus();
                }
            }
            public void afterTextChanged(Editable s) {
                String Sres14_1 = res14_1.getText().toString();
                String Sres14_4 = res14_4.getText().toString();

                if(Sres14_4.matches("")&& Sres14_1.matches("")){
                    TM1.setPaintFlags(TM1.getPaintFlags() | ~Paint.STRIKE_THRU_TEXT_FLAG);
                }else{
                    TM1.setPaintFlags(TM1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        res14_4.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                res41_4.setText(res14_4.getText());
            }
            public void afterTextChanged(Editable s) {
                String Sres14_1 = res14_1.getText().toString();
                String Sres14_4 = res14_4.getText().toString();

                if(Sres14_4.matches("")&& Sres14_1.matches("")){
                    TM1.setPaintFlags(TM1.getPaintFlags() | ~Paint.STRIKE_THRU_TEXT_FLAG);
                }else{
                    TM1.setPaintFlags(TM1.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        res24_2.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                res42_2.setText(res24_2.getText());
                if(res24_2.getText().toString().length()==2){
                    res24_4.requestFocus();
                }
            }
            public void afterTextChanged(Editable s) {
                String Sres24_2 = res24_2.getText().toString();
                String Sres24_4 = res24_4.getText().toString();

                if(Sres24_4.matches("")&& Sres24_2.matches("")){
                    TM4.setPaintFlags(TM4.getPaintFlags() | ~Paint.STRIKE_THRU_TEXT_FLAG);
                }else{
                    TM4.setPaintFlags(TM4.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        res24_4.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                res42_4.setText(res24_4.getText());
            }
            public void afterTextChanged(Editable s) {
                String Sres24_2 = res24_2.getText().toString();
                String Sres24_4 = res24_4.getText().toString();

                if(Sres24_4.matches("")&& Sres24_2.matches("")){
                    TM4.setPaintFlags(TM4.getPaintFlags() | ~Paint.STRIKE_THRU_TEXT_FLAG);
                }else{
                    TM4.setPaintFlags(TM4.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        res34_3.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                res43_3.setText(res34_3.getText());
                if(res34_3.getText().toString().length()==2){
                    res34_4.requestFocus();
                }
            }
            public void afterTextChanged(Editable s) {
                String Sres34_3 = res34_3.getText().toString();
                String Sres34_4 = res34_4.getText().toString();

                if(Sres34_4.matches("")&& Sres34_3.matches("")){
                    TM6.setPaintFlags(TM6.getPaintFlags() | ~Paint.STRIKE_THRU_TEXT_FLAG);
                }else{
                    TM6.setPaintFlags(TM6.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });

        res34_4.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                res43_4.setText(res34_4.getText());
            }
            public void afterTextChanged(Editable s) {
                String Sres34_3 = res34_3.getText().toString();
                String Sres34_4 = res34_4.getText().toString();

                if(Sres34_4.matches("")&& Sres34_3.matches("")){
                    TM6.setPaintFlags(TM6.getPaintFlags() | ~Paint.STRIKE_THRU_TEXT_FLAG);
                }else{
                    TM6.setPaintFlags(TM6.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        });



        name1.setText(getIntent().getStringExtra("NameOfTeam1"));
        name2.setText(getIntent().getStringExtra("NameOfTeam2"));
        name3.setText(getIntent().getStringExtra("NameOfTeam3"));
        name4.setText(getIntent().getStringExtra("NameOfTeam4"));




        Button finalResults = (Button)findViewById(R.id.buttonResults);
        finalResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(res12_1.getText().toString().equals("")){
                    res12_1.setText("0");
                }
                if(res12_2.getText().toString().equals("")){
                    res12_2.setText("0");
                }
                if(res13_1.getText().toString().equals("")){
                    res13_1.setText("0");
                }
                if(res13_3.getText().toString().equals("")){
                    res13_3.setText("0");
                }
                if(res23_2.getText().toString().equals("")){
                    res23_2.setText("0");
                }
                if(res23_3.getText().toString().equals("")){
                    res23_3.setText("0");
                }
                if(res14_4.getText().toString().equals("")){
                    res14_4.setText("0");
                }
                if(res14_1.getText().toString().equals("")){
                    res14_1.setText("0");
                }
                if(res24_4.getText().toString().equals("")){
                    res24_4.setText("0");
                }
                if(res24_2.getText().toString().equals("")){
                    res24_2.setText("0");
                }
                if(res34_4.getText().toString().equals("")){
                    res34_4.setText("0");
                }
                if(res34_3.getText().toString().equals("")){
                    res34_3.setText("0");
                }

                Integer teamWins1 = 0;
                Integer teamWins2 = 0;
                Integer teamWins3 = 0;
                Integer teamWins4 = 0;

                if(Integer.parseInt(res12_1.getText().toString())>Integer.parseInt(res12_2.getText().toString())){
                    teamWins1 +=1;
                }else{
                    teamWins2 +=1;
                }

                if(Integer.parseInt(res13_1.getText().toString())>Integer.parseInt(res13_3.getText().toString())){
                    teamWins1 +=1;
                }else{
                    teamWins3 +=1;
                }

                if(Integer.parseInt(res14_1.getText().toString())>Integer.parseInt(res14_4.getText().toString())){
                    teamWins1 +=1;
                }else{
                    teamWins4 +=1;
                }

                if(Integer.parseInt(res23_2.getText().toString())>Integer.parseInt(res23_3.getText().toString())){
                    teamWins2 +=1;
                }else{
                    teamWins3 +=1;
                }

                if(Integer.parseInt(res24_2.getText().toString())>Integer.parseInt(res24_4.getText().toString())){
                    teamWins2 +=1;
                }else{
                    teamWins4 +=1;
                }

                if(Integer.parseInt(res34_3.getText().toString())>Integer.parseInt(res34_4.getText().toString())){
                    teamWins3 +=1;
                }else{
                    teamWins4 +=1;
                }



                Integer teamPoints1 = Integer.parseInt(res12_1.getText().toString())+Integer.parseInt(res13_1.getText().toString())+Integer.parseInt(res14_1.getText().toString());
                Integer teamPoints2 = Integer.parseInt(res12_2.getText().toString())+Integer.parseInt(res23_2.getText().toString())+Integer.parseInt(res24_2.getText().toString());
                Integer teamPoints3 = Integer.parseInt(res13_3.getText().toString())+Integer.parseInt(res23_3.getText().toString())+Integer.parseInt(res34_3.getText().toString());
                Integer teamPoints4 = Integer.parseInt(res14_4.getText().toString())+Integer.parseInt(res24_4.getText().toString())+Integer.parseInt(res34_4.getText().toString());

                List<Score> scores = new ArrayList<Score>();

                scores.add(new Score(teamWins1,teamPoints1,name1.getText().toString()));
                scores.add(new Score(teamWins2,teamPoints2,name2.getText().toString()));
                scores.add(new Score(teamWins3,teamPoints3,name3.getText().toString()));
                scores.add(new Score(teamWins4,teamPoints4,name4.getText().toString()));

                Collections.sort(scores);


                Intent intent = new Intent (EFEactiv4.this, Results.class);
                intent.putExtra("teamWins1",Integer.toString(scores.get(3).getWins()));
                intent.putExtra("teamWins2",Integer.toString(scores.get(2).getWins()));
                intent.putExtra("teamWins3",Integer.toString(scores.get(1).getWins()));
                intent.putExtra("teamWins4",Integer.toString(scores.get(0).getWins()));
                intent.putExtra("teamPoints1",Integer.toString(scores.get(3).getPoints()));
                intent.putExtra("teamPoints2",Integer.toString(scores.get(2).getPoints()));
                intent.putExtra("teamPoints3",Integer.toString(scores.get(1).getPoints()));
                intent.putExtra("teamPoints4",Integer.toString(scores.get(0).getPoints()));
                intent.putExtra("NameOfTeam1",scores.get(3).getName());
                intent.putExtra("NameOfTeam2",scores.get(2).getName());
                intent.putExtra("NameOfTeam3",scores.get(1).getName());
                intent.putExtra("NameOfTeam4",scores.get(0).getName());
                startActivity(intent);
            }
        });

    }

    class Score implements Comparable<Score> {
        int score;
        int wins;
        String name;

        public Score(int wins,int score, String name) {
            this.wins = wins;
            this.score = score;
            this.name = name;
        }

        public int getPoints(){
            return score;
        }
        public String getName(){
            return name;
        }
        public int getWins(){return wins;}
        @Override
        public int compareTo(Score o) {
            int porownane = Integer.valueOf(wins).compareTo(Integer.valueOf(o.wins));

            if(porownane == 0) {
                return Integer.valueOf(score).compareTo(Integer.valueOf(o.score));
            }
            else {
                return porownane;
            }
        }
    }

}

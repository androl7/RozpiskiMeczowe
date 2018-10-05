package com.example.adam.rozpiskimeczowe.brazylian.brazylian8;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.adam.rozpiskimeczowe.R;
import java.util.Objects;

public class FragmentTabBraz8_1 extends Fragment {
    Toast toast;
    InputMethodManager imm;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_tab_braz8_1, container, false);

        imm = (InputMethodManager) Objects.requireNonNull(getActivity()).getSystemService(Context.INPUT_METHOD_SERVICE);

        final EditText res1_1 = view.findViewById(R.id.brazRes1_1);
        final EditText res1_8 = view.findViewById(R.id.brazRes1_8);
        final EditText res2_6 = view.findViewById(R.id.brazRes2_6);
        final EditText res2_3 = view.findViewById(R.id.brazRes2_3);
        final EditText res3_4 = view.findViewById(R.id.brazRes3_4);
        final EditText res3_5 = view.findViewById(R.id.brazRes3_5);
        final EditText res4_7 = view.findViewById(R.id.brazRes4_7);
        final EditText res4_2 = view.findViewById(R.id.brazRes4_2);

        res1_1.setVisibility(View.INVISIBLE);
        res1_8.setVisibility(View.INVISIBLE);
        res2_6.setVisibility(View.INVISIBLE);
        res2_3.setVisibility(View.INVISIBLE);
        res3_4.setVisibility(View.INVISIBLE);
        res3_5.setVisibility(View.INVISIBLE);
        res4_7.setVisibility(View.INVISIBLE);
        res4_2.setVisibility(View.INVISIBLE);

        final Button team1 = view.findViewById(R.id.Team01);
        final Button team2 = view.findViewById(R.id.Team02);
        final Button team3 = view.findViewById(R.id.Team03);
        final Button team4 = view.findViewById(R.id.Team04);
        final Button team5 = view.findViewById(R.id.Team05);
        final Button team6 = view.findViewById(R.id.Team06);
        final Button team7 = view.findViewById(R.id.Team07);
        final Button team8 = view.findViewById(R.id.Team08);

        team1.setText(getActivity().getIntent().getStringExtra("NameOfTeam1"));
        team2.setText(getActivity().getIntent().getStringExtra("NameOfTeam8"));
        team3.setText(getActivity().getIntent().getStringExtra("NameOfTeam6"));
        team4.setText(getActivity().getIntent().getStringExtra("NameOfTeam3"));
        team5.setText(getActivity().getIntent().getStringExtra("NameOfTeam4"));
        team6.setText(getActivity().getIntent().getStringExtra("NameOfTeam5"));
        team7.setText(getActivity().getIntent().getStringExtra("NameOfTeam7"));
        team8.setText(getActivity().getIntent().getStringExtra("NameOfTeam2"));


        final Button win1 = view.findViewById(R.id.WIN_1);
        final Button win2 = view.findViewById(R.id.WIN_2);
        final Button win3 = view.findViewById(R.id.WIN_3);
        final Button win4 = view.findViewById(R.id.WIN_4);
        final Button win5 = view.findViewById(R.id.Win_5);
        final Button win6 = view.findViewById(R.id.Win_6);
        final Button win7 = view.findViewById(R.id.WIN_7);
        final Button win8 = view.findViewById(R.id.WIN_8);
        final Button win9 = view.findViewById(R.id.WIN_9);
        final Button win10 = view.findViewById(R.id.WIN_10);
        final Button win11 = view.findViewById(R.id.WIN_11);
        final Button win12 = view.findViewById(R.id.WIN_12);
        final Button win13 = view.findViewById(R.id.WIN_13);
        final Button win14 = view.findViewById(R.id.WIN_14);


        final Button lost1 = view.findViewById(R.id.LOST_1);
        final Button lost2 = view.findViewById(R.id.LOST_2);
        final Button lost3 = view.findViewById(R.id.LOST_3);
        final Button lost4 = view.findViewById(R.id.LOST_4);
        final Button lost5 = view.findViewById(R.id.LOST_5);
        final Button lost6 = view.findViewById(R.id.LOST_6);
        final Button lost11 = view.findViewById(R.id.LOST_11);
        final Button lost12 = view.findViewById(R.id.LOST_12);

        toast = Toast.makeText(getActivity().getApplicationContext(), "Wprowadz wczesniejszy wynik !", Toast.LENGTH_SHORT);

        // 1 MECZ
        setResult(team1,team2,win1,"WIN.1",lost1,"LOST.1",res1_1,res1_8);

        // 2 MECZ
        setResult(team3,team4,win2,"WIN.2",lost2,"LOST.2",res2_6,res2_3);

        // 3 MECZ
        setResult(team5,team6,win3,"WIN.3",lost3,"LOST.3",res3_4,res3_5);

        // 4 MECZ
        setResult(team7,team8,win4,"WIN.4",lost4,"LOST.4",res4_7,res4_2);

        // 5 MECZ
        setResult(win1,"WIN.1",win2,"WIN.2",win5,"WIN.5",lost5,"LOST.5");

        // 6 MECZ
        setResult(win3,"WIN.3",win4,"WIN.4",win6,"WIN.6",lost6,"LOST.6");

        //7 MECZ
        setResult(lost1, "LOST.1", lost2, "LOST.2", win7, "WIN.7");

        //8 MECZ
        setResult(lost3, "LOST.3", lost4, "LOST.4", win8, "WIN.8");

        //9 MECZ
        setResult(lost6, "LOST.6", win7, "WIN.7", win9, "WIN.9");

        //10 MECZ
        setResult(win8, "WIN.8", lost5, "LOST.5", win10, "WIN.10");

        //11 MECZ
        setResult(win5, "WIN.5", win9, "WIN.9", win11, "WIN.11", lost11, "LOST.11");

        //12 MECZ
        setResult(win6, "WIN.6", win10, "WIN.10", win12, "WIN.12", lost12, "LOST.12");

        //13 MECZ
        setResult(lost11, "LOST.11", lost12, "LOST.12", win13, "WIN13");

        //14 MECZ FINAL
        setResult(win11, "WIN.11", win12, "WIN.12", win14, "WIN.14");
        return view;
    }


    //Method to set results to next Buttons with loser and check
    void setResult(final Button firstPlayer, final String firstPlayerString, final Button secundPlayer, final String secundPlayerString, final Button resultButton, final String undoResultString, final Button resultButton2, final String undoResultString2) {
        firstPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstPlayer.getText().equals(firstPlayerString) || secundPlayer.getText().equals(secundPlayerString)) {
                    toast.show();
                } else {
                    resultButton.setText(firstPlayer.getText());
                    resultButton2.setText(secundPlayer.getText());
                }
            }
        });

        secundPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (secundPlayer.getText().equals(secundPlayerString) || firstPlayer.getText().equals(firstPlayerString)) {
                    toast.show();
                } else {
                    resultButton.setText(secundPlayer.getText());
                    resultButton2.setText(firstPlayer.getText());
                }
            }
        });

        resultButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                resultButton.setText(undoResultString);
                resultButton2.setText(undoResultString2);
                return true;
            }
        });

        resultButton2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                resultButton.setText(undoResultString);
                resultButton2.setText(undoResultString2);
                return true;
            }
        });
    }

    //Method to set results to next Buttons without loser and check
    void setResult(final Button firstPlayer, final String firstPlayerString, final Button secundPlayer, final String secundPlayerString, final Button resultButton, final String undoResultString) {
        firstPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstPlayer.getText().equals(firstPlayerString) || secundPlayer.getText().equals(secundPlayerString)) {
                    toast.show();
                } else {
                    resultButton.setText(firstPlayer.getText());
                }
            }
        });

        secundPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (secundPlayer.getText().equals(secundPlayerString) || firstPlayer.getText().equals(firstPlayerString)) {
                    toast.show();
                } else {
                    resultButton.setText(secundPlayer.getText());
                }
            }
        });

        resultButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                resultButton.setText(undoResultString);
                return true;
            }
        });
    }
    // Method to set results to next Buttons with loser without check
    void setResult (final Button firstPlayer, final Button secundPlayer, final Button resultButton, final String undoResultString, final Button resultButton2, final String undoResultString2, final EditText pointsInSetFor1, final EditText pointsInSetFor2) {
        firstPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultButton.setText(firstPlayer.getText());
                resultButton2.setText(secundPlayer.getText());
                setDetailedResult(pointsInSetFor1, pointsInSetFor2);
            }
        });


        secundPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultButton.setText(secundPlayer.getText());
                resultButton2.setText(firstPlayer.getText());
                setDetailedResult(pointsInSetFor2, pointsInSetFor1);
            }
        });


        resultButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                resultButton.setText(undoResultString);
                resultButton2.setText(undoResultString2);
                return true;
            }
        });

        resultButton2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                resultButton.setText(undoResultString);
                resultButton2.setText(undoResultString2);
                return true;
            }
        });
    }

    // Method to add points of Sets
    void setDetailedResult(final EditText wynik1, final EditText wynik2) {

        wynik1.setVisibility(View.VISIBLE);
        wynik2.setVisibility(View.VISIBLE);
        wynik1.requestFocus();
        imm.showSoftInput(wynik1, InputMethodManager.SHOW_IMPLICIT);

        wynik1.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (wynik1.getText().toString().length() == 2) {
                    wynik2.requestFocus();
                }
            }

            public void afterTextChanged(Editable s) {
            }
        });

        wynik2.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (wynik2.getText().toString().length() == 2) {
                    wynik1.setVisibility(View.INVISIBLE);
                    wynik2.setVisibility(View.INVISIBLE);
                    imm.hideSoftInputFromWindow(wynik2.getWindowToken(), 0);
                }
            }

            public void afterTextChanged(Editable s) {

            }
        });
    }

}


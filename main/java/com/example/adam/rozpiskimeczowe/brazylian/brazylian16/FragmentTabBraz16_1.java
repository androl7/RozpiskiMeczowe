package com.example.adam.rozpiskimeczowe.brazylian.brazylian16;

import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adam.rozpiskimeczowe.R;

import java.util.Objects;
import java.util.TreeMap;

public class FragmentTabBraz16_1 extends Fragment {
    Toast toast;
    InputMethodManager imm;
    String pktInSet = "21";
    String pktInTieBreak = "15";
    View view;
    ViewGroup vg;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment_tab_braz16_1, container, false);

        imm = (InputMethodManager) Objects.requireNonNull(getActivity()).getSystemService(Context.INPUT_METHOD_SERVICE);


        this.vg = container;

        final EditText res1_1 = view.findViewById(R.id.braz16Res1_1);
        final EditText res1_1_2set = view.findViewById(R.id.braz16Res1_1_2set);
        final EditText res1_1_3set = view.findViewById(R.id.braz16Res1_1_3set);
        final EditText res1_8 = view.findViewById(R.id.braz16Res1_8);
        final EditText res1_8_2set = view.findViewById(R.id.braz16Res1_8_2set);
        final EditText res1_8_3set = view.findViewById(R.id.braz16Res1_8_3set);

        res1_1.setVisibility(View.INVISIBLE);
        res1_1_2set.setVisibility(View.INVISIBLE);
        res1_1_3set.setVisibility(View.INVISIBLE);
        res1_8.setVisibility(View.INVISIBLE);
        res1_8_2set.setVisibility(View.INVISIBLE);
        res1_8_3set.setVisibility(View.INVISIBLE);


        final EditText res2_6 = view.findViewById(R.id.braz16Res2_6);
        final EditText res2_6_2set = view.findViewById(R.id.braz16Res2_6_2set);
        final EditText res2_6_3set = view.findViewById(R.id.braz16Res2_6_3set);
        final EditText res2_3 = view.findViewById(R.id.braz16Res2_3);
        final EditText res2_3_2set = view.findViewById(R.id.braz16Res2_3_2set);
        final EditText res2_3_3set = view.findViewById(R.id.braz16Res2_3_3set);

        res2_6.setVisibility(View.INVISIBLE);
        res2_6_2set.setVisibility(View.INVISIBLE);
        res2_6_3set.setVisibility(View.INVISIBLE);
        res2_3.setVisibility(View.INVISIBLE);
        res2_3_2set.setVisibility(View.INVISIBLE);
        res2_3_3set.setVisibility(View.INVISIBLE);

        final EditText res3_4 = view.findViewById(R.id.braz16Res3_4);
        final EditText res3_4_2set = view.findViewById(R.id.braz16Res3_4_2set);
        final EditText res3_4_3set = view.findViewById(R.id.braz16Res3_4_3set);
        final EditText res3_5 = view.findViewById(R.id.braz16Res3_5);
        final EditText res3_5_2set = view.findViewById(R.id.braz16Res3_5_2set);
        final EditText res3_5_3set = view.findViewById(R.id.braz16Res3_5_3set);

        res3_4.setVisibility(View.INVISIBLE);
        res3_4_2set.setVisibility(View.INVISIBLE);
        res3_4_3set.setVisibility(View.INVISIBLE);
        res3_5.setVisibility(View.INVISIBLE);
        res3_5_2set.setVisibility(View.INVISIBLE);
        res3_5_3set.setVisibility(View.INVISIBLE);

        final EditText res4_7 = view.findViewById(R.id.braz16Res4_7);
        final EditText res4_7_2set = view.findViewById(R.id.braz16Res4_7_2set);
        final EditText res4_7_3set = view.findViewById(R.id.braz16Res4_7_3set);
        final EditText res4_2 = view.findViewById(R.id.braz16Res4_2);
        final EditText res4_2_2set = view.findViewById(R.id.braz16Res4_2_2set);
        final EditText res4_2_3set = view.findViewById(R.id.braz16Res4_2_3set);

        res4_7.setVisibility(View.INVISIBLE);
        res4_7_2set.setVisibility(View.INVISIBLE);
        res4_7_3set.setVisibility(View.INVISIBLE);
        res4_2.setVisibility(View.INVISIBLE);
        res4_2_2set.setVisibility(View.INVISIBLE);
        res4_2_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res5_Win_1 = view.findViewById(R.id.braz16Res5_Win_1);
        final EditText braz16Res5_Win_1_2set = view.findViewById(R.id.braz16Res5_Win_1_2set);
        final EditText braz16Res5_Win_1_3set = view.findViewById(R.id.braz16Res5_Win_1_3set);
        final EditText braz16Res5_Win_2 = view.findViewById(R.id.braz16Res5_Win_2);
        final EditText braz16Res5_Win_2_2set = view.findViewById(R.id.braz16Res5_Win_2_2set);
        final EditText braz16Res5_Win_2_3set = view.findViewById(R.id.braz16Res5_Win_2_3set);

        braz16Res5_Win_1.setVisibility(View.INVISIBLE);
        braz16Res5_Win_1_2set.setVisibility(View.INVISIBLE);
        braz16Res5_Win_1_3set.setVisibility(View.INVISIBLE);
        braz16Res5_Win_2.setVisibility(View.INVISIBLE);
        braz16Res5_Win_2_2set.setVisibility(View.INVISIBLE);
        braz16Res5_Win_2_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res6_Win_3 = view.findViewById(R.id.braz16Res6_Win_3);
        final EditText braz16Res6_Win_3_2set = view.findViewById(R.id.braz16Res6_Win_3_2set);
        final EditText braz16Res6_Win_3_3set = view.findViewById(R.id.braz16Res6_Win_3_3set);
        final EditText braz16Res6_Win_4 = view.findViewById(R.id.braz16Res6_Win_4);
        final EditText braz16Res6_Win_4_2set = view.findViewById(R.id.braz16Res6_Win_4_2set);
        final EditText braz16Res6_Win_4_3set = view.findViewById(R.id.braz16Res6_Win_4_3set);

        braz16Res6_Win_3.setVisibility(View.INVISIBLE);
        braz16Res6_Win_3_2set.setVisibility(View.INVISIBLE);
        braz16Res6_Win_3_3set.setVisibility(View.INVISIBLE);
        braz16Res6_Win_4.setVisibility(View.INVISIBLE);
        braz16Res6_Win_4_2set.setVisibility(View.INVISIBLE);
        braz16Res6_Win_4_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res7_Lost_1 = view.findViewById(R.id.braz16Res7_Lost_1);
        final EditText braz16Res7_Lost_1_2set = view.findViewById(R.id.braz16Res7_Lost_1_2set);
        final EditText braz16Res7_Lost_1_3set = view.findViewById(R.id.braz16Res7_Lost_1_3set);
        final EditText braz16Res7_Lost_2 = view.findViewById(R.id.braz16Res7_Lost_2);
        final EditText braz16Res7_Lost_2_2set = view.findViewById(R.id.braz16Res7_Lost_2_2set);
        final EditText braz16Res7_Lost_2_3set = view.findViewById(R.id.braz16Res7_Lost_2_3set);

        braz16Res7_Lost_1.setVisibility(View.INVISIBLE);
        braz16Res7_Lost_1_2set.setVisibility(View.INVISIBLE);
        braz16Res7_Lost_1_3set.setVisibility(View.INVISIBLE);
        braz16Res7_Lost_2.setVisibility(View.INVISIBLE);
        braz16Res7_Lost_2_2set.setVisibility(View.INVISIBLE);
        braz16Res7_Lost_2_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res8_Lost_3 = view.findViewById(R.id.braz16Res8_Lost_3);
        final EditText braz16Res8_Lost_3_2set = view.findViewById(R.id.braz16Res8_Lost_3_2set);
        final EditText braz16Res8_Lost_3_3set = view.findViewById(R.id.braz16Res8_Lost_3_3set);
        final EditText braz16Res8_Lost_4 = view.findViewById(R.id.braz16Res8_Lost_4);
        final EditText braz16Res8_Lost_4_2set = view.findViewById(R.id.braz16Res8_Lost_4_2set);
        final EditText braz16Res8_Lost_4_3set = view.findViewById(R.id.braz16Res8_Lost_4_3set);

        braz16Res8_Lost_3.setVisibility(View.INVISIBLE);
        braz16Res8_Lost_3_2set.setVisibility(View.INVISIBLE);
        braz16Res8_Lost_3_3set.setVisibility(View.INVISIBLE);
        braz16Res8_Lost_4.setVisibility(View.INVISIBLE);
        braz16Res8_Lost_4_2set.setVisibility(View.INVISIBLE);
        braz16Res8_Lost_4_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res9_Lost_6 = view.findViewById(R.id.braz16Res9_Lost_6);
        final EditText braz16Res9_Lost_6_2set = view.findViewById(R.id.braz16Res9_Lost_6_2set);
        final EditText braz16Res9_Lost_6_3set = view.findViewById(R.id.braz16Res9_Lost_6_3set);
        final EditText braz16Res9_Win_7 = view.findViewById(R.id.braz16Res9_Win_7);
        final EditText braz16Res9_Win_7_2set = view.findViewById(R.id.braz16Res9_Win_7_2set);
        final EditText braz16Res9_Win_7_3set = view.findViewById(R.id.braz16Res9_Win_7_3set);

        braz16Res9_Lost_6.setVisibility(View.INVISIBLE);
        braz16Res9_Lost_6_2set.setVisibility(View.INVISIBLE);
        braz16Res9_Lost_6_3set.setVisibility(View.INVISIBLE);
        braz16Res9_Win_7.setVisibility(View.INVISIBLE);
        braz16Res9_Win_7_2set.setVisibility(View.INVISIBLE);
        braz16Res9_Win_7_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res10_Lost_5 = view.findViewById(R.id.braz16Res10_Lost_5);
        final EditText braz16Res10_Lost_5_2set = view.findViewById(R.id.braz16Res10_Lost_5_2set);
        final EditText braz16Res10_Lost_5_3set = view.findViewById(R.id.braz16Res10_Lost_5_3set);
        final EditText braz16Res10_Win_8 = view.findViewById(R.id.braz16Res10_Win_8);
        final EditText braz16Res10_Win_8_2set = view.findViewById(R.id.braz16Res10_Win_8_2set);
        final EditText braz16Res10_Win_8_3set = view.findViewById(R.id.braz16Res10_Win_8_3set);

        braz16Res10_Lost_5.setVisibility(View.INVISIBLE);
        braz16Res10_Lost_5_2set.setVisibility(View.INVISIBLE);
        braz16Res10_Lost_5_3set.setVisibility(View.INVISIBLE);
        braz16Res10_Win_8.setVisibility(View.INVISIBLE);
        braz16Res10_Win_8_2set.setVisibility(View.INVISIBLE);
        braz16Res10_Win_8_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res11_Win_5 = view.findViewById(R.id.braz16Res11_Win_5);
        final EditText braz16Res11_Win_5_2set = view.findViewById(R.id.braz16Res11_Win_5_2set);
        final EditText braz16Res11_Win_5_3set = view.findViewById(R.id.braz16Res11_Win_5_3set);
        final EditText braz16Res11_Win_9 = view.findViewById(R.id.braz16Res11_Win_9);
        final EditText braz16Res11_Win_9_2set = view.findViewById(R.id.braz16Res11_Win_9_2set);
        final EditText braz16Res11_Win_9_3set = view.findViewById(R.id.braz16Res11_Win_9_3set);

        braz16Res11_Win_5.setVisibility(View.INVISIBLE);
        braz16Res11_Win_5_2set.setVisibility(View.INVISIBLE);
        braz16Res11_Win_5_3set.setVisibility(View.INVISIBLE);
        braz16Res11_Win_9.setVisibility(View.INVISIBLE);
        braz16Res11_Win_9_2set.setVisibility(View.INVISIBLE);
        braz16Res11_Win_9_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res12_Win_6 = view.findViewById(R.id.braz16Res12_Win_6);
        final EditText braz16Res12_Win_6_2set = view.findViewById(R.id.braz16Res12_Win_6_2set);
        final EditText braz16Res12_Win_6_3set = view.findViewById(R.id.braz16Res12_Win_6_3set);
        final EditText braz16Res12_Win_10 = view.findViewById(R.id.braz16Res12_Win_10);
        final EditText braz16Res12_Win_10_2set = view.findViewById(R.id.braz16Res12_Win_10_2set);
        final EditText braz16Res12_Win_10_3set = view.findViewById(R.id.braz16Res12_Win_10_3set);

        braz16Res12_Win_6.setVisibility(View.INVISIBLE);
        braz16Res12_Win_6_2set.setVisibility(View.INVISIBLE);
        braz16Res12_Win_6_3set.setVisibility(View.INVISIBLE);
        braz16Res12_Win_10.setVisibility(View.INVISIBLE);
        braz16Res12_Win_10_2set.setVisibility(View.INVISIBLE);
        braz16Res12_Win_10_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res13_Lost_11 = view.findViewById(R.id.braz16Res13_Lost_11);
        final EditText braz16Res13_Lost_11_2set = view.findViewById(R.id.braz16Res13_Lost_11_2set);
        final EditText braz16Res13_Lost_11_3set = view.findViewById(R.id.braz16Res13_Lost_11_3set);
        final EditText braz16Res13_Lost_12 = view.findViewById(R.id.braz16Res13_Lost_12);
        final EditText braz16Res13_Lost_12_2set = view.findViewById(R.id.braz16Res13_Lost_12_2set);
        final EditText braz16Res13_Lost_12_3set = view.findViewById(R.id.braz16Res13_Lost_12_3set);

        braz16Res13_Lost_11.setVisibility(View.INVISIBLE);
        braz16Res13_Lost_11_2set.setVisibility(View.INVISIBLE);
        braz16Res13_Lost_11_3set.setVisibility(View.INVISIBLE);
        braz16Res13_Lost_12.setVisibility(View.INVISIBLE);
        braz16Res13_Lost_12_2set.setVisibility(View.INVISIBLE);
        braz16Res13_Lost_12_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res14_Win_11 = view.findViewById(R.id.braz16Res14_Win_11);
        final EditText braz16Res14_Win_11_2set = view.findViewById(R.id.braz16Res14_Win_11_2set);
        final EditText braz16Res14_Win_11_3set = view.findViewById(R.id.braz16Res14_Win_11_3set);
        final EditText braz16Res14_Win_12 = view.findViewById(R.id.braz16Res14_Win_12);
        final EditText braz16Res14_Win_12_2set = view.findViewById(R.id.braz16Res14_Win_12_2set);
        final EditText braz16Res14_Win_12_3set = view.findViewById(R.id.braz16Res14_Win_12_3set);

        braz16Res14_Win_11.setVisibility(View.INVISIBLE);
        braz16Res14_Win_11_2set.setVisibility(View.INVISIBLE);
        braz16Res14_Win_11_3set.setVisibility(View.INVISIBLE);
        braz16Res14_Win_12.setVisibility(View.INVISIBLE);
        braz16Res14_Win_12_2set.setVisibility(View.INVISIBLE);
        braz16Res14_Win_12_3set.setVisibility(View.INVISIBLE);


        final Button team1 = view.findViewById(R.id.braz16Team01);
        final Button team2 = view.findViewById(R.id.braz16Team02);
        final Button team3 = view.findViewById(R.id.braz16Team03);
        final Button team4 = view.findViewById(R.id.braz16Team04);
        final Button team5 = view.findViewById(R.id.braz16Team05);
        final Button team6 = view.findViewById(R.id.braz16Team06);
        final Button team7 = view.findViewById(R.id.braz16Team07);
        final Button team8 = view.findViewById(R.id.braz16Team08);

        team1.setText(getActivity().getIntent().getStringExtra("NameOfTeam1"));
        team2.setText(getActivity().getIntent().getStringExtra("NameOfTeam2"));
        team3.setText(getActivity().getIntent().getStringExtra("NameOfTeam3"));
        team4.setText(getActivity().getIntent().getStringExtra("NameOfTeam4"));
        team5.setText(getActivity().getIntent().getStringExtra("NameOfTeam5"));
        team6.setText(getActivity().getIntent().getStringExtra("NameOfTeam6"));
        team7.setText(getActivity().getIntent().getStringExtra("NameOfTeam7"));
        team8.setText(getActivity().getIntent().getStringExtra("NameOfTeam8"));


        final Button win1 = view.findViewById(R.id.braz16WIN_1);
        final Button win2 = view.findViewById(R.id.braz16WIN_2);
        final Button win3 = view.findViewById(R.id.braz16WIN_3);
        final Button win4 = view.findViewById(R.id.braz16WIN_4);
        final Button win5 = view.findViewById(R.id.braz16WIN_5);
        final Button win6 = view.findViewById(R.id.braz16WIN_6);
        final Button win7 = view.findViewById(R.id.braz16WIN_7);
        final Button win8 = view.findViewById(R.id.braz16WIN_8);
        final Button win9 = view.findViewById(R.id.braz16WIN_9);
        final Button win10 = view.findViewById(R.id.braz16WIN_10);
        final Button win11 = view.findViewById(R.id.braz16WIN_11);
        final Button win12 = view.findViewById(R.id.braz16WIN_12);
        final Button win13 = view.findViewById(R.id.braz16WIN_13);
        final Button win14 = view.findViewById(R.id.braz16WIN_14);


        final Button lost1 = view.findViewById(R.id.braz16LOST_1);
        final Button lost2 = view.findViewById(R.id.braz16LOST_2);
        final Button lost3 = view.findViewById(R.id.braz16LOST_3);
        final Button lost4 = view.findViewById(R.id.braz16LOST_4);
        final Button lost5 = view.findViewById(R.id.braz16LOST_5);
        final Button lost6 = view.findViewById(R.id.braz16LOST_6);
        final Button lost11 = view.findViewById(R.id.braz16LOST_11);
        final Button lost12 = view.findViewById(R.id.braz16LOST_12);

        toast = Toast.makeText(getActivity().getApplicationContext(), "Wprowadz wczesniejszy wynik !", Toast.LENGTH_SHORT);

        // 1 MECZ
        setResult(team1, team8, win1, "WIN.1", lost1, "LOST.1", res1_1, res1_1_2set, res1_1_3set, res1_8, res1_8_2set, res1_8_3set);

        // 2 MECZ
        setResult(team6, team3, win2, "WIN.2", lost2, "LOST.2", res2_6, res2_6_2set, res2_6_3set, res2_3, res2_3_2set, res2_3_3set);

        // 3 MECZ
        setResult(team4, team5, win3, "WIN.3", lost3, "LOST.3", res3_4, res3_4_2set, res3_4_3set, res3_5, res3_5_2set, res3_5_3set);

        // 4 MECZ
        setResult(team7, team2, win4, "WIN.4", lost4, "LOST.4", res4_2, res4_2_2set, res4_2_3set, res4_7, res4_7_2set, res4_7_3set);

        // 5 MECZ

        setResult(win1, "WIN.1", win2, "WIN.2", win5, "WIN.5", lost5, "LOST.5", braz16Res5_Win_1, braz16Res5_Win_1_2set, braz16Res5_Win_1_3set, braz16Res5_Win_2, braz16Res5_Win_2_2set, braz16Res5_Win_2_3set);


        // 6 MECZ
        setResult(win3, "WIN.3", win4, "WIN.4", win6, "WIN.6", lost6, "LOST.6", braz16Res6_Win_3, braz16Res6_Win_3_2set, braz16Res6_Win_3_3set, braz16Res6_Win_4, braz16Res6_Win_4_2set, braz16Res6_Win_4_3set);

        //7 MECZ
        setResult(lost1, "LOST.1", lost2, "LOST.2", win7, "WIN.7", braz16Res7_Lost_1, braz16Res7_Lost_1_2set, braz16Res7_Lost_1_3set, braz16Res7_Lost_2, braz16Res7_Lost_2_2set, braz16Res7_Lost_2_3set);


        //8 MECZ
        setResult(lost3, "LOST.3", lost4, "LOST.4", win8, "WIN.8", braz16Res8_Lost_3, braz16Res8_Lost_3_2set, braz16Res8_Lost_3_3set, braz16Res8_Lost_4, braz16Res8_Lost_4_2set, braz16Res8_Lost_4_3set);

        //9 MECZ
        setResult(lost6, "LOST.6", win7, "WIN.7", win9, "WIN.9", braz16Res9_Lost_6, braz16Res9_Lost_6_2set, braz16Res9_Lost_6_3set, braz16Res9_Win_7, braz16Res9_Win_7_2set, braz16Res9_Win_7_3set);

        //10 MECZ
        setResult(win8, "WIN.8", lost5, "LOST.5", win10, "WIN.10", braz16Res10_Lost_5, braz16Res10_Lost_5_2set, braz16Res10_Lost_5_3set, braz16Res10_Win_8, braz16Res10_Win_8_2set, braz16Res10_Win_8_3set);

        //11 MECZ
        setResult(win5, "WIN.5", win9, "WIN.9", win11, "WIN.11", lost11, "LOST.11", braz16Res11_Win_5, braz16Res11_Win_5_2set, braz16Res11_Win_5_3set, braz16Res11_Win_9, braz16Res11_Win_9_2set, braz16Res11_Win_9_3set);

        //12 MECZ
        setResult(win6, "WIN.6", win10, "WIN.10", win12, "WIN.12", lost12, "LOST.12", braz16Res12_Win_6, braz16Res12_Win_6_2set, braz16Res12_Win_6_3set, braz16Res12_Win_10, braz16Res12_Win_10_2set, braz16Res12_Win_10_3set);

        //13 MECZ
        setResult(lost11, "LOST.11", lost12, "LOST.12", win13, "WIN.13", braz16Res13_Lost_11, braz16Res13_Lost_11_2set, braz16Res13_Lost_11_3set, braz16Res13_Lost_12, braz16Res13_Lost_12_2set, braz16Res13_Lost_12_3set);

        //14 MECZ FINAL
        setResult(win11, "WIN.11", win12, "WIN.12", win14, "WIN.14", braz16Res14_Win_11, braz16Res14_Win_11_2set, braz16Res14_Win_11_3set, braz16Res14_Win_12, braz16Res14_Win_12_2set, braz16Res14_Win_12_3set);
        return view;
    }


    //Method to set results to next Buttons with loser and check
    void setResult(final Button firstPlayer, final String firstPlayerString, final Button secundPlayer, final String secundPlayerString, final Button resultButton, final String undoResultString, final Button resultButton2, final String undoResultString2, final EditText pointsFor1In1Set, final EditText pointsFor1In2Set, final EditText pointsFor1In3Set, final EditText pointsFor2In1Set, final EditText pointsFor2In2Set, final EditText pointsFor2In3Set) {
        firstPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstPlayer.getText().equals(firstPlayerString) || secundPlayer.getText().equals(secundPlayerString)) {
                    toast.show();
                } else {
                    if (!pointsFor1In1Set.getText().toString().equals("")) {
                        Toast.makeText(getActivity().getApplicationContext(), "Wynik został już wprowadzony, jeśli chcesz go cofnąć przytrzymaj przycisk wygranego lub przegranego. Natomiast jeśli chcesz zobaczyć dokładny wynik, wejdz w zakladkę WYNIKI.", Toast.LENGTH_SHORT).show();
                    }else {
                        resultButton.setText(firstPlayer.getText());
                        resultButton2.setText(secundPlayer.getText());
                        setDetailedResultFor2Sets(pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set, pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set);
                    }
                }

            }
        });

        secundPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (secundPlayer.getText().equals(secundPlayerString) || firstPlayer.getText().equals(firstPlayerString)) {
                    toast.show();
                } else {
                    if (!pointsFor1In1Set.getText().toString().equals("")) {
                        Toast.makeText(getActivity().getApplicationContext(), "Wynik został już wprowadzony, jeśli chcesz go cofnąć przytrzymaj przycisk wygranego lub przegranego. Natomiast jeśli chcesz zobaczyć dokładny wynik, wejdz w zakladkę WYNIKI.", Toast.LENGTH_SHORT).show();
                    }else {
                        resultButton.setText(secundPlayer.getText());
                        resultButton2.setText(firstPlayer.getText());
                        setDetailedResultFor2Sets(pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set, pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set);
                    }
                }

            }
        });

        resultButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                resultButton.setText(undoResultString);
                resultButton2.setText(undoResultString2);
                pointsFor1In1Set.setText("");
                pointsFor1In2Set.setText("");
                pointsFor1In3Set.setText("");
                pointsFor2In1Set.setText("");
                pointsFor2In2Set.setText("");
                pointsFor2In3Set.setText("");
                return true;
            }
        });

        resultButton2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                resultButton.setText(undoResultString);
                resultButton2.setText(undoResultString2);
                pointsFor1In1Set.setText("");
                pointsFor1In2Set.setText("");
                pointsFor1In3Set.setText("");
                pointsFor2In1Set.setText("");
                pointsFor2In2Set.setText("");
                pointsFor2In3Set.setText("");
                return true;
            }
        });


    }


    //Method to set results to next Buttons without loser and check
    void setResult(final Button firstPlayer, final String firstPlayerString, final Button secundPlayer, final String secundPlayerString, final Button resultButton, final String undoResultString, final EditText pointsFor1In1Set, final EditText pointsFor1In2Set, final EditText pointsFor1In3Set, final EditText pointsFor2In1Set, final EditText pointsFor2In2Set, final EditText pointsFor2In3Set) {
        firstPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstPlayer.getText().equals(firstPlayerString) || secundPlayer.getText().equals(secundPlayerString)) {
                    toast.show();
                } else {
                    if (!pointsFor1In1Set.getText().toString().equals("")) {
                        Toast.makeText(getActivity().getApplicationContext(), "Wynik został już wprowadzony, jeśli chcesz go cofnąć przytrzymaj przycisk wygranego lub przegranego. Natomiast jeśli chcesz zobaczyć dokładny wynik, wejdz w zakladkę WYNIKI.", Toast.LENGTH_SHORT).show();
                    }else {
                        resultButton.setText(firstPlayer.getText());
                        setDetailedResultFor2Sets(pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set, pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set);
                    }
                }

            }
        });

        secundPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (secundPlayer.getText().equals(secundPlayerString) || firstPlayer.getText().equals(firstPlayerString)) {
                    toast.show();
                } else {
                    if (!pointsFor1In1Set.getText().toString().equals("")) {
                        Toast.makeText(getActivity().getApplicationContext(), "Wynik został już wprowadzony, jeśli chcesz go cofnąć przytrzymaj przycisk wygranego lub przegranego. Natomiast jeśli chcesz zobaczyć dokładny wynik, wejdz w zakladkę WYNIKI.", Toast.LENGTH_SHORT).show();
                    }else {
                        resultButton.setText(secundPlayer.getText());
                        setDetailedResultFor2Sets(pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set, pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set);
                    }
                }

            }
        });

        resultButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                resultButton.setText(undoResultString);
                pointsFor1In1Set.setText("");
                pointsFor1In2Set.setText("");
                pointsFor1In3Set.setText("");
                pointsFor2In1Set.setText("");
                pointsFor2In2Set.setText("");
                pointsFor2In3Set.setText("");
                return true;
            }
        });
    }

    // Method to set results to next Buttons with loser without check
    void setResult(final Button firstPlayer, final Button secundPlayer, final Button resultButton, final String undoResultString, final Button resultButton2, final String undoResultString2, final EditText pointsFor1In1Set, final EditText pointsFor1In2Set, final EditText pointsFor1In3Set, final EditText pointsFor2In1Set, final EditText pointsFor2In2Set, final EditText pointsFor2In3Set) {
        firstPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!pointsFor1In1Set.getText().toString().equals("")) {
                    Toast.makeText(getActivity().getApplicationContext(), "Wynik został już wprowadzony, jeśli chcesz go cofnąć przytrzymaj przycisk wygranego lub przegranego. Natomiast jeśli chcesz zobaczyć dokładny wynik, wejdz w zakladkę WYNIKI.", Toast.LENGTH_SHORT).show();
                }else {
                    resultButton.setText(firstPlayer.getText());
                    resultButton2.setText(secundPlayer.getText());
                    setDetailedResultFor2Sets(pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set, pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set);
                }
            }
        });


        secundPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!pointsFor1In1Set.getText().toString().equals("")) {
                    Toast.makeText(getActivity().getApplicationContext(), "Wynik został już wprowadzony, jeśli chcesz go cofnąć przytrzymaj przycisk wygranego lub przegranego. Natomiast jeśli chcesz zobaczyć dokładny wynik, wejdz w zakladkę WYNIKI.", Toast.LENGTH_SHORT).show();
                }else {
                    resultButton.setText(secundPlayer.getText());
                    resultButton2.setText(firstPlayer.getText());
                    setDetailedResultFor2Sets(pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set, pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set);
                }
            }
        });


        resultButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                resultButton.setText(undoResultString);
                resultButton2.setText(undoResultString2);
                pointsFor1In1Set.setText("");
                pointsFor1In2Set.setText("");
                pointsFor1In3Set.setText("");
                pointsFor2In1Set.setText("");
                pointsFor2In2Set.setText("");
                pointsFor2In3Set.setText("");
                return true;
            }
        });

        resultButton2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                resultButton.setText(undoResultString);
                resultButton2.setText(undoResultString2);
                pointsFor1In1Set.setText("");
                pointsFor1In2Set.setText("");
                pointsFor1In3Set.setText("");
                pointsFor2In1Set.setText("");
                pointsFor2In2Set.setText("");
                pointsFor2In3Set.setText("");

                return true;
            }
        });
    }


    // Method to add points of Sets
    void setDetailedResultFor2Sets(final EditText team1Set1, final EditText team1Set2, final EditText team1Set3, final EditText team2Set1, final EditText team2Set2, final EditText team2Set3) {


        team1Set1.setFocusableInTouchMode(true);
        team2Set1.setFocusableInTouchMode(true);

        disableEnableControls(false, vg);
        team1Set2.setFocusableInTouchMode(false);
        team1Set3.setFocusableInTouchMode(false);
        team2Set2.setFocusableInTouchMode(false);
        team2Set3.setFocusableInTouchMode(false);

        team1Set1.setVisibility(View.VISIBLE);
        team2Set1.setVisibility(View.VISIBLE);
        team1Set2.setVisibility(View.VISIBLE);
        team2Set2.setVisibility(View.VISIBLE);
        team1Set3.setVisibility(View.VISIBLE);
        team2Set3.setVisibility(View.VISIBLE);
        team1Set1.requestFocus();
        imm.showSoftInput(team1Set1, InputMethodManager.SHOW_IMPLICIT);

        team1Set1.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                team1Set1.setFocusableInTouchMode(true);
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                team1Set1.setFocusableInTouchMode(false);

                /*if (team1Set1.getText().toString().length() == 2) {

                    team2Set1.requestFocus();
                    if (Integer.parseInt(team1Set1.getText().toString()) >= Integer.parseInt(pktInSet)) {
                        team1Set2.setFocusableInTouchMode(true);
                    }
                }*/
            }

            public void afterTextChanged(Editable s) {
            }
        });

        team2Set1.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                team2Set1.setFocusableInTouchMode(false);

                /*if (team2Set1.getText().toString().length() == 2) {
                    team1Set2.setFocusableInTouchMode(true);
                    if (checkPointsInSet(team1Set1, team2Set1, pktInSet)) {
                        team1Set2.requestFocus();
                        imm.showSoftInput(team1Set2, InputMethodManager.SHOW_IMPLICIT);
                    } else {
                        Toast.makeText(getActivity().getApplicationContext(), "Wynik jest niepoprawny", Toast.LENGTH_SHORT).show();
                        team1Set1.setText(null);
                        team2Set1.setText(null);
                        team1Set1.setFocusableInTouchMode(true);
                        team2Set1.setFocusableInTouchMode(true);
                        team1Set1.requestFocus();

                    }
                }*/
            }

            public void afterTextChanged(Editable s) {

            }
        });

        //AFTER CLICK ACTION NEXT CHECK EVERYTHINK
        team2Set1.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {

                    if (checkPointsInSet(team1Set1, team2Set1, pktInSet)) {
                        team1Set2.setFocusableInTouchMode(true);
                        team1Set2.requestFocus();
                        imm.showSoftInput(team1Set2, InputMethodManager.SHOW_IMPLICIT);
                    } else {
                        Toast.makeText(getActivity().getApplicationContext(), "Wynik jest niepoprawny", Toast.LENGTH_SHORT).show();
                        team1Set1.setText(null);
                        team2Set1.setText(null);
                        team1Set1.setFocusableInTouchMode(true);
                        team2Set1.setFocusableInTouchMode(true);
                        team1Set1.requestFocus();

                    }
                }
                return false;
            }
        });




        team1Set2.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                team2Set2.setFocusableInTouchMode(true);
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                team1Set2.setFocusableInTouchMode(false);

                /*if (team1Set2.getText().toString().length() == 2) {

                    team2Set2.requestFocus();
                    if (Integer.parseInt(team1Set2.getText().toString()) >= Integer.parseInt(pktInSet)) {
                        team1Set3.setFocusableInTouchMode(true);
                    }

                }*/
            }

            public void afterTextChanged(Editable s) {
            }
        });

        team2Set2.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                team2Set2.setFocusableInTouchMode(false);

                /*if (team2Set2.getText().toString().length() == 2) {

                    team1Set3.setFocusableInTouchMode(true);
                    if (checkPointsInSet(team1Set2, team2Set2, pktInSet)) {
                        if (checkTieBreak(team1Set1, team1Set2, team2Set1, team2Set2)) {
                            team1Set3.requestFocus();
                        } else {

                            disableEnableControls(true, vg);
                            Runnable delayedTask = new Runnable() {
                                @Override
                                public void run() {
                                    imm.hideSoftInputFromWindow(team2Set2.getWindowToken(), 0);
                                    team1Set1.setVisibility(View.INVISIBLE);
                                    team2Set1.setVisibility(View.INVISIBLE);
                                    team1Set2.setVisibility(View.INVISIBLE);
                                    team2Set2.setVisibility(View.INVISIBLE);
                                    team1Set3.setVisibility(View.INVISIBLE);
                                    team2Set3.setVisibility(View.INVISIBLE);
                                }
                            };
                            view.postDelayed(delayedTask, 500);

                        }
                    } else {
                        Toast.makeText(getActivity().getApplicationContext(), "Wynik jest niepoprawny", Toast.LENGTH_SHORT).show();
                        team1Set2.setText(null);
                        team2Set2.setText(null);

                        team1Set2.setFocusableInTouchMode(true);
                        team2Set2.setFocusableInTouchMode(true);
                        team1Set2.requestFocus();

                    }

                }*/
            }


            public void afterTextChanged(Editable s) {

            }
        });


        //AFTER CLICK ACTION NEXT CHECK EVERYTHINK
        team2Set2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    if (checkPointsInSet(team1Set2, team2Set2, pktInSet)) {
                        if (checkTieBreak(team1Set1, team1Set2, team2Set1, team2Set2)) {
                            team1Set3.setFocusableInTouchMode(true);
                            team1Set3.requestFocus();
                            imm.showSoftInput(team1Set3, InputMethodManager.SHOW_IMPLICIT);
                        } else {

                            disableEnableControls(true, vg);

                            imm.hideSoftInputFromWindow(team2Set2.getWindowToken(), 0);
                            team1Set1.setVisibility(View.INVISIBLE);
                            team2Set1.setVisibility(View.INVISIBLE);
                            team1Set2.setVisibility(View.INVISIBLE);
                            team2Set2.setVisibility(View.INVISIBLE);
                            team1Set3.setVisibility(View.INVISIBLE);
                            team2Set3.setVisibility(View.INVISIBLE);

                            //Reset all
                            team1Set1.setOnEditorActionListener(null);
                            team2Set1.setOnEditorActionListener(null);
                            team1Set2.setOnEditorActionListener(null);
                            team2Set2.setOnEditorActionListener(null);
                            team1Set3.setOnEditorActionListener(null);
                            team2Set3.setOnEditorActionListener(null);




                        }
                    } else {
                        Toast.makeText(getActivity().getApplicationContext(), "Wynik jest niepoprawny", Toast.LENGTH_SHORT).show();
                        team1Set2.setText(null);
                        team2Set2.setText(null);

                        team1Set2.setFocusableInTouchMode(true);
                        team2Set2.setFocusableInTouchMode(true);
                        team1Set2.requestFocus();

                    }
                }
                return false;
            }
        });

        team1Set3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                team2Set3.setFocusableInTouchMode(true);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                team1Set3.setFocusableInTouchMode(false);

                /*if (team1Set3.getText().toString().length() == 2) {

                    team2Set3.requestFocus();

                }*/
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        team2Set3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                team2Set3.setFocusableInTouchMode(false);
                /*if (team2Set3.getText().toString().length() == 2) {
                    if (checkPointsInSet(team1Set3, team2Set3, pktInTieBreak)) {
                        disableEnableControls(true, vg);
                        Runnable delayedTask = new Runnable() {
                            @Override
                            public void run() {
                                imm.hideSoftInputFromWindow(team2Set3.getWindowToken(), 0);
                                team1Set1.setVisibility(View.INVISIBLE);
                                team2Set1.setVisibility(View.INVISIBLE);
                                team1Set2.setVisibility(View.INVISIBLE);
                                team2Set2.setVisibility(View.INVISIBLE);
                                team1Set3.setVisibility(View.INVISIBLE);
                                team2Set3.setVisibility(View.INVISIBLE);
                            }
                        };
                        view.postDelayed(delayedTask, 500);

                    } else {
                        Toast.makeText(getActivity().getApplicationContext(), "Wynik jest niepoprawny", Toast.LENGTH_SHORT).show();
                        team1Set3.setText(null);
                        team2Set3.setText(null);

                        team1Set3.setFocusableInTouchMode(true);
                        team2Set3.setFocusableInTouchMode(true);
                        team1Set3.requestFocus();

                    }

                }*/
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        team2Set3.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    if (checkPointsInSet(team1Set3, team2Set3, pktInTieBreak)) {
                        disableEnableControls(true, vg);

                        imm.hideSoftInputFromWindow(team2Set3.getWindowToken(), 0);
                        team1Set1.setVisibility(View.INVISIBLE);
                        team2Set1.setVisibility(View.INVISIBLE);
                        team1Set2.setVisibility(View.INVISIBLE);
                        team2Set2.setVisibility(View.INVISIBLE);
                        team1Set3.setVisibility(View.INVISIBLE);
                        team2Set3.setVisibility(View.INVISIBLE);

                        //Reset all
                        team1Set1.setOnEditorActionListener(null);
                        team2Set1.setOnEditorActionListener(null);
                        team1Set2.setOnEditorActionListener(null);
                        team2Set2.setOnEditorActionListener(null);
                        team1Set3.setOnEditorActionListener(null);
                        team2Set3.setOnEditorActionListener(null);



                    } else {
                        Toast.makeText(getActivity().getApplicationContext(), "Wynik jest niepoprawny", Toast.LENGTH_SHORT).show();
                        team1Set3.setText(null);
                        team2Set3.setText(null);

                        team1Set3.setFocusableInTouchMode(true);
                        team2Set3.setFocusableInTouchMode(true);
                        team1Set3.requestFocus();

                    }
                }
                return false;
            }
        });

    }

    private void disableEnableControls(boolean enable, ViewGroup vg) {
        for (int i = 0; i < vg.getChildCount(); i++) {
            View child = vg.getChildAt(i);
            if (child instanceof Button) {
                child.setEnabled(enable);

            } else if (child instanceof ViewGroup) {
                disableEnableControls(enable, (ViewGroup) child);
            }
        }
    }


    boolean checkPointsInSet(EditText team1, EditText team2, String pktInSet) {
        String res1 = team1.getText().toString();
        String res2 = team2.getText().toString();
        return !res1.equals("") && !res2.equals("") && ((Math.abs(Integer.parseInt(res1) - Integer.parseInt(res2)) > 2 && (Integer.parseInt(pktInSet) == Integer.parseInt(res1) && Integer.parseInt(res2) < Integer.parseInt(pktInSet)) || (Integer.parseInt(pktInSet) == Integer.parseInt(res2) && Integer.parseInt(res1) < Integer.parseInt(pktInSet))) || (Math.abs(Integer.parseInt(res1) - Integer.parseInt(res2)) == 2 && ((Integer.parseInt(res1) >= Integer.parseInt(pktInSet)) || Integer.parseInt(res2) >= Integer.parseInt(pktInSet))));
    }

    boolean checkTieBreak(EditText team1Set1, EditText team1Set2, EditText team2Set1, EditText team2Set2) {
        return (Integer.parseInt(team1Set1.getText().toString()) > Integer.parseInt(team2Set1.getText().toString()) && Integer.parseInt(team1Set2.getText().toString()) < Integer.parseInt(team2Set2.getText().toString())) || (Integer.parseInt(team1Set1.getText().toString()) < Integer.parseInt(team2Set1.getText().toString()) && Integer.parseInt(team1Set2.getText().toString()) > Integer.parseInt(team2Set2.getText().toString()));
    }
}




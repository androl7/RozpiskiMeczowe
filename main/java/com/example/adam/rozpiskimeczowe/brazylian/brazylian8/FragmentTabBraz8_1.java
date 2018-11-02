package com.example.adam.rozpiskimeczowe.brazylian.brazylian8;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.adam.rozpiskimeczowe.R;
import com.example.adam.rozpiskimeczowe.SetResultsForBraz;

import java.util.Objects;

public class FragmentTabBraz8_1 extends Fragment {
    Toast toast;
    String pktInSet = "21";
    String pktInTieBreak = "15";
    View view;
    SetResultsForBraz setResultsForBraz;



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment_tab_braz8_1, container, false);


        setResultsForBraz = new SetResultsForBraz(getActivity(),container,pktInSet,pktInTieBreak);



        final EditText res1_1 = view.findViewById(R.id.braz8Res1_1);
        final EditText res1_1_2set = view.findViewById(R.id.braz8Res1_1_2set);
        final EditText res1_1_3set = view.findViewById(R.id.braz8Res1_1_3set);
        final EditText res1_8 = view.findViewById(R.id.braz8Res1_8);
        final EditText res1_8_2set = view.findViewById(R.id.braz8Res1_8_2set);
        final EditText res1_8_3set = view.findViewById(R.id.braz8Res1_8_3set);

        res1_1.setVisibility(View.INVISIBLE);
        res1_1_2set.setVisibility(View.INVISIBLE);
        res1_1_3set.setVisibility(View.INVISIBLE);
        res1_8.setVisibility(View.INVISIBLE);
        res1_8_2set.setVisibility(View.INVISIBLE);
        res1_8_3set.setVisibility(View.INVISIBLE);


        final EditText res2_6 = view.findViewById(R.id.braz8Res2_6);
        final EditText res2_6_2set = view.findViewById(R.id.braz8Res2_6_2set);
        final EditText res2_6_3set = view.findViewById(R.id.braz8Res2_6_3set);
        final EditText res2_3 = view.findViewById(R.id.braz8Res2_3);
        final EditText res2_3_2set = view.findViewById(R.id.braz8Res2_3_2set);
        final EditText res2_3_3set = view.findViewById(R.id.braz8Res2_3_3set);

        res2_6.setVisibility(View.INVISIBLE);
        res2_6_2set.setVisibility(View.INVISIBLE);
        res2_6_3set.setVisibility(View.INVISIBLE);
        res2_3.setVisibility(View.INVISIBLE);
        res2_3_2set.setVisibility(View.INVISIBLE);
        res2_3_3set.setVisibility(View.INVISIBLE);

        final EditText res3_4 = view.findViewById(R.id.braz8Res3_4);
        final EditText res3_4_2set = view.findViewById(R.id.braz8Res3_4_2set);
        final EditText res3_4_3set = view.findViewById(R.id.braz8Res3_4_3set);
        final EditText res3_5 = view.findViewById(R.id.braz8Res3_5);
        final EditText res3_5_2set = view.findViewById(R.id.braz8Res3_5_2set);
        final EditText res3_5_3set = view.findViewById(R.id.braz8Res3_5_3set);

        res3_4.setVisibility(View.INVISIBLE);
        res3_4_2set.setVisibility(View.INVISIBLE);
        res3_4_3set.setVisibility(View.INVISIBLE);
        res3_5.setVisibility(View.INVISIBLE);
        res3_5_2set.setVisibility(View.INVISIBLE);
        res3_5_3set.setVisibility(View.INVISIBLE);

        final EditText res4_7 = view.findViewById(R.id.braz8Res4_7);
        final EditText res4_7_2set = view.findViewById(R.id.braz8Res4_7_2set);
        final EditText res4_7_3set = view.findViewById(R.id.braz8Res4_7_3set);
        final EditText res4_2 = view.findViewById(R.id.braz8Res4_2);
        final EditText res4_2_2set = view.findViewById(R.id.braz8Res4_2_2set);
        final EditText res4_2_3set = view.findViewById(R.id.braz8Res4_2_3set);

        res4_7.setVisibility(View.INVISIBLE);
        res4_7_2set.setVisibility(View.INVISIBLE);
        res4_7_3set.setVisibility(View.INVISIBLE);
        res4_2.setVisibility(View.INVISIBLE);
        res4_2_2set.setVisibility(View.INVISIBLE);
        res4_2_3set.setVisibility(View.INVISIBLE);

        final EditText braz8Res5_Win_1 = view.findViewById(R.id.braz8Res5_Win_1);
        final EditText braz8Res5_Win_1_2set = view.findViewById(R.id.braz8Res5_Win_1_2set);
        final EditText braz8Res5_Win_1_3set = view.findViewById(R.id.braz8Res5_Win_1_3set);
        final EditText braz8Res5_Win_2 = view.findViewById(R.id.braz8Res5_Win_2);
        final EditText braz8Res5_Win_2_2set = view.findViewById(R.id.braz8Res5_Win_2_2set);
        final EditText braz8Res5_Win_2_3set = view.findViewById(R.id.braz8Res5_Win_2_3set);

        braz8Res5_Win_1.setVisibility(View.INVISIBLE);
        braz8Res5_Win_1_2set.setVisibility(View.INVISIBLE);
        braz8Res5_Win_1_3set.setVisibility(View.INVISIBLE);
        braz8Res5_Win_2.setVisibility(View.INVISIBLE);
        braz8Res5_Win_2_2set.setVisibility(View.INVISIBLE);
        braz8Res5_Win_2_3set.setVisibility(View.INVISIBLE);

        final EditText braz8Res6_Win_3 = view.findViewById(R.id.braz8Res6_Win_3);
        final EditText braz8Res6_Win_3_2set = view.findViewById(R.id.braz8Res6_Win_3_2set);
        final EditText braz8Res6_Win_3_3set = view.findViewById(R.id.braz8Res6_Win_3_3set);
        final EditText braz8Res6_Win_4 = view.findViewById(R.id.braz8Res6_Win_4);
        final EditText braz8Res6_Win_4_2set = view.findViewById(R.id.braz8Res6_Win_4_2set);
        final EditText braz8Res6_Win_4_3set = view.findViewById(R.id.braz8Res6_Win_4_3set);

        braz8Res6_Win_3.setVisibility(View.INVISIBLE);
        braz8Res6_Win_3_2set.setVisibility(View.INVISIBLE);
        braz8Res6_Win_3_3set.setVisibility(View.INVISIBLE);
        braz8Res6_Win_4.setVisibility(View.INVISIBLE);
        braz8Res6_Win_4_2set.setVisibility(View.INVISIBLE);
        braz8Res6_Win_4_3set.setVisibility(View.INVISIBLE);

        final EditText braz8Res7_Lost_1 = view.findViewById(R.id.braz8Res7_Lost_1);
        final EditText braz8Res7_Lost_1_2set = view.findViewById(R.id.braz8Res7_Lost_1_2set);
        final EditText braz8Res7_Lost_1_3set = view.findViewById(R.id.braz8Res7_Lost_1_3set);
        final EditText braz8Res7_Lost_2 = view.findViewById(R.id.braz8Res7_Lost_2);
        final EditText braz8Res7_Lost_2_2set = view.findViewById(R.id.braz8Res7_Lost_2_2set);
        final EditText braz8Res7_Lost_2_3set = view.findViewById(R.id.braz8Res7_Lost_2_3set);

        braz8Res7_Lost_1.setVisibility(View.INVISIBLE);
        braz8Res7_Lost_1_2set.setVisibility(View.INVISIBLE);
        braz8Res7_Lost_1_3set.setVisibility(View.INVISIBLE);
        braz8Res7_Lost_2.setVisibility(View.INVISIBLE);
        braz8Res7_Lost_2_2set.setVisibility(View.INVISIBLE);
        braz8Res7_Lost_2_3set.setVisibility(View.INVISIBLE);

        final EditText braz8Res8_Lost_3 = view.findViewById(R.id.braz8Res8_Lost_3);
        final EditText braz8Res8_Lost_3_2set = view.findViewById(R.id.braz8Res8_Lost_3_2set);
        final EditText braz8Res8_Lost_3_3set = view.findViewById(R.id.braz8Res8_Lost_3_3set);
        final EditText braz8Res8_Lost_4 = view.findViewById(R.id.braz8Res8_Lost_4);
        final EditText braz8Res8_Lost_4_2set = view.findViewById(R.id.braz8Res8_Lost_4_2set);
        final EditText braz8Res8_Lost_4_3set = view.findViewById(R.id.braz8Res8_Lost_4_3set);

        braz8Res8_Lost_3.setVisibility(View.INVISIBLE);
        braz8Res8_Lost_3_2set.setVisibility(View.INVISIBLE);
        braz8Res8_Lost_3_3set.setVisibility(View.INVISIBLE);
        braz8Res8_Lost_4.setVisibility(View.INVISIBLE);
        braz8Res8_Lost_4_2set.setVisibility(View.INVISIBLE);
        braz8Res8_Lost_4_3set.setVisibility(View.INVISIBLE);

        final EditText braz8Res9_Lost_6 = view.findViewById(R.id.braz8Res9_Lost_6);
        final EditText braz8Res9_Lost_6_2set = view.findViewById(R.id.braz8Res9_Lost_6_2set);
        final EditText braz8Res9_Lost_6_3set = view.findViewById(R.id.braz8Res9_Lost_6_3set);
        final EditText braz8Res9_Win_7 = view.findViewById(R.id.braz8Res9_Win_7);
        final EditText braz8Res9_Win_7_2set = view.findViewById(R.id.braz8Res9_Win_7_2set);
        final EditText braz8Res9_Win_7_3set = view.findViewById(R.id.braz8Res9_Win_7_3set);

        braz8Res9_Lost_6.setVisibility(View.INVISIBLE);
        braz8Res9_Lost_6_2set.setVisibility(View.INVISIBLE);
        braz8Res9_Lost_6_3set.setVisibility(View.INVISIBLE);
        braz8Res9_Win_7.setVisibility(View.INVISIBLE);
        braz8Res9_Win_7_2set.setVisibility(View.INVISIBLE);
        braz8Res9_Win_7_3set.setVisibility(View.INVISIBLE);

        final EditText braz8Res10_Lost_5 = view.findViewById(R.id.braz8Res10_Lost_5);
        final EditText braz8Res10_Lost_5_2set = view.findViewById(R.id.braz8Res10_Lost_5_2set);
        final EditText braz8Res10_Lost_5_3set = view.findViewById(R.id.braz8Res10_Lost_5_3set);
        final EditText braz8Res10_Win_8 = view.findViewById(R.id.braz8Res10_Win_8);
        final EditText braz8Res10_Win_8_2set = view.findViewById(R.id.braz8Res10_Win_8_2set);
        final EditText braz8Res10_Win_8_3set = view.findViewById(R.id.braz8Res10_Win_8_3set);

        braz8Res10_Lost_5.setVisibility(View.INVISIBLE);
        braz8Res10_Lost_5_2set.setVisibility(View.INVISIBLE);
        braz8Res10_Lost_5_3set.setVisibility(View.INVISIBLE);
        braz8Res10_Win_8.setVisibility(View.INVISIBLE);
        braz8Res10_Win_8_2set.setVisibility(View.INVISIBLE);
        braz8Res10_Win_8_3set.setVisibility(View.INVISIBLE);

        final EditText braz8Res11_Win_5 = view.findViewById(R.id.braz8Res11_Win_5);
        final EditText braz8Res11_Win_5_2set = view.findViewById(R.id.braz8Res11_Win_5_2set);
        final EditText braz8Res11_Win_5_3set = view.findViewById(R.id.braz8Res11_Win_5_3set);
        final EditText braz8Res11_Win_9 = view.findViewById(R.id.braz8Res11_Win_9);
        final EditText braz8Res11_Win_9_2set = view.findViewById(R.id.braz8Res11_Win_9_2set);
        final EditText braz8Res11_Win_9_3set = view.findViewById(R.id.braz8Res11_Win_9_3set);

        braz8Res11_Win_5.setVisibility(View.INVISIBLE);
        braz8Res11_Win_5_2set.setVisibility(View.INVISIBLE);
        braz8Res11_Win_5_3set.setVisibility(View.INVISIBLE);
        braz8Res11_Win_9.setVisibility(View.INVISIBLE);
        braz8Res11_Win_9_2set.setVisibility(View.INVISIBLE);
        braz8Res11_Win_9_3set.setVisibility(View.INVISIBLE);

        final EditText braz8Res12_Win_6 = view.findViewById(R.id.braz8Res12_Win_6);
        final EditText braz8Res12_Win_6_2set = view.findViewById(R.id.braz8Res12_Win_6_2set);
        final EditText braz8Res12_Win_6_3set = view.findViewById(R.id.braz8Res12_Win_6_3set);
        final EditText braz8Res12_Win_10 = view.findViewById(R.id.braz8Res12_Win_10);
        final EditText braz8Res12_Win_10_2set = view.findViewById(R.id.braz8Res12_Win_10_2set);
        final EditText braz8Res12_Win_10_3set = view.findViewById(R.id.braz8Res12_Win_10_3set);

        braz8Res12_Win_6.setVisibility(View.INVISIBLE);
        braz8Res12_Win_6_2set.setVisibility(View.INVISIBLE);
        braz8Res12_Win_6_3set.setVisibility(View.INVISIBLE);
        braz8Res12_Win_10.setVisibility(View.INVISIBLE);
        braz8Res12_Win_10_2set.setVisibility(View.INVISIBLE);
        braz8Res12_Win_10_3set.setVisibility(View.INVISIBLE);

        final EditText braz8Res13_Lost_11 = view.findViewById(R.id.braz8Res13_Lost_11);
        final EditText braz8Res13_Lost_11_2set = view.findViewById(R.id.braz8Res13_Lost_11_2set);
        final EditText braz8Res13_Lost_11_3set = view.findViewById(R.id.braz8Res13_Lost_11_3set);
        final EditText braz8Res13_Lost_12 = view.findViewById(R.id.braz8Res13_Lost_12);
        final EditText braz8Res13_Lost_12_2set = view.findViewById(R.id.braz8Res13_Lost_12_2set);
        final EditText braz8Res13_Lost_12_3set = view.findViewById(R.id.braz8Res13_Lost_12_3set);

        braz8Res13_Lost_11.setVisibility(View.INVISIBLE);
        braz8Res13_Lost_11_2set.setVisibility(View.INVISIBLE);
        braz8Res13_Lost_11_3set.setVisibility(View.INVISIBLE);
        braz8Res13_Lost_12.setVisibility(View.INVISIBLE);
        braz8Res13_Lost_12_2set.setVisibility(View.INVISIBLE);
        braz8Res13_Lost_12_3set.setVisibility(View.INVISIBLE);

        final EditText braz8Res14_Win_11 = view.findViewById(R.id.braz8Res14_Win_11);
        final EditText braz8Res14_Win_11_2set = view.findViewById(R.id.braz8Res14_Win_11_2set);
        final EditText braz8Res14_Win_11_3set = view.findViewById(R.id.braz8Res14_Win_11_3set);
        final EditText braz8Res14_Win_12 = view.findViewById(R.id.braz8Res14_Win_12);
        final EditText braz8Res14_Win_12_2set = view.findViewById(R.id.braz8Res14_Win_12_2set);
        final EditText braz8Res14_Win_12_3set = view.findViewById(R.id.braz8Res14_Win_12_3set);

        braz8Res14_Win_11.setVisibility(View.INVISIBLE);
        braz8Res14_Win_11_2set.setVisibility(View.INVISIBLE);
        braz8Res14_Win_11_3set.setVisibility(View.INVISIBLE);
        braz8Res14_Win_12.setVisibility(View.INVISIBLE);
        braz8Res14_Win_12_2set.setVisibility(View.INVISIBLE);
        braz8Res14_Win_12_3set.setVisibility(View.INVISIBLE);


        final Button team1 = view.findViewById(R.id.braz8Team01);
        final Button team2 = view.findViewById(R.id.braz8Team02);
        final Button team3 = view.findViewById(R.id.braz8Team03);
        final Button team4 = view.findViewById(R.id.braz8Team04);
        final Button team5 = view.findViewById(R.id.braz8Team05);
        final Button team6 = view.findViewById(R.id.braz8Team06);
        final Button team7 = view.findViewById(R.id.braz8Team07);
        final Button team8 = view.findViewById(R.id.braz8Team08);

        team1.setText(getActivity().getIntent().getStringExtra("NameOfTeam1"));
        team2.setText(getActivity().getIntent().getStringExtra("NameOfTeam2"));
        team3.setText(getActivity().getIntent().getStringExtra("NameOfTeam3"));
        team4.setText(getActivity().getIntent().getStringExtra("NameOfTeam4"));
        team5.setText(getActivity().getIntent().getStringExtra("NameOfTeam5"));
        team6.setText(getActivity().getIntent().getStringExtra("NameOfTeam6"));
        team7.setText(getActivity().getIntent().getStringExtra("NameOfTeam7"));
        team8.setText(getActivity().getIntent().getStringExtra("NameOfTeam8"));


        final Button win1 = view.findViewById(R.id.braz8WIN_1);
        final Button win2 = view.findViewById(R.id.braz8WIN_2);
        final Button win3 = view.findViewById(R.id.braz8WIN_3);
        final Button win4 = view.findViewById(R.id.braz8WIN_4);
        final Button win5 = view.findViewById(R.id.braz8WIN_5);
        final Button win6 = view.findViewById(R.id.braz8WIN_6);
        final Button win7 = view.findViewById(R.id.braz8WIN_7);
        final Button win8 = view.findViewById(R.id.braz8WIN_8);
        final Button win9 = view.findViewById(R.id.braz8WIN_9);
        final Button win10 = view.findViewById(R.id.braz8WIN_10);
        final Button win11 = view.findViewById(R.id.braz8WIN_11);
        final Button win12 = view.findViewById(R.id.braz8WIN_12);
        final Button win13 = view.findViewById(R.id.braz8WIN_13);
        final Button win14 = view.findViewById(R.id.braz8WIN_14);


        final Button lost1 = view.findViewById(R.id.braz8LOST_1);
        final Button lost2 = view.findViewById(R.id.braz8LOST_2);
        final Button lost3 = view.findViewById(R.id.braz8LOST_3);
        final Button lost4 = view.findViewById(R.id.braz8LOST_4);
        final Button lost5 = view.findViewById(R.id.braz8LOST_5);
        final Button lost6 = view.findViewById(R.id.braz8LOST_6);
        final Button lost11 = view.findViewById(R.id.braz8LOST_11);
        final Button lost12 = view.findViewById(R.id.braz8LOST_12);

        toast = Toast.makeText(getActivity().getApplicationContext(), "Wprowadz wczesniejszy wynik !", Toast.LENGTH_SHORT);

        // 1 MECZ
        setResultsForBraz.WithLoserWithoutCheck(team1, team8, win1, "WIN.1", lost1, "LOST.1", res1_1, res1_1_2set, res1_1_3set, res1_8, res1_8_2set, res1_8_3set);

        // 2 MECZ
        setResultsForBraz.WithLoserWithoutCheck(team6, team3, win2, "WIN.2", lost2, "LOST.2", res2_6, res2_6_2set, res2_6_3set, res2_3, res2_3_2set, res2_3_3set);

        // 3 MECZ
        setResultsForBraz.WithLoserWithoutCheck(team4, team5, win3, "WIN.3", lost3, "LOST.3", res3_4, res3_4_2set, res3_4_3set, res3_5, res3_5_2set, res3_5_3set);

        // 4 MECZ
        setResultsForBraz.WithLoserWithoutCheck(team7, team2, win4, "WIN.4", lost4, "LOST.4", res4_2, res4_2_2set, res4_2_3set, res4_7, res4_7_2set, res4_7_3set);

        // 5 MECZ

        setResultsForBraz.WithLoserAndCheck(win1, "WIN.1", win2, "WIN.2", win5, "WIN.5", lost5, "LOST.5", braz8Res5_Win_1, braz8Res5_Win_1_2set, braz8Res5_Win_1_3set, braz8Res5_Win_2, braz8Res5_Win_2_2set, braz8Res5_Win_2_3set);


        // 6 MECZ
        setResultsForBraz.WithLoserAndCheck(win3, "WIN.3", win4, "WIN.4", win6, "WIN.6", lost6, "LOST.6", braz8Res6_Win_3, braz8Res6_Win_3_2set, braz8Res6_Win_3_3set, braz8Res6_Win_4, braz8Res6_Win_4_2set, braz8Res6_Win_4_3set);

        //7 MECZ
        setResultsForBraz.WithCheckWithoutLoser(lost1, "LOST.1", lost2, "LOST.2", win7, "WIN.7", braz8Res7_Lost_1, braz8Res7_Lost_1_2set, braz8Res7_Lost_1_3set, braz8Res7_Lost_2, braz8Res7_Lost_2_2set, braz8Res7_Lost_2_3set);


        //8 MECZ
        setResultsForBraz.WithCheckWithoutLoser(lost3, "LOST.3", lost4, "LOST.4", win8, "WIN.8", braz8Res8_Lost_3, braz8Res8_Lost_3_2set, braz8Res8_Lost_3_3set, braz8Res8_Lost_4, braz8Res8_Lost_4_2set, braz8Res8_Lost_4_3set);

        //9 MECZ
        setResultsForBraz.WithCheckWithoutLoser(lost6, "LOST.6", win7, "WIN.7", win9, "WIN.9", braz8Res9_Lost_6, braz8Res9_Lost_6_2set, braz8Res9_Lost_6_3set, braz8Res9_Win_7, braz8Res9_Win_7_2set, braz8Res9_Win_7_3set);

        //10 MECZ
        setResultsForBraz.WithCheckWithoutLoser(win8, "WIN.8", lost5, "LOST.5", win10, "WIN.10", braz8Res10_Lost_5, braz8Res10_Lost_5_2set, braz8Res10_Lost_5_3set, braz8Res10_Win_8, braz8Res10_Win_8_2set, braz8Res10_Win_8_3set);

        //11 MECZ
        setResultsForBraz.WithLoserAndCheck(win5, "WIN.5", win9, "WIN.9", win11, "WIN.11", lost11, "LOST.11", braz8Res11_Win_5, braz8Res11_Win_5_2set, braz8Res11_Win_5_3set, braz8Res11_Win_9, braz8Res11_Win_9_2set, braz8Res11_Win_9_3set);

        //12 MECZ
        setResultsForBraz.WithLoserAndCheck(win6, "WIN.6", win10, "WIN.10", win12, "WIN.12", lost12, "LOST.12", braz8Res12_Win_6, braz8Res12_Win_6_2set, braz8Res12_Win_6_3set, braz8Res12_Win_10, braz8Res12_Win_10_2set, braz8Res12_Win_10_3set);

        //13 MECZ
        setResultsForBraz.WithCheckWithoutLoser(lost11, "LOST.11", lost12, "LOST.12", win13, "WIN.13", braz8Res13_Lost_11, braz8Res13_Lost_11_2set, braz8Res13_Lost_11_3set, braz8Res13_Lost_12, braz8Res13_Lost_12_2set, braz8Res13_Lost_12_3set);

        //14 MECZ FINAL
        setResultsForBraz.WithCheckWithoutLoser(win11, "WIN.11", win12, "WIN.12", win14, "WIN.14", braz8Res14_Win_11, braz8Res14_Win_11_2set, braz8Res14_Win_11_3set, braz8Res14_Win_12, braz8Res14_Win_12_2set, braz8Res14_Win_12_3set);

        return view;
    }
}




package com.example.adam.rozpiskimeczowe.brazylian.brazylian16;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import java.util.Objects;
import java.util.TreeMap;

import com.example.adam.rozpiskimeczowe.R;




public class FragmentTabBraz16_2 extends Fragment {
    View view;
    CustomAdapter customAdapter;
    TreeMap<Integer, Values> resultsOfMatches;
    Integer numberOfMatch=0;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment_tab_braz16_2, container, false);

        resultsOfMatches = new TreeMap<>();

        final ListView list = view.findViewById(R.id.listViewBrazFrag2);
        list.setItemsCanFocus(true);
        customAdapter = new CustomAdapter(Objects.requireNonNull(getActivity()).getApplicationContext());
        list.setAdapter(customAdapter);

        final Button team1 = getActivity().findViewById(R.id.braz16Team01);
        final Button team2 = getActivity().findViewById(R.id.braz16Team02);
        final Button team3 = getActivity().findViewById(R.id.braz16Team03);
        final Button team4 = getActivity().findViewById(R.id.braz16Team04);
        final Button team5 = getActivity().findViewById(R.id.braz16Team05);
        final Button team6 = getActivity().findViewById(R.id.braz16Team06);
        final Button team7 = getActivity().findViewById(R.id.braz16Team07);
        final Button team8 = getActivity().findViewById(R.id.braz16Team08);
        final Button team9 = getActivity().findViewById(R.id.braz16Team09);
        final Button team10 = getActivity().findViewById(R.id.braz16Team10);
        final Button team11 = getActivity().findViewById(R.id.braz16Team11);
        final Button team12 = getActivity().findViewById(R.id.braz16Team12);
        final Button team13 = getActivity().findViewById(R.id.braz16Team13);
        final Button team14 = getActivity().findViewById(R.id.braz16Team14);
        final Button team15 = getActivity().findViewById(R.id.braz16Team15);
        final Button team16 = getActivity().findViewById(R.id.braz16Team16);

        final Button win1 = getActivity().findViewById(R.id.braz16WIN_1);
        final Button win2 = getActivity().findViewById(R.id.braz16WIN_2);
        final Button win3 = getActivity().findViewById(R.id.braz16WIN_3);
        final Button win4 = getActivity().findViewById(R.id.braz16WIN_4);
        final Button win5 = getActivity().findViewById(R.id.braz16WIN_5);
        final Button win6 = getActivity().findViewById(R.id.braz16WIN_6);
        final Button win7 = getActivity().findViewById(R.id.braz16WIN_7);
        final Button win8 = getActivity().findViewById(R.id.braz16WIN_8);
        final Button win9 = getActivity().findViewById(R.id.braz16WIN_9);
        final Button win10 = getActivity().findViewById(R.id.braz16WIN_10);
        final Button win11 = getActivity().findViewById(R.id.braz16WIN_11);
        final Button win12 = getActivity().findViewById(R.id.braz16WIN_12);
        final Button win13 = getActivity().findViewById(R.id.braz16WIN_13);
        final Button win14 = getActivity().findViewById(R.id.braz16WIN_14);
        final Button win15 = getActivity().findViewById(R.id.braz16WIN_15);
        final Button win16 = getActivity().findViewById(R.id.braz16WIN_16);
        final Button win17 = getActivity().findViewById(R.id.braz16WIN_17);
        final Button win18 = getActivity().findViewById(R.id.braz16WIN_18);
        final Button win19 = getActivity().findViewById(R.id.braz16WIN_19);
        final Button win20 = getActivity().findViewById(R.id.braz16WIN_20);
        final Button win21 = getActivity().findViewById(R.id.braz16WIN_21);
        final Button win22 = getActivity().findViewById(R.id.braz16WIN_22);
        final Button win23 = getActivity().findViewById(R.id.braz16WIN_23);
        final Button win24 = getActivity().findViewById(R.id.braz16WIN_24);
        final Button win25 = getActivity().findViewById(R.id.braz16WIN_25);
        final Button win26 = getActivity().findViewById(R.id.braz16WIN_26);
        final Button win27 = getActivity().findViewById(R.id.braz16WIN_27);
        final Button win28 = getActivity().findViewById(R.id.braz16WIN_28);


        final Button lost1 = getActivity().findViewById(R.id.braz16LOST_1);
        final Button lost2 = getActivity().findViewById(R.id.braz16LOST_2);
        final Button lost3 = getActivity().findViewById(R.id.braz16LOST_3);
        final Button lost4 = getActivity().findViewById(R.id.braz16LOST_4);
        final Button lost5 = getActivity().findViewById(R.id.braz16LOST_5);
        final Button lost6 = getActivity().findViewById(R.id.braz16LOST_6);
        final Button lost7 = getActivity().findViewById(R.id.braz16LOST_7);
        final Button lost8 = getActivity().findViewById(R.id.braz16LOST_8);
        final Button lost9 = getActivity().findViewById(R.id.braz16LOST_9);
        final Button lost10 = getActivity().findViewById(R.id.braz16LOST_10);
        final Button lost11 = getActivity().findViewById(R.id.braz16LOST_11);
        final Button lost12 = getActivity().findViewById(R.id.braz16LOST_12);
        final Button lost21 = getActivity().findViewById(R.id.braz16LOST_21);
        final Button lost22 = getActivity().findViewById(R.id.braz16LOST_22);
        final Button lost27 = getActivity().findViewById(R.id.braz16LOST_27);
        final Button lost28 = getActivity().findViewById(R.id.braz16LOST_28);


        final EditText Res1_1 = getActivity().findViewById(R.id.braz16Res1_1);
        final EditText Res1_1_2set = getActivity().findViewById(R.id.braz16Res1_1_2set);
        final EditText Res1_1_3set = getActivity().findViewById(R.id.braz16Res1_1_3set);
        final EditText Res1_16 = getActivity().findViewById(R.id.braz16Res1_16);
        final EditText Res1_16_2set = getActivity().findViewById(R.id.braz16Res1_16_2set);
        final EditText Res1_16_3set = getActivity().findViewById(R.id.braz16Res1_16_3set);


        final EditText Res2_9 = getActivity().findViewById(R.id.braz16Res2_9);
        final EditText Res2_9_2set = getActivity().findViewById(R.id.braz16Res2_9_2set);
        final EditText Res2_9_3set = getActivity().findViewById(R.id.braz16Res2_9_3set);
        final EditText Res2_8 = getActivity().findViewById(R.id.braz16Res2_8);
        final EditText Res2_8_2set = getActivity().findViewById(R.id.braz16Res2_8_2set);
        final EditText Res2_8_3set = getActivity().findViewById(R.id.braz16Res2_8_3set);

        final EditText Res3_5 = getActivity().findViewById(R.id.braz16Res3_5);
        final EditText Res3_5_2set = getActivity().findViewById(R.id.braz16Res3_5_2set);
        final EditText Res3_5_3set = getActivity().findViewById(R.id.braz16Res3_5_3set);
        final EditText Res3_12 = getActivity().findViewById(R.id.braz16Res3_12);
        final EditText Res3_12_2set = getActivity().findViewById(R.id.braz16Res3_12_2set);
        final EditText Res3_12_3set = getActivity().findViewById(R.id.braz16Res3_12_3set);

        final EditText Res4_13 = getActivity().findViewById(R.id.braz16Res4_13);
        final EditText Res4_13_2set = getActivity().findViewById(R.id.braz16Res4_13_2set);
        final EditText Res4_13_3set = getActivity().findViewById(R.id.braz16Res4_13_3set);
        final EditText Res4_4 = getActivity().findViewById(R.id.braz16Res4_4);
        final EditText Res4_4_2set = getActivity().findViewById(R.id.braz16Res4_4_2set);
        final EditText Res4_4_3set = getActivity().findViewById(R.id.braz16Res4_4_3set);

        final EditText braz16Res5_3 = getActivity().findViewById(R.id.braz16Res5_3);
        final EditText braz16Res5_3_2set = getActivity().findViewById(R.id.braz16Res5_3_2set);
        final EditText braz16Res5_3_3set = getActivity().findViewById(R.id.braz16Res5_3_3set);
        final EditText braz16Res5_14 = getActivity().findViewById(R.id.braz16Res5_14);
        final EditText braz16Res5_14_2set = getActivity().findViewById(R.id.braz16Res5_14_2set);
        final EditText braz16Res5_14_3set = getActivity().findViewById(R.id.braz16Res5_14_3set);

        final EditText braz16Res6_11 = getActivity().findViewById(R.id.braz16Res6_11);
        final EditText braz16Res6_11_2set = getActivity().findViewById(R.id.braz16Res6_11_2set);
        final EditText braz16Res6_11_3set = getActivity().findViewById(R.id.braz16Res6_11_3set);
        final EditText braz16Res6_6 = getActivity().findViewById(R.id.braz16Res6_6);
        final EditText braz16Res6_6_2set = getActivity().findViewById(R.id.braz16Res6_6_2set);
        final EditText braz16Res6_6_3set = getActivity().findViewById(R.id.braz16Res6_6_3set);

        final EditText braz16Res7_7 = getActivity().findViewById(R.id.braz16Res7_7);
        final EditText braz16Res7_7_2set = getActivity().findViewById(R.id.braz16Res7_7_2set);
        final EditText braz16Res7_7_3set = getActivity().findViewById(R.id.braz16Res7_7_3set);
        final EditText braz16Res7_10 = getActivity().findViewById(R.id.braz16Res7_10);
        final EditText braz16Res7_10_2set = getActivity().findViewById(R.id.braz16Res7_10_2set);
        final EditText braz16Res7_10_3set = getActivity().findViewById(R.id.braz16Res7_10_3set);

        final EditText braz16Res8_15 = getActivity().findViewById(R.id.braz16Res8_15);
        final EditText braz16Res8_15_2set = getActivity().findViewById(R.id.braz16Res8_15_2set);
        final EditText braz16Res8_15_3set = getActivity().findViewById(R.id.braz16Res8_15_3set);
        final EditText braz16Res8_2 = getActivity().findViewById(R.id.braz16Res8_2);
        final EditText braz16Res8_2_2set = getActivity().findViewById(R.id.braz16Res8_2_2set);
        final EditText braz16Res8_2_3set = getActivity().findViewById(R.id.braz16Res8_2_3set);

        final EditText braz16Res9_Win_1 = getActivity().findViewById(R.id.braz16Res9_Win_1);
        final EditText braz16Res9_Win_1_2set = getActivity().findViewById(R.id.braz16Res9_Win_1_2set);
        final EditText braz16Res9_Win_1_3set = getActivity().findViewById(R.id.braz16Res9_Win_1_3set);
        final EditText braz16Res9_Win_2 = getActivity().findViewById(R.id.braz16Res9_Win_2);
        final EditText braz16Res9_Win_2_2set = getActivity().findViewById(R.id.braz16Res9_Win_2_2set);
        final EditText braz16Res9_Win_2_3set = getActivity().findViewById(R.id.braz16Res9_Win_2_3set);

        final EditText braz16Res10_Win_3 = getActivity().findViewById(R.id.braz16Res10_Win_3);
        final EditText braz16Res10_Win_3_2set = getActivity().findViewById(R.id.braz16Res10_Win_3_2set);
        final EditText braz16Res10_Win_3_3set = getActivity().findViewById(R.id.braz16Res10_Win_3_3set);
        final EditText braz16Res10_Win_4 = getActivity().findViewById(R.id.braz16Res10_Win_4);
        final EditText braz16Res10_Win_4_2set = getActivity().findViewById(R.id.braz16Res10_Win_4_2set);
        final EditText braz16Res10_Win_4_3set = getActivity().findViewById(R.id.braz16Res10_Win_4_3set);

        final EditText braz16Res11_Win_5 = getActivity().findViewById(R.id.braz16Res11_Win_5);
        final EditText braz16Res11_Win_5_2set = getActivity().findViewById(R.id.braz16Res11_Win_5_2set);
        final EditText braz16Res11_Win_5_3set = getActivity().findViewById(R.id.braz16Res11_Win_5_3set);
        final EditText braz16Res11_Win_6 = getActivity().findViewById(R.id.braz16Res11_Win_6);
        final EditText braz16Res11_Win_6_2set = getActivity().findViewById(R.id.braz16Res11_Win_6_2set);
        final EditText braz16Res11_Win_6_3set = getActivity().findViewById(R.id.braz16Res11_Win_6_3set);

        final EditText braz16Res12_Win_7 = getActivity().findViewById(R.id.braz16Res12_Win_7);
        final EditText braz16Res12_Win_7_2set = getActivity().findViewById(R.id.braz16Res12_Win_7_2set);
        final EditText braz16Res12_Win_7_3set = getActivity().findViewById(R.id.braz16Res12_Win_7_3set);
        final EditText braz16Res12_Win_8 = getActivity().findViewById(R.id.braz16Res12_Win_8);
        final EditText braz16Res12_Win_8_2set = getActivity().findViewById(R.id.braz16Res12_Win_8_2set);
        final EditText braz16Res12_Win_8_3set = getActivity().findViewById(R.id.braz16Res12_Win_8_3set);

        final EditText braz16Res13_Lost_8 = getActivity().findViewById(R.id.braz16Res13_Lost_8);
        final EditText braz16Res13_Lost_8_2set = getActivity().findViewById(R.id.braz16Res13_Lost_8_2set);
        final EditText braz16Res13_Lost_8_3set = getActivity().findViewById(R.id.braz16Res13_Lost_8_3set);
        final EditText braz16Res13_Lost_7 = getActivity().findViewById(R.id.braz16Res13_Lost_7);
        final EditText braz16Res13_Lost_7_2set = getActivity().findViewById(R.id.braz16Res13_Lost_7_2set);
        final EditText braz16Res13_Lost_7_3set = getActivity().findViewById(R.id.braz16Res13_Lost_7_3set);

        final EditText braz16Res14_Lost_6 = getActivity().findViewById(R.id.braz16Res14_Lost_6);
        final EditText braz16Res14_Lost_6_2set = getActivity().findViewById(R.id.braz16Res14_Lost_6_2set);
        final EditText braz16Res14_Lost_6_3set = getActivity().findViewById(R.id.braz16Res14_Lost_6_3set);
        final EditText braz16Res14_Lost_5 = getActivity().findViewById(R.id.braz16Res14_Lost_5);
        final EditText braz16Res14_Lost_5_2set = getActivity().findViewById(R.id.braz16Res14_Lost_5_2set);
        final EditText braz16Res14_Lost_5_3set = getActivity().findViewById(R.id.braz16Res14_Lost_5_3set);

        final EditText braz16Res15_Lost_4 = getActivity().findViewById(R.id.braz16Res15_Lost_4);
        final EditText braz16Res15_Lost_4_2set = getActivity().findViewById(R.id.braz16Res15_Lost_4_2set);
        final EditText braz16Res15_Lost_4_3set = getActivity().findViewById(R.id.braz16Res15_Lost_4_3set);
        final EditText braz16Res15_Lost_3 = getActivity().findViewById(R.id.braz16Res15_Lost_3);
        final EditText braz16Res15_Lost_3_2set = getActivity().findViewById(R.id.braz16Res15_Lost_3_2set);
        final EditText braz16Res15_Lost_3_3set = getActivity().findViewById(R.id.braz16Res15_Lost_3_3set);

        final EditText braz16Res16_Lost_2 = getActivity().findViewById(R.id.braz16Res16_Lost_2);
        final EditText braz16Res16_Lost_2_2set = getActivity().findViewById(R.id.braz16Res16_Lost_2_2set);
        final EditText braz16Res16_Lost_2_3set = getActivity().findViewById(R.id.braz16Res16_Lost_2_3set);
        final EditText braz16Res16_Lost_1 = getActivity().findViewById(R.id.braz16Res16_Lost_1);
        final EditText braz16Res16_Lost_1_2set = getActivity().findViewById(R.id.braz16Res16_Lost_1_2set);
        final EditText braz16Res16_Lost_1_3set = getActivity().findViewById(R.id.braz16Res16_Lost_1_3set);

        final EditText braz16Res17_Win_13 = getActivity().findViewById(R.id.braz16Res17_Win_13);
        final EditText braz16Res17_Win_13_2set = getActivity().findViewById(R.id.braz16Res17_Win_13_2set);
        final EditText braz16Res17_Win_13_3set = getActivity().findViewById(R.id.braz16Res17_Win_13_3set);
        final EditText braz16Res17_Lost_10 = getActivity().findViewById(R.id.braz16Res17_Lost_10);
        final EditText braz16Res17_Lost_10_2set = getActivity().findViewById(R.id.braz16Res17_Lost_10_2set);
        final EditText braz16Res17_Lost_10_3set = getActivity().findViewById(R.id.braz16Res17_Lost_10_3set);



        final EditText braz16Res18_Win_14 = getActivity().findViewById(R.id.braz16Res18_Win_14);
        final EditText braz16Res18_Win_14_2set = getActivity().findViewById(R.id.braz16Res18_Win_14_2set);
        final EditText braz16Res18_Win_14_3set = getActivity().findViewById(R.id.braz16Res18_Win_14_3set);
        final EditText braz16Res18_Lost_9 = getActivity().findViewById(R.id.braz16Res18_Lost_9);
        final EditText braz16Res18_Lost_9_2set = getActivity().findViewById(R.id.braz16Res18_Lost_9_2set);
        final EditText braz16Res18_Lost_9_3set = getActivity().findViewById(R.id.braz16Res18_Lost_9_3set);

        final EditText braz16Res19_Win_15 = getActivity().findViewById(R.id.braz16Res19_Win_15);
        final EditText braz16Res19_Win_15_2set = getActivity().findViewById(R.id.braz16Res19_Win_15_2set);
        final EditText braz16Res19_Win_15_3set = getActivity().findViewById(R.id.braz16Res19_Win_15_3set);
        final EditText braz16Res19_Lost_12 = getActivity().findViewById(R.id.braz16Res19_Lost_12);
        final EditText braz16Res19_Lost_12_2set = getActivity().findViewById(R.id.braz16Res19_Lost_12_2set);
        final EditText braz16Res19_Lost_12_3set = getActivity().findViewById(R.id.braz16Res19_Lost_12_3set);


        final EditText braz16Res20_Win_16 = getActivity().findViewById(R.id.braz16Res20_Win_16);
        final EditText braz16Res20_Win_16_2set = getActivity().findViewById(R.id.braz16Res20_Win_16_2set);
        final EditText braz16Res20_Win_16_3set = getActivity().findViewById(R.id.braz16Res20_Win_16_3set);
        final EditText braz16Res20_Lost_11 = getActivity().findViewById(R.id.braz16Res20_Lost_11);
        final EditText braz16Res20_Lost_11_2set = getActivity().findViewById(R.id.braz16Res20_Lost_11_2set);
        final EditText braz16Res20_Lost_11_3set = getActivity().findViewById(R.id.braz16Res20_Lost_11_3set);

        final EditText braz16Res21_Win_9 = getActivity().findViewById(R.id.braz16Res21_Win_9);
        final EditText braz16Res21_Win_9_2set = getActivity().findViewById(R.id.braz16Res21_Win_9_2set);
        final EditText braz16Res21_Win_9_3set = getActivity().findViewById(R.id.braz16Res21_Win_9_3set);
        final EditText braz16Res21_Win_10 = getActivity().findViewById(R.id.braz16Res21_Win_10);
        final EditText braz16Res21_Win_10_2set = getActivity().findViewById(R.id.braz16Res21_Win_10_2set);
        final EditText braz16Res21_Win_10_3set = getActivity().findViewById(R.id.braz16Res21_Win_10_3set);

        final EditText braz16Res22_Win_11 = getActivity().findViewById(R.id.braz16Res22_Win_11);
        final EditText braz16Res22_Win_11_2set = getActivity().findViewById(R.id.braz16Res22_Win_11_2set);
        final EditText braz16Res22_Win_11_3set = getActivity().findViewById(R.id.braz16Res22_Win_11_3set);
        final EditText braz16Res22_Win_12 = getActivity().findViewById(R.id.braz16Res22_Win_12);
        final EditText braz16Res22_Win_12_2set = getActivity().findViewById(R.id.braz16Res22_Win_12_2set);
        final EditText braz16Res22_Win_12_3set = getActivity().findViewById(R.id.braz16Res22_Win_12_3set);


        final EditText braz16Res23_Win_17 = getActivity().findViewById(R.id.braz16Res23_Win_17);
        final EditText braz16Res23_Win_17_2set = getActivity().findViewById(R.id.braz16Res23_Win_17_2set);
        final EditText braz16Res23_Win_17_3set = getActivity().findViewById(R.id.braz16Res23_Win_17_3set);
        final EditText braz16Res23_Win_18 = getActivity().findViewById(R.id.braz16Res23_Win_18);
        final EditText braz16Res23_Win_18_2set = getActivity().findViewById(R.id.braz16Res23_Win_18_2set);
        final EditText braz16Res23_Win_18_3set = getActivity().findViewById(R.id.braz16Res23_Win_18_3set);



        final EditText braz16Res24_Win_19 = getActivity().findViewById(R.id.braz16Res24_Win_19);
        final EditText braz16Res24_Win_19_2set = getActivity().findViewById(R.id.braz16Res24_Win_19_2set);
        final EditText braz16Res24_Win_19_3set = getActivity().findViewById(R.id.braz16Res24_Win_19_3set);
        final EditText braz16Res24_Win_20 = getActivity().findViewById(R.id.braz16Res24_Win_20);
        final EditText braz16Res24_Win_20_2set = getActivity().findViewById(R.id.braz16Res24_Win_20_2set);
        final EditText braz16Res24_Win_20_3set = getActivity().findViewById(R.id.braz16Res24_Win_20_3set);


        final EditText braz16Res25_Lost_22 = getActivity().findViewById(R.id.braz16Res25_Lost_22);
        final EditText braz16Res25_Lost_22_2set = getActivity().findViewById(R.id.braz16Res25_Lost_22_2set);
        final EditText braz16Res25_Lost_22_3set = getActivity().findViewById(R.id.braz16Res25_Lost_22_3set);
        final EditText braz16Res25_Win_23 = getActivity().findViewById(R.id.braz16Res25_Win_23);
        final EditText braz16Res25_Win_23_2set = getActivity().findViewById(R.id.braz16Res25_Win_23_2set);
        final EditText braz16Res25_Win_23_3set = getActivity().findViewById(R.id.braz16Res25_Win_23_3set);


        final EditText braz16Res26_Lost_21 = getActivity().findViewById(R.id.braz16Res26_Lost_21);
        final EditText braz16Res26_Lost_21_2set = getActivity().findViewById(R.id.braz16Res26_Lost_21_2set);
        final EditText braz16Res26_Lost_21_3set = getActivity().findViewById(R.id.braz16Res26_Lost_21_3set);
        final EditText braz16Res26_Win_24 = getActivity().findViewById(R.id.braz16Res26_Win_24);
        final EditText braz16Res26_Win_24_2set = getActivity().findViewById(R.id.braz16Res26_Win_24_2set);
        final EditText braz16Res26_Win_24_3set = getActivity().findViewById(R.id.braz16Res26_Win_24_3set);

        final EditText braz16Res27_Win_21 = getActivity().findViewById(R.id.braz16Res27_Win_21);
        final EditText braz16Res27_Win_21_2set = getActivity().findViewById(R.id.braz16Res27_Win_21_2set);
        final EditText braz16Res27_Win_21_3set = getActivity().findViewById(R.id.braz16Res27_Win_21_3set);
        final EditText braz16Res27_Win_25 = getActivity().findViewById(R.id.braz16Res27_Win_25);
        final EditText braz16Res27_Win_25_2set = getActivity().findViewById(R.id.braz16Res27_Win_25_2set);
        final EditText braz16Res27_Win_25_3set = getActivity().findViewById(R.id.braz16Res27_Win_25_3set);


        final EditText braz16Res28_Win_22 = getActivity().findViewById(R.id.braz16Res28_Win_22);
        final EditText braz16Res28_Win_22_2set = getActivity().findViewById(R.id.braz16Res28_Win_22_2set);
        final EditText braz16Res28_Win_22_3set = getActivity().findViewById(R.id.braz16Res28_Win_22_3set);
        final EditText braz16Res28_Win_26 = getActivity().findViewById(R.id.braz16Res28_Win_26);
        final EditText braz16Res28_Win_26_2set = getActivity().findViewById(R.id.braz16Res28_Win_26_2set);
        final EditText braz16Res28_Win_26_3set = getActivity().findViewById(R.id.braz16Res28_Win_26_3set);


        final EditText braz16Res29_Lost_27 = getActivity().findViewById(R.id.braz16Res29_Lost_27);
        final EditText braz16Res29_Lost_27_2set = getActivity().findViewById(R.id.braz16Res29_Lost_27_2set);
        final EditText braz16Res29_Lost_27_3set = getActivity().findViewById(R.id.braz16Res29_Lost_27_3set);
        final EditText braz16Res29_Lost_28 = getActivity().findViewById(R.id.braz16Res29_Lost_28);
        final EditText braz16Res29_Lost_28_2set = getActivity().findViewById(R.id.braz16Res29_Lost_28_2set);
        final EditText braz16Res29_Lost_28_3set = getActivity().findViewById(R.id.braz16Res29_Lost_28_3set);

        final EditText braz16Res30_Win_27 = getActivity().findViewById(R.id.braz16Res30_Win_27);
        final EditText braz16Res30_Win_27_2set = getActivity().findViewById(R.id.braz16Res30_Win_27_2set);
        final EditText braz16Res30_Win_27_3set = getActivity().findViewById(R.id.braz16Res30_Win_27_3set);
        final EditText braz16Res30_Win_28 = getActivity().findViewById(R.id.braz16Res30_Win_28);
        final EditText braz16Res30_Win_28_2set = getActivity().findViewById(R.id.braz16Res30_Win_28_2set);
        final EditText braz16Res30_Win_28_3set = getActivity().findViewById(R.id.braz16Res30_Win_28_3set);





        // 1 MECZ
        setResult(team1, team16, Res1_1, Res1_1_2set, Res1_1_3set, Res1_16, Res1_16_2set, Res1_16_3set);

        // 2 MECZ
        setResult(team9, team8,  Res2_9, Res2_9_2set, Res2_9_3set, Res2_8, Res2_8_2set, Res2_8_3set);

        // 3 MECZ
        setResult(team5, team12,Res3_5, Res3_5_2set, Res3_5_3set, Res3_12, Res3_12_2set, Res3_12_3set);

        // 4 MECZ
        setResult(team13, team4,Res4_4, Res4_4_2set, Res4_4_3set, Res4_13, Res4_13_2set, Res4_13_3set);

        // 5 MECZ

        setResult(team3, team14,braz16Res5_3, braz16Res5_3_2set, braz16Res5_3_3set, braz16Res5_14, braz16Res5_14_2set, braz16Res5_14_3set);


        // 6 MECZ
        setResult(team11,  team6,braz16Res6_11, braz16Res6_11_2set, braz16Res6_11_3set, braz16Res6_6, braz16Res6_6_2set, braz16Res6_6_3set);

        //7 MECZ
        setResult(team7, team10,braz16Res7_7 , braz16Res7_7_2set, braz16Res7_7_3set, braz16Res7_10, braz16Res7_10_2set, braz16Res7_10_3set);


        //8 MECZ
        setResult(team15,  team2, braz16Res8_15,  braz16Res8_15_2set, braz16Res8_15_3set, braz16Res8_2, braz16Res8_2_2set, braz16Res8_2_3set);



        //9 MECZ
        setResult(win1, win2,braz16Res9_Win_1 , braz16Res9_Win_1_2set, braz16Res9_Win_1_3set, braz16Res9_Win_2, braz16Res9_Win_2_2set, braz16Res9_Win_2_3set);

        //10 MECZ
        setResult(win3, win4,braz16Res10_Win_3, braz16Res10_Win_3_2set, braz16Res10_Win_3_3set, braz16Res10_Win_4, braz16Res10_Win_4_2set, braz16Res10_Win_4_3set);

        //11 MECZ
        setResult(win5, win6,braz16Res11_Win_5, braz16Res11_Win_5_2set, braz16Res11_Win_5_3set, braz16Res11_Win_6, braz16Res11_Win_6_2set, braz16Res11_Win_6_3set);

        //12 MECZ
        setResult(win7, win8,braz16Res12_Win_7, braz16Res12_Win_7_2set, braz16Res12_Win_7_3set, braz16Res12_Win_8, braz16Res12_Win_8_2set, braz16Res12_Win_8_3set);


        //13 MECZ
        setResult(lost8, lost7,braz16Res13_Lost_8, braz16Res13_Lost_8_2set, braz16Res13_Lost_8_3set, braz16Res13_Lost_7, braz16Res13_Lost_7_2set, braz16Res13_Lost_7_3set);

        //14 MECZ
        setResult(lost6, lost5,braz16Res14_Lost_6, braz16Res14_Lost_6_2set, braz16Res14_Lost_6_3set, braz16Res14_Lost_5, braz16Res14_Lost_5_2set, braz16Res14_Lost_5_3set);

        //15 MECZ
        setResult(lost4, lost3,braz16Res15_Lost_4, braz16Res15_Lost_4_2set, braz16Res15_Lost_4_3set, braz16Res15_Lost_3, braz16Res15_Lost_3_2set, braz16Res15_Lost_3_3set);

        //16 MECZ
        setResult(lost2, lost1,braz16Res16_Lost_2, braz16Res16_Lost_2_2set, braz16Res16_Lost_2_3set, braz16Res16_Lost_1, braz16Res16_Lost_1_2set, braz16Res16_Lost_1_3set);

        //17 MECZ
        setResult(win13, lost10, braz16Res17_Win_13, braz16Res17_Win_13_2set, braz16Res17_Win_13_3set, braz16Res17_Lost_10, braz16Res17_Lost_10_2set, braz16Res17_Lost_10_3set);

        //18 MECZ
        setResult(win14, lost9,braz16Res18_Win_14, braz16Res18_Win_14_2set, braz16Res18_Win_14_3set, braz16Res18_Lost_9, braz16Res18_Lost_9_2set, braz16Res18_Lost_9_3set);

        //19 MECZ
        setResult(win15, lost12,braz16Res19_Win_15, braz16Res19_Win_15_2set, braz16Res19_Win_15_3set, braz16Res19_Lost_12, braz16Res19_Lost_12_2set, braz16Res19_Lost_12_3set);

        //20 MECZ
        setResult(win16, lost11,braz16Res20_Win_16, braz16Res20_Win_16_2set, braz16Res20_Win_16_3set, braz16Res20_Lost_11, braz16Res20_Lost_11_2set, braz16Res20_Lost_11_3set);


        //21 MECZ
        setResult(win9, win10,braz16Res21_Win_9, braz16Res21_Win_9_2set, braz16Res21_Win_9_3set, braz16Res21_Win_10, braz16Res21_Win_10_2set, braz16Res21_Win_10_3set);

        //22 MECZ
        setResult(win11, win12,braz16Res22_Win_11, braz16Res22_Win_11_2set, braz16Res22_Win_11_3set, braz16Res22_Win_12, braz16Res22_Win_12_2set, braz16Res22_Win_12_3set);


        //23 MECZ
        setResult(win17, win18,braz16Res23_Win_17, braz16Res23_Win_17_2set, braz16Res23_Win_17_3set, braz16Res23_Win_18, braz16Res23_Win_18_2set, braz16Res23_Win_18_3set);

        //24 MECZ
        setResult(win19, win20, braz16Res24_Win_19, braz16Res24_Win_19_2set, braz16Res24_Win_19_3set, braz16Res24_Win_20, braz16Res24_Win_20_2set, braz16Res24_Win_20_3set);

        //25 MECZ
        setResult(lost22, win23,braz16Res25_Lost_22, braz16Res25_Lost_22_2set, braz16Res25_Lost_22_3set, braz16Res25_Win_23, braz16Res25_Win_23_2set, braz16Res25_Win_23_3set);

        //26 MECZ
        setResult(lost21, win24,braz16Res26_Lost_21, braz16Res26_Lost_21_2set, braz16Res26_Lost_21_3set, braz16Res26_Win_24, braz16Res26_Win_24_2set, braz16Res26_Win_24_3set);


        //27 MECZ
        setResult(win21, win25, braz16Res27_Win_21, braz16Res27_Win_21_2set, braz16Res27_Win_21_3set, braz16Res27_Win_25, braz16Res27_Win_25_2set, braz16Res27_Win_25_3set);

        //28 MECZ
        setResult(win22, win26, braz16Res28_Win_22, braz16Res28_Win_22_2set, braz16Res28_Win_22_3set, braz16Res28_Win_26, braz16Res28_Win_26_2set, braz16Res28_Win_26_3set);


        //29 MECZ
        setResult(lost27, lost28,braz16Res29_Lost_27, braz16Res29_Lost_27_2set, braz16Res29_Lost_27_3set, braz16Res29_Lost_28, braz16Res29_Lost_28_2set, braz16Res29_Lost_28_3set);

        //30 MECZ FINAL
        setResult(win27, win28,braz16Res30_Win_27, braz16Res30_Win_27_2set, braz16Res30_Win_27_3set, braz16Res30_Win_28, braz16Res30_Win_28_2set, braz16Res30_Win_28_3set);


        return view;
    }

    //refresh fragment
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            assert getFragmentManager() != null;
            numberOfMatch=0;
            resultsOfMatches.clear();
            getFragmentManager().beginTransaction().detach(this).attach(this).commit();
        }
    }

    void setResult(Button team1, Button team2, EditText res1, EditText res1_2set,EditText res1_3set, EditText res2, EditText res2_2set, EditText res2_3set) {
        if (team1.getText() != "" && team2.getText() != "") {
            numberOfMatch++;
            if (!res1.getText().toString().equals("")) {
                Values value = new Values(numberOfMatch, team1.getText().toString(), team2.getText().toString(), res1.getText().toString(), res1_2set.getText().toString(), res1_3set.getText().toString(), res2.getText().toString(), res2_2set.getText().toString(), res2_3set.getText().toString());
                resultsOfMatches.put(numberOfMatch, value);

            }

        }


    }

    class CustomAdapter extends BaseAdapter {
        private Context context;

        CustomAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getCount() {
            return resultsOfMatches.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            final ViewHolder holder;


            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.brazylian_fragment2_item_list, null, true);

            holder.textViewWithNumber = convertView.findViewById(R.id.brazFrag2NumberOfMatch);
            holder.team1 = convertView.findViewById(R.id.brazFrag2teamName1);
            holder.team2 = convertView.findViewById(R.id.brazFrag2teamName2);
            holder.PointsFor1_1 = convertView.findViewById(R.id.brazFrag2PointsFor1_1);
            holder.PointsFor1_2 = convertView.findViewById(R.id.brazFrag2PointsFor1_2);
            holder.PointsFor2_1 = convertView.findViewById(R.id.brazFrag2PointsFor2_1);
            holder.PointsFor2_2 = convertView.findViewById(R.id.brazFrag2PointsFor2_2);
            holder.PointsFor1_3 = convertView.findViewById(R.id.brazFrag2PointsFor1_3);
            holder.PointsFor2_3 = convertView.findViewById(R.id.brazFrag2PointsFor2_3);
            //wyliczyć trzeba sety
            holder.Sets1 = convertView.findViewById(R.id.brazFrag2Sets1);
            holder.Sets2 = convertView.findViewById(R.id.brazFrag2Sets2);


            convertView.setTag(holder);


            Integer key = Integer.parseInt(resultsOfMatches.keySet().toArray()[position].toString());

            String numberOfMatch = resultsOfMatches.get(key).numberOfMatch.toString();
            holder.textViewWithNumber.setText(numberOfMatch);
            StringBuilder team1 = new StringBuilder(resultsOfMatches.get(key).team1);
            team1.setCharAt(team1.indexOf("\n"),'/');
            StringBuilder team2 = new StringBuilder(resultsOfMatches.get(key).team2);
            team2.setCharAt(team2.indexOf("\n"),'/');
            holder.team1.setText(team1.toString());
            holder.team2.setText(team2.toString());
            holder.PointsFor1_1.setText(resultsOfMatches.get(key).res1);
            holder.PointsFor1_2.setText(resultsOfMatches.get(key).res1_2set);
            holder.PointsFor2_1.setText(resultsOfMatches.get(key).res2);
            holder.PointsFor2_2.setText(resultsOfMatches.get(key).res2_2set);
            holder.PointsFor1_3.setText(resultsOfMatches.get(key).res1_3set);
            holder.PointsFor2_3.setText(resultsOfMatches.get(key).res2_3set);

            int setFor1=0;
            int setFor2=0;

            if(Integer.parseInt(resultsOfMatches.get(key).res1)>Integer.parseInt(resultsOfMatches.get(key).res2)){
                setFor1++;
            }
            if(Integer.parseInt(resultsOfMatches.get(key).res1)<Integer.parseInt(resultsOfMatches.get(key).res2)){
                setFor2++;
            }
            if(Integer.parseInt(resultsOfMatches.get(key).res1_2set)>Integer.parseInt(resultsOfMatches.get(key).res2_2set)){
                setFor1++;
            }
            if(Integer.parseInt(resultsOfMatches.get(key).res1_2set)<Integer.parseInt(resultsOfMatches.get(key).res2_2set)){
                setFor2++;
            }
            if(!resultsOfMatches.get(key).res1_3set.equals("")&&!resultsOfMatches.get(key).res2_3set.equals("")) {
                if (Integer.parseInt(resultsOfMatches.get(key).res1_3set) > Integer.parseInt(resultsOfMatches.get(key).res2_3set)) {
                    setFor1++;
                }
                if (Integer.parseInt(resultsOfMatches.get(key).res1_3set) < Integer.parseInt(resultsOfMatches.get(key).res2_3set)) {
                    setFor2++;
                }
            }

            holder.Sets1.setText(String.valueOf(setFor1));
            holder.Sets2.setText(String.valueOf(setFor2));


            return convertView;
        }

        private class ViewHolder {

            TextView textViewWithNumber;
            TextView team1;
            TextView team2;
            TextView Sets1;
            TextView Sets2;
            TextView PointsFor1_1;
            TextView PointsFor1_2;
            TextView PointsFor2_1;
            TextView PointsFor2_2;
            TextView PointsFor1_3;
            TextView PointsFor2_3;

        }

    }

    class Values {
        Integer numberOfMatch;
        String team1;
        String team2;
        String res1;
        String res1_2set;
        String res1_3set;
        String res2;
        String res2_2set;
        String res2_3set;


        Values(Integer numberOfMatch, String team1, String team2, String res1, String res1_2set,String res1_3set, String res2, String res2_2set, String res2_3set) {
            this.numberOfMatch = numberOfMatch;
            this.team1 = team1;
            this.team2 = team2;
            this.res1 = res1;
            this.res1_2set = res1_2set;
            this.res1_3set = res1_3set;
            this.res2 = res2;
            this.res2_2set = res2_2set;
            this.res2_3set = res2_3set;
        }

    }

}
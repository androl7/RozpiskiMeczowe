package com.example.adam.rozpiskimeczowe.cup.cup32;


import android.content.Intent;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adam.rozpiskimeczowe.Database;
import com.example.adam.rozpiskimeczowe.R;
import com.example.adam.rozpiskimeczowe.SetResultsForCup;
import com.example.adam.rozpiskimeczowe.brazylian.brazylian16.BRAZactiv16;
import com.otaliastudios.zoom.ZoomLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class FragmentTabCup32_1 extends Fragment {
    Map<Integer,ArrayList<EditText>> mapPointsInMatches;
    ArrayList<Button> listResultButtons;
    Map<Integer,ArrayList<String>> mapElimination;
    Toast toast;
    String pktInSet = "21";
    String pktInTieBreak = "15";
    String typeOfTour = "cup32";
    String nameOfTour;
    SetResultsForCup setResultsForCup;
    View view;
    int numberOfMatches = 0;
    int actualMatch = 0;
    RelativeLayout relativeLayout;
    TextView[]numbersOfMatchesArray;
    String R1;
    String R2;
    String R3;
    String R4;
    String R5;
    String R6;
    String R7;
    String R8;
    Button win17;
    Button win18;
    Button win19;
    Button win20;
    Button win21;
    Button win22;
    Button win23;
    Button win24;
    String onlyWatch;
    Database database;

    ZoomLayout zoomLayout;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment_tab_cup32_1, container, false);
        mapPointsInMatches = new HashMap<>();
        listResultButtons = new ArrayList<>();
        mapElimination = new HashMap<>();
        zoomLayout = view.findViewById(R.id.cup32_zoomLayout);
        relativeLayout = view.findViewById(R.id.cup32relLayout);

        String local = getActivity().getIntent().getStringExtra("local");

        setHasOptionsMenu(true);

        nameOfTour = getActivity().getIntent().getStringExtra("nameOfTour");
        //Add NumberOfMatches
        numbersOfMatchesArray = new TextView[24];
        for(int i=0; i<numbersOfMatchesArray.length; i++) {
            String buttonID = "cup32numberOfMatch" + (i+1) ;
            int resID = getResources().getIdentifier(buttonID, "id", getActivity().getPackageName());
            numbersOfMatchesArray[i] = view.findViewById(resID);
        }

        setResultsForCup = new SetResultsForCup(nameOfTour,listResultButtons,mapPointsInMatches,typeOfTour,getActivity(),container,pktInSet,pktInTieBreak,numberOfMatches,actualMatch,relativeLayout,numbersOfMatchesArray,view,"cup32",zoomLayout,local);




        final EditText res1_1 = view.findViewById(R.id.cup32Res1_1);
        final EditText res1_1_2set = view.findViewById(R.id.cup32Res1_1_2set);
        final EditText res1_1_3set = view.findViewById(R.id.cup32Res1_1_3set);
        final EditText res1_32 = view.findViewById(R.id.cup32Res1_32);
        final EditText res1_32_2set = view.findViewById(R.id.cup32Res1_32_2set);
        final EditText res1_32_3set = view.findViewById(R.id.cup32Res1_32_3set);

        res1_1.setVisibility(View.INVISIBLE);
        res1_1_2set.setVisibility(View.INVISIBLE);
        res1_1_3set.setVisibility(View.INVISIBLE);
        res1_32.setVisibility(View.INVISIBLE);
        res1_32_2set.setVisibility(View.INVISIBLE);
        res1_32_3set.setVisibility(View.INVISIBLE);


        final EditText res2_17 = view.findViewById(R.id.cup32Res2_17);
        final EditText res2_17_2set = view.findViewById(R.id.cup32Res2_17_2set);
        final EditText res2_17_3set = view.findViewById(R.id.cup32Res2_17_3set);
        final EditText res2_16 = view.findViewById(R.id.cup32Res2_16);
        final EditText res2_16_2set = view.findViewById(R.id.cup32Res2_16_2set);
        final EditText res2_16_3set = view.findViewById(R.id.cup32Res2_16_3set);

        res2_17.setVisibility(View.INVISIBLE);
        res2_17_2set.setVisibility(View.INVISIBLE);
        res2_17_3set.setVisibility(View.INVISIBLE);
        res2_16.setVisibility(View.INVISIBLE);
        res2_16_2set.setVisibility(View.INVISIBLE);
        res2_16_3set.setVisibility(View.INVISIBLE);

        final EditText res3_9 = view.findViewById(R.id.cup32Res3_9);
        final EditText res3_9_2set = view.findViewById(R.id.cup32Res3_9_2set);
        final EditText res3_9_3set = view.findViewById(R.id.cup32Res3_9_3set);
        final EditText res3_24 = view.findViewById(R.id.cup32Res3_24);
        final EditText res3_24_2set = view.findViewById(R.id.cup32Res3_24_2set);
        final EditText res3_24_3set = view.findViewById(R.id.cup32Res3_24_3set);

        res3_9.setVisibility(View.INVISIBLE);
        res3_9_2set.setVisibility(View.INVISIBLE);
        res3_9_3set.setVisibility(View.INVISIBLE);
        res3_24.setVisibility(View.INVISIBLE);
        res3_24_2set.setVisibility(View.INVISIBLE);
        res3_24_3set.setVisibility(View.INVISIBLE);

        final EditText res4_25 = view.findViewById(R.id.cup32Res4_25);
        final EditText res4_25_2set = view.findViewById(R.id.cup32Res4_25_2set);
        final EditText res4_25_3set = view.findViewById(R.id.cup32Res4_25_3set);
        final EditText res4_8 = view.findViewById(R.id.cup32Res4_8 );
        final EditText res4_8_2set = view.findViewById(R.id.cup32Res4_8_2set);
        final EditText res4_8_3set = view.findViewById(R.id.cup32Res4_8_3set);

        res4_25.setVisibility(View.INVISIBLE);
        res4_25_2set.setVisibility(View.INVISIBLE);
        res4_25_3set.setVisibility(View.INVISIBLE);
        res4_8.setVisibility(View.INVISIBLE);
        res4_8_2set.setVisibility(View.INVISIBLE);
        res4_8_3set.setVisibility(View.INVISIBLE);

        final EditText res5_5 = view.findViewById(R.id.cup32Res5_5);
        final EditText res5_5_2set = view.findViewById(R.id.cup32Res5_5_2set);
        final EditText res5_5_3set = view.findViewById(R.id.cup32Res5_5_3set);
        final EditText res5_28 = view.findViewById(R.id.cup32Res5_28);
        final EditText res5_28_2set = view.findViewById(R.id.cup32Res5_28_2set);
        final EditText res5_28_3set = view.findViewById(R.id.cup32Res5_28_3set);

        res5_5.setVisibility(View.INVISIBLE);
        res5_5_2set.setVisibility(View.INVISIBLE);
        res5_5_3set.setVisibility(View.INVISIBLE);
        res5_28.setVisibility(View.INVISIBLE);
        res5_28_2set.setVisibility(View.INVISIBLE);
        res5_28_3set.setVisibility(View.INVISIBLE);

        final EditText res6_21 = view.findViewById(R.id.cup32Res6_21);
        final EditText res6_21_2set = view.findViewById(R.id.cup32Res6_21_2set);
        final EditText res6_21_3set = view.findViewById(R.id.cup32Res6_21_3set);
        final EditText res6_12 = view.findViewById(R.id.cup32Res6_12);
        final EditText res6_12_2set = view.findViewById(R.id.cup32Res6_12_2set);
        final EditText res6_12_3set = view.findViewById(R.id.cup32Res6_12_3set);


        res6_21.setVisibility(View.INVISIBLE);
        res6_21_2set.setVisibility(View.INVISIBLE);
        res6_21_3set.setVisibility(View.INVISIBLE);
        res6_12.setVisibility(View.INVISIBLE);
        res6_12_2set.setVisibility(View.INVISIBLE);
        res6_12_3set.setVisibility(View.INVISIBLE);


        final EditText res7_13 = view.findViewById(R.id.cup32Res7_13);
        final EditText res7_13_2set = view.findViewById(R.id.cup32Res7_13_2set);
        final EditText res7_13_3set = view.findViewById(R.id.cup32Res7_13_3set);
        final EditText res7_20 = view.findViewById(R.id.cup32Res7_20);
        final EditText res7_20_2set = view.findViewById(R.id.cup32Res7_20_2set);
        final EditText res7_20_3set = view.findViewById(R.id.cup32Res7_20_3set);

        res7_13.setVisibility(View.INVISIBLE);
        res7_13_2set.setVisibility(View.INVISIBLE);
        res7_13_3set.setVisibility(View.INVISIBLE);
        res7_20.setVisibility(View.INVISIBLE);
        res7_20_2set.setVisibility(View.INVISIBLE);
        res7_20_3set.setVisibility(View.INVISIBLE);

        final EditText res8_29 = view.findViewById(R.id.cup32Res8_29);
        final EditText res8_29_2set = view.findViewById(R.id.cup32Res8_29_2set);
        final EditText res8_29_3set = view.findViewById(R.id.cup32Res8_29_3set);
        final EditText res8_4 = view.findViewById(R.id.cup32Res8_4);
        final EditText res8_4_2set = view.findViewById(R.id.cup32Res8_4_2set);
        final EditText res8_4_3set = view.findViewById(R.id.cup32Res8_4_3set);

        res8_29.setVisibility(View.INVISIBLE);
        res8_29_2set.setVisibility(View.INVISIBLE);
        res8_29_3set.setVisibility(View.INVISIBLE);
        res8_4.setVisibility(View.INVISIBLE);
        res8_4_2set.setVisibility(View.INVISIBLE);
        res8_4_3set.setVisibility(View.INVISIBLE);

        final EditText res9_3 = view.findViewById(R.id.cup32Res9_3);
        final EditText res9_3_2set = view.findViewById(R.id.cup32Res9_3_2set);
        final EditText res9_3_3set = view.findViewById(R.id.cup32Res9_3_3set);
        final EditText res9_30 = view.findViewById(R.id.cup32Res9_30);
        final EditText res9_30_2set = view.findViewById(R.id.cup32Res9_30_2set);
        final EditText res9_30_3set = view.findViewById(R.id.cup32Res9_30_3set);

        res9_3.setVisibility(View.INVISIBLE);
        res9_3_2set.setVisibility(View.INVISIBLE);
        res9_3_3set.setVisibility(View.INVISIBLE);
        res9_30.setVisibility(View.INVISIBLE);
        res9_30_2set.setVisibility(View.INVISIBLE);
        res9_30_3set.setVisibility(View.INVISIBLE);

        final EditText res10_19 = view.findViewById(R.id.cup32Res10_19);
        final EditText res10_19_2set = view.findViewById(R.id.cup32Res10_19_2set);
        final EditText res10_19_3set = view.findViewById(R.id.cup32Res10_19_3set);
        final EditText res10_14 = view.findViewById(R.id.cup32Res10_14);
        final EditText res10_14_2set = view.findViewById(R.id.cup32Res10_14_2set);
        final EditText res10_14_3set = view.findViewById(R.id.cup32Res10_14_3set);

        res10_19.setVisibility(View.INVISIBLE);
        res10_19_2set.setVisibility(View.INVISIBLE);
        res10_19_3set.setVisibility(View.INVISIBLE);
        res10_14.setVisibility(View.INVISIBLE);
        res10_14_2set.setVisibility(View.INVISIBLE);
        res10_14_3set.setVisibility(View.INVISIBLE);

        final EditText res11_11 = view.findViewById(R.id.cup32Res11_11);
        final EditText res11_11_2set = view.findViewById(R.id.cup32Res11_11_2set);
        final EditText res11_11_3set = view.findViewById(R.id.cup32Res11_11_3set);
        final EditText res11_22 = view.findViewById(R.id.cup32Res11_22);
        final EditText res11_22_2set = view.findViewById(R.id.cup32Res11_22_2set);
        final EditText res11_22_3set = view.findViewById(R.id.cup32Res11_22_3set);

        res11_11.setVisibility(View.INVISIBLE);
        res11_11_2set.setVisibility(View.INVISIBLE);
        res11_11_3set.setVisibility(View.INVISIBLE);
        res11_22.setVisibility(View.INVISIBLE);
        res11_22_2set.setVisibility(View.INVISIBLE);
        res11_22_3set.setVisibility(View.INVISIBLE);

        final EditText res12_27 = view.findViewById(R.id.cup32Res12_27);
        final EditText res12_27_2set = view.findViewById(R.id.cup32Res12_27_2set);
        final EditText res12_27_3set = view.findViewById(R.id.cup32Res12_27_3set);
        final EditText res12_6 = view.findViewById(R.id.cup32Res12_6);
        final EditText res12_6_2set = view.findViewById(R.id.cup32Res12_6_2set);
        final EditText res12_6_3set = view.findViewById(R.id.cup32Res12_6_3set);

        res12_27.setVisibility(View.INVISIBLE);
        res12_27_2set.setVisibility(View.INVISIBLE);
        res12_27_3set.setVisibility(View.INVISIBLE);
        res12_6.setVisibility(View.INVISIBLE);
        res12_6_2set.setVisibility(View.INVISIBLE);
        res12_6_3set.setVisibility(View.INVISIBLE);

        final EditText res13_7 = view.findViewById(R.id.cup32Res13_7);
        final EditText res13_7_2set = view.findViewById(R.id.cup32Res13_7_2set);
        final EditText res13_7_3set = view.findViewById(R.id.cup32Res13_7_3set);
        final EditText res13_26 = view.findViewById(R.id.cup32Res13_26);
        final EditText res13_26_2set = view.findViewById(R.id.cup32Res13_26_2set);
        final EditText res13_26_3set = view.findViewById(R.id.cup32Res13_26_3set);

        res13_7.setVisibility(View.INVISIBLE);
        res13_7_2set.setVisibility(View.INVISIBLE);
        res13_7_3set.setVisibility(View.INVISIBLE);
        res13_26.setVisibility(View.INVISIBLE);
        res13_26_2set.setVisibility(View.INVISIBLE);
        res13_26_3set.setVisibility(View.INVISIBLE);

        final EditText res14_23 = view.findViewById(R.id.cup32Res14_23);
        final EditText res14_23_2set = view.findViewById(R.id.cup32Res14_23_2set);
        final EditText res14_23_3set = view.findViewById(R.id.cup32Res14_23_3set);
        final EditText res14_10 = view.findViewById(R.id.cup32Res14_10);
        final EditText res14_10_2set = view.findViewById(R.id.cup32Res14_10_2set);
        final EditText res14_10_3set = view.findViewById(R.id.cup32Res14_10_3set);

        res14_23.setVisibility(View.INVISIBLE);
        res14_23_2set.setVisibility(View.INVISIBLE);
        res14_23_3set.setVisibility(View.INVISIBLE);
        res14_10.setVisibility(View.INVISIBLE);
        res14_10_2set.setVisibility(View.INVISIBLE);
        res14_10_3set.setVisibility(View.INVISIBLE);

        final EditText res15_15 = view.findViewById(R.id.cup32Res15_15);
        final EditText res15_15_2set = view.findViewById(R.id.cup32Res15_15_2set);
        final EditText res15_15_3set = view.findViewById(R.id.cup32Res15_15_3set);
        final EditText res15_18 = view.findViewById(R.id.cup32Res15_18);
        final EditText res15_18_2set = view.findViewById(R.id.cup32Res15_18_2set);
        final EditText res15_18_3set = view.findViewById(R.id.cup32Res15_18_3set);

        res15_15.setVisibility(View.INVISIBLE);
        res15_15_2set.setVisibility(View.INVISIBLE);
        res15_15_3set.setVisibility(View.INVISIBLE);
        res15_18.setVisibility(View.INVISIBLE);
        res15_18_2set.setVisibility(View.INVISIBLE);
        res15_18_3set.setVisibility(View.INVISIBLE);

        final EditText res16_31 = view.findViewById(R.id.cup32Res16_31);
        final EditText res16_31_2set = view.findViewById(R.id.cup32Res16_31_2set);
        final EditText res16_31_3set = view.findViewById(R.id.cup32Res16_31_3set);
        final EditText res16_2 = view.findViewById(R.id.cup32Res16_2);
        final EditText res16_2_2set = view.findViewById(R.id.cup32Res16_2_2set);
        final EditText res16_2_3set = view.findViewById(R.id.cup32Res16_2_3set);

        res16_31.setVisibility(View.INVISIBLE);
        res16_31_2set.setVisibility(View.INVISIBLE);
        res16_31_3set.setVisibility(View.INVISIBLE);
        res16_2.setVisibility(View.INVISIBLE);
        res16_2_2set.setVisibility(View.INVISIBLE);
        res16_2_3set.setVisibility(View.INVISIBLE);

        final EditText res17_Win_1 = view.findViewById(R.id.cup32Res17_Win_1);
        final EditText res17_Win_1_2set = view.findViewById(R.id.cup32Res17_Win_1_2set);
        final EditText res17_Win_1_3set = view.findViewById(R.id.cup32Res17_Win_1_3set);
        final EditText res17_Win_2 = view.findViewById(R.id.cup32Res17_Win_2);
        final EditText res17_Win_2_2set = view.findViewById(R.id.cup32Res17_Win_2_2set);
        final EditText res17_Win_2_3set = view.findViewById(R.id.cup32Res17_Win_2_3set);

        res17_Win_1.setVisibility(View.INVISIBLE);
        res17_Win_1_2set.setVisibility(View.INVISIBLE);
        res17_Win_1_3set.setVisibility(View.INVISIBLE);
        res17_Win_2.setVisibility(View.INVISIBLE);
        res17_Win_2_2set.setVisibility(View.INVISIBLE);
        res17_Win_2_3set.setVisibility(View.INVISIBLE);

        final EditText res18_Win_3 = view.findViewById(R.id.cup32Res18_Win_3);
        final EditText res18_Win_3_2set = view.findViewById(R.id.cup32Res18_Win_3_2set);
        final EditText res18_Win_3_3set = view.findViewById(R.id.cup32Res18_Win_3_3set);
        final EditText res18_Win_4 = view.findViewById(R.id.cup32Res18_Win_4);
        final EditText res18_Win_4_2set = view.findViewById(R.id.cup32Res18_Win_4_2set);
        final EditText res18_Win_4_3set = view.findViewById(R.id.cup32Res18_Win_4_3set);

        res18_Win_3.setVisibility(View.INVISIBLE);
        res18_Win_3_2set.setVisibility(View.INVISIBLE);
        res18_Win_3_3set.setVisibility(View.INVISIBLE);
        res18_Win_4.setVisibility(View.INVISIBLE);
        res18_Win_4_2set.setVisibility(View.INVISIBLE);
        res18_Win_4_3set.setVisibility(View.INVISIBLE);

        final EditText res19_Win_5 = view.findViewById(R.id.cup32Res19_Win_5);
        final EditText res19_Win_5_2set = view.findViewById(R.id.cup32Res19_Win_5_2set);
        final EditText res19_Win_5_3set = view.findViewById(R.id.cup32Res19_Win_5_3set);
        final EditText res19_Win_6 = view.findViewById(R.id.cup32Res19_Win_6);
        final EditText res19_Win_6_2set = view.findViewById(R.id.cup32Res19_Win_6_2set);
        final EditText res19_Win_6_3set = view.findViewById(R.id.cup32Res19_Win_6_3set);

        res19_Win_5.setVisibility(View.INVISIBLE);
        res19_Win_5_2set.setVisibility(View.INVISIBLE);
        res19_Win_5_3set.setVisibility(View.INVISIBLE);
        res19_Win_6.setVisibility(View.INVISIBLE);
        res19_Win_6_2set.setVisibility(View.INVISIBLE);
        res19_Win_6_3set.setVisibility(View.INVISIBLE);

        final EditText res20_Win_7 = view.findViewById(R.id.cup32Res20_Win_7);
        final EditText res20_Win_7_2set = view.findViewById(R.id.cup32Res20_Win_7_2set);
        final EditText res20_Win_7_3set = view.findViewById(R.id.cup32Res20_Win_7_3set);
        final EditText res20_Win_8 = view.findViewById(R.id.cup32Res20_Win_8);
        final EditText res20_Win_8_2set = view.findViewById(R.id.cup32Res20_Win_8_2set);
        final EditText res20_Win_8_3set = view.findViewById(R.id.cup32Res20_Win_8_3set);

        res20_Win_7.setVisibility(View.INVISIBLE);
        res20_Win_7_2set.setVisibility(View.INVISIBLE);
        res20_Win_7_3set.setVisibility(View.INVISIBLE);
        res20_Win_8.setVisibility(View.INVISIBLE);
        res20_Win_8_2set.setVisibility(View.INVISIBLE);
        res20_Win_8_3set.setVisibility(View.INVISIBLE);

        final EditText res21_Win_9 = view.findViewById(R.id.cup32Res21_Win_9);
        final EditText res21_Win_9_2set = view.findViewById(R.id.cup32Res21_Win_9_2set);
        final EditText res21_Win_9_3set = view.findViewById(R.id.cup32Res21_Win_9_3set);
        final EditText res21_Win_10 = view.findViewById(R.id.cup32Res21_Win_10);
        final EditText res21_Win_10_2set = view.findViewById(R.id.cup32Res21_Win_10_2set);
        final EditText res21_Win_10_3set = view.findViewById(R.id.cup32Res21_Win_10_3set);

        res21_Win_9.setVisibility(View.INVISIBLE);
        res21_Win_9_2set.setVisibility(View.INVISIBLE);
        res21_Win_9_3set.setVisibility(View.INVISIBLE);
        res21_Win_10.setVisibility(View.INVISIBLE);
        res21_Win_10_2set.setVisibility(View.INVISIBLE);
        res21_Win_10_3set.setVisibility(View.INVISIBLE);

        final EditText res22_Win_11 = view.findViewById(R.id.cup32Res22_Win_11);
        final EditText res22_Win_11_2set = view.findViewById(R.id.cup32Res22_Win_11_2set);
        final EditText res22_Win_11_3set = view.findViewById(R.id.cup32Res22_Win_11_3set);
        final EditText res22_Win_12 = view.findViewById(R.id.cup32Res22_Win_12);
        final EditText res22_Win_12_2set = view.findViewById(R.id.cup32Res22_Win_12_2set);
        final EditText res22_Win_12_3set = view.findViewById(R.id.cup32Res22_Win_12_3set);

        res22_Win_11.setVisibility(View.INVISIBLE);
        res22_Win_11_2set.setVisibility(View.INVISIBLE);
        res22_Win_11_3set.setVisibility(View.INVISIBLE);
        res22_Win_12.setVisibility(View.INVISIBLE);
        res22_Win_12_2set.setVisibility(View.INVISIBLE);
        res22_Win_12_3set.setVisibility(View.INVISIBLE);

        final EditText res23_Win_13 = view.findViewById(R.id.cup32Res23_Win_13);
        final EditText res23_Win_13_2set = view.findViewById(R.id.cup32Res23_Win_13_2set);
        final EditText res23_Win_13_3set = view.findViewById(R.id.cup32Res23_Win_13_3set);
        final EditText res23_Win_14 = view.findViewById(R.id.cup32Res23_Win_14);
        final EditText res23_Win_14_2set = view.findViewById(R.id.cup32Res23_Win_14_2set);
        final EditText res23_Win_14_3set = view.findViewById(R.id.cup32Res23_Win_14_3set);

        res23_Win_13.setVisibility(View.INVISIBLE);
        res23_Win_13_2set.setVisibility(View.INVISIBLE);
        res23_Win_13_3set.setVisibility(View.INVISIBLE);
        res23_Win_14.setVisibility(View.INVISIBLE);
        res23_Win_14_2set.setVisibility(View.INVISIBLE);
        res23_Win_14_3set.setVisibility(View.INVISIBLE);

        final EditText res24_Win_15 = view.findViewById(R.id.cup32Res24_Win_15);
        final EditText res24_Win_15_2set = view.findViewById(R.id.cup32Res24_Win_15_2set);
        final EditText res24_Win_15_3set = view.findViewById(R.id.cup32Res24_Win_15_3set);
        final EditText res24_Win_16 = view.findViewById(R.id.cup32Res24_Win_16);
        final EditText res24_Win_16_2set = view.findViewById(R.id.cup32Res24_Win_16_2set);
        final EditText res24_Win_16_3set = view.findViewById(R.id.cup32Res24_Win_16_3set);

        res24_Win_15.setVisibility(View.INVISIBLE);
        res24_Win_15_2set.setVisibility(View.INVISIBLE);
        res24_Win_15_3set.setVisibility(View.INVISIBLE);
        res24_Win_16.setVisibility(View.INVISIBLE);
        res24_Win_16_2set.setVisibility(View.INVISIBLE);
        res24_Win_16_3set.setVisibility(View.INVISIBLE);





        final Button team1 = view.findViewById(R.id.cup32Team01);
        final Button team2 = view.findViewById(R.id.cup32Team2);
        final Button team3 = view.findViewById(R.id.cup32Team3);
        final Button team4 = view.findViewById(R.id.cup32Team4);
        final Button team5 = view.findViewById(R.id.cup32Team5);
        final Button team6 = view.findViewById(R.id.cup32Team6);
        final Button team7 = view.findViewById(R.id.cup32Team7);
        final Button team8 = view.findViewById(R.id.cup32Team8);
        final Button team9 = view.findViewById(R.id.cup32Team9);
        final Button team10 = view.findViewById(R.id.cup32Team10);
        final Button team11 = view.findViewById(R.id.cup32Team11);
        final Button team12 = view.findViewById(R.id.cup32Team12);
        final Button team13 = view.findViewById(R.id.cup32Team13);
        final Button team14 = view.findViewById(R.id.cup32Team14);
        final Button team15 = view.findViewById(R.id.cup32Team15);
        final Button team16 = view.findViewById(R.id.cup32Team16);
        final Button team17 = view.findViewById(R.id.cup32Team17);
        final Button team18 = view.findViewById(R.id.cup32Team18);
        final Button team19 = view.findViewById(R.id.cup32Team19);
        final Button team20 = view.findViewById(R.id.cup32Team20);
        final Button team21 = view.findViewById(R.id.cup32Team21);
        final Button team22 = view.findViewById(R.id.cup32Team22);
        final Button team23 = view.findViewById(R.id.cup32Team23);
        final Button team24 = view.findViewById(R.id.cup32Team24);
        final Button team25 = view.findViewById(R.id.cup32Team25);
        final Button team26 = view.findViewById(R.id.cup32Team26);
        final Button team27 = view.findViewById(R.id.cup32Team27);
        final Button team28 = view.findViewById(R.id.cup32Team28);
        final Button team29 = view.findViewById(R.id.cup32Team29);
        final Button team30 = view.findViewById(R.id.cup32Team30);
        final Button team31 = view.findViewById(R.id.cup32Team31);
        final Button team32 = view.findViewById(R.id.cup32Team32);

        R1 = getActivity().getIntent().getStringExtra("NameOfTeam1");
        R2 = getActivity().getIntent().getStringExtra("NameOfTeam2");
        R3 = getActivity().getIntent().getStringExtra("NameOfTeam3");
        R4 = getActivity().getIntent().getStringExtra("NameOfTeam4");
        R5 = getActivity().getIntent().getStringExtra("NameOfTeam5");
        R6 = getActivity().getIntent().getStringExtra("NameOfTeam6");
        R7 = getActivity().getIntent().getStringExtra("NameOfTeam7");
        R8 = getActivity().getIntent().getStringExtra("NameOfTeam8");

        team1.setText(getActivity().getIntent().getStringExtra("NameOfTeam9"));
        team2.setText(getActivity().getIntent().getStringExtra("NameOfTeam10"));
        team3.setText(getActivity().getIntent().getStringExtra("NameOfTeam11"));
        team4.setText(getActivity().getIntent().getStringExtra("NameOfTeam12"));
        team5.setText(getActivity().getIntent().getStringExtra("NameOfTeam13"));
        team6.setText(getActivity().getIntent().getStringExtra("NameOfTeam14"));
        team7.setText(getActivity().getIntent().getStringExtra("NameOfTeam15"));
        team8.setText(getActivity().getIntent().getStringExtra("NameOfTeam16"));
        team9.setText(getActivity().getIntent().getStringExtra("NameOfTeam17"));
        team10.setText(getActivity().getIntent().getStringExtra("NameOfTeam18"));
        team11.setText(getActivity().getIntent().getStringExtra("NameOfTeam19"));
        team12.setText(getActivity().getIntent().getStringExtra("NameOfTeam20"));
        team13.setText(getActivity().getIntent().getStringExtra("NameOfTeam21"));
        team14.setText(getActivity().getIntent().getStringExtra("NameOfTeam22"));
        team15.setText(getActivity().getIntent().getStringExtra("NameOfTeam23"));
        team16.setText(getActivity().getIntent().getStringExtra("NameOfTeam24"));
        team17.setText(getActivity().getIntent().getStringExtra("NameOfTeam25"));
        team18.setText(getActivity().getIntent().getStringExtra("NameOfTeam26"));
        team19.setText(getActivity().getIntent().getStringExtra("NameOfTeam27"));
        team20.setText(getActivity().getIntent().getStringExtra("NameOfTeam28"));
        team21.setText(getActivity().getIntent().getStringExtra("NameOfTeam29"));
        team22.setText(getActivity().getIntent().getStringExtra("NameOfTeam30"));
        team23.setText(getActivity().getIntent().getStringExtra("NameOfTeam31"));
        team24.setText(getActivity().getIntent().getStringExtra("NameOfTeam32"));
        team25.setText(getActivity().getIntent().getStringExtra("NameOfTeam33"));
        team26.setText(getActivity().getIntent().getStringExtra("NameOfTeam34"));
        team27.setText(getActivity().getIntent().getStringExtra("NameOfTeam35"));
        team28.setText(getActivity().getIntent().getStringExtra("NameOfTeam36"));
        team29.setText(getActivity().getIntent().getStringExtra("NameOfTeam37"));
        team30.setText(getActivity().getIntent().getStringExtra("NameOfTeam38"));
        team31.setText(getActivity().getIntent().getStringExtra("NameOfTeam39"));
        team32.setText(getActivity().getIntent().getStringExtra("NameOfTeam40"));



        final Button win1 = view.findViewById(R.id.cup32WIN_1);
        final Button win2 = view.findViewById(R.id.cup32WIN_2);
        final Button win3 = view.findViewById(R.id.cup32WIN_3);
        final Button win4 = view.findViewById(R.id.cup32WIN_4);
        final Button win5 = view.findViewById(R.id.cup32WIN_5);
        final Button win6 = view.findViewById(R.id.cup32WIN_6);
        final Button win7 = view.findViewById(R.id.cup32WIN_7);
        final Button win8 = view.findViewById(R.id.cup32WIN_8);
        final Button win9 = view.findViewById(R.id.cup32WIN_9);
        final Button win10 = view.findViewById(R.id.cup32WIN_10);
        final Button win11 = view.findViewById(R.id.cup32WIN_11);
        final Button win12 = view.findViewById(R.id.cup32WIN_12);
        final Button win13 = view.findViewById(R.id.cup32WIN_13);
        final Button win14 = view.findViewById(R.id.cup32WIN_14);
        final Button win15 = view.findViewById(R.id.cup32WIN_15);
        final Button win16 = view.findViewById(R.id.cup32WIN_16);
        win17 = view.findViewById(R.id.cup32WIN_17);
        win18 = view.findViewById(R.id.cup32WIN_18);
        win19 = view.findViewById(R.id.cup32WIN_19);
        win20 = view.findViewById(R.id.cup32WIN_20);
        win21 = view.findViewById(R.id.cup32WIN_21);
        win22 = view.findViewById(R.id.cup32WIN_22);
        win23 = view.findViewById(R.id.cup32WIN_23);
        win24 = view.findViewById(R.id.cup32WIN_24);


        setResultsForCup.withCheckWithoutLosser("E1", "E32", team1, team32, win1, res1_1, res1_1_2set, res1_1_3set, res1_32, res1_32_2set, res1_32_3set);

        setResultsForCup.withCheckWithoutLosser("E17","E16",team17,team16,win2,res2_17,res2_17_2set,res2_17_3set,res2_16,res2_16_2set,res2_16_3set);

        setResultsForCup.withCheckWithoutLosser("E9","E24",team9,team24,win3,res3_9,res3_9_2set,res3_9_3set,res3_24,res3_24_2set,res3_24_3set);

        setResultsForCup.withCheckWithoutLosser("E25","E8",team25,team8,win4,res4_25,res4_25_2set,res4_25_3set,res4_8,res4_8_2set,res4_8_3set);

        setResultsForCup.withCheckWithoutLosser("E5","E28",team5,team28,win5,res5_5,res5_5_2set,res5_5_3set,res5_28,res5_28_2set,res5_28_3set);

        setResultsForCup.withCheckWithoutLosser("E21","E12",team21,team12,win6,res6_21,res6_21_2set,res6_21_3set,res6_12,res6_12_2set,res6_12_3set);

        setResultsForCup.withCheckWithoutLosser("E13","E20",team13,team20,win7,res7_13,res7_13_2set,res7_13_3set,res7_20,res7_20_2set,res7_20_3set);

        setResultsForCup.withCheckWithoutLosser("E29","E4",team29,team4,win8,res8_29,res8_29_2set,res8_29_3set,res8_4,res8_4_2set,res8_4_3set);

        setResultsForCup.withCheckWithoutLosser("E3","E30",team3,team30,win9,res9_3,res9_3_2set,res9_3_3set,res9_30,res9_30_2set,res9_30_3set);

        setResultsForCup.withCheckWithoutLosser("E19","E14",team19,team14,win10,res10_19,res10_19_2set,res10_19_3set,res10_14,res10_14_2set,res10_14_3set);

        setResultsForCup.withCheckWithoutLosser("E11","E22",team11,team22,win11,res11_11,res11_11_2set,res11_11_3set,res11_22,res11_22_2set,res11_22_3set);

        setResultsForCup.withCheckWithoutLosser("E27","E6",team27,team6,win12,res12_27,res12_27_2set,res12_27_3set,res12_6,res12_6_2set,res12_6_3set);

        setResultsForCup.withCheckWithoutLosser("E7","E26",team7,team26,win13,res13_7,res13_7_2set,res13_7_3set,res13_26,res13_26_2set,res13_26_3set);

        setResultsForCup.withCheckWithoutLosser("E23","E10",team23,team10,win14,res14_23,res14_23_2set,res14_23_3set,res14_10,res14_10_2set,res14_10_3set);

        setResultsForCup.withCheckWithoutLosser("E15","E18",team15,team18,win15,res15_15,res15_15_2set,res15_15_3set,res15_18,res15_18_2set,res15_18_3set);

        setResultsForCup.withCheckWithoutLosser("E31","E2",team31,team2,win16,res16_31,res16_31_2set,res16_31_3set,res16_2,res16_2_2set,res16_2_3set);


        setResultsForCup.withoutLosserAndCheck(win1,win2,win17,res17_Win_1,res17_Win_1_2set,res17_Win_1_3set,res17_Win_2,res17_Win_2_2set,res17_Win_2_3set);

        setResultsForCup.withoutLosserAndCheck(win3,win4,win18,res18_Win_3,res18_Win_3_2set,res18_Win_3_3set,res18_Win_4,res18_Win_4_2set,res18_Win_4_3set);

        setResultsForCup.withoutLosserAndCheck(win5,win6,win19,res19_Win_5,res19_Win_5_2set,res19_Win_5_3set,res19_Win_6,res19_Win_6_2set,res19_Win_6_3set);

        setResultsForCup.withoutLosserAndCheck(win7,win8,win20,res20_Win_7,res20_Win_7_2set,res20_Win_7_3set,res20_Win_8,res20_Win_8_2set,res20_Win_8_3set);

        setResultsForCup.withoutLosserAndCheck(win9,win10,win21,res21_Win_9,res21_Win_9_2set,res21_Win_9_3set,res21_Win_10,res21_Win_10_2set,res21_Win_10_3set);

        setResultsForCup.withoutLosserAndCheck(win11,win12,win22,res22_Win_11,res22_Win_11_2set,res22_Win_11_3set,res22_Win_12,res22_Win_12_2set,res22_Win_12_3set);

        setResultsForCup.withoutLosserAndCheck(win13,win14,win23,res23_Win_13,res23_Win_13_2set,res23_Win_13_3set,res23_Win_14,res23_Win_14_2set,res23_Win_14_3set);

        setResultsForCup.withoutLosserAndCheck(win15,win16,win24,res24_Win_15,res24_Win_15_2set,res24_Win_15_3set,res24_Win_16,res24_Win_16_2set,res24_Win_16_3set);


        database = new Database(mapElimination,mapPointsInMatches,listResultButtons);
        database.getResultFromDatabaseWithUpdate(nameOfTour,typeOfTour);

        toast = Toast.makeText(getActivity().getApplicationContext(), "Wprowadz wczesniejszy wynik !", Toast.LENGTH_SHORT);

        onlyWatch = getActivity().getIntent().getStringExtra("OnlyWatch");
        if(onlyWatch!=null){
            final int childCount = relativeLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                relativeLayout.getChildAt(i).setEnabled(false);

            }
        }

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.action_bar_with_main_button, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menuMainButton:
                Intent braz16 = new Intent(getActivity(),BRAZactiv16.class);

                braz16.putExtra("nameOfTour",nameOfTour);
                braz16.putExtra("NameOfTeam1",R1);
                braz16.putExtra("NameOfTeam2",R2);
                braz16.putExtra("NameOfTeam3",R3);
                braz16.putExtra("NameOfTeam4",R4);
                braz16.putExtra("NameOfTeam5",R5);
                braz16.putExtra("NameOfTeam6",R6);
                braz16.putExtra("NameOfTeam7",R7);
                braz16.putExtra("NameOfTeam8",R8);
                braz16.putExtra("NameOfTeam9",win17.getText().toString());
                braz16.putExtra("NameOfTeam10",win18.getText().toString());
                braz16.putExtra("NameOfTeam11",win19.getText().toString());
                braz16.putExtra("NameOfTeam12",win20.getText().toString());
                braz16.putExtra("NameOfTeam13",win21.getText().toString());
                braz16.putExtra("NameOfTeam14",win22.getText().toString());
                braz16.putExtra("NameOfTeam15",win23.getText().toString());
                braz16.putExtra("NameOfTeam16",win24.getText().toString());
                braz16.putExtra("OnlyWatch",onlyWatch);
                startActivity(braz16);
        }
        return super.onOptionsItemSelected(item);
    }

}




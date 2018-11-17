package com.example.adam.rozpiskimeczowe.brazylian.brazylian16;

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
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.adam.rozpiskimeczowe.Database;
import com.example.adam.rozpiskimeczowe.R;
import com.example.adam.rozpiskimeczowe.SetResultsForBraz;
import com.otaliastudios.zoom.ZoomLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FragmentTabBraz16_1 extends Fragment {
    Map<Integer,ArrayList<EditText>> mapPointsInMatches;
    Map<Integer,ArrayList<String>> mapElimination;
    ArrayList<Button> listResultButtons;
    Toast toast;
    String pktInSet = "21";
    String pktInTieBreak = "15";
    String typeOfTour = "braz16";
    View view;
    SetResultsForBraz setResultsForBraz;
    ZoomLayout zoomLayout;
    String nameOfTour;
    Database database;
    String onlyWatch;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment_tab_braz16_1, container, false);

        nameOfTour = getActivity().getIntent().getStringExtra("nameOfTour");
        mapPointsInMatches = new HashMap<>();
        listResultButtons = new ArrayList<>();
        mapElimination = new HashMap<>();


        zoomLayout = view.findViewById(R.id.braz16_zoomLayout);
        setResultsForBraz = new SetResultsForBraz(nameOfTour,listResultButtons,mapPointsInMatches,typeOfTour,getActivity(),container,pktInSet,pktInTieBreak,zoomLayout);


        final EditText Res1_1 = view.findViewById(R.id.braz16Res1_1);
        final EditText Res1_1_2set = view.findViewById(R.id.braz16Res1_1_2set);
        final EditText Res1_1_3set = view.findViewById(R.id.braz16Res1_1_3set);
        final EditText Res1_16 = view.findViewById(R.id.braz16Res1_16);
        final EditText Res1_16_2set = view.findViewById(R.id.braz16Res1_16_2set);
        final EditText Res1_16_3set = view.findViewById(R.id.braz16Res1_16_3set);

        Res1_1.setVisibility(View.INVISIBLE);
        Res1_1_2set.setVisibility(View.INVISIBLE);
        Res1_1_3set.setVisibility(View.INVISIBLE);
        Res1_16.setVisibility(View.INVISIBLE);
        Res1_16_2set.setVisibility(View.INVISIBLE);
        Res1_16_3set.setVisibility(View.INVISIBLE);


        final EditText Res2_9 = view.findViewById(R.id.braz16Res2_9);
        final EditText Res2_9_2set = view.findViewById(R.id.braz16Res2_9_2set);
        final EditText Res2_9_3set = view.findViewById(R.id.braz16Res2_9_3set);
        final EditText Res2_8 = view.findViewById(R.id.braz16Res2_8);
        final EditText Res2_8_2set = view.findViewById(R.id.braz16Res2_8_2set);
        final EditText Res2_8_3set = view.findViewById(R.id.braz16Res2_8_3set);

        Res2_9.setVisibility(View.INVISIBLE);
        Res2_9_2set.setVisibility(View.INVISIBLE);
        Res2_9_3set.setVisibility(View.INVISIBLE);
        Res2_8.setVisibility(View.INVISIBLE);
        Res2_8_2set.setVisibility(View.INVISIBLE);
        Res2_8_3set.setVisibility(View.INVISIBLE);

        final EditText Res3_5 = view.findViewById(R.id.braz16Res3_5);
        final EditText Res3_5_2set = view.findViewById(R.id.braz16Res3_5_2set);
        final EditText Res3_5_3set = view.findViewById(R.id.braz16Res3_5_3set);
        final EditText Res3_12 = view.findViewById(R.id.braz16Res3_12);
        final EditText Res3_12_2set = view.findViewById(R.id.braz16Res3_12_2set);
        final EditText Res3_12_3set = view.findViewById(R.id.braz16Res3_12_3set);

        Res3_5.setVisibility(View.INVISIBLE);
        Res3_5_2set.setVisibility(View.INVISIBLE);
        Res3_5_3set.setVisibility(View.INVISIBLE);
        Res3_12.setVisibility(View.INVISIBLE);
        Res3_12_2set.setVisibility(View.INVISIBLE);
        Res3_12_3set.setVisibility(View.INVISIBLE);

        final EditText Res4_13 = view.findViewById(R.id.braz16Res4_13);
        final EditText Res4_13_2set = view.findViewById(R.id.braz16Res4_13_2set);
        final EditText Res4_13_3set = view.findViewById(R.id.braz16Res4_13_3set);
        final EditText Res4_4 = view.findViewById(R.id.braz16Res4_4);
        final EditText Res4_4_2set = view.findViewById(R.id.braz16Res4_4_2set);
        final EditText Res4_4_3set = view.findViewById(R.id.braz16Res4_4_3set);

        Res4_13.setVisibility(View.INVISIBLE);
        Res4_13_2set.setVisibility(View.INVISIBLE);
        Res4_13_3set.setVisibility(View.INVISIBLE);
        Res4_4.setVisibility(View.INVISIBLE);
        Res4_4_2set.setVisibility(View.INVISIBLE);
        Res4_4_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res5_3 = view.findViewById(R.id.braz16Res5_3);
        final EditText braz16Res5_3_2set = view.findViewById(R.id.braz16Res5_3_2set);
        final EditText braz16Res5_3_3set = view.findViewById(R.id.braz16Res5_3_3set);
        final EditText braz16Res5_14 = view.findViewById(R.id.braz16Res5_14);
        final EditText braz16Res5_14_2set = view.findViewById(R.id.braz16Res5_14_2set);
        final EditText braz16Res5_14_3set = view.findViewById(R.id.braz16Res5_14_3set);

        braz16Res5_3.setVisibility(View.INVISIBLE);
        braz16Res5_3_2set.setVisibility(View.INVISIBLE);
        braz16Res5_3_3set.setVisibility(View.INVISIBLE);
        braz16Res5_14.setVisibility(View.INVISIBLE);
        braz16Res5_14_2set.setVisibility(View.INVISIBLE);
        braz16Res5_14_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res6_11 = view.findViewById(R.id.braz16Res6_11);
        final EditText braz16Res6_11_2set = view.findViewById(R.id.braz16Res6_11_2set);
        final EditText braz16Res6_11_3set = view.findViewById(R.id.braz16Res6_11_3set);
        final EditText braz16Res6_6 = view.findViewById(R.id.braz16Res6_6);
        final EditText braz16Res6_6_2set = view.findViewById(R.id.braz16Res6_6_2set);
        final EditText braz16Res6_6_3set = view.findViewById(R.id.braz16Res6_6_3set);

        braz16Res6_11.setVisibility(View.INVISIBLE);
        braz16Res6_11_2set.setVisibility(View.INVISIBLE);
        braz16Res6_11_3set.setVisibility(View.INVISIBLE);
        braz16Res6_6.setVisibility(View.INVISIBLE);
        braz16Res6_6_2set.setVisibility(View.INVISIBLE);
        braz16Res6_6_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res7_7 = view.findViewById(R.id.braz16Res7_7);
        final EditText braz16Res7_7_2set = view.findViewById(R.id.braz16Res7_7_2set);
        final EditText braz16Res7_7_3set = view.findViewById(R.id.braz16Res7_7_3set);
        final EditText braz16Res7_10 = view.findViewById(R.id.braz16Res7_10);
        final EditText braz16Res7_10_2set = view.findViewById(R.id.braz16Res7_10_2set);
        final EditText braz16Res7_10_3set = view.findViewById(R.id.braz16Res7_10_3set);

        braz16Res7_7.setVisibility(View.INVISIBLE);
        braz16Res7_7_2set.setVisibility(View.INVISIBLE);
        braz16Res7_7_3set.setVisibility(View.INVISIBLE);
        braz16Res7_10.setVisibility(View.INVISIBLE);
        braz16Res7_10_2set.setVisibility(View.INVISIBLE);
        braz16Res7_10_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res8_15 = view.findViewById(R.id.braz16Res8_15);
        final EditText braz16Res8_15_2set = view.findViewById(R.id.braz16Res8_15_2set);
        final EditText braz16Res8_15_3set = view.findViewById(R.id.braz16Res8_15_3set);
        final EditText braz16Res8_2 = view.findViewById(R.id.braz16Res8_2);
        final EditText braz16Res8_2_2set = view.findViewById(R.id.braz16Res8_2_2set);
        final EditText braz16Res8_2_3set = view.findViewById(R.id.braz16Res8_2_3set);

        braz16Res8_15.setVisibility(View.INVISIBLE);
        braz16Res8_15_2set.setVisibility(View.INVISIBLE);
        braz16Res8_15_3set.setVisibility(View.INVISIBLE);
        braz16Res8_2.setVisibility(View.INVISIBLE);
        braz16Res8_2_2set.setVisibility(View.INVISIBLE);
        braz16Res8_2_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res9_Win_1 = view.findViewById(R.id.braz16Res9_Win_1);
        final EditText braz16Res9_Win_1_2set = view.findViewById(R.id.braz16Res9_Win_1_2set);
        final EditText braz16Res9_Win_1_3set = view.findViewById(R.id.braz16Res9_Win_1_3set);
        final EditText braz16Res9_Win_2 = view.findViewById(R.id.braz16Res9_Win_2);
        final EditText braz16Res9_Win_2_2set = view.findViewById(R.id.braz16Res9_Win_2_2set);
        final EditText braz16Res9_Win_2_3set = view.findViewById(R.id.braz16Res9_Win_2_3set);

        braz16Res9_Win_1.setVisibility(View.INVISIBLE);
        braz16Res9_Win_1_2set.setVisibility(View.INVISIBLE);
        braz16Res9_Win_1_3set.setVisibility(View.INVISIBLE);
        braz16Res9_Win_2.setVisibility(View.INVISIBLE);
        braz16Res9_Win_2_2set.setVisibility(View.INVISIBLE);
        braz16Res9_Win_2_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res10_Win_3 = view.findViewById(R.id.braz16Res10_Win_3);
        final EditText braz16Res10_Win_3_2set = view.findViewById(R.id.braz16Res10_Win_3_2set);
        final EditText braz16Res10_Win_3_3set = view.findViewById(R.id.braz16Res10_Win_3_3set);
        final EditText braz16Res10_Win_4 = view.findViewById(R.id.braz16Res10_Win_4);
        final EditText braz16Res10_Win_4_2set = view.findViewById(R.id.braz16Res10_Win_4_2set);
        final EditText braz16Res10_Win_4_3set = view.findViewById(R.id.braz16Res10_Win_4_3set);

        braz16Res10_Win_3.setVisibility(View.INVISIBLE);
        braz16Res10_Win_3_2set.setVisibility(View.INVISIBLE);
        braz16Res10_Win_3_3set.setVisibility(View.INVISIBLE);
        braz16Res10_Win_4.setVisibility(View.INVISIBLE);
        braz16Res10_Win_4_2set.setVisibility(View.INVISIBLE);
        braz16Res10_Win_4_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res11_Win_5 = view.findViewById(R.id.braz16Res11_Win_5);
        final EditText braz16Res11_Win_5_2set = view.findViewById(R.id.braz16Res11_Win_5_2set);
        final EditText braz16Res11_Win_5_3set = view.findViewById(R.id.braz16Res11_Win_5_3set);
        final EditText braz16Res11_Win_6 = view.findViewById(R.id.braz16Res11_Win_6);
        final EditText braz16Res11_Win_6_2set = view.findViewById(R.id.braz16Res11_Win_6_2set);
        final EditText braz16Res11_Win_6_3set = view.findViewById(R.id.braz16Res11_Win_6_3set);

        braz16Res11_Win_5.setVisibility(View.INVISIBLE);
        braz16Res11_Win_5_2set.setVisibility(View.INVISIBLE);
        braz16Res11_Win_5_3set.setVisibility(View.INVISIBLE);
        braz16Res11_Win_6.setVisibility(View.INVISIBLE);
        braz16Res11_Win_6_2set.setVisibility(View.INVISIBLE);
        braz16Res11_Win_6_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res12_Win_7 = view.findViewById(R.id.braz16Res12_Win_7);
        final EditText braz16Res12_Win_7_2set = view.findViewById(R.id.braz16Res12_Win_7_2set);
        final EditText braz16Res12_Win_7_3set = view.findViewById(R.id.braz16Res12_Win_7_3set);
        final EditText braz16Res12_Win_8 = view.findViewById(R.id.braz16Res12_Win_8);
        final EditText braz16Res12_Win_8_2set = view.findViewById(R.id.braz16Res12_Win_8_2set);
        final EditText braz16Res12_Win_8_3set = view.findViewById(R.id.braz16Res12_Win_8_3set);

        braz16Res12_Win_7.setVisibility(View.INVISIBLE);
        braz16Res12_Win_7_2set.setVisibility(View.INVISIBLE);
        braz16Res12_Win_7_3set.setVisibility(View.INVISIBLE);
        braz16Res12_Win_8.setVisibility(View.INVISIBLE);
        braz16Res12_Win_8_2set.setVisibility(View.INVISIBLE);
        braz16Res12_Win_8_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res13_Lost_8 = view.findViewById(R.id.braz16Res13_Lost_8);
        final EditText braz16Res13_Lost_8_2set = view.findViewById(R.id.braz16Res13_Lost_8_2set);
        final EditText braz16Res13_Lost_8_3set = view.findViewById(R.id.braz16Res13_Lost_8_3set);
        final EditText braz16Res13_Lost_7 = view.findViewById(R.id.braz16Res13_Lost_7);
        final EditText braz16Res13_Lost_7_2set = view.findViewById(R.id.braz16Res13_Lost_7_2set);
        final EditText braz16Res13_Lost_7_3set = view.findViewById(R.id.braz16Res13_Lost_7_3set);

        braz16Res13_Lost_8.setVisibility(View.INVISIBLE);
        braz16Res13_Lost_8_2set.setVisibility(View.INVISIBLE);
        braz16Res13_Lost_8_3set.setVisibility(View.INVISIBLE);
        braz16Res13_Lost_7.setVisibility(View.INVISIBLE);
        braz16Res13_Lost_7_2set.setVisibility(View.INVISIBLE);
        braz16Res13_Lost_7_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res14_Lost_6 = view.findViewById(R.id.braz16Res14_Lost_6);
        final EditText braz16Res14_Lost_6_2set = view.findViewById(R.id.braz16Res14_Lost_6_2set);
        final EditText braz16Res14_Lost_6_3set = view.findViewById(R.id.braz16Res14_Lost_6_3set);
        final EditText braz16Res14_Lost_5 = view.findViewById(R.id.braz16Res14_Lost_5);
        final EditText braz16Res14_Lost_5_2set = view.findViewById(R.id.braz16Res14_Lost_5_2set);
        final EditText braz16Res14_Lost_5_3set = view.findViewById(R.id.braz16Res14_Lost_5_3set);

        braz16Res14_Lost_6.setVisibility(View.INVISIBLE);
        braz16Res14_Lost_6_2set.setVisibility(View.INVISIBLE);
        braz16Res14_Lost_6_3set.setVisibility(View.INVISIBLE);
        braz16Res14_Lost_5.setVisibility(View.INVISIBLE);
        braz16Res14_Lost_5_2set.setVisibility(View.INVISIBLE);
        braz16Res14_Lost_5_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res15_Lost_4 = view.findViewById(R.id.braz16Res15_Lost_4);
        final EditText braz16Res15_Lost_4_2set = view.findViewById(R.id.braz16Res15_Lost_4_2set);
        final EditText braz16Res15_Lost_4_3set = view.findViewById(R.id.braz16Res15_Lost_4_3set);
        final EditText braz16Res15_Lost_3 = view.findViewById(R.id.braz16Res15_Lost_3);
        final EditText braz16Res15_Lost_3_2set = view.findViewById(R.id.braz16Res15_Lost_3_2set);
        final EditText braz16Res15_Lost_3_3set = view.findViewById(R.id.braz16Res15_Lost_3_3set);

        braz16Res15_Lost_4.setVisibility(View.INVISIBLE);
        braz16Res15_Lost_4_2set.setVisibility(View.INVISIBLE);
        braz16Res15_Lost_4_3set.setVisibility(View.INVISIBLE);
        braz16Res15_Lost_3.setVisibility(View.INVISIBLE);
        braz16Res15_Lost_3_2set.setVisibility(View.INVISIBLE);
        braz16Res15_Lost_3_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res16_Lost_2 = view.findViewById(R.id.braz16Res16_Lost_2);
        final EditText braz16Res16_Lost_2_2set = view.findViewById(R.id.braz16Res16_Lost_2_2set);
        final EditText braz16Res16_Lost_2_3set = view.findViewById(R.id.braz16Res16_Lost_2_3set);
        final EditText braz16Res16_Lost_1 = view.findViewById(R.id.braz16Res16_Lost_1);
        final EditText braz16Res16_Lost_1_2set = view.findViewById(R.id.braz16Res16_Lost_1_2set);
        final EditText braz16Res16_Lost_1_3set = view.findViewById(R.id.braz16Res16_Lost_1_3set);

        braz16Res16_Lost_2.setVisibility(View.INVISIBLE);
        braz16Res16_Lost_2_2set.setVisibility(View.INVISIBLE);
        braz16Res16_Lost_2_3set.setVisibility(View.INVISIBLE);
        braz16Res16_Lost_1.setVisibility(View.INVISIBLE);
        braz16Res16_Lost_1_2set.setVisibility(View.INVISIBLE);
        braz16Res16_Lost_1_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res17_Win_13 = view.findViewById(R.id.braz16Res17_Win_13);
        final EditText braz16Res17_Win_13_2set = view.findViewById(R.id.braz16Res17_Win_13_2set);
        final EditText braz16Res17_Win_13_3set = view.findViewById(R.id.braz16Res17_Win_13_3set);
        final EditText braz16Res17_Lost_10 = view.findViewById(R.id.braz16Res17_Lost_10);
        final EditText braz16Res17_Lost_10_2set = view.findViewById(R.id.braz16Res17_Lost_10_2set);
        final EditText braz16Res17_Lost_10_3set = view.findViewById(R.id.braz16Res17_Lost_10_3set);

        braz16Res17_Win_13.setVisibility(View.INVISIBLE);
        braz16Res17_Win_13_2set.setVisibility(View.INVISIBLE);
        braz16Res17_Win_13_3set.setVisibility(View.INVISIBLE);
        braz16Res17_Lost_10.setVisibility(View.INVISIBLE);
        braz16Res17_Lost_10_2set.setVisibility(View.INVISIBLE);
        braz16Res17_Lost_10_3set.setVisibility(View.INVISIBLE);



        final EditText braz16Res18_Win_14 = view.findViewById(R.id.braz16Res18_Win_14);
        final EditText braz16Res18_Win_14_2set = view.findViewById(R.id.braz16Res18_Win_14_2set);
        final EditText braz16Res18_Win_14_3set = view.findViewById(R.id.braz16Res18_Win_14_3set);
        final EditText braz16Res18_Lost_9 = view.findViewById(R.id.braz16Res18_Lost_9);
        final EditText braz16Res18_Lost_9_2set = view.findViewById(R.id.braz16Res18_Lost_9_2set);
        final EditText braz16Res18_Lost_9_3set = view.findViewById(R.id.braz16Res18_Lost_9_3set);

        braz16Res18_Win_14.setVisibility(View.INVISIBLE);
        braz16Res18_Win_14_2set.setVisibility(View.INVISIBLE);
        braz16Res18_Win_14_3set.setVisibility(View.INVISIBLE);
        braz16Res18_Lost_9.setVisibility(View.INVISIBLE);
        braz16Res18_Lost_9_2set.setVisibility(View.INVISIBLE);
        braz16Res18_Lost_9_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res19_Win_15 = view.findViewById(R.id.braz16Res19_Win_15);
        final EditText braz16Res19_Win_15_2set = view.findViewById(R.id.braz16Res19_Win_15_2set);
        final EditText braz16Res19_Win_15_3set = view.findViewById(R.id.braz16Res19_Win_15_3set);
        final EditText braz16Res19_Lost_12 = view.findViewById(R.id.braz16Res19_Lost_12);
        final EditText braz16Res19_Lost_12_2set = view.findViewById(R.id.braz16Res19_Lost_12_2set);
        final EditText braz16Res19_Lost_12_3set = view.findViewById(R.id.braz16Res19_Lost_12_3set);

        braz16Res19_Win_15.setVisibility(View.INVISIBLE);
        braz16Res19_Win_15_2set.setVisibility(View.INVISIBLE);
        braz16Res19_Win_15_3set.setVisibility(View.INVISIBLE);
        braz16Res19_Lost_12.setVisibility(View.INVISIBLE);
        braz16Res19_Lost_12_2set.setVisibility(View.INVISIBLE);
        braz16Res19_Lost_12_3set.setVisibility(View.INVISIBLE);


        final EditText braz16Res20_Win_16 = view.findViewById(R.id.braz16Res20_Win_16);
        final EditText braz16Res20_Win_16_2set = view.findViewById(R.id.braz16Res20_Win_16_2set);
        final EditText braz16Res20_Win_16_3set = view.findViewById(R.id.braz16Res20_Win_16_3set);
        final EditText braz16Res20_Lost_11 = view.findViewById(R.id.braz16Res20_Lost_11);
        final EditText braz16Res20_Lost_11_2set = view.findViewById(R.id.braz16Res20_Lost_11_2set);
        final EditText braz16Res20_Lost_11_3set = view.findViewById(R.id.braz16Res20_Lost_11_3set);

        braz16Res20_Win_16.setVisibility(View.INVISIBLE);
        braz16Res20_Win_16_2set.setVisibility(View.INVISIBLE);
        braz16Res20_Win_16_3set.setVisibility(View.INVISIBLE);
        braz16Res20_Lost_11.setVisibility(View.INVISIBLE);
        braz16Res20_Lost_11_2set.setVisibility(View.INVISIBLE);
        braz16Res20_Lost_11_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res21_Win_9 = view.findViewById(R.id.braz16Res21_Win_9);
        final EditText braz16Res21_Win_9_2set = view.findViewById(R.id.braz16Res21_Win_9_2set);
        final EditText braz16Res21_Win_9_3set = view.findViewById(R.id.braz16Res21_Win_9_3set);
        final EditText braz16Res21_Win_10 = view.findViewById(R.id.braz16Res21_Win_10);
        final EditText braz16Res21_Win_10_2set = view.findViewById(R.id.braz16Res21_Win_10_2set);
        final EditText braz16Res21_Win_10_3set = view.findViewById(R.id.braz16Res21_Win_10_3set);

        braz16Res21_Win_9.setVisibility(View.INVISIBLE);
        braz16Res21_Win_9_2set.setVisibility(View.INVISIBLE);
        braz16Res21_Win_9_3set.setVisibility(View.INVISIBLE);
        braz16Res21_Win_10.setVisibility(View.INVISIBLE);
        braz16Res21_Win_10_2set.setVisibility(View.INVISIBLE);
        braz16Res21_Win_10_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res22_Win_11 = view.findViewById(R.id.braz16Res22_Win_11);
        final EditText braz16Res22_Win_11_2set = view.findViewById(R.id.braz16Res22_Win_11_2set);
        final EditText braz16Res22_Win_11_3set = view.findViewById(R.id.braz16Res22_Win_11_3set);
        final EditText braz16Res22_Win_12 = view.findViewById(R.id.braz16Res22_Win_12);
        final EditText braz16Res22_Win_12_2set = view.findViewById(R.id.braz16Res22_Win_12_2set);
        final EditText braz16Res22_Win_12_3set = view.findViewById(R.id.braz16Res22_Win_12_3set);

        braz16Res22_Win_11.setVisibility(View.INVISIBLE);
        braz16Res22_Win_11_2set.setVisibility(View.INVISIBLE);
        braz16Res22_Win_11_3set.setVisibility(View.INVISIBLE);
        braz16Res22_Win_12.setVisibility(View.INVISIBLE);
        braz16Res22_Win_12_2set.setVisibility(View.INVISIBLE);
        braz16Res22_Win_12_3set.setVisibility(View.INVISIBLE);


        final EditText braz16Res23_Win_17 = view.findViewById(R.id.braz16Res23_Win_17);
        final EditText braz16Res23_Win_17_2set = view.findViewById(R.id.braz16Res23_Win_17_2set);
        final EditText braz16Res23_Win_17_3set = view.findViewById(R.id.braz16Res23_Win_17_3set);
        final EditText braz16Res23_Win_18 = view.findViewById(R.id.braz16Res23_Win_18);
        final EditText braz16Res23_Win_18_2set = view.findViewById(R.id.braz16Res23_Win_18_2set);
        final EditText braz16Res23_Win_18_3set = view.findViewById(R.id.braz16Res23_Win_18_3set);

        braz16Res23_Win_17.setVisibility(View.INVISIBLE);
        braz16Res23_Win_17_2set.setVisibility(View.INVISIBLE);
        braz16Res23_Win_17_3set.setVisibility(View.INVISIBLE);
        braz16Res23_Win_18.setVisibility(View.INVISIBLE);
        braz16Res23_Win_18_2set.setVisibility(View.INVISIBLE);
        braz16Res23_Win_18_3set.setVisibility(View.INVISIBLE);



        final EditText braz16Res24_Win_19 = view.findViewById(R.id.braz16Res24_Win_19);
        final EditText braz16Res24_Win_19_2set = view.findViewById(R.id.braz16Res24_Win_19_2set);
        final EditText braz16Res24_Win_19_3set = view.findViewById(R.id.braz16Res24_Win_19_3set);
        final EditText braz16Res24_Win_20 = view.findViewById(R.id.braz16Res24_Win_20);
        final EditText braz16Res24_Win_20_2set = view.findViewById(R.id.braz16Res24_Win_20_2set);
        final EditText braz16Res24_Win_20_3set = view.findViewById(R.id.braz16Res24_Win_20_3set);

        braz16Res24_Win_19.setVisibility(View.INVISIBLE);
        braz16Res24_Win_19_2set.setVisibility(View.INVISIBLE);
        braz16Res24_Win_19_3set.setVisibility(View.INVISIBLE);
        braz16Res24_Win_20.setVisibility(View.INVISIBLE);
        braz16Res24_Win_20_2set.setVisibility(View.INVISIBLE);
        braz16Res24_Win_20_3set.setVisibility(View.INVISIBLE);


        final EditText braz16Res25_Lost_22 = view.findViewById(R.id.braz16Res25_Lost_22);
        final EditText braz16Res25_Lost_22_2set = view.findViewById(R.id.braz16Res25_Lost_22_2set);
        final EditText braz16Res25_Lost_22_3set = view.findViewById(R.id.braz16Res25_Lost_22_3set);
        final EditText braz16Res25_Win_23 = view.findViewById(R.id.braz16Res25_Win_23);
        final EditText braz16Res25_Win_23_2set = view.findViewById(R.id.braz16Res25_Win_23_2set);
        final EditText braz16Res25_Win_23_3set = view.findViewById(R.id.braz16Res25_Win_23_3set);

        braz16Res25_Lost_22.setVisibility(View.INVISIBLE);
        braz16Res25_Lost_22_2set.setVisibility(View.INVISIBLE);
        braz16Res25_Lost_22_3set.setVisibility(View.INVISIBLE);
        braz16Res25_Win_23.setVisibility(View.INVISIBLE);
        braz16Res25_Win_23_2set.setVisibility(View.INVISIBLE);
        braz16Res25_Win_23_3set.setVisibility(View.INVISIBLE);


        final EditText braz16Res26_Lost_21 = view.findViewById(R.id.braz16Res26_Lost_21);
        final EditText braz16Res26_Lost_21_2set = view.findViewById(R.id.braz16Res26_Lost_21_2set);
        final EditText braz16Res26_Lost_21_3set = view.findViewById(R.id.braz16Res26_Lost_21_3set);
        final EditText braz16Res26_Win_24 = view.findViewById(R.id.braz16Res26_Win_24);
        final EditText braz16Res26_Win_24_2set = view.findViewById(R.id.braz16Res26_Win_24_2set);
        final EditText braz16Res26_Win_24_3set = view.findViewById(R.id.braz16Res26_Win_24_3set);

        braz16Res26_Lost_21.setVisibility(View.INVISIBLE);
        braz16Res26_Lost_21_2set.setVisibility(View.INVISIBLE);
        braz16Res26_Lost_21_3set.setVisibility(View.INVISIBLE);
        braz16Res26_Win_24.setVisibility(View.INVISIBLE);
        braz16Res26_Win_24_2set.setVisibility(View.INVISIBLE);
        braz16Res26_Win_24_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res27_Win_21 = view.findViewById(R.id.braz16Res27_Win_21);
        final EditText braz16Res27_Win_21_2set = view.findViewById(R.id.braz16Res27_Win_21_2set);
        final EditText braz16Res27_Win_21_3set = view.findViewById(R.id.braz16Res27_Win_21_3set);
        final EditText braz16Res27_Win_25 = view.findViewById(R.id.braz16Res27_Win_25);
        final EditText braz16Res27_Win_25_2set = view.findViewById(R.id.braz16Res27_Win_25_2set);
        final EditText braz16Res27_Win_25_3set = view.findViewById(R.id.braz16Res27_Win_25_3set);

        braz16Res27_Win_21.setVisibility(View.INVISIBLE);
        braz16Res27_Win_21_2set.setVisibility(View.INVISIBLE);
        braz16Res27_Win_21_3set.setVisibility(View.INVISIBLE);
        braz16Res27_Win_25.setVisibility(View.INVISIBLE);
        braz16Res27_Win_25_2set.setVisibility(View.INVISIBLE);
        braz16Res27_Win_25_3set.setVisibility(View.INVISIBLE);


        final EditText braz16Res28_Win_22 = view.findViewById(R.id.braz16Res28_Win_22);
        final EditText braz16Res28_Win_22_2set = view.findViewById(R.id.braz16Res28_Win_22_2set);
        final EditText braz16Res28_Win_22_3set = view.findViewById(R.id.braz16Res28_Win_22_3set);
        final EditText braz16Res28_Win_26 = view.findViewById(R.id.braz16Res28_Win_26);
        final EditText braz16Res28_Win_26_2set = view.findViewById(R.id.braz16Res28_Win_26_2set);
        final EditText braz16Res28_Win_26_3set = view.findViewById(R.id.braz16Res28_Win_26_3set);

        braz16Res28_Win_22.setVisibility(View.INVISIBLE);
        braz16Res28_Win_22_2set.setVisibility(View.INVISIBLE);
        braz16Res28_Win_22_3set.setVisibility(View.INVISIBLE);
        braz16Res28_Win_26.setVisibility(View.INVISIBLE);
        braz16Res28_Win_26_2set.setVisibility(View.INVISIBLE);
        braz16Res28_Win_26_3set.setVisibility(View.INVISIBLE);


        final EditText braz16Res29_Lost_27 = view.findViewById(R.id.braz16Res29_Lost_27);
        final EditText braz16Res29_Lost_27_2set = view.findViewById(R.id.braz16Res29_Lost_27_2set);
        final EditText braz16Res29_Lost_27_3set = view.findViewById(R.id.braz16Res29_Lost_27_3set);
        final EditText braz16Res29_Lost_28 = view.findViewById(R.id.braz16Res29_Lost_28);
        final EditText braz16Res29_Lost_28_2set = view.findViewById(R.id.braz16Res29_Lost_28_2set);
        final EditText braz16Res29_Lost_28_3set = view.findViewById(R.id.braz16Res29_Lost_28_3set);

        braz16Res29_Lost_27.setVisibility(View.INVISIBLE);
        braz16Res29_Lost_27_2set.setVisibility(View.INVISIBLE);
        braz16Res29_Lost_27_3set.setVisibility(View.INVISIBLE);
        braz16Res29_Lost_28.setVisibility(View.INVISIBLE);
        braz16Res29_Lost_28_2set.setVisibility(View.INVISIBLE);
        braz16Res29_Lost_28_3set.setVisibility(View.INVISIBLE);

        final EditText braz16Res30_Win_27 = view.findViewById(R.id.braz16Res30_Win_27);
        final EditText braz16Res30_Win_27_2set = view.findViewById(R.id.braz16Res30_Win_27_2set);
        final EditText braz16Res30_Win_27_3set = view.findViewById(R.id.braz16Res30_Win_27_3set);
        final EditText braz16Res30_Win_28 = view.findViewById(R.id.braz16Res30_Win_28);
        final EditText braz16Res30_Win_28_2set = view.findViewById(R.id.braz16Res30_Win_28_2set);
        final EditText braz16Res30_Win_28_3set = view.findViewById(R.id.braz16Res30_Win_28_3set);

        braz16Res30_Win_27.setVisibility(View.INVISIBLE);
        braz16Res30_Win_27_2set.setVisibility(View.INVISIBLE);
        braz16Res30_Win_27_3set.setVisibility(View.INVISIBLE);
        braz16Res30_Win_28.setVisibility(View.INVISIBLE);
        braz16Res30_Win_28_2set.setVisibility(View.INVISIBLE);
        braz16Res30_Win_28_3set.setVisibility(View.INVISIBLE);




        final Button team1 = view.findViewById(R.id.braz16Team01);
        final Button team2 = view.findViewById(R.id.braz16Team02);
        final Button team3 = view.findViewById(R.id.braz16Team03);
        final Button team4 = view.findViewById(R.id.braz16Team04);
        final Button team5 = view.findViewById(R.id.braz16Team05);
        final Button team6 = view.findViewById(R.id.braz16Team06);
        final Button team7 = view.findViewById(R.id.braz16Team07);
        final Button team8 = view.findViewById(R.id.braz16Team08);
        final Button team9 = view.findViewById(R.id.braz16Team09);
        final Button team10 = view.findViewById(R.id.braz16Team10);
        final Button team11 = view.findViewById(R.id.braz16Team11);
        final Button team12 = view.findViewById(R.id.braz16Team12);
        final Button team13 = view.findViewById(R.id.braz16Team13);
        final Button team14 = view.findViewById(R.id.braz16Team14);
        final Button team15 = view.findViewById(R.id.braz16Team15);
        final Button team16 = view.findViewById(R.id.braz16Team16);

        team1.setText(getActivity().getIntent().getStringExtra("NameOfTeam1"));
        team2.setText(getActivity().getIntent().getStringExtra("NameOfTeam2"));
        team3.setText(getActivity().getIntent().getStringExtra("NameOfTeam3"));
        team4.setText(getActivity().getIntent().getStringExtra("NameOfTeam4"));
        team5.setText(getActivity().getIntent().getStringExtra("NameOfTeam5"));
        team6.setText(getActivity().getIntent().getStringExtra("NameOfTeam6"));
        team7.setText(getActivity().getIntent().getStringExtra("NameOfTeam7"));
        team8.setText(getActivity().getIntent().getStringExtra("NameOfTeam8"));
        team9.setText(getActivity().getIntent().getStringExtra("NameOfTeam9"));
        team10.setText(getActivity().getIntent().getStringExtra("NameOfTeam10"));
        team11.setText(getActivity().getIntent().getStringExtra("NameOfTeam11"));
        team12.setText(getActivity().getIntent().getStringExtra("NameOfTeam12"));
        team13.setText(getActivity().getIntent().getStringExtra("NameOfTeam13"));
        team14.setText(getActivity().getIntent().getStringExtra("NameOfTeam14"));
        team15.setText(getActivity().getIntent().getStringExtra("NameOfTeam15"));
        team16.setText(getActivity().getIntent().getStringExtra("NameOfTeam16"));


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
        final Button win15 = view.findViewById(R.id.braz16WIN_15);
        final Button win16 = view.findViewById(R.id.braz16WIN_16);
        final Button win17 = view.findViewById(R.id.braz16WIN_17);
        final Button win18 = view.findViewById(R.id.braz16WIN_18);
        final Button win19 = view.findViewById(R.id.braz16WIN_19);
        final Button win20 = view.findViewById(R.id.braz16WIN_20);
        final Button win21 = view.findViewById(R.id.braz16WIN_21);
        final Button win22 = view.findViewById(R.id.braz16WIN_22);
        final Button win23 = view.findViewById(R.id.braz16WIN_23);
        final Button win24 = view.findViewById(R.id.braz16WIN_24);
        final Button win25 = view.findViewById(R.id.braz16WIN_25);
        final Button win26 = view.findViewById(R.id.braz16WIN_26);
        final Button win27 = view.findViewById(R.id.braz16WIN_27);
        final Button win28 = view.findViewById(R.id.braz16WIN_28);
        final Button win29 = view.findViewById(R.id.braz16WIN_29);
        final Button win30 = view.findViewById(R.id.braz16WIN_30);


        final Button lost1 = view.findViewById(R.id.braz16LOST_1);
        final Button lost2 = view.findViewById(R.id.braz16LOST_2);
        final Button lost3 = view.findViewById(R.id.braz16LOST_3);
        final Button lost4 = view.findViewById(R.id.braz16LOST_4);
        final Button lost5 = view.findViewById(R.id.braz16LOST_5);
        final Button lost6 = view.findViewById(R.id.braz16LOST_6);
        final Button lost7 = view.findViewById(R.id.braz16LOST_7);
        final Button lost8 = view.findViewById(R.id.braz16LOST_8);
        final Button lost9 = view.findViewById(R.id.braz16LOST_9);
        final Button lost10 = view.findViewById(R.id.braz16LOST_10);
        final Button lost11 = view.findViewById(R.id.braz16LOST_11);
        final Button lost12 = view.findViewById(R.id.braz16LOST_12);
        final Button lost21 = view.findViewById(R.id.braz16LOST_21);
        final Button lost22 = view.findViewById(R.id.braz16LOST_22);
        final Button lost27 = view.findViewById(R.id.braz16LOST_27);
        final Button lost28 = view.findViewById(R.id.braz16LOST_28);


        toast = Toast.makeText(getActivity().getApplicationContext(), "Wprowadz wczesniejszy wynik !", Toast.LENGTH_SHORT);

        // 1 MECZ
        setResultsForBraz.WithLoserWithoutCheck(team1, team16, win1, "WIN.1", lost1, "LOST.1", Res1_1, Res1_1_2set, Res1_1_3set, Res1_16, Res1_16_2set, Res1_16_3set);

        // 2 MECZ
        setResultsForBraz.WithLoserWithoutCheck(team9, team8, win2, "WIN.2", lost2, "LOST.2", Res2_9, Res2_9_2set, Res2_9_3set, Res2_8, Res2_8_2set, Res2_8_3set);

        // 3 MECZ
        setResultsForBraz.WithLoserWithoutCheck(team5, team12, win3, "WIN.3", lost3, "LOST.3", Res3_5, Res3_5_2set, Res3_5_3set, Res3_12, Res3_12_2set, Res3_12_3set);

        // 4 MECZ
        setResultsForBraz.WithLoserWithoutCheck(team13, team4, win4, "WIN.4", lost4, "LOST.4", Res4_4, Res4_4_2set, Res4_4_3set, Res4_13, Res4_13_2set, Res4_13_3set);

        // 5 MECZ

        setResultsForBraz.WithLoserWithoutCheck(team3, team14,win5, "WIN.5", lost5, "LOST.5", braz16Res5_3, braz16Res5_3_2set, braz16Res5_3_3set, braz16Res5_14, braz16Res5_14_2set, braz16Res5_14_3set);


        // 6 MECZ
        setResultsForBraz.WithLoserWithoutCheck(team11,  team6, win6, "WIN.6", lost6, "LOST.6", braz16Res6_11, braz16Res6_11_2set, braz16Res6_11_3set, braz16Res6_6, braz16Res6_6_2set, braz16Res6_6_3set);

        //7 MECZ
        setResultsForBraz.WithLoserWithoutCheck(team7, team10, win7, "WIN.7",lost7,"LOST,7", braz16Res7_7, braz16Res7_7_2set, braz16Res7_7_3set, braz16Res7_10, braz16Res7_10_2set, braz16Res7_10_3set);


        //8 MECZ
        setResultsForBraz.WithLoserWithoutCheck(team15,  team2, win8, "WIN.8",lost8,"LOST.8", braz16Res8_15, braz16Res8_15_2set, braz16Res8_15_3set, braz16Res8_2, braz16Res8_2_2set, braz16Res8_2_3set);



        //9 MECZ
        setResultsForBraz.WithLoserAndCheck(win1, "WIN.1", win2, "WIN.2", win9, "WIN.9",lost9,"LOST.9", braz16Res9_Win_1, braz16Res9_Win_1_2set, braz16Res9_Win_1_3set, braz16Res9_Win_2, braz16Res9_Win_2_2set, braz16Res9_Win_2_3set);

        //10 MECZ
        setResultsForBraz.WithLoserAndCheck(win3, "WIN.3", win4, "WIN.4", win10, "WIN.10",lost10,"LOST.10", braz16Res10_Win_3, braz16Res10_Win_3_2set, braz16Res10_Win_3_3set, braz16Res10_Win_4, braz16Res10_Win_4_2set, braz16Res10_Win_4_3set);

        //11 MECZ
        setResultsForBraz.WithLoserAndCheck(win5, "WIN.5", win6, "WIN.6", win11, "WIN.11",lost11,"LOST.11", braz16Res11_Win_5, braz16Res11_Win_5_2set, braz16Res11_Win_5_3set, braz16Res11_Win_6, braz16Res11_Win_6_2set, braz16Res11_Win_6_3set);

        //12 MECZ
        setResultsForBraz.WithLoserAndCheck(win7, "WIN.7", win8, "WIN.8", win12, "WIN.12",lost12,"LOST.12", braz16Res12_Win_7, braz16Res12_Win_7_2set, braz16Res12_Win_7_3set, braz16Res12_Win_8, braz16Res12_Win_8_2set, braz16Res12_Win_8_3set);


        //13 MECZ
        setResultsForBraz.WithCheckWithoutLoser(lost8, "LOST.8", lost7, "WIN.4", win13, "WIN.13", braz16Res13_Lost_8, braz16Res13_Lost_8_2set, braz16Res13_Lost_8_3set, braz16Res13_Lost_7, braz16Res13_Lost_7_2set, braz16Res13_Lost_7_3set);

        //14 MECZ
        setResultsForBraz.WithCheckWithoutLoser(lost6, "LOST.6", lost5, "WIN.4", win14, "WIN.14", braz16Res14_Lost_6, braz16Res14_Lost_6_2set, braz16Res14_Lost_6_3set, braz16Res14_Lost_5, braz16Res14_Lost_5_2set, braz16Res14_Lost_5_3set);

        //15 MECZ
        setResultsForBraz.WithCheckWithoutLoser(lost4, "LOST.4", lost3, "WIN.4", win15, "WIN.15", braz16Res15_Lost_4, braz16Res15_Lost_4_2set, braz16Res15_Lost_4_3set, braz16Res15_Lost_3, braz16Res15_Lost_3_2set, braz16Res15_Lost_3_3set);

        //16 MECZ
        setResultsForBraz.WithCheckWithoutLoser(lost2, "LOST.2", lost1, "LOST.1", win16, "WIN.16", braz16Res16_Lost_2, braz16Res16_Lost_2_2set, braz16Res16_Lost_2_3set, braz16Res16_Lost_1, braz16Res16_Lost_1_2set, braz16Res16_Lost_1_3set);

        //17 MECZ
        setResultsForBraz.WithCheckWithoutLoser(win13, "WIN.13", lost10, "LOST.10", win17, "WIN.17", braz16Res17_Win_13, braz16Res17_Win_13_2set, braz16Res17_Win_13_3set, braz16Res17_Lost_10, braz16Res17_Lost_10_2set, braz16Res17_Lost_10_3set);

        //18 MECZ
        setResultsForBraz.WithCheckWithoutLoser(win14, "WIN.14", lost9, "LOST.9", win18, "WIN.18", braz16Res18_Win_14, braz16Res18_Win_14_2set, braz16Res18_Win_14_3set, braz16Res18_Lost_9, braz16Res18_Lost_9_2set, braz16Res18_Lost_9_3set);

        //19 MECZ
        setResultsForBraz.WithCheckWithoutLoser(win15, "WIN.15", lost12, "LOST.12", win19, "WIN.19", braz16Res19_Win_15, braz16Res19_Win_15_2set, braz16Res19_Win_15_3set, braz16Res19_Lost_12, braz16Res19_Lost_12_2set, braz16Res19_Lost_12_3set);

        //20 MECZ
        setResultsForBraz.WithCheckWithoutLoser(win16, "WIN.16", lost11, "LOST.11", win20, "WIN.20", braz16Res20_Win_16, braz16Res20_Win_16_2set, braz16Res20_Win_16_3set, braz16Res20_Lost_11, braz16Res20_Lost_11_2set, braz16Res20_Lost_11_3set);


        //21 MECZ
        setResultsForBraz.WithLoserAndCheck(win9, "WIN.9", win10, "WIN.10", win21, "WIN.21",lost21,"LOST.21", braz16Res21_Win_9, braz16Res21_Win_9_2set, braz16Res21_Win_9_3set, braz16Res21_Win_10, braz16Res21_Win_10_2set, braz16Res21_Win_10_3set);

        //22 MECZ
        setResultsForBraz.WithLoserAndCheck(win11, "WIN.11", win12, "WIN.12", win22, "WIN.22",lost22,"LOST.22", braz16Res22_Win_11, braz16Res22_Win_11_2set, braz16Res22_Win_11_3set, braz16Res22_Win_12, braz16Res22_Win_12_2set, braz16Res22_Win_12_3set);


        //23 MECZ
        setResultsForBraz.WithCheckWithoutLoser(win17, "WIN.17", win18, "WIN.18", win23, "WIN.23", braz16Res23_Win_17, braz16Res23_Win_17_2set, braz16Res23_Win_17_3set, braz16Res23_Win_18, braz16Res23_Win_18_2set, braz16Res23_Win_18_3set);

        //24 MECZ
        setResultsForBraz.WithCheckWithoutLoser(win19, "WIN.19", win20, "WIN.20", win24, "WIN.24", braz16Res24_Win_19, braz16Res24_Win_19_2set, braz16Res24_Win_19_3set, braz16Res24_Win_20, braz16Res24_Win_20_2set, braz16Res24_Win_20_3set);

        //25 MECZ
        setResultsForBraz.WithCheckWithoutLoser(lost22, "LOST.22", win23, "WIN.23", win25, "WIN.25", braz16Res25_Lost_22, braz16Res25_Lost_22_2set, braz16Res25_Lost_22_3set, braz16Res25_Win_23, braz16Res25_Win_23_2set, braz16Res25_Win_23_3set);

        //26 MECZ
        setResultsForBraz.WithCheckWithoutLoser(lost21, "LOST.21", win24, "WIN.24", win26, "WIN.26", braz16Res26_Lost_21, braz16Res26_Lost_21_2set, braz16Res26_Lost_21_3set, braz16Res26_Win_24, braz16Res26_Win_24_2set, braz16Res26_Win_24_3set);


        //27 MECZ
        setResultsForBraz.WithLoserAndCheck(win21, "WIN.21", win25, "WIN.25", win27, "WIN.27",lost27,"LOST.27", braz16Res27_Win_21, braz16Res27_Win_21_2set, braz16Res27_Win_21_3set, braz16Res27_Win_25, braz16Res27_Win_25_2set, braz16Res27_Win_25_3set);

        //28 MECZ
        setResultsForBraz.WithLoserAndCheck(win22, "WIN.22", win26, "WIN.26", win28, "WIN.28",lost28,"LOST.28", braz16Res28_Win_22, braz16Res28_Win_22_2set, braz16Res28_Win_22_3set, braz16Res28_Win_26, braz16Res28_Win_26_2set, braz16Res28_Win_26_3set);


        //29 MECZ
        setResultsForBraz.WithCheckWithoutLoser(lost27, "LOST.27", lost28, "LOST.28", win29, "WIN.29", braz16Res29_Lost_27, braz16Res29_Lost_27_2set, braz16Res29_Lost_27_3set, braz16Res29_Lost_28, braz16Res29_Lost_28_2set, braz16Res29_Lost_28_3set);

        //30 MECZ FINAL
        setResultsForBraz.WithCheckWithoutLoser(win27, "WIN.27", win28, "WIN.28", win30, "WIN.30", braz16Res30_Win_27, braz16Res30_Win_27_2set, braz16Res30_Win_27_3set, braz16Res30_Win_28, braz16Res30_Win_28_2set, braz16Res30_Win_28_3set);


        database = new Database(mapElimination,mapPointsInMatches,listResultButtons);
        database.getResultFromDatabaseWithUpdate(nameOfTour,typeOfTour);

        RelativeLayout relativeLayout = view.findViewById(R.id.braz16_relLayout);
        onlyWatch = getActivity().getIntent().getStringExtra("OnlyWatch");
        if(onlyWatch!=null){
            final int childCount = relativeLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                relativeLayout.getChildAt(i).setEnabled(false);

            }
        }
        return view;
    }
}




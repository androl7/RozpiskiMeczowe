package com.example.adam.rozpiskimeczowe.cup.cup64;

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
import com.google.firebase.firestore.FirebaseFirestore;
import com.otaliastudios.zoom.ZoomLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FragmentTabCup64_1 extends Fragment {
    Map<Integer,ArrayList<EditText>> mapPointsInMatches;
    Map<Integer,ArrayList<String>> mapElimination;
    ArrayList<Button> listResultButtons;
    Toast toast;
    String pktInSet = "21";
    String pktInTieBreak = "15";
    String typeOfTour = "cup64";
    SetResultsForCup setResultsForCup;
    int numberOfMatches = 0;
    int actualMatch = 0;
    View view;
    RelativeLayout relativeLayout;
    TextView[]numbersOfMatchesArray;
    Button win49;
    Button win50;
    Button win51;
    Button win52;
    Button win53;
    Button win54;
    Button win55;
    Button win56;
    String R1;
    String R2;
    String R3;
    String R4;
    String R5;
    String R6;
    String R7;
    String R8;
    String nameOfTour;
    RelativeLayout introLayout;
    FirebaseFirestore db;
    Database database;
    ZoomLayout zoomLayout;
    String onlyWatch;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment_tab_cup64_1, container, false);

        String local = getActivity().getIntent().getStringExtra("local");

        db = FirebaseFirestore.getInstance();
        mapPointsInMatches = new HashMap<>();
        listResultButtons = new ArrayList<>();
        mapElimination = new HashMap<>();
        nameOfTour = getActivity().getIntent().getStringExtra("nameOfTour");

        setHasOptionsMenu(true);

        relativeLayout = view.findViewById(R.id.cup64relLayout);
        zoomLayout = view.findViewById(R.id.cup64_zoomLayout);


        //Add NumberOfMatches
        numbersOfMatchesArray = new TextView[56];
        for(int i=0; i<numbersOfMatchesArray.length; i++) {
            String buttonID = "cup64numberOfMatch" + (i+1) ;
            int resID = getResources().getIdentifier(buttonID, "id", getActivity().getPackageName());
            numbersOfMatchesArray[i] = view.findViewById(resID);
        }

        setResultsForCup = new SetResultsForCup(nameOfTour,listResultButtons,mapPointsInMatches,typeOfTour,getActivity(),container,pktInSet,pktInTieBreak,numberOfMatches,actualMatch,relativeLayout,numbersOfMatchesArray,view,"cup64",zoomLayout,local);


        final EditText Res1_1 = view.findViewById(R.id.cup64Res1_1);
        final EditText Res1_1_2set = view.findViewById(R.id.cup64Res1_1_2set);
        final EditText Res1_1_3set = view.findViewById(R.id.cup64Res1_1_3set);
        final EditText Res1_64 = view.findViewById(R.id.cup64Res1_64);
        final EditText Res1_64_2set = view.findViewById(R.id.cup64Res1_64_2set);
        final EditText Res1_64_3set = view.findViewById(R.id.cup64Res1_64_3set);

        Res1_1.setVisibility(View.INVISIBLE);
        Res1_1_2set.setVisibility(View.INVISIBLE);
        Res1_1_3set.setVisibility(View.INVISIBLE);
        Res1_64.setVisibility(View.INVISIBLE);
        Res1_64_2set.setVisibility(View.INVISIBLE);
        Res1_64_3set.setVisibility(View.INVISIBLE);




        final EditText Res2_33 = view.findViewById(R.id.cup64Res2_33);
        final EditText Res2_33_2set = view.findViewById(R.id.cup64Res2_33_2set);
        final EditText Res2_33_3set = view.findViewById(R.id.cup64Res2_33_3set);
        final EditText Res2_32 = view.findViewById(R.id.cup64Res2_32);
        final EditText Res2_32_2set = view.findViewById(R.id.cup64Res2_32_2set);
        final EditText Res2_32_3set = view.findViewById(R.id.cup64Res2_32_3set);

        Res2_33.setVisibility(View.INVISIBLE);
        Res2_33_2set.setVisibility(View.INVISIBLE);
        Res2_33_3set.setVisibility(View.INVISIBLE);
        Res2_32.setVisibility(View.INVISIBLE);
        Res2_32_2set.setVisibility(View.INVISIBLE);
        Res2_32_3set.setVisibility(View.INVISIBLE);

        final EditText Res3_17 = view.findViewById(R.id.cup64Res3_17);
        final EditText Res3_17_2set = view.findViewById(R.id.cup64Res3_17_2set);
        final EditText Res3_17_3set = view.findViewById(R.id.cup64Res3_17_3set);
        final EditText Res3_48 = view.findViewById(R.id.cup64Res3_48);
        final EditText Res3_48_2set = view.findViewById(R.id.cup64Res3_48_2set);
        final EditText Res3_48_3set = view.findViewById(R.id.cup64Res3_48_3set);

        Res3_17.setVisibility(View.INVISIBLE);
        Res3_17_2set.setVisibility(View.INVISIBLE);
        Res3_17_3set.setVisibility(View.INVISIBLE);
        Res3_48.setVisibility(View.INVISIBLE);
        Res3_48_2set.setVisibility(View.INVISIBLE);
        Res3_48_3set.setVisibility(View.INVISIBLE);

        final EditText Res4_49 = view.findViewById(R.id.cup64Res4_49);
        final EditText Res4_49_2set = view.findViewById(R.id.cup64Res4_49_2set);
        final EditText Res4_49_3set = view.findViewById(R.id.cup64Res4_49_3set);
        final EditText Res4_16 = view.findViewById(R.id.cup64Res4_16 );
        final EditText Res4_16_2set = view.findViewById(R.id.cup64Res4_16_2set);
        final EditText Res4_16_3set = view.findViewById(R.id.cup64Res4_16_3set);

        Res4_49.setVisibility(View.INVISIBLE);
        Res4_49_2set.setVisibility(View.INVISIBLE);
        Res4_49_3set.setVisibility(View.INVISIBLE);
        Res4_16.setVisibility(View.INVISIBLE);
        Res4_16_2set.setVisibility(View.INVISIBLE);
        Res4_16_3set.setVisibility(View.INVISIBLE);

        final EditText Res5_9 = view.findViewById(R.id.cup64Res5_9);
        final EditText Res5_9_2set = view.findViewById(R.id.cup64Res5_9_2set);
        final EditText Res5_9_3set = view.findViewById(R.id.cup64Res5_9_3set);
        final EditText Res5_56 = view.findViewById(R.id.cup64Res5_56);
        final EditText Res5_56_2set = view.findViewById(R.id.cup64Res5_56_2set);
        final EditText Res5_56_3set = view.findViewById(R.id.cup64Res5_56_3set);

        Res5_9.setVisibility(View.INVISIBLE);
        Res5_9_2set.setVisibility(View.INVISIBLE);
        Res5_9_3set.setVisibility(View.INVISIBLE);
        Res5_56.setVisibility(View.INVISIBLE);
        Res5_56_2set.setVisibility(View.INVISIBLE);
        Res5_56_3set.setVisibility(View.INVISIBLE);

        final EditText Res6_41 = view.findViewById(R.id.cup64Res6_41);
        final EditText Res6_41_2set = view.findViewById(R.id.cup64Res6_41_2set);
        final EditText Res6_41_3set = view.findViewById(R.id.cup64Res6_41_3set);
        final EditText Res6_24 = view.findViewById(R.id.cup64Res6_24);
        final EditText Res6_24_2set = view.findViewById(R.id.cup64Res6_24_2set);
        final EditText Res6_24_3set = view.findViewById(R.id.cup64Res6_24_3set);


        Res6_41.setVisibility(View.INVISIBLE);
        Res6_41_2set.setVisibility(View.INVISIBLE);
        Res6_41_3set.setVisibility(View.INVISIBLE);
        Res6_24.setVisibility(View.INVISIBLE);
        Res6_24_2set.setVisibility(View.INVISIBLE);
        Res6_24_3set.setVisibility(View.INVISIBLE);


        final EditText Res7_25 = view.findViewById(R.id.cup64Res7_25);
        final EditText Res7_25_2set = view.findViewById(R.id.cup64Res7_25_2set);
        final EditText Res7_25_3set = view.findViewById(R.id.cup64Res7_25_3set);
        final EditText Res7_40 = view.findViewById(R.id.cup64Res7_40);
        final EditText Res7_40_2set = view.findViewById(R.id.cup64Res7_40_2set);
        final EditText Res7_40_3set = view.findViewById(R.id.cup64Res7_40_3set);

        Res7_25.setVisibility(View.INVISIBLE);
        Res7_25_2set.setVisibility(View.INVISIBLE);
        Res7_25_3set.setVisibility(View.INVISIBLE);
        Res7_40.setVisibility(View.INVISIBLE);
        Res7_40_2set.setVisibility(View.INVISIBLE);
        Res7_40_3set.setVisibility(View.INVISIBLE);

        final EditText Res8_57 = view.findViewById(R.id.cup64Res8_57);
        final EditText Res8_57_2set = view.findViewById(R.id.cup64Res8_57_2set);
        final EditText Res8_57_3set = view.findViewById(R.id.cup64Res8_57_3set);
        final EditText Res8_8 = view.findViewById(R.id.cup64Res8_8);
        final EditText Res8_8_2set = view.findViewById(R.id.cup64Res8_8_2set);
        final EditText Res8_8_3set = view.findViewById(R.id.cup64Res8_8_3set);

        Res8_57.setVisibility(View.INVISIBLE);
        Res8_57_2set.setVisibility(View.INVISIBLE);
        Res8_57_3set.setVisibility(View.INVISIBLE);
        Res8_8.setVisibility(View.INVISIBLE);
        Res8_8_2set.setVisibility(View.INVISIBLE);
        Res8_8_3set.setVisibility(View.INVISIBLE);

        final EditText Res9_5 = view.findViewById(R.id.cup64Res9_5);
        final EditText Res9_5_2set = view.findViewById(R.id.cup64Res9_5_2set);
        final EditText Res9_5_3set = view.findViewById(R.id.cup64Res9_5_3set);
        final EditText Res9_60 = view.findViewById(R.id.cup64Res9_60);
        final EditText Res9_60_2set = view.findViewById(R.id.cup64Res9_60_2set);
        final EditText Res9_60_3set = view.findViewById(R.id.cup64Res9_60_3set);

        Res9_5.setVisibility(View.INVISIBLE);
        Res9_5_2set.setVisibility(View.INVISIBLE);
        Res9_5_3set.setVisibility(View.INVISIBLE);
        Res9_60.setVisibility(View.INVISIBLE);
        Res9_60_2set.setVisibility(View.INVISIBLE);
        Res9_60_3set.setVisibility(View.INVISIBLE);

        final EditText Res10_37 = view.findViewById(R.id.cup64Res10_37);
        final EditText Res10_37_2set = view.findViewById(R.id.cup64Res10_37_2set);
        final EditText Res10_37_3set = view.findViewById(R.id.cup64Res10_37_3set);
        final EditText Res10_28 = view.findViewById(R.id.cup64Res10_28);
        final EditText Res10_28_2set = view.findViewById(R.id.cup64Res10_28_2set);
        final EditText Res10_28_3set = view.findViewById(R.id.cup64Res10_28_3set);

        Res10_37.setVisibility(View.INVISIBLE);
        Res10_37_2set.setVisibility(View.INVISIBLE);
        Res10_37_3set.setVisibility(View.INVISIBLE);
        Res10_28.setVisibility(View.INVISIBLE);
        Res10_28_2set.setVisibility(View.INVISIBLE);
        Res10_28_3set.setVisibility(View.INVISIBLE);

        final EditText Res11_21 = view.findViewById(R.id.cup64Res11_21);
        final EditText Res11_21_2set = view.findViewById(R.id.cup64Res11_21_2set);
        final EditText Res11_21_3set = view.findViewById(R.id.cup64Res11_21_3set);
        final EditText Res11_44 = view.findViewById(R.id.cup64Res11_44);
        final EditText Res11_44_2set = view.findViewById(R.id.cup64Res11_44_2set);
        final EditText Res11_44_3set = view.findViewById(R.id.cup64Res11_44_3set);

        Res11_21.setVisibility(View.INVISIBLE);
        Res11_21_2set.setVisibility(View.INVISIBLE);
        Res11_21_3set.setVisibility(View.INVISIBLE);
        Res11_44.setVisibility(View.INVISIBLE);
        Res11_44_2set.setVisibility(View.INVISIBLE);
        Res11_44_3set.setVisibility(View.INVISIBLE);

        final EditText Res12_53 = view.findViewById(R.id.cup64Res12_53);
        final EditText Res12_53_2set = view.findViewById(R.id.cup64Res12_53_2set);
        final EditText Res12_53_3set = view.findViewById(R.id.cup64Res12_53_3set);
        final EditText Res12_12 = view.findViewById(R.id.cup64Res12_12);
        final EditText Res12_12_2set = view.findViewById(R.id.cup64Res12_12_2set);
        final EditText Res12_12_3set = view.findViewById(R.id.cup64Res12_12_3set);

        Res12_53.setVisibility(View.INVISIBLE);
        Res12_53_2set.setVisibility(View.INVISIBLE);
        Res12_53_3set.setVisibility(View.INVISIBLE);
        Res12_12.setVisibility(View.INVISIBLE);
        Res12_12_2set.setVisibility(View.INVISIBLE);
        Res12_12_3set.setVisibility(View.INVISIBLE);

        final EditText Res13_13 = view.findViewById(R.id.cup64Res13_13);
        final EditText Res13_13_2set = view.findViewById(R.id.cup64Res13_13_2set);
        final EditText Res13_13_3set = view.findViewById(R.id.cup64Res13_13_3set);
        final EditText Res13_52 = view.findViewById(R.id.cup64Res13_52);
        final EditText Res13_52_2set = view.findViewById(R.id.cup64Res13_52_2set);
        final EditText Res13_52_3set = view.findViewById(R.id.cup64Res13_52_3set);

        Res13_13.setVisibility(View.INVISIBLE);
        Res13_13_2set.setVisibility(View.INVISIBLE);
        Res13_13_3set.setVisibility(View.INVISIBLE);
        Res13_52.setVisibility(View.INVISIBLE);
        Res13_52_2set.setVisibility(View.INVISIBLE);
        Res13_52_3set.setVisibility(View.INVISIBLE);

        final EditText Res14_45 = view.findViewById(R.id.cup64Res14_45);
        final EditText Res14_45_2set = view.findViewById(R.id.cup64Res14_45_2set);
        final EditText Res14_45_3set = view.findViewById(R.id.cup64Res14_45_3set);
        final EditText Res14_20 = view.findViewById(R.id.cup64Res14_20);
        final EditText Res14_20_2set = view.findViewById(R.id.cup64Res14_20_2set);
        final EditText Res14_20_3set = view.findViewById(R.id.cup64Res14_20_3set);

        Res14_45.setVisibility(View.INVISIBLE);
        Res14_45_2set.setVisibility(View.INVISIBLE);
        Res14_45_3set.setVisibility(View.INVISIBLE);
        Res14_20.setVisibility(View.INVISIBLE);
        Res14_20_2set.setVisibility(View.INVISIBLE);
        Res14_20_3set.setVisibility(View.INVISIBLE);

        final EditText Res15_29 = view.findViewById(R.id.cup64Res15_29);
        final EditText Res15_29_2set = view.findViewById(R.id.cup64Res15_29_2set);
        final EditText Res15_29_3set = view.findViewById(R.id.cup64Res15_29_3set);
        final EditText Res15_36 = view.findViewById(R.id.cup64Res15_36);
        final EditText Res15_36_2set = view.findViewById(R.id.cup64Res15_36_2set);
        final EditText Res15_36_3set = view.findViewById(R.id.cup64Res15_36_3set);

        Res15_29.setVisibility(View.INVISIBLE);
        Res15_29_2set.setVisibility(View.INVISIBLE);
        Res15_29_3set.setVisibility(View.INVISIBLE);
        Res15_36.setVisibility(View.INVISIBLE);
        Res15_36_2set.setVisibility(View.INVISIBLE);
        Res15_36_3set.setVisibility(View.INVISIBLE);

        final EditText Res16_61 = view.findViewById(R.id.cup64Res16_61);
        final EditText Res16_61_2set = view.findViewById(R.id.cup64Res16_61_2set);
        final EditText Res16_61_3set = view.findViewById(R.id.cup64Res16_61_3set);
        final EditText Res16_4 = view.findViewById(R.id.cup64Res16_4);
        final EditText Res16_4_2set = view.findViewById(R.id.cup64Res16_4_2set);
        final EditText Res16_4_3set = view.findViewById(R.id.cup64Res16_4_3set);

        Res16_61.setVisibility(View.INVISIBLE);
        Res16_61_2set.setVisibility(View.INVISIBLE);
        Res16_61_3set.setVisibility(View.INVISIBLE);
        Res16_4.setVisibility(View.INVISIBLE);
        Res16_4_2set.setVisibility(View.INVISIBLE);
        Res16_4_3set.setVisibility(View.INVISIBLE);

        final EditText Res17_3 = view.findViewById(R.id.cup64Res17_3);
        final EditText Res17_3_2set = view.findViewById(R.id.cup64Res17_3_2set);
        final EditText Res17_3_3set = view.findViewById(R.id.cup64Res17_3_3set);
        final EditText Res17_62 = view.findViewById(R.id.cup64Res17_62);
        final EditText Res17_62_2set = view.findViewById(R.id.cup64Res17_62_2set);
        final EditText Res17_62_3set = view.findViewById(R.id.cup64Res17_62_3set);

        Res17_3.setVisibility(View.INVISIBLE);
        Res17_3_2set.setVisibility(View.INVISIBLE);
        Res17_3_3set.setVisibility(View.INVISIBLE);
        Res17_62.setVisibility(View.INVISIBLE);
        Res17_62_2set.setVisibility(View.INVISIBLE);
        Res17_62_3set.setVisibility(View.INVISIBLE);


        final EditText Res18_35 = view.findViewById(R.id.cup64Res18_35);
        final EditText Res18_35_2set = view.findViewById(R.id.cup64Res18_35_2set);
        final EditText Res18_35_3set = view.findViewById(R.id.cup64Res18_35_3set);
        final EditText Res18_30 = view.findViewById(R.id.cup64Res18_30);
        final EditText Res18_30_2set = view.findViewById(R.id.cup64Res18_30_2set);
        final EditText Res18_30_3set = view.findViewById(R.id.cup64Res18_30_3set);

        Res18_35.setVisibility(View.INVISIBLE);
        Res18_35_2set.setVisibility(View.INVISIBLE);
        Res18_35_3set.setVisibility(View.INVISIBLE);
        Res18_30.setVisibility(View.INVISIBLE);
        Res18_30_2set.setVisibility(View.INVISIBLE);
        Res18_30_3set.setVisibility(View.INVISIBLE);

        final EditText Res19_19 = view.findViewById(R.id.cup64Res19_19);
        final EditText Res19_19_2set = view.findViewById(R.id.cup64Res19_19_2set);
        final EditText Res19_19_3set = view.findViewById(R.id.cup64Res19_19_3set);
        final EditText Res19_46 = view.findViewById(R.id.cup64Res19_46);
        final EditText Res19_46_2set = view.findViewById(R.id.cup64Res19_46_2set);
        final EditText Res19_46_3set = view.findViewById(R.id.cup64Res19_46_3set);

        Res19_19.setVisibility(View.INVISIBLE);
        Res19_19_2set.setVisibility(View.INVISIBLE);
        Res19_19_3set.setVisibility(View.INVISIBLE);
        Res19_46.setVisibility(View.INVISIBLE);
        Res19_46_2set.setVisibility(View.INVISIBLE);
        Res19_46_3set.setVisibility(View.INVISIBLE);

        final EditText Res20_51 = view.findViewById(R.id.cup64Res20_51);
        final EditText Res20_51_2set = view.findViewById(R.id.cup64Res20_51_2set);
        final EditText Res20_51_3set = view.findViewById(R.id.cup64Res20_51_3set);
        final EditText Res20_14 = view.findViewById(R.id.cup64Res20_14 );
        final EditText Res20_14_2set = view.findViewById(R.id.cup64Res20_14_2set);
        final EditText Res20_14_3set = view.findViewById(R.id.cup64Res20_14_3set);

        Res20_51.setVisibility(View.INVISIBLE);
        Res20_51_2set.setVisibility(View.INVISIBLE);
        Res20_51_3set.setVisibility(View.INVISIBLE);
        Res20_14.setVisibility(View.INVISIBLE);
        Res20_14_2set.setVisibility(View.INVISIBLE);
        Res20_14_3set.setVisibility(View.INVISIBLE);

        final EditText Res21_11 = view.findViewById(R.id.cup64Res21_11);
        final EditText Res21_11_2set = view.findViewById(R.id.cup64Res21_11_2set);
        final EditText Res21_11_3set = view.findViewById(R.id.cup64Res21_11_3set);
        final EditText Res21_54 = view.findViewById(R.id.cup64Res21_54);
        final EditText Res21_54_2set = view.findViewById(R.id.cup64Res21_54_2set);
        final EditText Res21_54_3set = view.findViewById(R.id.cup64Res21_54_3set);

        Res21_11.setVisibility(View.INVISIBLE);
        Res21_11_2set.setVisibility(View.INVISIBLE);
        Res21_11_3set.setVisibility(View.INVISIBLE);
        Res21_54.setVisibility(View.INVISIBLE);
        Res21_54_2set.setVisibility(View.INVISIBLE);
        Res21_54_3set.setVisibility(View.INVISIBLE);

        final EditText Res22_43 = view.findViewById(R.id.cup64Res22_43);
        final EditText Res22_43_2set = view.findViewById(R.id.cup64Res22_43_2set);
        final EditText Res22_43_3set = view.findViewById(R.id.cup64Res22_43_3set);
        final EditText Res22_22 = view.findViewById(R.id.cup64Res22_22);
        final EditText Res22_22_2set = view.findViewById(R.id.cup64Res22_22_2set);
        final EditText Res22_22_3set = view.findViewById(R.id.cup64Res22_22_3set);


        Res22_43.setVisibility(View.INVISIBLE);
        Res22_43_2set.setVisibility(View.INVISIBLE);
        Res22_43_3set.setVisibility(View.INVISIBLE);
        Res22_22.setVisibility(View.INVISIBLE);
        Res22_22_2set.setVisibility(View.INVISIBLE);
        Res22_22_3set.setVisibility(View.INVISIBLE);


        final EditText Res23_27 = view.findViewById(R.id.cup64Res23_27);
        final EditText Res23_27_2set = view.findViewById(R.id.cup64Res23_27_2set);
        final EditText Res23_27_3set = view.findViewById(R.id.cup64Res23_27_3set);
        final EditText Res23_38 = view.findViewById(R.id.cup64Res23_38);
        final EditText Res23_38_2set = view.findViewById(R.id.cup64Res23_38_2set);
        final EditText Res23_38_3set = view.findViewById(R.id.cup64Res23_38_3set);

        Res23_27.setVisibility(View.INVISIBLE);
        Res23_27_2set.setVisibility(View.INVISIBLE);
        Res23_27_3set.setVisibility(View.INVISIBLE);
        Res23_38.setVisibility(View.INVISIBLE);
        Res23_38_2set.setVisibility(View.INVISIBLE);
        Res23_38_3set.setVisibility(View.INVISIBLE);

        final EditText Res24_59 = view.findViewById(R.id.cup64Res24_59);
        final EditText Res24_59_2set = view.findViewById(R.id.cup64Res24_59_2set);
        final EditText Res24_59_3set = view.findViewById(R.id.cup64Res24_59_3set);
        final EditText Res24_6 = view.findViewById(R.id.cup64Res24_6);
        final EditText Res24_6_2set = view.findViewById(R.id.cup64Res24_6_2set);
        final EditText Res24_6_3set = view.findViewById(R.id.cup64Res24_6_3set);

        Res24_59.setVisibility(View.INVISIBLE);
        Res24_59_2set.setVisibility(View.INVISIBLE);
        Res24_59_3set.setVisibility(View.INVISIBLE);
        Res24_6.setVisibility(View.INVISIBLE);
        Res24_6_2set.setVisibility(View.INVISIBLE);
        Res24_6_3set.setVisibility(View.INVISIBLE);

        final EditText Res25_7 = view.findViewById(R.id.cup64Res25_7);
        final EditText Res25_7_2set = view.findViewById(R.id.cup64Res25_7_2set);
        final EditText Res25_7_3set = view.findViewById(R.id.cup64Res25_7_3set);
        final EditText Res25_58 = view.findViewById(R.id.cup64Res25_58);
        final EditText Res25_58_2set = view.findViewById(R.id.cup64Res25_58_2set);
        final EditText Res25_58_3set = view.findViewById(R.id.cup64Res25_58_3set);

        Res25_7.setVisibility(View.INVISIBLE);
        Res25_7_2set.setVisibility(View.INVISIBLE);
        Res25_7_3set.setVisibility(View.INVISIBLE);
        Res25_58.setVisibility(View.INVISIBLE);
        Res25_58_2set.setVisibility(View.INVISIBLE);
        Res25_58_3set.setVisibility(View.INVISIBLE);

        final EditText Res26_39 = view.findViewById(R.id.cup64Res26_39);
        final EditText Res26_39_2set = view.findViewById(R.id.cup64Res26_39_2set);
        final EditText Res26_39_3set = view.findViewById(R.id.cup64Res26_39_3set);
        final EditText Res26_26 = view.findViewById(R.id.cup64Res26_26);
        final EditText Res26_26_2set = view.findViewById(R.id.cup64Res26_26_2set);
        final EditText Res26_26_3set = view.findViewById(R.id.cup64Res26_26_3set);

        Res26_39.setVisibility(View.INVISIBLE);
        Res26_39_2set.setVisibility(View.INVISIBLE);
        Res26_39_3set.setVisibility(View.INVISIBLE);
        Res26_26.setVisibility(View.INVISIBLE);
        Res26_26_2set.setVisibility(View.INVISIBLE);
        Res26_26_3set.setVisibility(View.INVISIBLE);

        final EditText Res27_23 = view.findViewById(R.id.cup64Res27_23);
        final EditText Res27_23_2set = view.findViewById(R.id.cup64Res27_23_2set);
        final EditText Res27_23_3set = view.findViewById(R.id.cup64Res27_23_3set);
        final EditText Res27_42 = view.findViewById(R.id.cup64Res27_42);
        final EditText Res27_42_2set = view.findViewById(R.id.cup64Res27_42_2set);
        final EditText Res27_42_3set = view.findViewById(R.id.cup64Res27_42_3set);

        Res27_23.setVisibility(View.INVISIBLE);
        Res27_23_2set.setVisibility(View.INVISIBLE);
        Res27_23_3set.setVisibility(View.INVISIBLE);
        Res27_42.setVisibility(View.INVISIBLE);
        Res27_42_2set.setVisibility(View.INVISIBLE);
        Res27_42_3set.setVisibility(View.INVISIBLE);

        final EditText Res28_55 = view.findViewById(R.id.cup64Res28_55);
        final EditText Res28_55_2set = view.findViewById(R.id.cup64Res28_55_2set);
        final EditText Res28_55_3set = view.findViewById(R.id.cup64Res28_55_3set);
        final EditText Res28_10 = view.findViewById(R.id.cup64Res28_10);
        final EditText Res28_10_2set = view.findViewById(R.id.cup64Res28_10_2set);
        final EditText Res28_10_3set = view.findViewById(R.id.cup64Res28_10_3set);

        Res28_55.setVisibility(View.INVISIBLE);
        Res28_55_2set.setVisibility(View.INVISIBLE);
        Res28_55_3set.setVisibility(View.INVISIBLE);
        Res28_10.setVisibility(View.INVISIBLE);
        Res28_10_2set.setVisibility(View.INVISIBLE);
        Res28_10_3set.setVisibility(View.INVISIBLE);

        final EditText Res29_15 = view.findViewById(R.id.cup64Res29_15);
        final EditText Res29_15_2set = view.findViewById(R.id.cup64Res29_15_2set);
        final EditText Res29_15_3set = view.findViewById(R.id.cup64Res29_15_3set);
        final EditText Res29_50 = view.findViewById(R.id.cup64Res29_50);
        final EditText Res29_50_2set = view.findViewById(R.id.cup64Res29_50_2set);
        final EditText Res29_50_3set = view.findViewById(R.id.cup64Res29_50_3set);

        Res29_15.setVisibility(View.INVISIBLE);
        Res29_15_2set.setVisibility(View.INVISIBLE);
        Res29_15_3set.setVisibility(View.INVISIBLE);
        Res29_50.setVisibility(View.INVISIBLE);
        Res29_50_2set.setVisibility(View.INVISIBLE);
        Res29_50_3set.setVisibility(View.INVISIBLE);

        final EditText Res30_47 = view.findViewById(R.id.cup64Res30_47);
        final EditText Res30_47_2set = view.findViewById(R.id.cup64Res30_47_2set);
        final EditText Res30_47_3set = view.findViewById(R.id.cup64Res30_47_3set);
        final EditText Res30_18 = view.findViewById(R.id.cup64Res30_18);
        final EditText Res30_18_2set = view.findViewById(R.id.cup64Res30_18_2set);
        final EditText Res30_18_3set = view.findViewById(R.id.cup64Res30_18_3set);

        Res30_47.setVisibility(View.INVISIBLE);
        Res30_47_2set.setVisibility(View.INVISIBLE);
        Res30_47_3set.setVisibility(View.INVISIBLE);
        Res30_18.setVisibility(View.INVISIBLE);
        Res30_18_2set.setVisibility(View.INVISIBLE);
        Res30_18_3set.setVisibility(View.INVISIBLE);

        final EditText Res31_31 = view.findViewById(R.id.cup64Res31_31);
        final EditText Res31_31_2set = view.findViewById(R.id.cup64Res31_31_2set);
        final EditText Res31_31_3set = view.findViewById(R.id.cup64Res31_31_3set);
        final EditText Res31_34 = view.findViewById(R.id.cup64Res31_34);
        final EditText Res31_34_2set = view.findViewById(R.id.cup64Res31_34_2set);
        final EditText Res31_34_3set = view.findViewById(R.id.cup64Res31_34_3set);

        Res31_31.setVisibility(View.INVISIBLE);
        Res31_31_2set.setVisibility(View.INVISIBLE);
        Res31_31_3set.setVisibility(View.INVISIBLE);
        Res31_34.setVisibility(View.INVISIBLE);
        Res31_34_2set.setVisibility(View.INVISIBLE);
        Res31_34_3set.setVisibility(View.INVISIBLE);

        final EditText Res32_63 = view.findViewById(R.id.cup64Res32_63);
        final EditText Res32_63_2set = view.findViewById(R.id.cup64Res32_63_2set);
        final EditText Res32_63_3set = view.findViewById(R.id.cup64Res32_63_3set);
        final EditText Res32_2 = view.findViewById(R.id.cup64Res32_2);
        final EditText Res32_2_2set = view.findViewById(R.id.cup64Res32_2_2set);
        final EditText Res32_2_3set = view.findViewById(R.id.cup64Res32_2_3set);

        Res32_63.setVisibility(View.INVISIBLE);
        Res32_63_2set.setVisibility(View.INVISIBLE);
        Res32_63_3set.setVisibility(View.INVISIBLE);
        Res32_2.setVisibility(View.INVISIBLE);
        Res32_2_2set.setVisibility(View.INVISIBLE);
        Res32_2_3set.setVisibility(View.INVISIBLE);


        final EditText Res33_Win_1 = view.findViewById(R.id.cup64Res33_Win_1);
        final EditText Res33_Win_1_2set = view.findViewById(R.id.cup64Res33_Win_1_2set);
        final EditText Res33_Win_1_3set = view.findViewById(R.id.cup64Res33_Win_1_3set);
        final EditText Res33_Win_2 = view.findViewById(R.id.cup64Res33_Win_2);
        final EditText Res33_Win_2_2set = view.findViewById(R.id.cup64Res33_Win_2_2set);
        final EditText Res33_Win_2_3set = view.findViewById(R.id.cup64Res33_Win_2_3set);

        Res33_Win_1.setVisibility(View.INVISIBLE);
        Res33_Win_1_2set.setVisibility(View.INVISIBLE);
        Res33_Win_1_3set.setVisibility(View.INVISIBLE);
        Res33_Win_2.setVisibility(View.INVISIBLE);
        Res33_Win_2_2set.setVisibility(View.INVISIBLE);
        Res33_Win_2_3set.setVisibility(View.INVISIBLE);


        final EditText Res34_Win_3 = view.findViewById(R.id.cup64Res34_Win_3);
        final EditText Res34_Win_3_2set = view.findViewById(R.id.cup64Res34_Win_3_2set);
        final EditText Res34_Win_3_3set = view.findViewById(R.id.cup64Res34_Win_3_3set);
        final EditText Res34_Win_4 = view.findViewById(R.id.cup64Res34_Win_4);
        final EditText Res34_Win_4_2set = view.findViewById(R.id.cup64Res34_Win_4_2set);
        final EditText Res34_Win_4_3set = view.findViewById(R.id.cup64Res34_Win_4_3set);

        Res34_Win_3.setVisibility(View.INVISIBLE);
        Res34_Win_3_2set.setVisibility(View.INVISIBLE);
        Res34_Win_3_3set.setVisibility(View.INVISIBLE);
        Res34_Win_4.setVisibility(View.INVISIBLE);
        Res34_Win_4_2set.setVisibility(View.INVISIBLE);
        Res34_Win_4_3set.setVisibility(View.INVISIBLE);


        final EditText Res35_Win_5 = view.findViewById(R.id.cup64Res35_Win_5);
        final EditText Res35_Win_5_2set = view.findViewById(R.id.cup64Res35_Win_5_2set);
        final EditText Res35_Win_5_3set = view.findViewById(R.id.cup64Res35_Win_5_3set);
        final EditText Res35_Win_6 = view.findViewById(R.id.cup64Res35_Win_6);
        final EditText Res35_Win_6_2set = view.findViewById(R.id.cup64Res35_Win_6_2set);
        final EditText Res35_Win_6_3set = view.findViewById(R.id.cup64Res35_Win_6_3set);

        Res35_Win_5.setVisibility(View.INVISIBLE);
        Res35_Win_5_2set.setVisibility(View.INVISIBLE);
        Res35_Win_5_3set.setVisibility(View.INVISIBLE);
        Res35_Win_6.setVisibility(View.INVISIBLE);
        Res35_Win_6_2set.setVisibility(View.INVISIBLE);
        Res35_Win_6_3set.setVisibility(View.INVISIBLE);

        final EditText Res36_Win_7 = view.findViewById(R.id.cup64Res36_Win_7);
        final EditText Res36_Win_7_2set = view.findViewById(R.id.cup64Res36_Win_7_2set);
        final EditText Res36_Win_7_3set = view.findViewById(R.id.cup64Res36_Win_7_3set);
        final EditText Res36_Win_8 = view.findViewById(R.id.cup64Res36_Win_8);
        final EditText Res36_Win_8_2set = view.findViewById(R.id.cup64Res36_Win_8_2set);
        final EditText Res36_Win_8_3set = view.findViewById(R.id.cup64Res36_Win_8_3set);

        Res36_Win_7.setVisibility(View.INVISIBLE);
        Res36_Win_7_2set.setVisibility(View.INVISIBLE);
        Res36_Win_7_3set.setVisibility(View.INVISIBLE);
        Res36_Win_8.setVisibility(View.INVISIBLE);
        Res36_Win_8_2set.setVisibility(View.INVISIBLE);
        Res36_Win_8_3set.setVisibility(View.INVISIBLE);

        final EditText Res37_Win_9 = view.findViewById(R.id.cup64Res37_Win_9);
        final EditText Res37_Win_9_2set = view.findViewById(R.id.cup64Res37_Win_9_2set);
        final EditText Res37_Win_9_3set = view.findViewById(R.id.cup64Res37_Win_9_3set);
        final EditText Res37_Win_10 = view.findViewById(R.id.cup64Res37_Win_10);
        final EditText Res37_Win_10_2set = view.findViewById(R.id.cup64Res37_Win_10_2set);
        final EditText Res37_Win_10_3set = view.findViewById(R.id.cup64Res37_Win_10_3set);

        Res37_Win_9.setVisibility(View.INVISIBLE);
        Res37_Win_9_2set.setVisibility(View.INVISIBLE);
        Res37_Win_9_3set.setVisibility(View.INVISIBLE);
        Res37_Win_10.setVisibility(View.INVISIBLE);
        Res37_Win_10_2set.setVisibility(View.INVISIBLE);
        Res37_Win_10_3set.setVisibility(View.INVISIBLE);

        final EditText Res38_Win_11 = view.findViewById(R.id.cup64Res38_Win_11);
        final EditText Res38_Win_11_2set = view.findViewById(R.id.cup64Res38_Win_11_2set);
        final EditText Res38_Win_11_3set = view.findViewById(R.id.cup64Res38_Win_11_3set);
        final EditText Res38_Win_12 = view.findViewById(R.id.cup64Res38_Win_12);
        final EditText Res38_Win_12_2set = view.findViewById(R.id.cup64Res38_Win_12_2set);
        final EditText Res38_Win_12_3set = view.findViewById(R.id.cup64Res38_Win_12_3set);

        Res38_Win_11.setVisibility(View.INVISIBLE);
        Res38_Win_11_2set.setVisibility(View.INVISIBLE);
        Res38_Win_11_3set.setVisibility(View.INVISIBLE);
        Res38_Win_12.setVisibility(View.INVISIBLE);
        Res38_Win_12_2set.setVisibility(View.INVISIBLE);
        Res38_Win_12_3set.setVisibility(View.INVISIBLE);

        final EditText Res39_Win_13 = view.findViewById(R.id.cup64Res39_Win_13);
        final EditText Res39_Win_13_2set = view.findViewById(R.id.cup64Res39_Win_13_2set);
        final EditText Res39_Win_13_3set = view.findViewById(R.id.cup64Res39_Win_13_3set);
        final EditText Res39_Win_14 = view.findViewById(R.id.cup64Res39_Win_14);
        final EditText Res39_Win_14_2set = view.findViewById(R.id.cup64Res39_Win_14_2set);
        final EditText Res39_Win_14_3set = view.findViewById(R.id.cup64Res39_Win_14_3set);

        Res39_Win_13.setVisibility(View.INVISIBLE);
        Res39_Win_13_2set.setVisibility(View.INVISIBLE);
        Res39_Win_13_3set.setVisibility(View.INVISIBLE);
        Res39_Win_14.setVisibility(View.INVISIBLE);
        Res39_Win_14_2set.setVisibility(View.INVISIBLE);
        Res39_Win_14_3set.setVisibility(View.INVISIBLE);

        final EditText Res40_Win_15 = view.findViewById(R.id.cup64Res40_Win_15);
        final EditText Res40_Win_15_2set = view.findViewById(R.id.cup64Res40_Win_15_2set);
        final EditText Res40_Win_15_3set = view.findViewById(R.id.cup64Res40_Win_15_3set);
        final EditText Res40_Win_16 = view.findViewById(R.id.cup64Res40_Win_16);
        final EditText Res40_Win_16_2set = view.findViewById(R.id.cup64Res40_Win_16_2set);
        final EditText Res40_Win_16_3set = view.findViewById(R.id.cup64Res40_Win_16_3set);

        Res40_Win_15.setVisibility(View.INVISIBLE);
        Res40_Win_15_2set.setVisibility(View.INVISIBLE);
        Res40_Win_15_3set.setVisibility(View.INVISIBLE);
        Res40_Win_16.setVisibility(View.INVISIBLE);
        Res40_Win_16_2set.setVisibility(View.INVISIBLE);
        Res40_Win_16_3set.setVisibility(View.INVISIBLE);

        final EditText Res41_Win_17 = view.findViewById(R.id.cup64Res41_Win_17);
        final EditText Res41_Win_17_2set = view.findViewById(R.id.cup64Res41_Win_17_2set);
        final EditText Res41_Win_17_3set = view.findViewById(R.id.cup64Res41_Win_17_3set);
        final EditText Res41_Win_18 = view.findViewById(R.id.cup64Res41_Win_18);
        final EditText Res41_Win_18_2set = view.findViewById(R.id.cup64Res41_Win_18_2set);
        final EditText Res41_Win_18_3set = view.findViewById(R.id.cup64Res41_Win_18_3set);

        Res41_Win_17.setVisibility(View.INVISIBLE);
        Res41_Win_17_2set.setVisibility(View.INVISIBLE);
        Res41_Win_17_3set.setVisibility(View.INVISIBLE);
        Res41_Win_18.setVisibility(View.INVISIBLE);
        Res41_Win_18_2set.setVisibility(View.INVISIBLE);
        Res41_Win_18_3set.setVisibility(View.INVISIBLE);

        final EditText Res42_Win_19 = view.findViewById(R.id.cup64Res42_Win_19);
        final EditText Res42_Win_19_2set = view.findViewById(R.id.cup64Res42_Win_19_2set);
        final EditText Res42_Win_19_3set = view.findViewById(R.id.cup64Res42_Win_19_3set);
        final EditText Res42_Win_20 = view.findViewById(R.id.cup64Res42_Win_20);
        final EditText Res42_Win_20_2set = view.findViewById(R.id.cup64Res42_Win_20_2set);
        final EditText Res42_Win_20_3set = view.findViewById(R.id.cup64Res42_Win_20_3set);

        Res42_Win_19.setVisibility(View.INVISIBLE);
        Res42_Win_19_2set.setVisibility(View.INVISIBLE);
        Res42_Win_19_3set.setVisibility(View.INVISIBLE);
        Res42_Win_20.setVisibility(View.INVISIBLE);
        Res42_Win_20_2set.setVisibility(View.INVISIBLE);
        Res42_Win_20_3set.setVisibility(View.INVISIBLE);

        final EditText Res43_Win_21 = view.findViewById(R.id.cup64Res43_Win_21);
        final EditText Res43_Win_21_2set = view.findViewById(R.id.cup64Res43_Win_21_2set);
        final EditText Res43_Win_21_3set = view.findViewById(R.id.cup64Res43_Win_21_3set);
        final EditText Res43_Win_22 = view.findViewById(R.id.cup64Res43_Win_22);
        final EditText Res43_Win_22_2set = view.findViewById(R.id.cup64Res43_Win_22_2set);
        final EditText Res43_Win_22_3set = view.findViewById(R.id.cup64Res43_Win_22_3set);

        Res43_Win_21.setVisibility(View.INVISIBLE);
        Res43_Win_21_2set.setVisibility(View.INVISIBLE);
        Res43_Win_21_3set.setVisibility(View.INVISIBLE);
        Res43_Win_22.setVisibility(View.INVISIBLE);
        Res43_Win_22_2set.setVisibility(View.INVISIBLE);
        Res43_Win_22_3set.setVisibility(View.INVISIBLE);

        final EditText Res44_Win_23 = view.findViewById(R.id.cup64Res44_Win_23);
        final EditText Res44_Win_23_2set = view.findViewById(R.id.cup64Res44_Win_23_2set);
        final EditText Res44_Win_23_3set = view.findViewById(R.id.cup64Res44_Win_23_3set);
        final EditText Res44_Win_24 = view.findViewById(R.id.cup64Res44_Win_24);
        final EditText Res44_Win_24_2set = view.findViewById(R.id.cup64Res44_Win_24_2set);
        final EditText Res44_Win_24_3set = view.findViewById(R.id.cup64Res44_Win_24_3set);

        Res44_Win_23.setVisibility(View.INVISIBLE);
        Res44_Win_23_2set.setVisibility(View.INVISIBLE);
        Res44_Win_23_3set.setVisibility(View.INVISIBLE);
        Res44_Win_24.setVisibility(View.INVISIBLE);
        Res44_Win_24_2set.setVisibility(View.INVISIBLE);
        Res44_Win_24_3set.setVisibility(View.INVISIBLE);

        final EditText Res45_Win_25 = view.findViewById(R.id.cup64Res45_Win_25);
        final EditText Res45_Win_25_2set = view.findViewById(R.id.cup64Res45_Win_25_2set);
        final EditText Res45_Win_25_3set = view.findViewById(R.id.cup64Res45_Win_25_3set);
        final EditText Res45_Win_26 = view.findViewById(R.id.cup64Res45_Win_26);
        final EditText Res45_Win_26_2set = view.findViewById(R.id.cup64Res45_Win_26_2set);
        final EditText Res45_Win_26_3set = view.findViewById(R.id.cup64Res45_Win_26_3set);

        Res45_Win_25.setVisibility(View.INVISIBLE);
        Res45_Win_25_2set.setVisibility(View.INVISIBLE);
        Res45_Win_25_3set.setVisibility(View.INVISIBLE);
        Res45_Win_26.setVisibility(View.INVISIBLE);
        Res45_Win_26_2set.setVisibility(View.INVISIBLE);
        Res45_Win_26_3set.setVisibility(View.INVISIBLE);

        final EditText Res46_Win_27 = view.findViewById(R.id.cup64Res46_Win_27);
        final EditText Res46_Win_27_2set = view.findViewById(R.id.cup64Res46_Win_27_2set);
        final EditText Res46_Win_27_3set = view.findViewById(R.id.cup64Res46_Win_27_3set);
        final EditText Res46_Win_28 = view.findViewById(R.id.cup64Res46_Win_28);
        final EditText Res46_Win_28_2set = view.findViewById(R.id.cup64Res46_Win_28_2set);
        final EditText Res46_Win_28_3set = view.findViewById(R.id.cup64Res46_Win_28_3set);

        Res46_Win_27.setVisibility(View.INVISIBLE);
        Res46_Win_27_2set.setVisibility(View.INVISIBLE);
        Res46_Win_27_3set.setVisibility(View.INVISIBLE);
        Res46_Win_28.setVisibility(View.INVISIBLE);
        Res46_Win_28_2set.setVisibility(View.INVISIBLE);
        Res46_Win_28_3set.setVisibility(View.INVISIBLE);

        final EditText Res47_Win_29 = view.findViewById(R.id.cup64Res47_Win_29);
        final EditText Res47_Win_29_2set = view.findViewById(R.id.cup64Res47_Win_29_2set);
        final EditText Res47_Win_29_3set = view.findViewById(R.id.cup64Res47_Win_29_3set);
        final EditText Res47_Win_30 = view.findViewById(R.id.cup64Res47_Win_30);
        final EditText Res47_Win_30_2set = view.findViewById(R.id.cup64Res47_Win_30_2set);
        final EditText Res47_Win_30_3set = view.findViewById(R.id.cup64Res47_Win_30_3set);

        Res47_Win_29.setVisibility(View.INVISIBLE);
        Res47_Win_29_2set.setVisibility(View.INVISIBLE);
        Res47_Win_29_3set.setVisibility(View.INVISIBLE);
        Res47_Win_30.setVisibility(View.INVISIBLE);
        Res47_Win_30_2set.setVisibility(View.INVISIBLE);
        Res47_Win_30_3set.setVisibility(View.INVISIBLE);

        final EditText Res48_Win_31 = view.findViewById(R.id.cup64Res48_Win_31);
        final EditText Res48_Win_31_2set = view.findViewById(R.id.cup64Res48_Win_31_2set);
        final EditText Res48_Win_31_3set = view.findViewById(R.id.cup64Res48_Win_31_3set);
        final EditText Res48_Win_32 = view.findViewById(R.id.cup64Res48_Win_32);
        final EditText Res48_Win_32_2set = view.findViewById(R.id.cup64Res48_Win_32_2set);
        final EditText Res48_Win_32_3set = view.findViewById(R.id.cup64Res48_Win_32_3set);

        Res48_Win_31.setVisibility(View.INVISIBLE);
        Res48_Win_31_2set.setVisibility(View.INVISIBLE);
        Res48_Win_31_3set.setVisibility(View.INVISIBLE);
        Res48_Win_32.setVisibility(View.INVISIBLE);
        Res48_Win_32_2set.setVisibility(View.INVISIBLE);
        Res48_Win_32_3set.setVisibility(View.INVISIBLE);

        final EditText Res49_Win_33 = view.findViewById(R.id.cup64Res_49_Win_33);
        final EditText Res49_Win_33_2set = view.findViewById(R.id.cup64Res_49_Win_33_2set);
        final EditText Res49_Win_33_3set = view.findViewById(R.id.cup64Res_49_Win_33_3set);
        final EditText Res49_Win_34 = view.findViewById(R.id.cup64Res_49_Win_34);
        final EditText Res49_Win_34_2set = view.findViewById(R.id.cup64Res_49_Win_34_2set);
        final EditText Res49_Win_34_3set = view.findViewById(R.id.cup64Res_49_Win_34_3set);

        Res49_Win_33.setVisibility(View.INVISIBLE);
        Res49_Win_33_2set.setVisibility(View.INVISIBLE);
        Res49_Win_33_3set.setVisibility(View.INVISIBLE);
        Res49_Win_34.setVisibility(View.INVISIBLE);
        Res49_Win_34_2set.setVisibility(View.INVISIBLE);
        Res49_Win_34_3set.setVisibility(View.INVISIBLE);

        final EditText Res50_Win_35 = view.findViewById(R.id.cup64Res_50_Win_35);
        final EditText Res50_Win_35_2set = view.findViewById(R.id.cup64Res_50_Win_35_2set);
        final EditText Res50_Win_35_3set = view.findViewById(R.id.cup64Res_50_Win_35_3set);
        final EditText Res50_Win_36 = view.findViewById(R.id.cup64Res_50_Win_36);
        final EditText Res50_Win_36_2set = view.findViewById(R.id.cup64Res_50_Win_36_2set);
        final EditText Res50_Win_36_3set = view.findViewById(R.id.cup64Res_50_Win_36_3set);

        Res50_Win_35.setVisibility(View.INVISIBLE);
        Res50_Win_35_2set.setVisibility(View.INVISIBLE);
        Res50_Win_35_3set.setVisibility(View.INVISIBLE);
        Res50_Win_36.setVisibility(View.INVISIBLE);
        Res50_Win_36_2set.setVisibility(View.INVISIBLE);
        Res50_Win_36_3set.setVisibility(View.INVISIBLE);

        final EditText Res51_Win_37 = view.findViewById(R.id.cup64Res_51_Win_37);
        final EditText Res51_Win_37_2set = view.findViewById(R.id.cup64Res_51_Win_37_2set);
        final EditText Res51_Win_37_3set = view.findViewById(R.id.cup64Res_51_Win_37_3set);
        final EditText Res51_Win_38 = view.findViewById(R.id.cup64Res_51_Win_38);
        final EditText Res51_Win_38_2set = view.findViewById(R.id.cup64Res_51_Win_38_2set);
        final EditText Res51_Win_38_3set = view.findViewById(R.id.cup64Res_51_Win_38_3set);

        Res51_Win_37.setVisibility(View.INVISIBLE);
        Res51_Win_37_2set.setVisibility(View.INVISIBLE);
        Res51_Win_37_3set.setVisibility(View.INVISIBLE);
        Res51_Win_38.setVisibility(View.INVISIBLE);
        Res51_Win_38_2set.setVisibility(View.INVISIBLE);
        Res51_Win_38_3set.setVisibility(View.INVISIBLE);

        final EditText Res52_Win_39 = view.findViewById(R.id.cup64Res_52_Win_39);
        final EditText Res52_Win_39_2set = view.findViewById(R.id.cup64Res_52_Win_39_2set);
        final EditText Res52_Win_39_3set = view.findViewById(R.id.cup64Res_52_Win_39_3set);
        final EditText Res52_Win_40 = view.findViewById(R.id.cup64Res_52_Win_40);
        final EditText Res52_Win_40_2set = view.findViewById(R.id.cup64Res_52_Win_40_2set);
        final EditText Res52_Win_40_3set = view.findViewById(R.id.cup64Res_52_Win_40_3set);

        Res52_Win_39.setVisibility(View.INVISIBLE);
        Res52_Win_39_2set.setVisibility(View.INVISIBLE);
        Res52_Win_39_3set.setVisibility(View.INVISIBLE);
        Res52_Win_40.setVisibility(View.INVISIBLE);
        Res52_Win_40_2set.setVisibility(View.INVISIBLE);
        Res52_Win_40_3set.setVisibility(View.INVISIBLE);


        final EditText Res53_Win_41 = view.findViewById(R.id.cup64Res_53_Win_41);
        final EditText Res53_Win_41_2set = view.findViewById(R.id.cup64Res_53_Win_41_2set);
        final EditText Res53_Win_41_3set = view.findViewById(R.id.cup64Res_53_Win_41_3set);
        final EditText Res53_Win_42 = view.findViewById(R.id.cup64Res_53_Win_42);
        final EditText Res53_Win_42_2set = view.findViewById(R.id.cup64Res_53_Win_42_2set);
        final EditText Res53_Win_42_3set = view.findViewById(R.id.cup64Res_53_Win_42_3set);

        Res53_Win_41.setVisibility(View.INVISIBLE);
        Res53_Win_41_2set.setVisibility(View.INVISIBLE);
        Res53_Win_41_3set.setVisibility(View.INVISIBLE);
        Res53_Win_42.setVisibility(View.INVISIBLE);
        Res53_Win_42_2set.setVisibility(View.INVISIBLE);
        Res53_Win_42_3set.setVisibility(View.INVISIBLE);

        final EditText Res54_Win_43 = view.findViewById(R.id.cup64Res_54_Win_43);
        final EditText Res54_Win_43_2set = view.findViewById(R.id.cup64Res_54_Win_43_2set);
        final EditText Res54_Win_43_3set = view.findViewById(R.id.cup64Res_54_Win_43_3set);
        final EditText Res54_Win_44 = view.findViewById(R.id.cup64Res_54_Win_44);
        final EditText Res54_Win_44_2set = view.findViewById(R.id.cup64Res_54_Win_44_2set);
        final EditText Res54_Win_44_3set = view.findViewById(R.id.cup64Res_54_Win_44_3set);

        Res54_Win_43.setVisibility(View.INVISIBLE);
        Res54_Win_43_2set.setVisibility(View.INVISIBLE);
        Res54_Win_43_3set.setVisibility(View.INVISIBLE);
        Res54_Win_44.setVisibility(View.INVISIBLE);
        Res54_Win_44_2set.setVisibility(View.INVISIBLE);
        Res54_Win_44_3set.setVisibility(View.INVISIBLE);

        final EditText Res55_Win_45 = view.findViewById(R.id.cup64Res_55_Win_45);
        final EditText Res55_Win_45_2set = view.findViewById(R.id.cup64Res_55_Win_45_2set);
        final EditText Res55_Win_45_3set = view.findViewById(R.id.cup64Res_55_Win_45_3set);
        final EditText Res55_Win_46 = view.findViewById(R.id.cup64Res_55_Win_46);
        final EditText Res55_Win_46_2set = view.findViewById(R.id.cup64Res_55_Win_46_2set);
        final EditText Res55_Win_46_3set = view.findViewById(R.id.cup64Res_55_Win_46_3set);

        Res55_Win_45.setVisibility(View.INVISIBLE);
        Res55_Win_45_2set.setVisibility(View.INVISIBLE);
        Res55_Win_45_3set.setVisibility(View.INVISIBLE);
        Res55_Win_46.setVisibility(View.INVISIBLE);
        Res55_Win_46_2set.setVisibility(View.INVISIBLE);
        Res55_Win_46_3set.setVisibility(View.INVISIBLE);

        final EditText Res56_Win_47 = view.findViewById(R.id.cup64Res_56_Win_47);
        final EditText Res56_Win_47_2set = view.findViewById(R.id.cup64Res_56_Win_47_2set);
        final EditText Res56_Win_47_3set = view.findViewById(R.id.cup64Res_56_Win_47_3set);
        final EditText Res56_Win_48 = view.findViewById(R.id.cup64Res_56_Win_48);
        final EditText Res56_Win_48_2set = view.findViewById(R.id.cup64Res_56_Win_48_2set);
        final EditText Res56_Win_48_3set = view.findViewById(R.id.cup64Res_56_Win_48_3set);

        Res56_Win_47.setVisibility(View.INVISIBLE);
        Res56_Win_47_2set.setVisibility(View.INVISIBLE);
        Res56_Win_47_3set.setVisibility(View.INVISIBLE);
        Res56_Win_48.setVisibility(View.INVISIBLE);
        Res56_Win_48_2set.setVisibility(View.INVISIBLE);
        Res56_Win_48_3set.setVisibility(View.INVISIBLE);



        final Button team1 = view.findViewById(R.id.cup64Team01);
        final Button team2 = view.findViewById(R.id.cup64Team2);
        final Button team3 = view.findViewById(R.id.cup64Team3);
        final Button team4 = view.findViewById(R.id.cup64Team4);
        final Button team5 = view.findViewById(R.id.cup64Team5);
        final Button team6 = view.findViewById(R.id.cup64Team6);
        final Button team7 = view.findViewById(R.id.cup64Team7);
        final Button team8 = view.findViewById(R.id.cup64Team8);
        final Button team9 = view.findViewById(R.id.cup64Team9);
        final Button team10 = view.findViewById(R.id.cup64Team10);
        final Button team11 = view.findViewById(R.id.cup64Team11);
        final Button team12 = view.findViewById(R.id.cup64Team12);
        final Button team13 = view.findViewById(R.id.cup64Team13);
        final Button team14 = view.findViewById(R.id.cup64Team14);
        final Button team15 = view.findViewById(R.id.cup64Team15);
        final Button team16 = view.findViewById(R.id.cup64Team16);
        final Button team17 = view.findViewById(R.id.cup64Team17);
        final Button team18 = view.findViewById(R.id.cup64Team18);
        final Button team19 = view.findViewById(R.id.cup64Team19);
        final Button team20 = view.findViewById(R.id.cup64Team20);
        final Button team21 = view.findViewById(R.id.cup64Team21);
        final Button team22 = view.findViewById(R.id.cup64Team22);
        final Button team23 = view.findViewById(R.id.cup64Team23);
        final Button team24 = view.findViewById(R.id.cup64Team24);
        final Button team25 = view.findViewById(R.id.cup64Team25);
        final Button team26 = view.findViewById(R.id.cup64Team26);
        final Button team27 = view.findViewById(R.id.cup64Team27);
        final Button team28 = view.findViewById(R.id.cup64Team28);
        final Button team29 = view.findViewById(R.id.cup64Team29);
        final Button team30 = view.findViewById(R.id.cup64Team30);
        final Button team31 = view.findViewById(R.id.cup64Team31);
        final Button team32 = view.findViewById(R.id.cup64Team32);
        final Button team33 = view.findViewById(R.id.cup64Team33);
        final Button team34 = view.findViewById(R.id.cup64Team34);
        final Button team35 = view.findViewById(R.id.cup64Team35);
        final Button team36 = view.findViewById(R.id.cup64Team36);
        final Button team37 = view.findViewById(R.id.cup64Team37);
        final Button team38 = view.findViewById(R.id.cup64Team38);
        final Button team39 = view.findViewById(R.id.cup64Team39);
        final Button team40 = view.findViewById(R.id.cup64Team40);
        final Button team41 = view.findViewById(R.id.cup64Team41);
        final Button team42 = view.findViewById(R.id.cup64Team42);
        final Button team43 = view.findViewById(R.id.cup64Team43);
        final Button team44 = view.findViewById(R.id.cup64Team44);
        final Button team45 = view.findViewById(R.id.cup64Team45);
        final Button team46 = view.findViewById(R.id.cup64Team46);
        final Button team47 = view.findViewById(R.id.cup64Team47);
        final Button team48 = view.findViewById(R.id.cup64Team48);
        final Button team49 = view.findViewById(R.id.cup64Team49);
        final Button team50 = view.findViewById(R.id.cup64Team50);
        final Button team51 = view.findViewById(R.id.cup64Team51);
        final Button team52 = view.findViewById(R.id.cup64Team52);
        final Button team53 = view.findViewById(R.id.cup64Team53);
        final Button team54 = view.findViewById(R.id.cup64Team54);
        final Button team55 = view.findViewById(R.id.cup64Team55);
        final Button team56 = view.findViewById(R.id.cup64Team56);
        final Button team57 = view.findViewById(R.id.cup64Team57);
        final Button team58 = view.findViewById(R.id.cup64Team58);
        final Button team59 = view.findViewById(R.id.cup64Team59);
        final Button team60 = view.findViewById(R.id.cup64Team60);
        final Button team61 = view.findViewById(R.id.cup64Team61);
        final Button team62 = view.findViewById(R.id.cup64Team62);
        final Button team63 = view.findViewById(R.id.cup64Team63);
        final Button team64 = view.findViewById(R.id.cup64Team64);

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
        team33.setText(getActivity().getIntent().getStringExtra("NameOfTeam41"));
        team34.setText(getActivity().getIntent().getStringExtra("NameOfTeam42"));
        team35.setText(getActivity().getIntent().getStringExtra("NameOfTeam43"));
        team36.setText(getActivity().getIntent().getStringExtra("NameOfTeam44"));
        team37.setText(getActivity().getIntent().getStringExtra("NameOfTeam45"));
        team38.setText(getActivity().getIntent().getStringExtra("NameOfTeam46"));
        team39.setText(getActivity().getIntent().getStringExtra("NameOfTeam47"));
        team40.setText(getActivity().getIntent().getStringExtra("NameOfTeam48"));
        team41.setText(getActivity().getIntent().getStringExtra("NameOfTeam49"));
        team42.setText(getActivity().getIntent().getStringExtra("NameOfTeam50"));
        team43.setText(getActivity().getIntent().getStringExtra("NameOfTeam51"));
        team44.setText(getActivity().getIntent().getStringExtra("NameOfTeam52"));
        team45.setText(getActivity().getIntent().getStringExtra("NameOfTeam53"));
        team46.setText(getActivity().getIntent().getStringExtra("NameOfTeam54"));
        team47.setText(getActivity().getIntent().getStringExtra("NameOfTeam55"));
        team48.setText(getActivity().getIntent().getStringExtra("NameOfTeam56"));
        team49.setText(getActivity().getIntent().getStringExtra("NameOfTeam57"));
        team50.setText(getActivity().getIntent().getStringExtra("NameOfTeam58"));
        team51.setText(getActivity().getIntent().getStringExtra("NameOfTeam59"));
        team52.setText(getActivity().getIntent().getStringExtra("NameOfTeam60"));
        team53.setText(getActivity().getIntent().getStringExtra("NameOfTeam61"));
        team54.setText(getActivity().getIntent().getStringExtra("NameOfTeam62"));
        team55.setText(getActivity().getIntent().getStringExtra("NameOfTeam63"));
        team56.setText(getActivity().getIntent().getStringExtra("NameOfTeam64"));
        team57.setText(getActivity().getIntent().getStringExtra("NameOfTeam65"));
        team58.setText(getActivity().getIntent().getStringExtra("NameOfTeam66"));
        team59.setText(getActivity().getIntent().getStringExtra("NameOfTeam67"));
        team60.setText(getActivity().getIntent().getStringExtra("NameOfTeam68"));
        team61.setText(getActivity().getIntent().getStringExtra("NameOfTeam69"));
        team62.setText(getActivity().getIntent().getStringExtra("NameOfTeam70"));
        team63.setText(getActivity().getIntent().getStringExtra("NameOfTeam71"));
        team64.setText(getActivity().getIntent().getStringExtra("NameOfTeam72"));



        final Button win1 = view.findViewById(R.id.cup64WIN_1);
        final Button win2 = view.findViewById(R.id.cup64WIN_2);
        final Button win3 = view.findViewById(R.id.cup64WIN_3);
        final Button win4 = view.findViewById(R.id.cup64WIN_4);
        final Button win5 = view.findViewById(R.id.cup64WIN_5);
        final Button win6 = view.findViewById(R.id.cup64WIN_6);
        final Button win7 = view.findViewById(R.id.cup64WIN_7);
        final Button win8 = view.findViewById(R.id.cup64WIN_8);
        final Button win9 = view.findViewById(R.id.cup64WIN_9);
        final Button win10 = view.findViewById(R.id.cup64WIN_10);
        final Button win11 = view.findViewById(R.id.cup64WIN_11);
        final Button win12 = view.findViewById(R.id.cup64WIN_12);
        final Button win13 = view.findViewById(R.id.cup64WIN_13);
        final Button win14 = view.findViewById(R.id.cup64WIN_14);
        final Button win15 = view.findViewById(R.id.cup64WIN_15);
        final Button win16 = view.findViewById(R.id.cup64WIN_16);
        final Button win17 = view.findViewById(R.id.cup64WIN_17);
        final Button win18 = view.findViewById(R.id.cup64WIN_18);
        final Button win19 = view.findViewById(R.id.cup64WIN_19);
        final Button win20 = view.findViewById(R.id.cup64WIN_20);
        final Button win21 = view.findViewById(R.id.cup64WIN_21);
        final Button win22 = view.findViewById(R.id.cup64WIN_22);
        final Button win23 = view.findViewById(R.id.cup64WIN_23);
        final Button win24 = view.findViewById(R.id.cup64WIN_24);

        final Button win25 = view.findViewById(R.id.cup64WIN_25);
        final Button win26 = view.findViewById(R.id.cup64WIN_26);
        final Button win27 = view.findViewById(R.id.cup64WIN_27);
        final Button win28 = view.findViewById(R.id.cup64WIN_28);
        final Button win29 = view.findViewById(R.id.cup64WIN_29);
        final Button win30 = view.findViewById(R.id.cup64WIN_30);
        final Button win31 = view.findViewById(R.id.cup64WIN_31);
        final Button win32 = view.findViewById(R.id.cup64WIN_32);
        final Button win33 = view.findViewById(R.id.cup64WIN_33);
        final Button win34 = view.findViewById(R.id.cup64WIN_34);
        final Button win35 = view.findViewById(R.id.cup64WIN_35);
        final Button win36 = view.findViewById(R.id.cup64WIN_36);
        final Button win37 = view.findViewById(R.id.cup64WIN_37);
        final Button win38 = view.findViewById(R.id.cup64WIN_38);
        final Button win39 = view.findViewById(R.id.cup64WIN_39);
        final Button win40 = view.findViewById(R.id.cup64WIN_40);
        final Button win41 = view.findViewById(R.id.cup64WIN_41);
        final Button win42 = view.findViewById(R.id.cup64WIN_42);
        final Button win43 = view.findViewById(R.id.cup64WIN_43);
        final Button win44 = view.findViewById(R.id.cup64WIN_44);
        final Button win45 = view.findViewById(R.id.cup64WIN_45);
        final Button win46 = view.findViewById(R.id.cup64WIN_46);
        final Button win47 = view.findViewById(R.id.cup64WIN_47);
        final Button win48 = view.findViewById(R.id.cup64WIN_48);

        win49 = view.findViewById(R.id.cup64WIN_49);
        win50 = view.findViewById(R.id.cup64WIN_50);
        win51 = view.findViewById(R.id.cup64WIN_51);
        win52 = view.findViewById(R.id.cup64WIN_52);
        win53 = view.findViewById(R.id.cup64WIN_53);
        win54 = view.findViewById(R.id.cup64WIN_54);
        win55 = view.findViewById(R.id.cup64WIN_55);
        win56 = view.findViewById(R.id.cup64WIN_56);


        setResultsForCup.withCheckWithoutLosser("E1", "E64", team1, team64, win1, Res1_1, Res1_1_2set, Res1_1_3set, Res1_64, Res1_64_2set, Res1_64_3set);

        setResultsForCup.withCheckWithoutLosser("E33","E32",team33,team32,win2,Res2_33,Res2_33_2set,Res2_33_3set,Res2_32,Res2_32_2set,Res2_32_3set);

        setResultsForCup.withCheckWithoutLosser("E17","E48",team17,team48,win3,Res3_17,Res3_17_2set,Res3_17_3set,Res3_48,Res3_48_2set,Res3_48_3set);

        setResultsForCup.withCheckWithoutLosser("E49","E16",team49,team16,win4,Res4_49,Res4_49_2set,Res4_49_3set,Res4_16,Res4_16_2set,Res4_16_3set);

        setResultsForCup.withCheckWithoutLosser("E9","E56",team9,team56,win5,Res5_9,Res5_9_2set,Res5_9_3set,Res5_56,Res5_56_2set,Res5_56_3set);

        setResultsForCup.withCheckWithoutLosser("E41","E24",team41,team24,win6,Res6_41,Res6_41_2set,Res6_41_3set,Res6_24,Res6_24_2set,Res6_24_3set);

        setResultsForCup.withCheckWithoutLosser("E25","E40",team25,team40,win7,Res7_25,Res7_25_2set,Res7_25_3set,Res7_40,Res7_40_2set,Res7_40_3set);

        setResultsForCup.withCheckWithoutLosser("E57","E8",team57,team8,win8,Res8_57,Res8_57_2set,Res8_57_3set,Res8_8,Res8_8_2set,Res8_8_3set);

        setResultsForCup.withCheckWithoutLosser("E5","E60",team5,team60,win9,Res9_5,Res9_5_2set,Res9_5_3set,Res9_60,Res9_60_2set,Res9_60_3set);

        setResultsForCup.withCheckWithoutLosser("E37","E28",team37,team28,win10,Res10_37,Res10_37_2set,Res10_37_3set,Res10_28,Res10_28_2set,Res10_28_3set);

        setResultsForCup.withCheckWithoutLosser("E21","E44",team21,team44,win11,Res11_21,Res11_21_2set,Res11_21_3set,Res11_44,Res11_44_2set,Res11_44_3set);

        setResultsForCup.withCheckWithoutLosser("E53","E12",team53,team12,win12,Res12_53,Res12_53_2set,Res12_53_3set,Res12_12,Res12_12_2set,Res12_12_3set);

        setResultsForCup.withCheckWithoutLosser("E13","E52",team13,team52,win13,Res13_13,Res13_13_2set,Res13_13_3set,Res13_52,Res13_52_2set,Res13_52_3set);

        setResultsForCup.withCheckWithoutLosser("E45","E20",team45,team20,win14,Res14_45,Res14_45_2set,Res14_45_3set,Res14_20,Res14_20_2set,Res14_20_3set);

        setResultsForCup.withCheckWithoutLosser("E29","E36",team29,team36,win15,Res15_29,Res15_29_2set,Res15_29_3set,Res15_36,Res15_36_2set,Res15_36_3set);

        setResultsForCup.withCheckWithoutLosser("E61","E4",team61,team4,win16,Res16_61,Res16_61_2set,Res16_61_3set,Res16_4,Res16_4_2set,Res16_4_3set);

        setResultsForCup.withCheckWithoutLosser("E3","E62",team3,team62,win17,Res17_3,Res17_3_2set,Res17_3_3set,Res17_62,Res17_62_2set,Res17_62_3set);

        setResultsForCup.withCheckWithoutLosser("E35","E30",team35,team30,win18,Res18_35,Res18_35_2set,Res18_35_3set,Res18_30,Res18_30_2set,Res18_30_3set);

        setResultsForCup.withCheckWithoutLosser("E19","E46",team19,team46,win19,Res19_19,Res19_19_2set,Res19_19_3set,Res19_46,Res19_46_2set,Res19_46_3set);

        setResultsForCup.withCheckWithoutLosser("E51","E14",team51,team14,win20,Res20_51,Res20_51_2set,Res20_51_3set,Res20_14,Res20_14_2set,Res20_14_3set);

        setResultsForCup.withCheckWithoutLosser("E11","E54",team11,team54,win21,Res21_11,Res21_11_2set,Res21_11_3set,Res21_54,Res21_54_2set,Res21_54_3set);

        setResultsForCup.withCheckWithoutLosser("E43","E22",team43,team22,win22,Res22_43,Res22_43_2set,Res22_43_3set,Res22_22,Res22_22_2set,Res22_22_3set);

        setResultsForCup.withCheckWithoutLosser("E27","E38",team27,team38,win23,Res23_27,Res23_27_2set,Res23_27_3set,Res23_38,Res23_38_2set,Res23_38_3set);

        setResultsForCup.withCheckWithoutLosser("E59","E6",team59,team6,win24,Res24_59,Res24_59_2set,Res24_59_3set,Res24_6,Res24_6_2set,Res24_6_3set);

        setResultsForCup.withCheckWithoutLosser("E7","E58",team7,team58,win25,Res25_7,Res25_7_2set,Res25_7_3set,Res25_58,Res25_58_2set,Res25_58_3set);

        setResultsForCup.withCheckWithoutLosser("E39","E26",team39,team26,win26,Res26_39,Res26_39_2set,Res26_39_3set,Res26_26,Res26_26_2set,Res26_26_3set);

        setResultsForCup.withCheckWithoutLosser("E23","E42",team23,team42,win27,Res27_23,Res27_23_2set,Res27_23_3set,Res27_42,Res27_42_2set,Res27_42_3set);

        setResultsForCup.withCheckWithoutLosser("E55","E10",team55,team10,win28,Res28_55,Res28_55_2set,Res28_55_3set,Res28_10,Res28_10_2set,Res28_10_3set);

        setResultsForCup.withCheckWithoutLosser("E15","E50",team15,team50,win29,Res29_15,Res29_15_2set,Res29_15_3set,Res29_50,Res29_50_2set,Res29_50_3set);

        setResultsForCup.withCheckWithoutLosser("E47","E18",team47,team18,win30,Res30_47,Res30_47_2set,Res30_47_3set,Res30_18,Res30_18_2set,Res30_18_3set);

        setResultsForCup.withCheckWithoutLosser("E31","E34",team31,team34,win31,Res31_31,Res31_31_2set,Res31_31_3set,Res31_34,Res31_34_2set,Res31_34_3set);

        setResultsForCup.withCheckWithoutLosser("E63","E2",team63,team2,win32,Res32_63,Res32_63_2set,Res32_63_3set,Res32_2,Res32_2_2set,Res32_2_3set);


        setResultsForCup.withoutLosserAndCheck(win1,win2,win33,Res33_Win_1,Res33_Win_1_2set,Res33_Win_1_3set,Res33_Win_2,Res33_Win_2_2set,Res33_Win_2_3set);

        setResultsForCup.withoutLosserAndCheck(win3,win4,win34,Res34_Win_3,Res34_Win_3_2set,Res34_Win_3_3set,Res34_Win_4,Res34_Win_4_2set,Res34_Win_4_3set);

        setResultsForCup.withoutLosserAndCheck(win5,win6,win35,Res35_Win_5,Res35_Win_5_2set,Res35_Win_5_3set,Res35_Win_6,Res35_Win_6_2set,Res35_Win_6_3set);

        setResultsForCup.withoutLosserAndCheck(win7,win8,win36,Res36_Win_7,Res36_Win_7_2set,Res36_Win_7_3set,Res36_Win_8,Res36_Win_8_2set,Res36_Win_8_3set);

        setResultsForCup.withoutLosserAndCheck(win9,win10,win37,Res37_Win_9,Res37_Win_9_2set,Res37_Win_9_3set,Res37_Win_10,Res37_Win_10_2set,Res37_Win_10_3set);

        setResultsForCup.withoutLosserAndCheck(win11,win12,win38,Res38_Win_11,Res38_Win_11_2set,Res38_Win_11_3set,Res38_Win_12,Res38_Win_12_2set,Res38_Win_12_3set);

        setResultsForCup.withoutLosserAndCheck(win13,win14,win39,Res39_Win_13,Res39_Win_13_2set,Res39_Win_13_3set,Res39_Win_14,Res39_Win_14_2set,Res39_Win_14_3set);

        setResultsForCup.withoutLosserAndCheck(win15,win16,win40,Res40_Win_15,Res40_Win_15_2set,Res40_Win_15_3set,Res40_Win_16,Res40_Win_16_2set,Res40_Win_16_3set);

        setResultsForCup.withoutLosserAndCheck(win17,win18,win41,Res41_Win_17,Res41_Win_17_2set,Res41_Win_17_3set,Res41_Win_18,Res41_Win_18_2set,Res41_Win_18_3set);

        setResultsForCup.withoutLosserAndCheck(win19,win20,win42,Res42_Win_19,Res42_Win_19_2set,Res42_Win_19_3set,Res42_Win_20,Res42_Win_20_2set,Res42_Win_20_3set);

        setResultsForCup.withoutLosserAndCheck(win21,win22,win43,Res43_Win_21,Res43_Win_21_2set,Res43_Win_21_3set,Res43_Win_22,Res43_Win_22_2set,Res43_Win_22_3set);

        setResultsForCup.withoutLosserAndCheck(win23,win24,win44,Res44_Win_23,Res44_Win_23_2set,Res44_Win_23_3set,Res44_Win_24,Res44_Win_24_2set,Res44_Win_24_3set);

        setResultsForCup.withoutLosserAndCheck(win25,win26,win45,Res45_Win_25,Res45_Win_25_2set,Res45_Win_25_3set,Res45_Win_26,Res45_Win_26_2set,Res45_Win_26_3set);

        setResultsForCup.withoutLosserAndCheck(win27,win28,win46,Res46_Win_27,Res46_Win_27_2set,Res46_Win_27_3set,Res46_Win_28,Res46_Win_28_2set,Res46_Win_28_3set);

        setResultsForCup.withoutLosserAndCheck(win29,win30,win47,Res47_Win_29,Res47_Win_29_2set,Res47_Win_29_3set,Res47_Win_30,Res47_Win_30_2set,Res47_Win_30_3set);

        setResultsForCup.withoutLosserAndCheck(win31,win32,win48,Res48_Win_31,Res48_Win_31_2set,Res48_Win_31_3set,Res48_Win_32,Res48_Win_32_2set,Res48_Win_32_3set);

        setResultsForCup.withoutLosserAndCheck(win33,win34,win49,Res49_Win_33,Res49_Win_33_2set,Res49_Win_33_3set,Res49_Win_34,Res49_Win_34_2set,Res49_Win_34_3set);

        setResultsForCup.withoutLosserAndCheck(win35,win36,win50,Res50_Win_35,Res50_Win_35_2set,Res50_Win_35_3set,Res50_Win_36,Res50_Win_36_2set,Res50_Win_36_3set);

        setResultsForCup.withoutLosserAndCheck(win37,win38,win51,Res51_Win_37,Res51_Win_37_2set,Res51_Win_37_3set,Res51_Win_38,Res51_Win_38_2set,Res51_Win_38_3set);

        setResultsForCup.withoutLosserAndCheck(win39,win40,win52,Res52_Win_39,Res52_Win_39_2set,Res52_Win_39_3set,Res52_Win_40,Res52_Win_40_2set,Res52_Win_40_3set);

        setResultsForCup.withoutLosserAndCheck(win41,win42,win53,Res53_Win_41,Res53_Win_41_2set,Res53_Win_41_3set,Res53_Win_42,Res53_Win_42_2set,Res53_Win_42_3set);

        setResultsForCup.withoutLosserAndCheck(win43,win44,win54,Res54_Win_43,Res54_Win_43_2set,Res54_Win_43_3set,Res54_Win_44,Res54_Win_44_2set,Res54_Win_44_3set);

        setResultsForCup.withoutLosserAndCheck(win45,win46,win55,Res55_Win_45,Res55_Win_45_2set,Res55_Win_45_3set,Res55_Win_46,Res55_Win_46_2set,Res55_Win_46_3set);

        setResultsForCup.withoutLosserAndCheck(win47,win48,win56,Res56_Win_47,Res56_Win_47_2set,Res56_Win_47_3set,Res56_Win_48,Res56_Win_48_2set,Res56_Win_48_3set);


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
                braz16.putExtra("NameOfTeam9",win49.getText().toString());
                braz16.putExtra("NameOfTeam10",win50.getText().toString());
                braz16.putExtra("NameOfTeam11",win51.getText().toString());
                braz16.putExtra("NameOfTeam12",win52.getText().toString());
                braz16.putExtra("NameOfTeam13",win53.getText().toString());
                braz16.putExtra("NameOfTeam14",win54.getText().toString());
                braz16.putExtra("NameOfTeam15",win55.getText().toString());
                braz16.putExtra("NameOfTeam16",win56.getText().toString());
                braz16.putExtra("OnlyWatch",onlyWatch);
                startActivity(braz16);
        }
        return super.onOptionsItemSelected(item);
    }



}




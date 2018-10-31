package com.example.adam.rozpiskimeczowe.cup.cup32;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adam.rozpiskimeczowe.R;

import java.util.Objects;

public class FragmentTabCup32_1 extends Fragment {
    Toast toast;
    InputMethodManager imm;
    String pktInSet = "21";
    String pktInTieBreak = "15";
    View view;
    ViewGroup vg;
    int numberOfMatches = 0;
    int actualMatch = 0;
    RelativeLayout relativeLayout;
    TextView[]numbersOfMatchesArray;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment_tab_cup32_1, container, false);

        imm = (InputMethodManager) Objects.requireNonNull(getActivity()).getSystemService(Context.INPUT_METHOD_SERVICE);

        relativeLayout = view.findViewById(R.id.cup32relLayout);
        this.vg = container;


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
        final Button win17 = view.findViewById(R.id.cup32WIN_17);
        final Button win18 = view.findViewById(R.id.cup32WIN_18);
        final Button win19 = view.findViewById(R.id.cup32WIN_19);
        final Button win20 = view.findViewById(R.id.cup32WIN_20);
        final Button win21 = view.findViewById(R.id.cup32WIN_21);
        final Button win22 = view.findViewById(R.id.cup32WIN_22);
        final Button win23 = view.findViewById(R.id.cup32WIN_23);
        final Button win24 = view.findViewById(R.id.cup32WIN_24);

        //Add NumberOfMatches
        numbersOfMatchesArray = new TextView[24];
        for(int i=0; i<numbersOfMatchesArray.length; i++) {
            String buttonID = "cup32numberOfMatch" + (i+1) ;
            int resID = getResources().getIdentifier(buttonID, "id", getActivity().getPackageName());
            numbersOfMatchesArray[i] = view.findViewById(resID);
        }

        setResult("E1","E32",team1,team32,win1,res1_1,res1_1_2set,res1_1_3set,res1_32,res1_32_2set,res1_32_3set);

        setResult("E17","E16",team17,team16,win2,res2_17,res2_17_2set,res2_17_3set,res2_16,res2_16_2set,res2_16_3set);

        setResult("E9","E24",team9,team24,win3,res3_9,res3_9_2set,res3_9_3set,res3_24,res3_24_2set,res3_24_3set);

        setResult("E25","E8",team25,team8,win4,res4_25,res4_25_2set,res4_25_3set,res4_8,res4_8_2set,res4_8_3set);

        setResult("E5","E28",team5,team28,win5,res5_5,res5_5_2set,res5_5_3set,res5_28,res5_28_2set,res5_28_3set);

        setResult("E21","E12",team21,team12,win6,res6_21,res6_21_2set,res6_21_3set,res6_12,res6_12_2set,res6_12_3set);

        setResult("E13","E20",team13,team20,win7,res7_13,res7_13_2set,res7_13_3set,res7_20,res7_20_2set,res7_20_3set);

        setResult("E29","E4",team29,team4,win8,res8_29,res8_29_2set,res8_29_3set,res8_4,res8_4_2set,res8_4_3set);

        setResult("E3","E30",team3,team30,win9,res9_3,res9_3_2set,res9_3_3set,res9_30,res9_30_2set,res9_30_3set);

        setResult("E19","E14",team19,team14,win10,res10_19,res10_19_2set,res10_19_3set,res10_14,res10_14_2set,res10_14_3set);

        setResult("E11","E22",team11,team22,win11,res11_11,res11_11_2set,res11_11_3set,res11_22,res11_22_2set,res11_22_3set);

        setResult("E27","E6",team27,team6,win12,res12_27,res12_27_2set,res12_27_3set,res12_6,res12_6_2set,res12_6_3set);

        setResult("E7","E26",team7,team26,win13,res13_7,res13_7_2set,res13_7_3set,res13_26,res13_26_2set,res13_26_3set);

        setResult("E23","E10",team23,team10,win14,res14_23,res14_23_2set,res14_23_3set,res14_10,res14_10_2set,res14_10_3set);

        setResult("E15","E18",team15,team18,win15,res15_15,res15_15_2set,res15_15_3set,res15_18,res15_18_2set,res15_18_3set);

        setResult("E31","E2",team31,team2,win16,res16_31,res16_31_2set,res16_31_3set,res16_2,res16_2_2set,res16_2_3set);


        setResult(win1,"WIN.1",win2,"WIN.2",win17,res17_Win_1,res17_Win_1_2set,res17_Win_1_3set,res17_Win_2,res17_Win_2_2set,res17_Win_2_3set);

        setResult(win3,"WIN.3",win4,"WIN.4",win18,res18_Win_3,res18_Win_3_2set,res18_Win_3_3set,res18_Win_4,res18_Win_4_2set,res18_Win_4_3set);

        setResult(win5,"WIN.5",win6,"WIN.6",win19,res19_Win_5,res19_Win_5_2set,res19_Win_5_3set,res19_Win_6,res19_Win_6_2set,res19_Win_6_3set);

        setResult(win7,"WIN.7",win8,"WIN.8",win20,res20_Win_7,res20_Win_7_2set,res20_Win_7_3set,res20_Win_8,res20_Win_8_2set,res20_Win_8_3set);

        setResult(win9,"WIN.9",win10,"WIN.10",win21,res21_Win_9,res21_Win_9_2set,res21_Win_9_3set,res21_Win_10,res21_Win_10_2set,res21_Win_10_3set);

        setResult(win11,"WIN.11",win12,"WIN.12",win22,res22_Win_11,res22_Win_11_2set,res22_Win_11_3set,res22_Win_12,res22_Win_12_2set,res22_Win_12_3set);

        setResult(win13,"WIN.13",win14,"WIN.14",win23,res23_Win_13,res23_Win_13_2set,res23_Win_13_3set,res23_Win_14,res23_Win_14_2set,res23_Win_14_3set);

        setResult(win15,"WIN.15",win16,"WIN.16",win24,res24_Win_15,res24_Win_15_2set,res24_Win_15_3set,res24_Win_16,res24_Win_16_2set,res24_Win_16_3set);




        toast = Toast.makeText(getActivity().getApplicationContext(), "Wprowadz wczesniejszy wynik !", Toast.LENGTH_SHORT);



        return view;
    }




    //Method to set Results to next Buttons without loser and check
    void setResult(final Button firstPlayer, final String firstPlayerString, final Button secundPlayer, final String secundPlayerString, final Button ResultButton, final EditText pointsFor1In1Set, final EditText pointsFor1In2Set, final EditText pointsFor1In3Set, final EditText pointsFor2In1Set, final EditText pointsFor2In2Set, final EditText pointsFor2In3Set) {
        final String undoResultString = "WIN."+(numberOfMatches+1);
        //Add NumberOfMatches
        numberOfMatches++;
        numbersOfMatchesArray[actualMatch].setText(String.valueOf(numberOfMatches));
        actualMatch++;
        ResultButton.setText(undoResultString);


        firstPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstPlayer.getText().equals(firstPlayerString) || secundPlayer.getText().equals(secundPlayerString)) {
                    toast.show();
                } else {
                    if (!pointsFor1In1Set.getText().toString().equals("")) {
                        Toast.makeText(getActivity().getApplicationContext(), "Wynik został już wprowadzony, jeśli chcesz go cofnąć przytrzymaj przycisk wygranego lub przegranego. Natomiast jeśli chcesz zobaczyć dokładny wynik, wejdz w zakladkę WYNIKI.", Toast.LENGTH_SHORT).show();
                    }else {
                        ResultButton.setText(firstPlayer.getText());
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
                        ResultButton.setText(secundPlayer.getText());
                        setDetailedResultFor2Sets(pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set, pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set);
                    }
                }

            }
        });

        ResultButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ResultButton.setText(undoResultString);
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


    void setResult(String EofFirstPlayer,String EofSecondPlayer,final Button firstPlayer, final Button secundPlayer, final Button ResultButton, final EditText pointsFor1In1Set, final EditText pointsFor1In2Set, final EditText pointsFor1In3Set, final EditText pointsFor2In1Set, final EditText pointsFor2In2Set, final EditText pointsFor2In3Set) {
        final String undoResultString = "WIN."+(numberOfMatches+1);
        //ADD E of Players
        if(firstPlayer.getText()==""){
            firstPlayer.setVisibility(View.INVISIBLE);
            secundPlayer.setVisibility(View.INVISIBLE);
            ResultButton.setText(secundPlayer.getText());


            //set the properties for textView
            TextView tv = new TextView(getActivity().getApplicationContext());

            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            lp.addRule(RelativeLayout.START_OF,ResultButton.getId());
            lp.addRule(RelativeLayout.ALIGN_BASELINE,ResultButton.getId());


            tv.setLayoutParams(lp);

            tv.setText(EofSecondPlayer);
            tv.setTextSize(16);
            tv.setTextColor(Color.BLACK);


            //add textView to the layout
            relativeLayout.addView(tv);

            int resID = getResources().getIdentifier("cup32"+EofFirstPlayer, "id", getActivity().getPackageName());
            TextView tvE = view.findViewById(resID);
            tvE.setVisibility(View.INVISIBLE);

            int resID2 = getResources().getIdentifier("cup32"+EofSecondPlayer, "id", getActivity().getPackageName());
            TextView tvE2 = view.findViewById(resID2);
            tvE2.setVisibility(View.INVISIBLE);
            //Add NumberOfMatches
            actualMatch++;


        }else if(secundPlayer.getText()==""){
            firstPlayer.setVisibility(View.INVISIBLE);
            secundPlayer.setVisibility(View.INVISIBLE);
            ResultButton.setText(firstPlayer.getText());



            //set the properties for textView
            TextView tv = new TextView(getActivity().getApplicationContext());

            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            lp.addRule(RelativeLayout.START_OF,ResultButton.getId());
            lp.addRule(RelativeLayout.ALIGN_BASELINE,ResultButton.getId());

            tv.setLayoutParams(lp);

            tv.setText(EofFirstPlayer);
            tv.setTextSize(16);
            tv.setTextColor(Color.BLACK);


            int resID = getResources().getIdentifier("cup32"+EofFirstPlayer, "id", getActivity().getPackageName());
            TextView tvE = view.findViewById(resID);
            tvE.setVisibility(View.INVISIBLE);

            int resID2 = getResources().getIdentifier("cup32"+EofSecondPlayer, "id", getActivity().getPackageName());
            TextView tvE2 = view.findViewById(resID2);
            tvE2.setVisibility(View.INVISIBLE);



            //add button to the layout
            relativeLayout.addView(tv);

            if(!(firstPlayer.getText()=="")) {
                actualMatch++;
            }

        }else {

            //Add NumberOfMatches
            numberOfMatches++;
            numbersOfMatchesArray[actualMatch].setText(String.valueOf(numberOfMatches));
            ResultButton.setText(undoResultString);
            actualMatch++;
        }







        firstPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!pointsFor1In1Set.getText().toString().equals("")) {
                    Toast.makeText(getActivity().getApplicationContext(), "Wynik został już wprowadzony, jeśli chcesz go cofnąć przytrzymaj przycisk wygranego lub przegranego. Natomiast jeśli chcesz zobaczyć dokładny wynik, wejdz w zakladkę WYNIKI.", Toast.LENGTH_SHORT).show();
                }else {
                    ResultButton.setText(firstPlayer.getText());
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
                    ResultButton.setText(secundPlayer.getText());
                    setDetailedResultFor2Sets(pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set, pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set);
                }
            }
        });


        ResultButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ResultButton.setText(undoResultString);
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
        String Res1 = team1.getText().toString();
        String Res2 = team2.getText().toString();
        return !Res1.equals("") && !Res2.equals("") && ((Math.abs(Integer.parseInt(Res1) - Integer.parseInt(Res2)) > 2 && (Integer.parseInt(pktInSet) == Integer.parseInt(Res1) && Integer.parseInt(Res2) < Integer.parseInt(pktInSet)) || (Integer.parseInt(pktInSet) == Integer.parseInt(Res2) && Integer.parseInt(Res1) < Integer.parseInt(pktInSet))) || (Math.abs(Integer.parseInt(Res1) - Integer.parseInt(Res2)) == 2 && ((Integer.parseInt(Res1) >= Integer.parseInt(pktInSet)) || Integer.parseInt(Res2) >= Integer.parseInt(pktInSet))));
    }

    boolean checkTieBreak(EditText team1Set1, EditText team1Set2, EditText team2Set1, EditText team2Set2) {
        return (Integer.parseInt(team1Set1.getText().toString()) > Integer.parseInt(team2Set1.getText().toString()) && Integer.parseInt(team1Set2.getText().toString()) < Integer.parseInt(team2Set2.getText().toString())) || (Integer.parseInt(team1Set1.getText().toString()) < Integer.parseInt(team2Set1.getText().toString()) && Integer.parseInt(team1Set2.getText().toString()) > Integer.parseInt(team2Set2.getText().toString()));
    }
}




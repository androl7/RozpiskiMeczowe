package com.example.adam.rozpiskimeczowe.cup.cup32;

import android.content.Context;
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


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment_tab_cup32_1, container, false);

        imm = (InputMethodManager) Objects.requireNonNull(getActivity()).getSystemService(Context.INPUT_METHOD_SERVICE);


        this.vg = container;


        final EditText res_9_1 = view.findViewById(R.id.cup32Res1_1);
        final EditText res_9_1_2set = view.findViewById(R.id.cup32Res1_1_2set);
        final EditText res_9_1_3set = view.findViewById(R.id.cup32Res1_1_3set);
        final EditText res9_32 = view.findViewById(R.id.cup32Res1_64);
        final EditText res9_32_2set = view.findViewById(R.id.cup32Res1_64_2set);
        final EditText res9_32_3set = view.findViewById(R.id.cup32Res1_64_3set);

        res_9_1.setVisibility(View.INVISIBLE);
        res_9_1_2set.setVisibility(View.INVISIBLE);
        res_9_1_3set.setVisibility(View.INVISIBLE);
        res9_32.setVisibility(View.INVISIBLE);
        res9_32_2set.setVisibility(View.INVISIBLE);
        res9_32_3set.setVisibility(View.INVISIBLE);


        final EditText res10_17 = view.findViewById(R.id.cup32Res2_33);
        final EditText res10_17_2set = view.findViewById(R.id.cup32Res2_33_2set);
        final EditText res10_17_3set = view.findViewById(R.id.cup32Res2_33_3set);
        final EditText res10_16 = view.findViewById(R.id.cup32Res2_32);
        final EditText res10_16_2set = view.findViewById(R.id.cup32Res2_32_2set);
        final EditText res10_16_3set = view.findViewById(R.id.cup32Res2_32_3set);

        res10_17.setVisibility(View.INVISIBLE);
        res10_17_2set.setVisibility(View.INVISIBLE);
        res10_17_3set.setVisibility(View.INVISIBLE);
        res10_16.setVisibility(View.INVISIBLE);
        res10_16_2set.setVisibility(View.INVISIBLE);
        res10_16_3set.setVisibility(View.INVISIBLE);

        final EditText res11_9 = view.findViewById(R.id.cup32Res11_9);
        final EditText res11_9_2set = view.findViewById(R.id.cup32Res11_9_2set);
        final EditText res11_9_3set = view.findViewById(R.id.cup32Res11_9_3set);
        final EditText res11_24 = view.findViewById(R.id.cup32Res11_24);
        final EditText res11_24_2set = view.findViewById(R.id.cup32Res11_24_2set);
        final EditText res11_24_3set = view.findViewById(R.id.cup32Res11_24_3set);

        res11_9.setVisibility(View.INVISIBLE);
        res11_9_2set.setVisibility(View.INVISIBLE);
        res11_9_3set.setVisibility(View.INVISIBLE);
        res11_24.setVisibility(View.INVISIBLE);
        res11_24_2set.setVisibility(View.INVISIBLE);
        res11_24_3set.setVisibility(View.INVISIBLE);

        final EditText res12_25 = view.findViewById(R.id.cup32Res12_25);
        final EditText res12_25_2set = view.findViewById(R.id.cup32Res12_25_2set);
        final EditText res12_25_3set = view.findViewById(R.id.cup32Res12_25_3set);
        final EditText res8_24 = view.findViewById(R.id.cup32Res12_8);
        final EditText res8_24_2set = view.findViewById(R.id.cup32Res12_8_2set);
        final EditText res8_24_3set = view.findViewById(R.id.cup32Res12_8_3set);

        res12_25.setVisibility(View.INVISIBLE);
        res12_25_2set.setVisibility(View.INVISIBLE);
        res12_25_3set.setVisibility(View.INVISIBLE);
        res8_24.setVisibility(View.INVISIBLE);
        res8_24_2set.setVisibility(View.INVISIBLE);
        res8_24_3set.setVisibility(View.INVISIBLE);

        final EditText res13_5 = view.findViewById(R.id.cup32Res13_5);
        final EditText res13_5_2set = view.findViewById(R.id.cup32Res13_5_2set);
        final EditText res13_5_3set = view.findViewById(R.id.cup32Res13_5_3set);
        final EditText res13_28 = view.findViewById(R.id.cup32Res13_28);
        final EditText res13_28_2set = view.findViewById(R.id.cup32Res13_28_2set);
        final EditText res13_28_3set = view.findViewById(R.id.cup32Res13_28_3set);

        res13_5.setVisibility(View.INVISIBLE);
        res13_5_2set.setVisibility(View.INVISIBLE);
        res13_5_3set.setVisibility(View.INVISIBLE);
        res13_28.setVisibility(View.INVISIBLE);
        res13_28_2set.setVisibility(View.INVISIBLE);
        res13_28_3set.setVisibility(View.INVISIBLE);

        final EditText res14_21 = view.findViewById(R.id.cup32Res14_21);
        final EditText res14_21_2set = view.findViewById(R.id.cup32Res14_21_2set);
        final EditText res14_21_3set = view.findViewById(R.id.cup32Res14_21_3set);
        final EditText res14_12 = view.findViewById(R.id.cup32Res14_12);
        final EditText res14_12_2set = view.findViewById(R.id.cup32Res14_12_2set);
        final EditText res14_12_3set = view.findViewById(R.id.cup32Res14_12_3set);


        res14_21.setVisibility(View.INVISIBLE);
        res14_21_2set.setVisibility(View.INVISIBLE);
        res14_21_3set.setVisibility(View.INVISIBLE);
        res14_12.setVisibility(View.INVISIBLE);
        res14_12_2set.setVisibility(View.INVISIBLE);
        res14_12_3set.setVisibility(View.INVISIBLE);


        final EditText res15_13 = view.findViewById(R.id.cup32Res15_13);
        final EditText res15_13_2set = view.findViewById(R.id.cup32Res15_13_2set);
        final EditText res15_13_3set = view.findViewById(R.id.cup32Res15_13_3set);
        final EditText res15_20 = view.findViewById(R.id.cup32Res15_20);
        final EditText res15_20_2set = view.findViewById(R.id.cup32Res15_20_2set);
        final EditText res15_20_3set = view.findViewById(R.id.cup32Res15_20_3set);

        res15_13.setVisibility(View.INVISIBLE);
        res15_13_2set.setVisibility(View.INVISIBLE);
        res15_13_3set.setVisibility(View.INVISIBLE);
        res15_20.setVisibility(View.INVISIBLE);
        res15_20_2set.setVisibility(View.INVISIBLE);
        res15_20_3set.setVisibility(View.INVISIBLE);

        final EditText res16_29 = view.findViewById(R.id.cup32Res16_29);
        final EditText res16_29_2set = view.findViewById(R.id.cup32Res16_29_2set);
        final EditText res16_29_3set = view.findViewById(R.id.cup32Res16_29_3set);
        final EditText res16_4 = view.findViewById(R.id.cup32Res16_4);
        final EditText res16_4_2set = view.findViewById(R.id.cup32Res16_4_2set);
        final EditText res16_4_3set = view.findViewById(R.id.cup32Res16_4_3set);

        res16_29.setVisibility(View.INVISIBLE);
        res16_29_2set.setVisibility(View.INVISIBLE);
        res16_29_3set.setVisibility(View.INVISIBLE);
        res16_4.setVisibility(View.INVISIBLE);
        res16_4_2set.setVisibility(View.INVISIBLE);
        res16_4_3set.setVisibility(View.INVISIBLE);

        final EditText res17_3 = view.findViewById(R.id.cup32Res17_3);
        final EditText res17_3_2set = view.findViewById(R.id.cup32Res17_3_2set);
        final EditText res17_3_3set = view.findViewById(R.id.cup32Res17_3_3set);
        final EditText res17_30 = view.findViewById(R.id.cup32Res17_30);
        final EditText res17_30_2set = view.findViewById(R.id.cup32Res17_30_2set);
        final EditText res17_30_3set = view.findViewById(R.id.cup32Res17_30_3set);

        res17_3.setVisibility(View.INVISIBLE);
        res17_3_2set.setVisibility(View.INVISIBLE);
        res17_3_3set.setVisibility(View.INVISIBLE);
        res17_30.setVisibility(View.INVISIBLE);
        res17_30_2set.setVisibility(View.INVISIBLE);
        res17_30_3set.setVisibility(View.INVISIBLE);

        final EditText res18_19 = view.findViewById(R.id.cup32Res18_19);
        final EditText res18_19_2set = view.findViewById(R.id.cup32Res18_19_2set);
        final EditText res18_19_3set = view.findViewById(R.id.cup32Res18_19_3set);
        final EditText res18_14 = view.findViewById(R.id.cup32Res18_14);
        final EditText res18_14_2set = view.findViewById(R.id.cup32Res18_14_2set);
        final EditText res18_14_3set = view.findViewById(R.id.cup32Res18_14_3set);

        res18_19.setVisibility(View.INVISIBLE);
        res18_19_2set.setVisibility(View.INVISIBLE);
        res18_19_3set.setVisibility(View.INVISIBLE);
        res18_14.setVisibility(View.INVISIBLE);
        res18_14_2set.setVisibility(View.INVISIBLE);
        res18_14_3set.setVisibility(View.INVISIBLE);

        final EditText res19_11 = view.findViewById(R.id.cup32Res19_11);
        final EditText res19_11_2set = view.findViewById(R.id.cup32Res19_11_2set);
        final EditText res19_11_3set = view.findViewById(R.id.cup32Res19_11_3set);
        final EditText res19_22 = view.findViewById(R.id.cup32Res19_22);
        final EditText res19_22_2set = view.findViewById(R.id.cup32Res19_22_2set);
        final EditText res19_22_3set = view.findViewById(R.id.cup32Res19_22_3set);

        res19_11.setVisibility(View.INVISIBLE);
        res19_11_2set.setVisibility(View.INVISIBLE);
        res19_11_3set.setVisibility(View.INVISIBLE);
        res19_22.setVisibility(View.INVISIBLE);
        res19_22_2set.setVisibility(View.INVISIBLE);
        res19_22_3set.setVisibility(View.INVISIBLE);

        final EditText res20_27 = view.findViewById(R.id.cup32Res20_27);
        final EditText res20_27_2set = view.findViewById(R.id.cup32Res20_27_2set);
        final EditText res20_27_3set = view.findViewById(R.id.cup32Res20_27_3set);
        final EditText res20_6 = view.findViewById(R.id.cup32Res20_6);
        final EditText res20_6_2set = view.findViewById(R.id.cup32Res20_6_2set);
        final EditText res20_6_3set = view.findViewById(R.id.cup32Res20_6_3set);

        res20_27.setVisibility(View.INVISIBLE);
        res20_27_2set.setVisibility(View.INVISIBLE);
        res20_27_3set.setVisibility(View.INVISIBLE);
        res20_6.setVisibility(View.INVISIBLE);
        res20_6_2set.setVisibility(View.INVISIBLE);
        res20_6_3set.setVisibility(View.INVISIBLE);

        final EditText res21_7 = view.findViewById(R.id.cup32Res21_7);
        final EditText res21_7_2set = view.findViewById(R.id.cup32Res21_7_2set);
        final EditText res21_7_3set = view.findViewById(R.id.cup32Res21_7_3set);
        final EditText res21_26 = view.findViewById(R.id.cup32Res21_26);
        final EditText res21_26_2set = view.findViewById(R.id.cup32Res21_26_2set);
        final EditText res21_26_3set = view.findViewById(R.id.cup32Res21_26_3set);

        res21_7.setVisibility(View.INVISIBLE);
        res21_7_2set.setVisibility(View.INVISIBLE);
        res21_7_3set.setVisibility(View.INVISIBLE);
        res21_26.setVisibility(View.INVISIBLE);
        res21_26_2set.setVisibility(View.INVISIBLE);
        res21_26_3set.setVisibility(View.INVISIBLE);

        final EditText res22_23 = view.findViewById(R.id.cup32Res22_23);
        final EditText res22_23_2set = view.findViewById(R.id.cup32Res22_23_2set);
        final EditText res22_23_3set = view.findViewById(R.id.cup32Res22_23_3set);
        final EditText res22_10 = view.findViewById(R.id.cup32Res22_10);
        final EditText res22_10_2set = view.findViewById(R.id.cup32Res22_10_2set);
        final EditText res22_10_3set = view.findViewById(R.id.cup32Res22_10_3set);

        res22_23.setVisibility(View.INVISIBLE);
        res22_23_2set.setVisibility(View.INVISIBLE);
        res22_23_3set.setVisibility(View.INVISIBLE);
        res22_10.setVisibility(View.INVISIBLE);
        res22_10_2set.setVisibility(View.INVISIBLE);
        res22_10_3set.setVisibility(View.INVISIBLE);

        final EditText res23_15 = view.findViewById(R.id.cup32Res23_15);
        final EditText res23_15_2set = view.findViewById(R.id.cup32Res23_15_2set);
        final EditText res23_15_3set = view.findViewById(R.id.cup32Res23_15_3set);
        final EditText res23_18 = view.findViewById(R.id.cup32Res23_18);
        final EditText res23_18_2set = view.findViewById(R.id.cup32Res23_18_2set);
        final EditText res23_18_3set = view.findViewById(R.id.cup32Res23_18_3set);

        res23_15.setVisibility(View.INVISIBLE);
        res23_15_2set.setVisibility(View.INVISIBLE);
        res23_15_3set.setVisibility(View.INVISIBLE);
        res23_18.setVisibility(View.INVISIBLE);
        res23_18_2set.setVisibility(View.INVISIBLE);
        res23_18_3set.setVisibility(View.INVISIBLE);

        final EditText res24_31 = view.findViewById(R.id.cup32Res24_31);
        final EditText res24_31_2set = view.findViewById(R.id.cup32Res24_31_2set);
        final EditText res24_31_3set = view.findViewById(R.id.cup32Res24_31_3set);
        final EditText res24_2 = view.findViewById(R.id.cup32Res24_2);
        final EditText res24_2_2set = view.findViewById(R.id.cup32Res24_2_2set);
        final EditText res24_2_3set = view.findViewById(R.id.cup32Res24_2_3set);

        res24_31.setVisibility(View.INVISIBLE);
        res24_31_2set.setVisibility(View.INVISIBLE);
        res24_31_3set.setVisibility(View.INVISIBLE);
        res24_2.setVisibility(View.INVISIBLE);
        res24_2_2set.setVisibility(View.INVISIBLE);
        res24_2_3set.setVisibility(View.INVISIBLE);

        final EditText res25_Win_9 = view.findViewById(R.id.cup32Res25_Win_9);
        final EditText res25_Win_9_2set = view.findViewById(R.id.cup32Res25_Win_9_2set);
        final EditText res25_Win_9_3set = view.findViewById(R.id.cup32Res25_Win_9_3set);
        final EditText res25_Win_10 = view.findViewById(R.id.cup32Res25_Win_10);
        final EditText res25_Win_10_2set = view.findViewById(R.id.cup32Res25_Win_10_2set);
        final EditText res25_Win_10_3set = view.findViewById(R.id.cup32Res25_Win_10_3set);

        res25_Win_9.setVisibility(View.INVISIBLE);
        res25_Win_9_2set.setVisibility(View.INVISIBLE);
        res25_Win_9_3set.setVisibility(View.INVISIBLE);
        res25_Win_10.setVisibility(View.INVISIBLE);
        res25_Win_10_2set.setVisibility(View.INVISIBLE);
        res25_Win_10_3set.setVisibility(View.INVISIBLE);

        final EditText res26_Win_11 = view.findViewById(R.id.cup32Res26_Win_11);
        final EditText res26_Win_11_2set = view.findViewById(R.id.cup32Res26_Win_11_2set);
        final EditText res26_Win_11_3set = view.findViewById(R.id.cup32Res26_Win_11_3set);
        final EditText res26_Win_12 = view.findViewById(R.id.cup32Res26_Win_12);
        final EditText res26_Win_12_2set = view.findViewById(R.id.cup32Res26_Win_12_2set);
        final EditText res26_Win_12_3set = view.findViewById(R.id.cup32Res26_Win_12_3set);

        res26_Win_11.setVisibility(View.INVISIBLE);
        res26_Win_11_2set.setVisibility(View.INVISIBLE);
        res26_Win_11_3set.setVisibility(View.INVISIBLE);
        res26_Win_12.setVisibility(View.INVISIBLE);
        res26_Win_12_2set.setVisibility(View.INVISIBLE);
        res26_Win_12_3set.setVisibility(View.INVISIBLE);

        final EditText res27_Win_13 = view.findViewById(R.id.cup32Res27_Win_13);
        final EditText res27_Win_13_2set = view.findViewById(R.id.cup32Res27_Win_13_2set);
        final EditText res27_Win_13_3set = view.findViewById(R.id.cup32Res27_Win_13_3set);
        final EditText res27_Win_14 = view.findViewById(R.id.cup32Res27_Win_14);
        final EditText res27_Win_14_2set = view.findViewById(R.id.cup32Res27_Win_14_2set);
        final EditText res27_Win_14_3set = view.findViewById(R.id.cup32Res27_Win_14_3set);

        res27_Win_13.setVisibility(View.INVISIBLE);
        res27_Win_13_2set.setVisibility(View.INVISIBLE);
        res27_Win_13_3set.setVisibility(View.INVISIBLE);
        res27_Win_14.setVisibility(View.INVISIBLE);
        res27_Win_14_2set.setVisibility(View.INVISIBLE);
        res27_Win_14_3set.setVisibility(View.INVISIBLE);

        final EditText res28_Win_15 = view.findViewById(R.id.cup32Res28_Win_15);
        final EditText res28_Win_15_2set = view.findViewById(R.id.cup32Res28_Win_15_2set);
        final EditText res28_Win_15_3set = view.findViewById(R.id.cup32Res28_Win_15_3set);
        final EditText res28_Win_16 = view.findViewById(R.id.cup32Res28_Win_16);
        final EditText res28_Win_16_2set = view.findViewById(R.id.cup32Res28_Win_16_2set);
        final EditText res28_Win_16_3set = view.findViewById(R.id.cup32Res28_Win_16_3set);

        res28_Win_15.setVisibility(View.INVISIBLE);
        res28_Win_15_2set.setVisibility(View.INVISIBLE);
        res28_Win_15_3set.setVisibility(View.INVISIBLE);
        res28_Win_16.setVisibility(View.INVISIBLE);
        res28_Win_16_2set.setVisibility(View.INVISIBLE);
        res28_Win_16_3set.setVisibility(View.INVISIBLE);

        final EditText res29_Win_17 = view.findViewById(R.id.cup32Res29_Win_17);
        final EditText res29_Win_17_2set = view.findViewById(R.id.cup32Res29_Win_17_2set);
        final EditText res29_Win_17_3set = view.findViewById(R.id.cup32Res29_Win_17_3set);
        final EditText res29_Win_18 = view.findViewById(R.id.cup32Res29_Win_18);
        final EditText res29_Win_18_2set = view.findViewById(R.id.cup32Res29_Win_18_2set);
        final EditText res29_Win_18_3set = view.findViewById(R.id.cup32Res29_Win_18_3set);

        res29_Win_17.setVisibility(View.INVISIBLE);
        res29_Win_17_2set.setVisibility(View.INVISIBLE);
        res29_Win_17_3set.setVisibility(View.INVISIBLE);
        res29_Win_18.setVisibility(View.INVISIBLE);
        res29_Win_18_2set.setVisibility(View.INVISIBLE);
        res29_Win_18_3set.setVisibility(View.INVISIBLE);

        final EditText res30_Win_19 = view.findViewById(R.id.cup32Res30_Win_19);
        final EditText res30_Win_19_2set = view.findViewById(R.id.cup32Res30_Win_19_2set);
        final EditText res30_Win_19_3set = view.findViewById(R.id.cup32Res30_Win_19_3set);
        final EditText res30_Win_20 = view.findViewById(R.id.cup32Res30_Win_20);
        final EditText res30_Win_20_2set = view.findViewById(R.id.cup32Res30_Win_20_2set);
        final EditText res30_Win_20_3set = view.findViewById(R.id.cup32Res30_Win_20_3set);

        res30_Win_19.setVisibility(View.INVISIBLE);
        res30_Win_19_2set.setVisibility(View.INVISIBLE);
        res30_Win_19_3set.setVisibility(View.INVISIBLE);
        res30_Win_20.setVisibility(View.INVISIBLE);
        res30_Win_20_2set.setVisibility(View.INVISIBLE);
        res30_Win_20_3set.setVisibility(View.INVISIBLE);

        final EditText res31_Win_21 = view.findViewById(R.id.cup32Res31_Win_21);
        final EditText res31_Win_21_2set = view.findViewById(R.id.cup32Res31_Win_21_2set);
        final EditText res31_Win_21_3set = view.findViewById(R.id.cup32Res31_Win_21_3set);
        final EditText res31_Win_22 = view.findViewById(R.id.cup32Res31_Win_22);
        final EditText res31_Win_22_2set = view.findViewById(R.id.cup32Res31_Win_22_2set);
        final EditText res31_Win_22_3set = view.findViewById(R.id.cup32Res31_Win_22_3set);

        res31_Win_21.setVisibility(View.INVISIBLE);
        res31_Win_21_2set.setVisibility(View.INVISIBLE);
        res31_Win_21_3set.setVisibility(View.INVISIBLE);
        res31_Win_22.setVisibility(View.INVISIBLE);
        res31_Win_22_2set.setVisibility(View.INVISIBLE);
        res31_Win_22_3set.setVisibility(View.INVISIBLE);

        final EditText res32_Win_23 = view.findViewById(R.id.cup32Res32_Win_23);
        final EditText res32_Win_23_2set = view.findViewById(R.id.cup32Res32_Win_23_2set);
        final EditText res32_Win_23_3set = view.findViewById(R.id.cup32Res32_Win_23_3set);
        final EditText res32_Win_24 = view.findViewById(R.id.cup32Res32_Win_24);
        final EditText res32_Win_24_2set = view.findViewById(R.id.cup32Res32_Win_24_2set);
        final EditText res32_Win_24_3set = view.findViewById(R.id.cup32Res32_Win_24_3set);

        res32_Win_23.setVisibility(View.INVISIBLE);
        res32_Win_23_2set.setVisibility(View.INVISIBLE);
        res32_Win_23_3set.setVisibility(View.INVISIBLE);
        res32_Win_24.setVisibility(View.INVISIBLE);
        res32_Win_24_2set.setVisibility(View.INVISIBLE);
        res32_Win_24_3set.setVisibility(View.INVISIBLE);





        final Button team1 = view.findViewById(R.id.cup32Team01);
        final Button team2 = view.findViewById(R.id.cup32Team6);
        final Button team3 = view.findViewById(R.id.cup32Team3);
        final Button team4 = view.findViewById(R.id.cup32Team8);
        final Button team5 = view.findViewById(R.id.cup32Team09);
        final Button team6 = view.findViewById(R.id.cup32Team14);
        final Button team7 = view.findViewById(R.id.cup32Team11);
        final Button team8 = view.findViewById(R.id.cup32Team16);
        final Button team9 = view.findViewById(R.id.cup32Team17);
        final Button team10 = view.findViewById(R.id.cup32Team22);
        final Button team11 = view.findViewById(R.id.cup32Team19);
        final Button team12 = view.findViewById(R.id.cup32Team24);
        final Button team13 = view.findViewById(R.id.cup32Team25);
        final Button team14 = view.findViewById(R.id.cup32Team30);
        final Button team15 = view.findViewById(R.id.cup32Team27);
        final Button team16 = view.findViewById(R.id.cup32Team32);
        final Button team17 = view.findViewById(R.id.cup32Team33);
        final Button team18 = view.findViewById(R.id.cup32Team38);
        final Button team19 = view.findViewById(R.id.cup32Team35);
        final Button team20 = view.findViewById(R.id.cup32Team40);
        final Button team21 = view.findViewById(R.id.cup32Team41);
        final Button team22 = view.findViewById(R.id.cup32Team46);
        final Button team23 = view.findViewById(R.id.cup32Team43);
        final Button team24 = view.findViewById(R.id.cup32Team48);
        final Button team25 = view.findViewById(R.id.cup32Team49);
        final Button team26 = view.findViewById(R.id.cup32Team54);
        final Button team27 = view.findViewById(R.id.cup32Team51);
        final Button team28 = view.findViewById(R.id.cup32Team56);
        final Button team29 = view.findViewById(R.id.cup32Team57);
        final Button team30 = view.findViewById(R.id.cup32Team62);
        final Button team31 = view.findViewById(R.id.cup32Team59);
        final Button team32 = view.findViewById(R.id.cup32Team64);


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



        final Button win9 = view.findViewById(R.id.cup32WIN_1);
        final Button win10 = view.findViewById(R.id.cup32WIN_2);
        final Button win11 = view.findViewById(R.id.cup32WIN_3);
        final Button win12 = view.findViewById(R.id.cup32WIN_4);
        final Button win13 = view.findViewById(R.id.cup32WIN_5);
        final Button win14 = view.findViewById(R.id.cup32WIN_7);
        final Button win15 = view.findViewById(R.id.cup32WIN_7);
        final Button win16 = view.findViewById(R.id.cup32WIN_8);
        final Button win17 = view.findViewById(R.id.cup32WIN_17);
        final Button win18 = view.findViewById(R.id.cup32WIN_18);
        final Button win19 = view.findViewById(R.id.cup32WIN_19);
        final Button win20 = view.findViewById(R.id.cup32WIN_20);
        final Button win21 = view.findViewById(R.id.cup32WIN_21);
        final Button win22 = view.findViewById(R.id.cup32WIN_22);
        final Button win23 = view.findViewById(R.id.cup32WIN_23);
        final Button win24 = view.findViewById(R.id.cup32WIN_24);
        final Button win25 = view.findViewById(R.id.cup32WIN_33);
        final Button win26 = view.findViewById(R.id.cup32WIN_34);
        final Button win27 = view.findViewById(R.id.cup32WIN_35);
        final Button win28 = view.findViewById(R.id.cup32WIN_36);
        final Button win29 = view.findViewById(R.id.cup32WIN_41);
        final Button win30 = view.findViewById(R.id.cup32WIN_42);
        final Button win31 = view.findViewById(R.id.cup32WIN_43);
        final Button win32 = view.findViewById(R.id.cup32WIN_44);




        toast = Toast.makeText(getActivity().getApplicationContext(), "Wprowadz wczesniejszy wynik !", Toast.LENGTH_SHORT);



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
                    resultButton.setText(firstPlayer.getText());
                    resultButton2.setText(secundPlayer.getText());
                    setDetailedResultFor2Sets(pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set, pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set);
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


    //Method to set results to next Buttons without loser and check
    void setResult(final Button firstPlayer, final String firstPlayerString, final Button secundPlayer, final String secundPlayerString, final Button resultButton, final String undoResultString, final EditText pointsFor1In1Set, final EditText pointsFor1In2Set, final EditText pointsFor1In3Set, final EditText pointsFor2In1Set, final EditText pointsFor2In2Set, final EditText pointsFor2In3Set) {
        firstPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstPlayer.getText().equals(firstPlayerString) || secundPlayer.getText().equals(secundPlayerString)) {
                    toast.show();
                } else {
                    resultButton.setText(firstPlayer.getText());
                    setDetailedResultFor2Sets(pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set, pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set);
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
                    setDetailedResultFor2Sets(pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set, pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set);
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
                resultButton.setText(firstPlayer.getText());
                resultButton2.setText(secundPlayer.getText());
                setDetailedResultFor2Sets(pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set, pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set);
            }
        });


        secundPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultButton.setText(secundPlayer.getText());
                resultButton2.setText(firstPlayer.getText());
                setDetailedResultFor2Sets(pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set, pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set);
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

        if (!team1Set1.getText().toString().equals("")) {
            Toast.makeText(getActivity().getApplicationContext(), "Wynik został już wprowadzony, jeśli chcesz go cofnąć przytrzymaj przycisk wygranego lub przegranego. Natomiast jeśli chcesz zobaczyć dokładny wynik, wejdz w zakladkę WYNIKI.", Toast.LENGTH_SHORT).show();
            return;
        }
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
                        } else {

                            disableEnableControls(true, vg);

                            imm.hideSoftInputFromWindow(team2Set2.getWindowToken(), 0);
                            team1Set1.setVisibility(View.INVISIBLE);
                            team2Set1.setVisibility(View.INVISIBLE);
                            team1Set2.setVisibility(View.INVISIBLE);
                            team2Set2.setVisibility(View.INVISIBLE);
                            team1Set3.setVisibility(View.INVISIBLE);
                            team2Set3.setVisibility(View.INVISIBLE);


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




package com.example.adam.rozpiskimeczowe.cup.cup64;

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

public class FragmentTabCup64_1 extends Fragment {
    Toast toast;
    InputMethodManager imm;
    String pktInSet = "21";
    String pktInTieBreak = "15";
    View view;
    ViewGroup vg;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment_tab_cup64_1, container, false);

        imm = (InputMethodManager) Objects.requireNonNull(getActivity()).getSystemService(Context.INPUT_METHOD_SERVICE);


        this.vg = container;


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

        final Button win49 = view.findViewById(R.id.cup64WIN_49);
        final Button win50 = view.findViewById(R.id.cup64WIN_50);
        final Button win51 = view.findViewById(R.id.cup64WIN_51);
        final Button win52 = view.findViewById(R.id.cup64WIN_52);
        final Button win53 = view.findViewById(R.id.cup64WIN_53);
        final Button win54 = view.findViewById(R.id.cup64WIN_54);
        final Button win55 = view.findViewById(R.id.cup64WIN_55);
        final Button win56 = view.findViewById(R.id.cup64WIN_56);



        setResult(team1,team32,win1,"WIN.1",Res1_1,Res1_1_2set,Res1_1_3set,Res1_64,Res1_64_2set,Res1_64_3set);

        setResult(team17,team16,win2,"WIN.2",Res2_33,Res2_33_2set,Res2_33_3set,Res2_32,Res2_32_2set,Res2_32_3set);

        setResult(team9,team24,win3,"WIN.3",Res3_17,Res3_17_2set,Res3_17_3set,Res3_48,Res3_48_2set,Res3_48_3set);

        setResult(team25,team8,win4,"WIN.4",Res4_49,Res4_49_2set,Res4_49_3set,Res4_16,Res4_16_2set,Res4_16_3set);

        setResult(team5,team28,win5,"WIN.5",Res5_9,Res5_9_2set,Res5_9_3set,Res5_56,Res5_56_2set,Res5_56_3set);

        setResult(team21,team12,win6,"WIN.6",Res6_41,Res6_41_2set,Res6_41_3set,Res6_24,Res6_24_2set,Res6_24_3set);

        setResult(team13,team20,win7,"WIN.7",Res7_25,Res7_25_2set,Res7_25_3set,Res7_40,Res7_40_2set,Res7_40_3set);

        setResult(team29,team4,win8,"WIN.8",Res8_57,Res8_57_2set,Res8_57_3set,Res8_8,Res8_8_2set,Res8_8_3set);

        setResult(team3,team30,win9,"WIN.9",Res9_5,Res9_5_2set,Res9_5_3set,Res9_60,Res9_60_2set,Res9_60_3set);

        setResult(team19,team14,win10,"WIN.10",Res10_37,Res10_37_2set,Res10_37_3set,Res10_28,Res10_28_2set,Res10_28_3set);

        setResult(team11,team22,win11,"WIN.11",Res11_21,Res21_11_2set,Res11_21_3set,Res11_44,Res11_44_2set,Res11_44_3set);

        setResult(team27,team6,win12,"WIN.12",Res12_53,Res12_53_2set,Res12_53_3set,Res12_12,Res12_12_2set,Res12_12_3set);

        setResult(team7,team26,win13,"WIN.13",Res13_13,Res13_13_2set,Res13_13_3set,Res13_52,Res13_52_2set,Res13_52_3set);

        setResult(team23,team10,win14,"WIN.14",Res14_45,Res14_45_2set,Res14_45_3set,Res14_20,Res14_20_2set,Res14_20_3set);

        setResult(team15,team18,win15,"WIN.15",Res15_29,Res15_29_2set,Res15_29_3set,Res15_36,Res15_36_2set,Res15_36_3set);

        setResult(team31,team2,win16,"WIN.16",Res16_61,Res16_61_2set,Res16_61_3set,Res16_4,Res16_4_2set,Res16_4_3set);

        setResult(team3,team62,win17,"WIN.17",Res17_3,Res17_3_2set,Res17_3_3set,Res17_62,Res17_62_2set,Res17_62_3set);

        setResult(team35,team30,win18,"WIN.18",Res18_35,Res18_35_2set,Res18_35_3set,Res18_30,Res18_30_2set,Res18_30_3set);

        setResult(team19,team46,win19,"WIN.19",Res19_19,Res19_19_2set,Res19_19_3set,Res19_46,Res19_46_2set,Res19_46_3set);

        setResult(team51,team14,win20,"WIN.20",Res20_51,Res20_51_2set,Res20_51_3set,Res20_14,Res20_14_2set,Res20_14_3set);

        setResult(team11,team54,win21,"WIN.21",Res21_11,Res21_11_2set,Res21_11_3set,Res21_54,Res21_54_2set,Res21_54_3set);

        setResult(team43,team22,win22,"WIN.22",Res22_43,Res22_43_2set,Res22_43_3set,Res22_22,Res22_22_2set,Res22_22_3set);

        setResult(team27,team38,win23,"WIN.23",Res23_27,Res23_27_2set,Res23_27_3set,Res23_38,Res23_38_2set,Res23_38_3set);

        setResult(team59,team6,win24,"WIN.24",Res24_59,Res24_59_2set,Res24_59_3set,Res24_6,Res24_6_2set,Res24_6_3set);

        setResult(team7,team58,win25,"WIN.25",Res25_7,Res25_7_2set,Res25_7_3set,Res25_58,Res25_58_2set,Res25_58_3set);

        setResult(team39,team26,win26,"WIN.26",Res26_39,Res26_39_2set,Res26_39_3set,Res26_26,Res26_26_2set,Res26_26_3set);

        setResult(team23,team42,win27,"WIN.27",Res27_23,Res27_23_2set,Res27_23_3set,Res27_42,Res27_42_2set,Res27_42_3set);

        setResult(team55,team10,win28,"WIN.28",Res28_55,Res28_55_2set,Res28_55_3set,Res28_10,Res28_10_2set,Res28_10_3set);

        setResult(team15,team50,win29,"WIN.29",Res29_15,Res29_15_2set,Res29_15_3set,Res29_50,Res29_50_2set,Res29_50_3set);

        setResult(team47,team18,win30,"WIN.30",Res30_47,Res30_47_2set,Res30_47_3set,Res30_18,Res30_18_2set,Res30_18_3set);

        setResult(team31,team34,win31,"WIN.31",Res31_31,Res31_31_2set,Res31_31_3set,Res31_34,Res31_34_2set,Res31_34_3set);

        setResult(team63,team2,win32,"WIN.32",Res32_63,Res32_63_2set,Res32_63_3set,Res32_2,Res32_2_2set,Res32_2_3set);


        setResult(win1,"WIN.1",win2,"WIN.2",win33,"WIN.33",Res33_Win_1,Res33_Win_1_2set,Res33_Win_1_3set,Res33_Win_2,Res33_Win_2_2set,Res33_Win_2_3set);

        setResult(win3,"WIN.3",win4,"WIN.4",win34,"WIN.34",Res34_Win_3,Res34_Win_3_2set,Res34_Win_3_3set,Res34_Win_4,Res34_Win_4_2set,Res34_Win_4_3set);

        setResult(win5,"WIN.5",win6,"WIN.6",win35,"WIN.35",Res35_Win_5,Res35_Win_5_2set,Res35_Win_5_3set,Res35_Win_6,Res35_Win_6_2set,Res35_Win_6_3set);

        setResult(win7,"WIN.7",win8,"WIN.8",win36,"WIN.36",Res36_Win_7,Res36_Win_7_2set,Res36_Win_7_3set,Res36_Win_8,Res36_Win_8_2set,Res36_Win_8_3set);

        setResult(win9,"WIN.9",win10,"WIN.10",win37,"WIN.37",Res37_Win_9,Res37_Win_9_2set,Res37_Win_9_3set,Res37_Win_10,Res37_Win_10_2set,Res37_Win_10_3set);

        setResult(win11,"WIN.11",win12,"WIN.12",win38,"WIN.38",Res38_Win_11,Res38_Win_11_2set,Res38_Win_11_3set,Res38_Win_12,Res38_Win_12_2set,Res38_Win_12_3set);

        setResult(win13,"WIN.13",win14,"WIN.14",win39,"WIN.39",Res39_Win_13,Res39_Win_13_2set,Res39_Win_13_3set,Res39_Win_14,Res39_Win_14_2set,Res39_Win_14_3set);

        setResult(win15,"WIN.15",win16,"WIN.16",win40,"WIN.40",Res40_Win_15,Res40_Win_15_2set,Res40_Win_15_3set,Res40_Win_16,Res40_Win_16_2set,Res40_Win_16_3set);

        setResult(win1,"WIN.17",win2,"WIN.18",win41,"WIN.41",Res41_Win_17,Res41_Win_17_2set,Res41_Win_17_3set,Res41_Win_18,Res41_Win_18_2set,Res41_Win_18_3set);

        setResult(win3,"WIN.19",win4,"WIN.20",win42,"WIN.42",Res42_Win_19,Res42_Win_19_2set,Res42_Win_19_3set,Res42_Win_20,Res42_Win_20_2set,Res42_Win_20_3set);

        setResult(win5,"WIN.21",win6,"WIN.22",win43,"WIN.43",Res43_Win_21,Res43_Win_21_2set,Res43_Win_21_3set,Res43_Win_22,Res43_Win_22_2set,Res43_Win_22_3set);

        setResult(win7,"WIN.23",win8,"WIN.24",win44,"WIN.44",Res44_Win_23,Res44_Win_23_2set,Res44_Win_23_3set,Res44_Win_24,Res44_Win_24_2set,Res44_Win_24_3set);

        setResult(win9,"WIN.25",win10,"WIN.26",win45,"WIN.45",Res45_Win_25,Res45_Win_25_2set,Res45_Win_25_3set,Res45_Win_26,Res45_Win_26_2set,Res45_Win_26_3set);

        setResult(win11,"WIN.27",win12,"WIN.28",win46,"WIN.46",Res46_Win_27,Res46_Win_27_2set,Res46_Win_27_3set,Res46_Win_28,Res46_Win_28_2set,Res46_Win_28_3set);

        setResult(win13,"WIN.29",win14,"WIN.30",win47,"WIN.47",Res47_Win_29,Res47_Win_29_2set,Res47_Win_29_3set,Res47_Win_30,Res47_Win_30_2set,Res47_Win_30_3set);

        setResult(win15,"WIN.31",win16,"WIN.32",win48,"WIN.48",Res48_Win_31,Res48_Win_31_2set,Res48_Win_31_3set,Res48_Win_32,Res48_Win_32_2set,Res48_Win_32_3set);

        setResult(win1,"WIN.33",win2,"WIN.34",win49,"WIN.49",Res49_Win_33,Res49_Win_33_2set,Res49_Win_33_3set,Res49_Win_34,Res49_Win_34_2set,Res49_Win_34_3set);

        setResult(win3,"WIN.35",win4,"WIN.36",win50,"WIN.50",Res50_Win_35,Res50_Win_35_2set,Res50_Win_35_3set,Res50_Win_36,Res50_Win_36_2set,Res50_Win_36_3set);

        setResult(win5,"WIN.37",win6,"WIN.38",win51,"WIN.51",Res51_Win_37,Res51_Win_37_2set,Res51_Win_37_3set,Res51_Win_38,Res51_Win_38_2set,Res51_Win_38_3set);

        setResult(win7,"WIN.39",win8,"WIN.40",win52,"WIN.52",Res52_Win_39,Res52_Win_39_2set,Res52_Win_39_3set,Res52_Win_40,Res52_Win_40_2set,Res52_Win_40_3set);

        setResult(win9,"WIN.41",win10,"WIN.42",win53,"WIN.53",Res53_Win_41,Res53_Win_41_2set,Res53_Win_41_3set,Res53_Win_42,Res53_Win_42_2set,Res53_Win_42_3set);

        setResult(win11,"WIN.43",win12,"WIN.44",win54,"WIN.54",Res54_Win_43,Res54_Win_43_2set,Res54_Win_43_3set,Res54_Win_44,Res54_Win_44_2set,Res54_Win_44_3set);

        setResult(win13,"WIN.45",win14,"WIN.46",win55,"WIN.55",Res55_Win_45,Res55_Win_45_2set,Res55_Win_45_3set,Res55_Win_46,Res55_Win_46_2set,Res55_Win_46_3set);

        setResult(win15,"WIN.47",win16,"WIN.48",win56,"WIN.56",Res56_Win_47,Res56_Win_47_2set,Res56_Win_47_3set,Res56_Win_48,Res56_Win_48_2set,Res56_Win_48_3set);




        toast = Toast.makeText(getActivity().getApplicationContext(), "Wprowadz wczesniejszy wynik !", Toast.LENGTH_SHORT);



        return view;
    }


    //Method to set Results to next Buttons with loser and check
    void setResult(final Button firstPlayer, final String firstPlayerString, final Button secundPlayer, final String secundPlayerString, final Button ResultButton, final String undoResultString, final Button ResultButton2, final String undoResultString2, final EditText pointsFor1In1Set, final EditText pointsFor1In2Set, final EditText pointsFor1In3Set, final EditText pointsFor2In1Set, final EditText pointsFor2In2Set, final EditText pointsFor2In3Set) {
        firstPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstPlayer.getText().equals(firstPlayerString) || secundPlayer.getText().equals(secundPlayerString)) {
                    toast.show();
                } else {
                    ResultButton.setText(firstPlayer.getText());
                    ResultButton2.setText(secundPlayer.getText());
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
                    ResultButton.setText(secundPlayer.getText());
                    ResultButton2.setText(firstPlayer.getText());
                    setDetailedResultFor2Sets(pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set, pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set);
                }

            }
        });

        ResultButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ResultButton.setText(undoResultString);
                ResultButton2.setText(undoResultString2);
                pointsFor1In1Set.setText("");
                pointsFor1In2Set.setText("");
                pointsFor1In3Set.setText("");
                pointsFor2In1Set.setText("");
                pointsFor2In2Set.setText("");
                pointsFor2In3Set.setText("");
                return true;
            }
        });

        ResultButton2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ResultButton.setText(undoResultString);
                ResultButton2.setText(undoResultString2);
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


    //Method to set Results to next Buttons without loser and check
    void setResult(final Button firstPlayer, final String firstPlayerString, final Button secundPlayer, final String secundPlayerString, final Button ResultButton, final String undoResultString, final EditText pointsFor1In1Set, final EditText pointsFor1In2Set, final EditText pointsFor1In3Set, final EditText pointsFor2In1Set, final EditText pointsFor2In2Set, final EditText pointsFor2In3Set) {
        firstPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstPlayer.getText().equals(firstPlayerString) || secundPlayer.getText().equals(secundPlayerString)) {
                    toast.show();
                } else {
                    ResultButton.setText(firstPlayer.getText());
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

    // Method to set Results to next Buttons with loser without check
    void setResult(final Button firstPlayer, final Button secundPlayer, final Button ResultButton, final String undoResultString, final Button ResultButton2, final String undoResultString2, final EditText pointsFor1In1Set, final EditText pointsFor1In2Set, final EditText pointsFor1In3Set, final EditText pointsFor2In1Set, final EditText pointsFor2In2Set, final EditText pointsFor2In3Set) {
        firstPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultButton.setText(firstPlayer.getText());
                ResultButton2.setText(secundPlayer.getText());
                setDetailedResultFor2Sets(pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set, pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set);
            }
        });


        secundPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultButton.setText(secundPlayer.getText());
                ResultButton2.setText(firstPlayer.getText());
                setDetailedResultFor2Sets(pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set, pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set);
            }
        });


        ResultButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ResultButton.setText(undoResultString);
                ResultButton2.setText(undoResultString2);
                pointsFor1In1Set.setText("");
                pointsFor1In2Set.setText("");
                pointsFor1In3Set.setText("");
                pointsFor2In1Set.setText("");
                pointsFor2In2Set.setText("");
                pointsFor2In3Set.setText("");
                return true;
            }
        });

        ResultButton2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ResultButton.setText(undoResultString);
                ResultButton2.setText(undoResultString2);
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

    void setResult(final Button firstPlayer, final Button secundPlayer, final Button ResultButton, final String undoResultString, final EditText pointsFor1In1Set, final EditText pointsFor1In2Set, final EditText pointsFor1In3Set, final EditText pointsFor2In1Set, final EditText pointsFor2In2Set, final EditText pointsFor2In3Set) {
        firstPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultButton.setText(firstPlayer.getText());
                setDetailedResultFor2Sets(pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set, pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set);
            }
        });


        secundPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultButton.setText(secundPlayer.getText());
                setDetailedResultFor2Sets(pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set, pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set);
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
        String Res1 = team1.getText().toString();
        String Res2 = team2.getText().toString();
        return !Res1.equals("") && !Res2.equals("") && ((Math.abs(Integer.parseInt(Res1) - Integer.parseInt(Res2)) > 2 && (Integer.parseInt(pktInSet) == Integer.parseInt(Res1) && Integer.parseInt(Res2) < Integer.parseInt(pktInSet)) || (Integer.parseInt(pktInSet) == Integer.parseInt(Res2) && Integer.parseInt(Res1) < Integer.parseInt(pktInSet))) || (Math.abs(Integer.parseInt(Res1) - Integer.parseInt(Res2)) == 2 && ((Integer.parseInt(Res1) >= Integer.parseInt(pktInSet)) || Integer.parseInt(Res2) >= Integer.parseInt(pktInSet))));
    }

    boolean checkTieBreak(EditText team1Set1, EditText team1Set2, EditText team2Set1, EditText team2Set2) {
        return (Integer.parseInt(team1Set1.getText().toString()) > Integer.parseInt(team2Set1.getText().toString()) && Integer.parseInt(team1Set2.getText().toString()) < Integer.parseInt(team2Set2.getText().toString())) || (Integer.parseInt(team1Set1.getText().toString()) < Integer.parseInt(team2Set1.getText().toString()) && Integer.parseInt(team1Set2.getText().toString()) > Integer.parseInt(team2Set2.getText().toString()));
    }
}




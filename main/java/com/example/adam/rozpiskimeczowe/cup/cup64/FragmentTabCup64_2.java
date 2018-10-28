package com.example.adam.rozpiskimeczowe.cup.cup64;

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

import com.example.adam.rozpiskimeczowe.R;

import java.util.Objects;
import java.util.TreeMap;


public class FragmentTabCup64_2 extends Fragment {
    View view;
    CustomAdapter customAdapter;
    TreeMap<Integer, Values> resultsOfMatches;
    Integer numberOfMatch=0;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment_tab_cup64_2, container, false);

        resultsOfMatches = new TreeMap<>();

        final ListView list = view.findViewById(R.id.listViewCup64Frag2);
        list.setItemsCanFocus(true);
        customAdapter = new CustomAdapter(Objects.requireNonNull(getActivity()).getApplicationContext());
        list.setAdapter(customAdapter);


        final Button team1 = getActivity().findViewById(R.id.cup64Team01);
        final Button team2 = getActivity().findViewById(R.id.cup64Team2);
        final Button team3 = getActivity().findViewById(R.id.cup64Team3);
        final Button team4 = getActivity().findViewById(R.id.cup64Team4);
        final Button team5 = getActivity().findViewById(R.id.cup64Team5);
        final Button team6 = getActivity().findViewById(R.id.cup64Team6);
        final Button team7 = getActivity().findViewById(R.id.cup64Team7);
        final Button team8 = getActivity().findViewById(R.id.cup64Team8);
        final Button team9 = getActivity().findViewById(R.id.cup64Team9);
        final Button team10 = getActivity().findViewById(R.id.cup64Team10);
        final Button team11 = getActivity().findViewById(R.id.cup64Team11);
        final Button team12 = getActivity().findViewById(R.id.cup64Team12);
        final Button team13 = getActivity().findViewById(R.id.cup64Team13);
        final Button team14 = getActivity().findViewById(R.id.cup64Team14);
        final Button team15 = getActivity().findViewById(R.id.cup64Team15);
        final Button team16 = getActivity().findViewById(R.id.cup64Team16);
        final Button team17 = getActivity().findViewById(R.id.cup64Team17);
        final Button team18 = getActivity().findViewById(R.id.cup64Team18);
        final Button team19 = getActivity().findViewById(R.id.cup64Team19);
        final Button team20 = getActivity().findViewById(R.id.cup64Team20);
        final Button team21 = getActivity().findViewById(R.id.cup64Team21);
        final Button team22 = getActivity().findViewById(R.id.cup64Team22);
        final Button team23 = getActivity().findViewById(R.id.cup64Team23);
        final Button team24 = getActivity().findViewById(R.id.cup64Team24);
        final Button team25 = getActivity().findViewById(R.id.cup64Team25);
        final Button team26 = getActivity().findViewById(R.id.cup64Team26);
        final Button team27 = getActivity().findViewById(R.id.cup64Team27);
        final Button team28 = getActivity().findViewById(R.id.cup64Team28);
        final Button team29 = getActivity().findViewById(R.id.cup64Team29);
        final Button team30 = getActivity().findViewById(R.id.cup64Team30);
        final Button team31 = getActivity().findViewById(R.id.cup64Team31);
        final Button team32 = getActivity().findViewById(R.id.cup64Team32);
        final Button team33 = getActivity().findViewById(R.id.cup64Team33);
        final Button team34 = getActivity().findViewById(R.id.cup64Team34);
        final Button team35 = getActivity().findViewById(R.id.cup64Team35);
        final Button team36 = getActivity().findViewById(R.id.cup64Team36);
        final Button team37 = getActivity().findViewById(R.id.cup64Team37);
        final Button team38 = getActivity().findViewById(R.id.cup64Team38);
        final Button team39 = getActivity().findViewById(R.id.cup64Team39);
        final Button team40 = getActivity().findViewById(R.id.cup64Team40);
        final Button team41 = getActivity().findViewById(R.id.cup64Team41);
        final Button team42 = getActivity().findViewById(R.id.cup64Team42);
        final Button team43 = getActivity().findViewById(R.id.cup64Team43);
        final Button team44 = getActivity().findViewById(R.id.cup64Team44);
        final Button team45 = getActivity().findViewById(R.id.cup64Team45);
        final Button team46 = getActivity().findViewById(R.id.cup64Team46);
        final Button team47 = getActivity().findViewById(R.id.cup64Team47);
        final Button team48 = getActivity().findViewById(R.id.cup64Team48);
        final Button team49 = getActivity().findViewById(R.id.cup64Team49);
        final Button team50 = getActivity().findViewById(R.id.cup64Team50);
        final Button team51 = getActivity().findViewById(R.id.cup64Team51);
        final Button team52 = getActivity().findViewById(R.id.cup64Team52);
        final Button team53 = getActivity().findViewById(R.id.cup64Team53);
        final Button team54 = getActivity().findViewById(R.id.cup64Team54);
        final Button team55 = getActivity().findViewById(R.id.cup64Team55);
        final Button team56 = getActivity().findViewById(R.id.cup64Team56);
        final Button team57 = getActivity().findViewById(R.id.cup64Team57);
        final Button team58 = getActivity().findViewById(R.id.cup64Team58);
        final Button team59 = getActivity().findViewById(R.id.cup64Team59);
        final Button team60 = getActivity().findViewById(R.id.cup64Team60);
        final Button team61 = getActivity().findViewById(R.id.cup64Team61);
        final Button team62 = getActivity().findViewById(R.id.cup64Team62);
        final Button team63 = getActivity().findViewById(R.id.cup64Team63);
        final Button team64 = getActivity().findViewById(R.id.cup64Team64);

        final Button win1 = getActivity().findViewById(R.id.cup64WIN_1);
        final Button win2 = getActivity().findViewById(R.id.cup64WIN_2);
        final Button win3 = getActivity().findViewById(R.id.cup64WIN_3);
        final Button win4 = getActivity().findViewById(R.id.cup64WIN_4);
        final Button win5 = getActivity().findViewById(R.id.cup64WIN_5);
        final Button win6 = getActivity().findViewById(R.id.cup64WIN_6);
        final Button win7 = getActivity().findViewById(R.id.cup64WIN_7);
        final Button win8 = getActivity().findViewById(R.id.cup64WIN_8);
        final Button win9 = getActivity().findViewById(R.id.cup64WIN_9);
        final Button win10 = getActivity().findViewById(R.id.cup64WIN_10);
        final Button win11 = getActivity().findViewById(R.id.cup64WIN_11);
        final Button win12 = getActivity().findViewById(R.id.cup64WIN_12);
        final Button win13 = getActivity().findViewById(R.id.cup64WIN_13);
        final Button win14 = getActivity().findViewById(R.id.cup64WIN_14);
        final Button win15 = getActivity().findViewById(R.id.cup64WIN_15);
        final Button win16 = getActivity().findViewById(R.id.cup64WIN_16);
        final Button win17 = getActivity().findViewById(R.id.cup64WIN_17);
        final Button win18 = getActivity().findViewById(R.id.cup64WIN_18);
        final Button win19 = getActivity().findViewById(R.id.cup64WIN_19);
        final Button win20 = getActivity().findViewById(R.id.cup64WIN_20);
        final Button win21 = getActivity().findViewById(R.id.cup64WIN_21);
        final Button win22 = getActivity().findViewById(R.id.cup64WIN_22);
        final Button win23 = getActivity().findViewById(R.id.cup64WIN_23);
        final Button win24 = getActivity().findViewById(R.id.cup64WIN_24);

        final Button win25 = getActivity().findViewById(R.id.cup64WIN_25);
        final Button win26 = getActivity().findViewById(R.id.cup64WIN_26);
        final Button win27 = getActivity().findViewById(R.id.cup64WIN_27);
        final Button win28 = getActivity().findViewById(R.id.cup64WIN_28);
        final Button win29 = getActivity().findViewById(R.id.cup64WIN_29);
        final Button win30 = getActivity().findViewById(R.id.cup64WIN_30);
        final Button win31 = getActivity().findViewById(R.id.cup64WIN_31);
        final Button win32 = getActivity().findViewById(R.id.cup64WIN_32);
        final Button win33 = getActivity().findViewById(R.id.cup64WIN_33);
        final Button win34 = getActivity().findViewById(R.id.cup64WIN_34);
        final Button win35 = getActivity().findViewById(R.id.cup64WIN_35);
        final Button win36 = getActivity().findViewById(R.id.cup64WIN_36);
        final Button win37 = getActivity().findViewById(R.id.cup64WIN_37);
        final Button win38 = getActivity().findViewById(R.id.cup64WIN_38);
        final Button win39 = getActivity().findViewById(R.id.cup64WIN_39);
        final Button win40 = getActivity().findViewById(R.id.cup64WIN_40);
        final Button win41 = getActivity().findViewById(R.id.cup64WIN_41);
        final Button win42 = getActivity().findViewById(R.id.cup64WIN_42);
        final Button win43 = getActivity().findViewById(R.id.cup64WIN_43);
        final Button win44 = getActivity().findViewById(R.id.cup64WIN_44);
        final Button win45 = getActivity().findViewById(R.id.cup64WIN_45);
        final Button win46 = getActivity().findViewById(R.id.cup64WIN_46);
        final Button win47 = getActivity().findViewById(R.id.cup64WIN_47);
        final Button win48 = getActivity().findViewById(R.id.cup64WIN_48);

       /* final Button win49 = getActivity().findViewById(R.id.cup64WIN_49);
        final Button win50 = getActivity().findViewById(R.id.cup64WIN_50);
        final Button win51 = getActivity().findViewById(R.id.cup64WIN_51);
        final Button win52 = getActivity().findViewById(R.id.cup64WIN_52);
        final Button win53 = getActivity().findViewById(R.id.cup64WIN_53);
        final Button win54 = getActivity().findViewById(R.id.cup64WIN_54);
        final Button win55 = getActivity().findViewById(R.id.cup64WIN_55);
        final Button win56 = getActivity().findViewById(R.id.cup64WIN_56);*/


        final EditText Res1_1 = getActivity().findViewById(R.id.cup64Res1_1);
        final EditText Res1_1_2set = getActivity().findViewById(R.id.cup64Res1_1_2set);
        final EditText Res1_1_3set = getActivity().findViewById(R.id.cup64Res1_1_3set);
        final EditText Res1_64 = getActivity().findViewById(R.id.cup64Res1_64);
        final EditText Res1_64_2set = getActivity().findViewById(R.id.cup64Res1_64_2set);
        final EditText Res1_64_3set = getActivity().findViewById(R.id.cup64Res1_64_3set);


        final EditText Res2_33 = getActivity().findViewById(R.id.cup64Res2_33);
        final EditText Res2_33_2set = getActivity().findViewById(R.id.cup64Res2_33_2set);
        final EditText Res2_33_3set = getActivity().findViewById(R.id.cup64Res2_33_3set);
        final EditText Res2_32 = getActivity().findViewById(R.id.cup64Res2_32);
        final EditText Res2_32_2set = getActivity().findViewById(R.id.cup64Res2_32_2set);
        final EditText Res2_32_3set = getActivity().findViewById(R.id.cup64Res2_32_3set);


        final EditText Res3_17 = getActivity().findViewById(R.id.cup64Res3_17);
        final EditText Res3_17_2set = getActivity().findViewById(R.id.cup64Res3_17_2set);
        final EditText Res3_17_3set = getActivity().findViewById(R.id.cup64Res3_17_3set);
        final EditText Res3_48 = getActivity().findViewById(R.id.cup64Res3_48);
        final EditText Res3_48_2set = getActivity().findViewById(R.id.cup64Res3_48_2set);
        final EditText Res3_48_3set = getActivity().findViewById(R.id.cup64Res3_48_3set);


        final EditText Res4_49 = getActivity().findViewById(R.id.cup64Res4_49);
        final EditText Res4_49_2set = getActivity().findViewById(R.id.cup64Res4_49_2set);
        final EditText Res4_49_3set = getActivity().findViewById(R.id.cup64Res4_49_3set);
        final EditText Res4_16 = getActivity().findViewById(R.id.cup64Res4_16 );
        final EditText Res4_16_2set = getActivity().findViewById(R.id.cup64Res4_16_2set);
        final EditText Res4_16_3set = getActivity().findViewById(R.id.cup64Res4_16_3set);


        final EditText Res5_9 = getActivity().findViewById(R.id.cup64Res5_9);
        final EditText Res5_9_2set = getActivity().findViewById(R.id.cup64Res5_9_2set);
        final EditText Res5_9_3set = getActivity().findViewById(R.id.cup64Res5_9_3set);
        final EditText Res5_56 = getActivity().findViewById(R.id.cup64Res5_56);
        final EditText Res5_56_2set = getActivity().findViewById(R.id.cup64Res5_56_2set);
        final EditText Res5_56_3set = getActivity().findViewById(R.id.cup64Res5_56_3set);


        final EditText Res6_41 = getActivity().findViewById(R.id.cup64Res6_41);
        final EditText Res6_41_2set = getActivity().findViewById(R.id.cup64Res6_41_2set);
        final EditText Res6_41_3set = getActivity().findViewById(R.id.cup64Res6_41_3set);
        final EditText Res6_24 = getActivity().findViewById(R.id.cup64Res6_24);
        final EditText Res6_24_2set = getActivity().findViewById(R.id.cup64Res6_24_2set);
        final EditText Res6_24_3set = getActivity().findViewById(R.id.cup64Res6_24_3set);




        final EditText Res7_25 = getActivity().findViewById(R.id.cup64Res7_25);
        final EditText Res7_25_2set = getActivity().findViewById(R.id.cup64Res7_25_2set);
        final EditText Res7_25_3set = getActivity().findViewById(R.id.cup64Res7_25_3set);
        final EditText Res7_40 = getActivity().findViewById(R.id.cup64Res7_40);
        final EditText Res7_40_2set = getActivity().findViewById(R.id.cup64Res7_40_2set);
        final EditText Res7_40_3set = getActivity().findViewById(R.id.cup64Res7_40_3set);


        final EditText Res8_57 = getActivity().findViewById(R.id.cup64Res8_57);
        final EditText Res8_57_2set = getActivity().findViewById(R.id.cup64Res8_57_2set);
        final EditText Res8_57_3set = getActivity().findViewById(R.id.cup64Res8_57_3set);
        final EditText Res8_8 = getActivity().findViewById(R.id.cup64Res8_8);
        final EditText Res8_8_2set = getActivity().findViewById(R.id.cup64Res8_8_2set);
        final EditText Res8_8_3set = getActivity().findViewById(R.id.cup64Res8_8_3set);


        final EditText Res9_5 = getActivity().findViewById(R.id.cup64Res9_5);
        final EditText Res9_5_2set = getActivity().findViewById(R.id.cup64Res9_5_2set);
        final EditText Res9_5_3set = getActivity().findViewById(R.id.cup64Res9_5_3set);
        final EditText Res9_60 = getActivity().findViewById(R.id.cup64Res9_60);
        final EditText Res9_60_2set = getActivity().findViewById(R.id.cup64Res9_60_2set);
        final EditText Res9_60_3set = getActivity().findViewById(R.id.cup64Res9_60_3set);


        final EditText Res10_37 = getActivity().findViewById(R.id.cup64Res10_37);
        final EditText Res10_37_2set = getActivity().findViewById(R.id.cup64Res10_37_2set);
        final EditText Res10_37_3set = getActivity().findViewById(R.id.cup64Res10_37_3set);
        final EditText Res10_28 = getActivity().findViewById(R.id.cup64Res10_28);
        final EditText Res10_28_2set = getActivity().findViewById(R.id.cup64Res10_28_2set);
        final EditText Res10_28_3set = getActivity().findViewById(R.id.cup64Res10_28_3set);


        final EditText Res11_21 = getActivity().findViewById(R.id.cup64Res11_21);
        final EditText Res11_21_2set = getActivity().findViewById(R.id.cup64Res11_21_2set);
        final EditText Res11_21_3set = getActivity().findViewById(R.id.cup64Res11_21_3set);
        final EditText Res11_44 = getActivity().findViewById(R.id.cup64Res11_44);
        final EditText Res11_44_2set = getActivity().findViewById(R.id.cup64Res11_44_2set);
        final EditText Res11_44_3set = getActivity().findViewById(R.id.cup64Res11_44_3set);


        final EditText Res12_53 = getActivity().findViewById(R.id.cup64Res12_53);
        final EditText Res12_53_2set = getActivity().findViewById(R.id.cup64Res12_53_2set);
        final EditText Res12_53_3set = getActivity().findViewById(R.id.cup64Res12_53_3set);
        final EditText Res12_12 = getActivity().findViewById(R.id.cup64Res12_12);
        final EditText Res12_12_2set = getActivity().findViewById(R.id.cup64Res12_12_2set);
        final EditText Res12_12_3set = getActivity().findViewById(R.id.cup64Res12_12_3set);


        final EditText Res13_13 = getActivity().findViewById(R.id.cup64Res13_13);
        final EditText Res13_13_2set = getActivity().findViewById(R.id.cup64Res13_13_2set);
        final EditText Res13_13_3set = getActivity().findViewById(R.id.cup64Res13_13_3set);
        final EditText Res13_52 = getActivity().findViewById(R.id.cup64Res13_52);
        final EditText Res13_52_2set = getActivity().findViewById(R.id.cup64Res13_52_2set);
        final EditText Res13_52_3set = getActivity().findViewById(R.id.cup64Res13_52_3set);


        final EditText Res14_45 = getActivity().findViewById(R.id.cup64Res14_45);
        final EditText Res14_45_2set = getActivity().findViewById(R.id.cup64Res14_45_2set);
        final EditText Res14_45_3set = getActivity().findViewById(R.id.cup64Res14_45_3set);
        final EditText Res14_20 = getActivity().findViewById(R.id.cup64Res14_20);
        final EditText Res14_20_2set = getActivity().findViewById(R.id.cup64Res14_20_2set);
        final EditText Res14_20_3set = getActivity().findViewById(R.id.cup64Res14_20_3set);


        final EditText Res15_29 = getActivity().findViewById(R.id.cup64Res15_29);
        final EditText Res15_29_2set = getActivity().findViewById(R.id.cup64Res15_29_2set);
        final EditText Res15_29_3set = getActivity().findViewById(R.id.cup64Res15_29_3set);
        final EditText Res15_36 = getActivity().findViewById(R.id.cup64Res15_36);
        final EditText Res15_36_2set = getActivity().findViewById(R.id.cup64Res15_36_2set);
        final EditText Res15_36_3set = getActivity().findViewById(R.id.cup64Res15_36_3set);


        final EditText Res16_61 = getActivity().findViewById(R.id.cup64Res16_61);
        final EditText Res16_61_2set = getActivity().findViewById(R.id.cup64Res16_61_2set);
        final EditText Res16_61_3set = getActivity().findViewById(R.id.cup64Res16_61_3set);
        final EditText Res16_4 = getActivity().findViewById(R.id.cup64Res16_4);
        final EditText Res16_4_2set = getActivity().findViewById(R.id.cup64Res16_4_2set);
        final EditText Res16_4_3set = getActivity().findViewById(R.id.cup64Res16_4_3set);


        final EditText Res17_3 = getActivity().findViewById(R.id.cup64Res17_3);
        final EditText Res17_3_2set = getActivity().findViewById(R.id.cup64Res17_3_2set);
        final EditText Res17_3_3set = getActivity().findViewById(R.id.cup64Res17_3_3set);
        final EditText Res17_62 = getActivity().findViewById(R.id.cup64Res17_62);
        final EditText Res17_62_2set = getActivity().findViewById(R.id.cup64Res17_62_2set);
        final EditText Res17_62_3set = getActivity().findViewById(R.id.cup64Res17_62_3set);



        final EditText Res18_35 = getActivity().findViewById(R.id.cup64Res18_35);
        final EditText Res18_35_2set = getActivity().findViewById(R.id.cup64Res18_35_2set);
        final EditText Res18_35_3set = getActivity().findViewById(R.id.cup64Res18_35_3set);
        final EditText Res18_30 = getActivity().findViewById(R.id.cup64Res18_30);
        final EditText Res18_30_2set = getActivity().findViewById(R.id.cup64Res18_30_2set);
        final EditText Res18_30_3set = getActivity().findViewById(R.id.cup64Res18_30_3set);


        final EditText Res19_19 = getActivity().findViewById(R.id.cup64Res19_19);
        final EditText Res19_19_2set = getActivity().findViewById(R.id.cup64Res19_19_2set);
        final EditText Res19_19_3set = getActivity().findViewById(R.id.cup64Res19_19_3set);
        final EditText Res19_46 = getActivity().findViewById(R.id.cup64Res19_46);
        final EditText Res19_46_2set = getActivity().findViewById(R.id.cup64Res19_46_2set);
        final EditText Res19_46_3set = getActivity().findViewById(R.id.cup64Res19_46_3set);


        final EditText Res20_51 = getActivity().findViewById(R.id.cup64Res20_51);
        final EditText Res20_51_2set = getActivity().findViewById(R.id.cup64Res20_51_2set);
        final EditText Res20_51_3set = getActivity().findViewById(R.id.cup64Res20_51_3set);
        final EditText Res20_14 = getActivity().findViewById(R.id.cup64Res20_14 );
        final EditText Res20_14_2set = getActivity().findViewById(R.id.cup64Res20_14_2set);
        final EditText Res20_14_3set = getActivity().findViewById(R.id.cup64Res20_14_3set);


        final EditText Res21_11 = getActivity().findViewById(R.id.cup64Res21_11);
        final EditText Res21_11_2set = getActivity().findViewById(R.id.cup64Res21_11_2set);
        final EditText Res21_11_3set = getActivity().findViewById(R.id.cup64Res21_11_3set);
        final EditText Res21_54 = getActivity().findViewById(R.id.cup64Res21_54);
        final EditText Res21_54_2set = getActivity().findViewById(R.id.cup64Res21_54_2set);
        final EditText Res21_54_3set = getActivity().findViewById(R.id.cup64Res21_54_3set);


        final EditText Res22_43 = getActivity().findViewById(R.id.cup64Res22_43);
        final EditText Res22_43_2set = getActivity().findViewById(R.id.cup64Res22_43_2set);
        final EditText Res22_43_3set = getActivity().findViewById(R.id.cup64Res22_43_3set);
        final EditText Res22_22 = getActivity().findViewById(R.id.cup64Res22_22);
        final EditText Res22_22_2set = getActivity().findViewById(R.id.cup64Res22_22_2set);
        final EditText Res22_22_3set = getActivity().findViewById(R.id.cup64Res22_22_3set);




        final EditText Res23_27 = getActivity().findViewById(R.id.cup64Res23_27);
        final EditText Res23_27_2set = getActivity().findViewById(R.id.cup64Res23_27_2set);
        final EditText Res23_27_3set = getActivity().findViewById(R.id.cup64Res23_27_3set);
        final EditText Res23_38 = getActivity().findViewById(R.id.cup64Res23_38);
        final EditText Res23_38_2set = getActivity().findViewById(R.id.cup64Res23_38_2set);
        final EditText Res23_38_3set = getActivity().findViewById(R.id.cup64Res23_38_3set);


        final EditText Res24_59 = getActivity().findViewById(R.id.cup64Res24_59);
        final EditText Res24_59_2set = getActivity().findViewById(R.id.cup64Res24_59_2set);
        final EditText Res24_59_3set = getActivity().findViewById(R.id.cup64Res24_59_3set);
        final EditText Res24_6 = getActivity().findViewById(R.id.cup64Res24_6);
        final EditText Res24_6_2set = getActivity().findViewById(R.id.cup64Res24_6_2set);
        final EditText Res24_6_3set = getActivity().findViewById(R.id.cup64Res24_6_3set);


        final EditText Res25_7 = getActivity().findViewById(R.id.cup64Res25_7);
        final EditText Res25_7_2set = getActivity().findViewById(R.id.cup64Res25_7_2set);
        final EditText Res25_7_3set = getActivity().findViewById(R.id.cup64Res25_7_3set);
        final EditText Res25_58 = getActivity().findViewById(R.id.cup64Res25_58);
        final EditText Res25_58_2set = getActivity().findViewById(R.id.cup64Res25_58_2set);
        final EditText Res25_58_3set = getActivity().findViewById(R.id.cup64Res25_58_3set);


        final EditText Res26_39 = getActivity().findViewById(R.id.cup64Res26_39);
        final EditText Res26_39_2set = getActivity().findViewById(R.id.cup64Res26_39_2set);
        final EditText Res26_39_3set = getActivity().findViewById(R.id.cup64Res26_39_3set);
        final EditText Res26_26 = getActivity().findViewById(R.id.cup64Res26_26);
        final EditText Res26_26_2set = getActivity().findViewById(R.id.cup64Res26_26_2set);
        final EditText Res26_26_3set = getActivity().findViewById(R.id.cup64Res26_26_3set);


        final EditText Res27_23 = getActivity().findViewById(R.id.cup64Res27_23);
        final EditText Res27_23_2set = getActivity().findViewById(R.id.cup64Res27_23_2set);
        final EditText Res27_23_3set = getActivity().findViewById(R.id.cup64Res27_23_3set);
        final EditText Res27_42 = getActivity().findViewById(R.id.cup64Res27_42);
        final EditText Res27_42_2set = getActivity().findViewById(R.id.cup64Res27_42_2set);
        final EditText Res27_42_3set = getActivity().findViewById(R.id.cup64Res27_42_3set);


        final EditText Res28_55 = getActivity().findViewById(R.id.cup64Res28_55);
        final EditText Res28_55_2set = getActivity().findViewById(R.id.cup64Res28_55_2set);
        final EditText Res28_55_3set = getActivity().findViewById(R.id.cup64Res28_55_3set);
        final EditText Res28_10 = getActivity().findViewById(R.id.cup64Res28_10);
        final EditText Res28_10_2set = getActivity().findViewById(R.id.cup64Res28_10_2set);
        final EditText Res28_10_3set = getActivity().findViewById(R.id.cup64Res28_10_3set);


        final EditText Res29_15 = getActivity().findViewById(R.id.cup64Res29_15);
        final EditText Res29_15_2set = getActivity().findViewById(R.id.cup64Res29_15_2set);
        final EditText Res29_15_3set = getActivity().findViewById(R.id.cup64Res29_15_3set);
        final EditText Res29_50 = getActivity().findViewById(R.id.cup64Res29_50);
        final EditText Res29_50_2set = getActivity().findViewById(R.id.cup64Res29_50_2set);
        final EditText Res29_50_3set = getActivity().findViewById(R.id.cup64Res29_50_3set);


        final EditText Res30_47 = getActivity().findViewById(R.id.cup64Res30_47);
        final EditText Res30_47_2set = getActivity().findViewById(R.id.cup64Res30_47_2set);
        final EditText Res30_47_3set = getActivity().findViewById(R.id.cup64Res30_47_3set);
        final EditText Res30_18 = getActivity().findViewById(R.id.cup64Res30_18);
        final EditText Res30_18_2set = getActivity().findViewById(R.id.cup64Res30_18_2set);
        final EditText Res30_18_3set = getActivity().findViewById(R.id.cup64Res30_18_3set);


        final EditText Res31_31 = getActivity().findViewById(R.id.cup64Res31_31);
        final EditText Res31_31_2set = getActivity().findViewById(R.id.cup64Res31_31_2set);
        final EditText Res31_31_3set = getActivity().findViewById(R.id.cup64Res31_31_3set);
        final EditText Res31_34 = getActivity().findViewById(R.id.cup64Res31_34);
        final EditText Res31_34_2set = getActivity().findViewById(R.id.cup64Res31_34_2set);
        final EditText Res31_34_3set = getActivity().findViewById(R.id.cup64Res31_34_3set);


        final EditText Res32_63 = getActivity().findViewById(R.id.cup64Res32_63);
        final EditText Res32_63_2set = getActivity().findViewById(R.id.cup64Res32_63_2set);
        final EditText Res32_63_3set = getActivity().findViewById(R.id.cup64Res32_63_3set);
        final EditText Res32_2 = getActivity().findViewById(R.id.cup64Res32_2);
        final EditText Res32_2_2set = getActivity().findViewById(R.id.cup64Res32_2_2set);
        final EditText Res32_2_3set = getActivity().findViewById(R.id.cup64Res32_2_3set);



        final EditText Res33_Win_1 = getActivity().findViewById(R.id.cup64Res33_Win_1);
        final EditText Res33_Win_1_2set = getActivity().findViewById(R.id.cup64Res33_Win_1_2set);
        final EditText Res33_Win_1_3set = getActivity().findViewById(R.id.cup64Res33_Win_1_3set);
        final EditText Res33_Win_2 = getActivity().findViewById(R.id.cup64Res33_Win_2);
        final EditText Res33_Win_2_2set = getActivity().findViewById(R.id.cup64Res33_Win_2_2set);
        final EditText Res33_Win_2_3set = getActivity().findViewById(R.id.cup64Res33_Win_2_3set);



        final EditText Res34_Win_3 = getActivity().findViewById(R.id.cup64Res34_Win_3);
        final EditText Res34_Win_3_2set = getActivity().findViewById(R.id.cup64Res34_Win_3_2set);
        final EditText Res34_Win_3_3set = getActivity().findViewById(R.id.cup64Res34_Win_3_3set);
        final EditText Res34_Win_4 = getActivity().findViewById(R.id.cup64Res34_Win_4);
        final EditText Res34_Win_4_2set = getActivity().findViewById(R.id.cup64Res34_Win_4_2set);
        final EditText Res34_Win_4_3set = getActivity().findViewById(R.id.cup64Res34_Win_4_3set);



        final EditText Res35_Win_5 = getActivity().findViewById(R.id.cup64Res35_Win_5);
        final EditText Res35_Win_5_2set = getActivity().findViewById(R.id.cup64Res35_Win_5_2set);
        final EditText Res35_Win_5_3set = getActivity().findViewById(R.id.cup64Res35_Win_5_3set);
        final EditText Res35_Win_6 = getActivity().findViewById(R.id.cup64Res35_Win_6);
        final EditText Res35_Win_6_2set = getActivity().findViewById(R.id.cup64Res35_Win_6_2set);
        final EditText Res35_Win_6_3set = getActivity().findViewById(R.id.cup64Res35_Win_6_3set);


        final EditText Res36_Win_7 = getActivity().findViewById(R.id.cup64Res36_Win_7);
        final EditText Res36_Win_7_2set = getActivity().findViewById(R.id.cup64Res36_Win_7_2set);
        final EditText Res36_Win_7_3set = getActivity().findViewById(R.id.cup64Res36_Win_7_3set);
        final EditText Res36_Win_8 = getActivity().findViewById(R.id.cup64Res36_Win_8);
        final EditText Res36_Win_8_2set = getActivity().findViewById(R.id.cup64Res36_Win_8_2set);
        final EditText Res36_Win_8_3set = getActivity().findViewById(R.id.cup64Res36_Win_8_3set);


        final EditText Res37_Win_9 = getActivity().findViewById(R.id.cup64Res37_Win_9);
        final EditText Res37_Win_9_2set = getActivity().findViewById(R.id.cup64Res37_Win_9_2set);
        final EditText Res37_Win_9_3set = getActivity().findViewById(R.id.cup64Res37_Win_9_3set);
        final EditText Res37_Win_10 = getActivity().findViewById(R.id.cup64Res37_Win_10);
        final EditText Res37_Win_10_2set = getActivity().findViewById(R.id.cup64Res37_Win_10_2set);
        final EditText Res37_Win_10_3set = getActivity().findViewById(R.id.cup64Res37_Win_10_3set);


        final EditText Res38_Win_11 = getActivity().findViewById(R.id.cup64Res38_Win_11);
        final EditText Res38_Win_11_2set = getActivity().findViewById(R.id.cup64Res38_Win_11_2set);
        final EditText Res38_Win_11_3set = getActivity().findViewById(R.id.cup64Res38_Win_11_3set);
        final EditText Res38_Win_12 = getActivity().findViewById(R.id.cup64Res38_Win_12);
        final EditText Res38_Win_12_2set = getActivity().findViewById(R.id.cup64Res38_Win_12_2set);
        final EditText Res38_Win_12_3set = getActivity().findViewById(R.id.cup64Res38_Win_12_3set);


        final EditText Res39_Win_13 = getActivity().findViewById(R.id.cup64Res39_Win_13);
        final EditText Res39_Win_13_2set = getActivity().findViewById(R.id.cup64Res39_Win_13_2set);
        final EditText Res39_Win_13_3set = getActivity().findViewById(R.id.cup64Res39_Win_13_3set);
        final EditText Res39_Win_14 = getActivity().findViewById(R.id.cup64Res39_Win_14);
        final EditText Res39_Win_14_2set = getActivity().findViewById(R.id.cup64Res39_Win_14_2set);
        final EditText Res39_Win_14_3set = getActivity().findViewById(R.id.cup64Res39_Win_14_3set);


        final EditText Res40_Win_15 = getActivity().findViewById(R.id.cup64Res40_Win_15);
        final EditText Res40_Win_15_2set = getActivity().findViewById(R.id.cup64Res40_Win_15_2set);
        final EditText Res40_Win_15_3set = getActivity().findViewById(R.id.cup64Res40_Win_15_3set);
        final EditText Res40_Win_16 = getActivity().findViewById(R.id.cup64Res40_Win_16);
        final EditText Res40_Win_16_2set = getActivity().findViewById(R.id.cup64Res40_Win_16_2set);
        final EditText Res40_Win_16_3set = getActivity().findViewById(R.id.cup64Res40_Win_16_3set);


        final EditText Res41_Win_17 = getActivity().findViewById(R.id.cup64Res41_Win_17);
        final EditText Res41_Win_17_2set = getActivity().findViewById(R.id.cup64Res41_Win_17_2set);
        final EditText Res41_Win_17_3set = getActivity().findViewById(R.id.cup64Res41_Win_17_3set);
        final EditText Res41_Win_18 = getActivity().findViewById(R.id.cup64Res41_Win_18);
        final EditText Res41_Win_18_2set = getActivity().findViewById(R.id.cup64Res41_Win_18_2set);
        final EditText Res41_Win_18_3set = getActivity().findViewById(R.id.cup64Res41_Win_18_3set);


        final EditText Res42_Win_19 = getActivity().findViewById(R.id.cup64Res42_Win_19);
        final EditText Res42_Win_19_2set = getActivity().findViewById(R.id.cup64Res42_Win_19_2set);
        final EditText Res42_Win_19_3set = getActivity().findViewById(R.id.cup64Res42_Win_19_3set);
        final EditText Res42_Win_20 = getActivity().findViewById(R.id.cup64Res42_Win_20);
        final EditText Res42_Win_20_2set = getActivity().findViewById(R.id.cup64Res42_Win_20_2set);
        final EditText Res42_Win_20_3set = getActivity().findViewById(R.id.cup64Res42_Win_20_3set);


        final EditText Res43_Win_21 = getActivity().findViewById(R.id.cup64Res43_Win_21);
        final EditText Res43_Win_21_2set = getActivity().findViewById(R.id.cup64Res43_Win_21_2set);
        final EditText Res43_Win_21_3set = getActivity().findViewById(R.id.cup64Res43_Win_21_3set);
        final EditText Res43_Win_22 = getActivity().findViewById(R.id.cup64Res43_Win_22);
        final EditText Res43_Win_22_2set = getActivity().findViewById(R.id.cup64Res43_Win_22_2set);
        final EditText Res43_Win_22_3set = getActivity().findViewById(R.id.cup64Res43_Win_22_3set);


        final EditText Res44_Win_23 = getActivity().findViewById(R.id.cup64Res44_Win_23);
        final EditText Res44_Win_23_2set = getActivity().findViewById(R.id.cup64Res44_Win_23_2set);
        final EditText Res44_Win_23_3set = getActivity().findViewById(R.id.cup64Res44_Win_23_3set);
        final EditText Res44_Win_24 = getActivity().findViewById(R.id.cup64Res44_Win_24);
        final EditText Res44_Win_24_2set = getActivity().findViewById(R.id.cup64Res44_Win_24_2set);
        final EditText Res44_Win_24_3set = getActivity().findViewById(R.id.cup64Res44_Win_24_3set);


        final EditText Res45_Win_25 = getActivity().findViewById(R.id.cup64Res45_Win_25);
        final EditText Res45_Win_25_2set = getActivity().findViewById(R.id.cup64Res45_Win_25_2set);
        final EditText Res45_Win_25_3set = getActivity().findViewById(R.id.cup64Res45_Win_25_3set);
        final EditText Res45_Win_26 = getActivity().findViewById(R.id.cup64Res45_Win_26);
        final EditText Res45_Win_26_2set = getActivity().findViewById(R.id.cup64Res45_Win_26_2set);
        final EditText Res45_Win_26_3set = getActivity().findViewById(R.id.cup64Res45_Win_26_3set);


        final EditText Res46_Win_27 = getActivity().findViewById(R.id.cup64Res46_Win_27);
        final EditText Res46_Win_27_2set = getActivity().findViewById(R.id.cup64Res46_Win_27_2set);
        final EditText Res46_Win_27_3set = getActivity().findViewById(R.id.cup64Res46_Win_27_3set);
        final EditText Res46_Win_28 = getActivity().findViewById(R.id.cup64Res46_Win_28);
        final EditText Res46_Win_28_2set = getActivity().findViewById(R.id.cup64Res46_Win_28_2set);
        final EditText Res46_Win_28_3set = getActivity().findViewById(R.id.cup64Res46_Win_28_3set);


        final EditText Res47_Win_29 = getActivity().findViewById(R.id.cup64Res47_Win_29);
        final EditText Res47_Win_29_2set = getActivity().findViewById(R.id.cup64Res47_Win_29_2set);
        final EditText Res47_Win_29_3set = getActivity().findViewById(R.id.cup64Res47_Win_29_3set);
        final EditText Res47_Win_30 = getActivity().findViewById(R.id.cup64Res47_Win_30);
        final EditText Res47_Win_30_2set = getActivity().findViewById(R.id.cup64Res47_Win_30_2set);
        final EditText Res47_Win_30_3set = getActivity().findViewById(R.id.cup64Res47_Win_30_3set);


        final EditText Res48_Win_31 = getActivity().findViewById(R.id.cup64Res48_Win_31);
        final EditText Res48_Win_31_2set = getActivity().findViewById(R.id.cup64Res48_Win_31_2set);
        final EditText Res48_Win_31_3set = getActivity().findViewById(R.id.cup64Res48_Win_31_3set);
        final EditText Res48_Win_32 = getActivity().findViewById(R.id.cup64Res48_Win_32);
        final EditText Res48_Win_32_2set = getActivity().findViewById(R.id.cup64Res48_Win_32_2set);
        final EditText Res48_Win_32_3set = getActivity().findViewById(R.id.cup64Res48_Win_32_3set);


        final EditText Res49_Win_33 = getActivity().findViewById(R.id.cup64Res_49_Win_33);
        final EditText Res49_Win_33_2set = getActivity().findViewById(R.id.cup64Res_49_Win_33_2set);
        final EditText Res49_Win_33_3set = getActivity().findViewById(R.id.cup64Res_49_Win_33_3set);
        final EditText Res49_Win_34 = getActivity().findViewById(R.id.cup64Res_49_Win_34);
        final EditText Res49_Win_34_2set = getActivity().findViewById(R.id.cup64Res_49_Win_34_2set);
        final EditText Res49_Win_34_3set = getActivity().findViewById(R.id.cup64Res_49_Win_34_3set);


        final EditText Res50_Win_35 = getActivity().findViewById(R.id.cup64Res_50_Win_35);
        final EditText Res50_Win_35_2set = getActivity().findViewById(R.id.cup64Res_50_Win_35_2set);
        final EditText Res50_Win_35_3set = getActivity().findViewById(R.id.cup64Res_50_Win_35_3set);
        final EditText Res50_Win_36 = getActivity().findViewById(R.id.cup64Res_50_Win_36);
        final EditText Res50_Win_36_2set = getActivity().findViewById(R.id.cup64Res_50_Win_36_2set);
        final EditText Res50_Win_36_3set = getActivity().findViewById(R.id.cup64Res_50_Win_36_3set);


        final EditText Res51_Win_37 = getActivity().findViewById(R.id.cup64Res_51_Win_37);
        final EditText Res51_Win_37_2set = getActivity().findViewById(R.id.cup64Res_51_Win_37_2set);
        final EditText Res51_Win_37_3set = getActivity().findViewById(R.id.cup64Res_51_Win_37_3set);
        final EditText Res51_Win_38 = getActivity().findViewById(R.id.cup64Res_51_Win_38);
        final EditText Res51_Win_38_2set = getActivity().findViewById(R.id.cup64Res_51_Win_38_2set);
        final EditText Res51_Win_38_3set = getActivity().findViewById(R.id.cup64Res_51_Win_38_3set);


        final EditText Res52_Win_39 = getActivity().findViewById(R.id.cup64Res_52_Win_39);
        final EditText Res52_Win_39_2set = getActivity().findViewById(R.id.cup64Res_52_Win_39_2set);
        final EditText Res52_Win_39_3set = getActivity().findViewById(R.id.cup64Res_52_Win_39_3set);
        final EditText Res52_Win_40 = getActivity().findViewById(R.id.cup64Res_52_Win_40);
        final EditText Res52_Win_40_2set = getActivity().findViewById(R.id.cup64Res_52_Win_40_2set);
        final EditText Res52_Win_40_3set = getActivity().findViewById(R.id.cup64Res_52_Win_40_3set);



        final EditText Res53_Win_41 = getActivity().findViewById(R.id.cup64Res_53_Win_41);
        final EditText Res53_Win_41_2set = getActivity().findViewById(R.id.cup64Res_53_Win_41_2set);
        final EditText Res53_Win_41_3set = getActivity().findViewById(R.id.cup64Res_53_Win_41_3set);
        final EditText Res53_Win_42 = getActivity().findViewById(R.id.cup64Res_53_Win_42);
        final EditText Res53_Win_42_2set = getActivity().findViewById(R.id.cup64Res_53_Win_42_2set);
        final EditText Res53_Win_42_3set = getActivity().findViewById(R.id.cup64Res_53_Win_42_3set);


        final EditText Res54_Win_43 = getActivity().findViewById(R.id.cup64Res_54_Win_43);
        final EditText Res54_Win_43_2set = getActivity().findViewById(R.id.cup64Res_54_Win_43_2set);
        final EditText Res54_Win_43_3set = getActivity().findViewById(R.id.cup64Res_54_Win_43_3set);
        final EditText Res54_Win_44 = getActivity().findViewById(R.id.cup64Res_54_Win_44);
        final EditText Res54_Win_44_2set = getActivity().findViewById(R.id.cup64Res_54_Win_44_2set);
        final EditText Res54_Win_44_3set = getActivity().findViewById(R.id.cup64Res_54_Win_44_3set);


        final EditText Res55_Win_45 = getActivity().findViewById(R.id.cup64Res_55_Win_45);
        final EditText Res55_Win_45_2set = getActivity().findViewById(R.id.cup64Res_55_Win_45_2set);
        final EditText Res55_Win_45_3set = getActivity().findViewById(R.id.cup64Res_55_Win_45_3set);
        final EditText Res55_Win_46 = getActivity().findViewById(R.id.cup64Res_55_Win_46);
        final EditText Res55_Win_46_2set = getActivity().findViewById(R.id.cup64Res_55_Win_46_2set);
        final EditText Res55_Win_46_3set = getActivity().findViewById(R.id.cup64Res_55_Win_46_3set);


        final EditText Res56_Win_47 = getActivity().findViewById(R.id.cup64Res_56_Win_47);
        final EditText Res56_Win_47_2set = getActivity().findViewById(R.id.cup64Res_56_Win_47_2set);
        final EditText Res56_Win_47_3set = getActivity().findViewById(R.id.cup64Res_56_Win_47_3set);
        final EditText Res56_Win_48 = getActivity().findViewById(R.id.cup64Res_56_Win_48);
        final EditText Res56_Win_48_2set = getActivity().findViewById(R.id.cup64Res_56_Win_48_2set);
        final EditText Res56_Win_48_3set = getActivity().findViewById(R.id.cup64Res_56_Win_48_3set);


        //1
        setResult(team1,team64,Res1_1,Res1_1_2set,Res1_1_3set,Res1_64,Res1_64_2set,Res1_64_3set);
        //2
        setResult(team33,team32,Res2_33,Res2_33_2set,Res2_33_3set,Res2_32,Res2_32_2set,Res2_32_3set);
        //3
        setResult(team17,team48,Res3_17,Res3_17_2set,Res3_17_3set,Res3_48,Res3_48_2set,Res3_48_3set);
        //4
        setResult(team49,team16,Res4_49,Res4_49_2set,Res4_49_3set,Res4_16,Res4_16_2set,Res4_16_3set);
        //5
        setResult(team9,team56,Res5_9,Res5_9_2set,Res5_9_3set,Res5_56,Res5_56_2set,Res5_56_3set);
        //6
        setResult(team41,team24,Res6_41,Res6_41_2set,Res6_41_3set,Res6_24,Res6_24_2set,Res6_24_3set);
        //7
        setResult(team25,team40,Res7_25,Res7_25_2set,Res7_25_3set,Res7_40,Res7_40_2set,Res7_40_3set);
        //8
        setResult(team57,team8,Res8_57,Res8_57_2set,Res8_57_3set,Res8_8,Res8_8_2set,Res8_8_3set);
        //9
        setResult(team5,team60,Res9_5,Res9_5_2set,Res9_5_3set,Res9_60,Res9_60_2set,Res9_60_3set);
        //10
        setResult(team37,team28,Res10_37,Res10_37_2set,Res10_37_3set,Res10_28,Res10_28_2set,Res10_28_3set);
        //11
        setResult(team21,team44,Res11_21,Res11_21_2set,Res11_21_3set,Res11_44,Res11_44_2set,Res11_44_3set);
        //12
        setResult(team53,team12,Res12_53,Res12_53_2set,Res12_53_3set,Res12_12,Res12_12_2set,Res12_12_3set);
        //13
        setResult(team13,team52,Res13_13,Res13_13_2set,Res13_13_3set,Res13_52,Res13_52_2set,Res13_52_3set);
        //14
        setResult(team45,team20,Res14_45,Res14_45_2set,Res14_45_3set,Res14_20,Res14_20_2set,Res14_20_3set);
        //15
        setResult(team29,team36,Res15_29,Res15_29_2set,Res15_29_3set,Res15_36,Res15_36_2set,Res15_36_3set);
        //16
        setResult(team61,team4,Res16_61,Res16_61_2set,Res16_61_3set,Res16_4,Res16_4_2set,Res16_4_3set);
        //17
        setResult(team3,team62,Res17_3,Res17_3_2set,Res17_3_3set,Res17_62,Res17_62_2set,Res17_62_3set);
        //18
        setResult(team35,team30,Res18_35,Res18_35_2set,Res18_35_3set,Res18_30,Res18_30_2set,Res18_30_3set);
        //19
        setResult(team19,team46,Res19_19,Res19_19_2set,Res19_19_3set,Res19_46,Res19_46_2set,Res19_46_3set);
        //20
        setResult(team51,team14,Res20_51,Res20_51_2set,Res20_51_3set,Res20_14,Res20_14_2set,Res20_14_3set);
        //21
        setResult(team11,team54,Res21_11,Res21_11_2set,Res21_11_3set,Res21_54,Res21_54_2set,Res21_54_3set);
        //22
        setResult(team43,team22,Res22_43,Res22_43_2set,Res22_43_3set,Res22_22,Res22_22_2set,Res22_22_3set);
        //23
        setResult(team27,team38,Res23_27,Res23_27_2set,Res23_27_3set,Res23_38,Res23_38_2set,Res23_38_3set);
        //24
        setResult(team59,team6,Res24_59,Res24_59_2set,Res24_59_3set,Res24_6,Res24_6_2set,Res24_6_3set);
        //25
        setResult(team7,team58,Res25_7,Res25_7_2set,Res25_7_3set,Res25_58,Res25_58_2set,Res25_58_3set);
        //26
        setResult(team39,team26,Res26_39,Res26_39_2set,Res26_39_3set,Res26_26,Res26_26_2set,Res26_26_3set);
        //27
        setResult(team23,team42,Res27_23,Res27_23_2set,Res27_23_3set,Res27_42,Res27_42_2set,Res27_42_3set);
        //28
        setResult(team55,team10,Res28_55,Res28_55_2set,Res28_55_3set,Res28_10,Res28_10_2set,Res28_10_3set);
        //29
        setResult(team15,team50,Res29_15,Res29_15_2set,Res29_15_3set,Res29_50,Res29_50_2set,Res29_50_3set);
        //30
        setResult(team47,team18,Res30_47,Res30_47_2set,Res30_47_3set,Res30_18,Res30_18_2set,Res30_18_3set);
        //31
        setResult(team31,team34,Res31_31,Res31_31_2set,Res31_31_3set,Res31_34,Res31_34_2set,Res31_34_3set);
        //32
        setResult(team63,team2,Res32_63,Res32_63_2set,Res32_63_3set,Res32_2,Res32_2_2set,Res32_2_3set);

        //33
        setResult(win1,win2,Res33_Win_1,Res33_Win_1_2set,Res33_Win_1_3set,Res33_Win_2,Res33_Win_2_2set,Res33_Win_2_3set);
        //34
        setResult(win3,win4,Res34_Win_3,Res34_Win_3_2set,Res34_Win_3_3set,Res34_Win_4,Res34_Win_4_2set,Res34_Win_4_3set);
        //35
        setResult(win5,win6,Res35_Win_5,Res35_Win_5_2set,Res35_Win_5_3set,Res35_Win_6,Res35_Win_6_2set,Res35_Win_6_3set);
        //36
        setResult(win7,win8,Res36_Win_7,Res36_Win_7_2set,Res36_Win_7_3set,Res36_Win_8,Res36_Win_8_2set,Res36_Win_8_3set);
        //37
        setResult(win9,win10,Res37_Win_9,Res37_Win_9_2set,Res37_Win_9_3set,Res37_Win_10,Res37_Win_10_2set,Res37_Win_10_3set);
        //38
        setResult(win11,win12,Res38_Win_11,Res38_Win_11_2set,Res38_Win_11_3set,Res38_Win_12,Res38_Win_12_2set,Res38_Win_12_3set);
        //39
        setResult(win13,win14,Res39_Win_13,Res39_Win_13_2set,Res39_Win_13_3set,Res39_Win_14,Res39_Win_14_2set,Res39_Win_14_3set);
        //40
        setResult(win15,win16,Res40_Win_15,Res40_Win_15_2set,Res40_Win_15_3set,Res40_Win_16,Res40_Win_16_2set,Res40_Win_16_3set);
        //41
        setResult(win17,win18,Res41_Win_17,Res41_Win_17_2set,Res41_Win_17_3set,Res41_Win_18,Res41_Win_18_2set,Res41_Win_18_3set);
        //42
        setResult(win19,win20,Res42_Win_19,Res42_Win_19_2set,Res42_Win_19_3set,Res42_Win_20,Res42_Win_20_2set,Res42_Win_20_3set);
        //43
        setResult(win21,win22,Res43_Win_21,Res43_Win_21_2set,Res43_Win_21_3set,Res43_Win_22,Res43_Win_22_2set,Res43_Win_22_3set);
        //44
        setResult(win23,win24,Res44_Win_23,Res44_Win_23_2set,Res44_Win_23_3set,Res44_Win_24,Res44_Win_24_2set,Res44_Win_24_3set);
        //45
        setResult(win25,win26,Res45_Win_25,Res45_Win_25_2set,Res45_Win_25_3set,Res45_Win_26,Res45_Win_26_2set,Res45_Win_26_3set);
        //46
        setResult(win27,win28,Res46_Win_27,Res46_Win_27_2set,Res46_Win_27_3set,Res46_Win_28,Res46_Win_28_2set,Res46_Win_28_3set);
        //47
        setResult(win29,win30,Res47_Win_29,Res47_Win_29_2set,Res47_Win_29_3set,Res47_Win_30,Res47_Win_30_2set,Res47_Win_30_3set);
        //48
        setResult(win31,win32,Res48_Win_31,Res48_Win_31_2set,Res48_Win_31_3set,Res48_Win_32,Res48_Win_32_2set,Res48_Win_32_3set);
        //49
        setResult(win33,win34,Res49_Win_33,Res49_Win_33_2set,Res49_Win_33_3set,Res49_Win_34,Res49_Win_34_2set,Res49_Win_34_3set);
        //50
        setResult(win35,win36,Res50_Win_35,Res50_Win_35_2set,Res50_Win_35_3set,Res50_Win_36,Res50_Win_36_2set,Res50_Win_36_3set);
        //51
        setResult(win37,win38,Res51_Win_37,Res51_Win_37_2set,Res51_Win_37_3set,Res51_Win_38,Res51_Win_38_2set,Res51_Win_38_3set);
        //52
        setResult(win39,win40,Res52_Win_39,Res52_Win_39_2set,Res52_Win_39_3set,Res52_Win_40,Res52_Win_40_2set,Res52_Win_40_3set);
        //53
        setResult(win41,win42,Res53_Win_41,Res53_Win_41_2set,Res53_Win_41_3set,Res53_Win_42,Res53_Win_42_2set,Res53_Win_42_3set);
        //54
        setResult(win43,win44,Res54_Win_43,Res54_Win_43_2set,Res54_Win_43_3set,Res54_Win_44,Res54_Win_44_2set,Res54_Win_44_3set);
        //55
        setResult(win45,win46,Res55_Win_45,Res55_Win_45_2set,Res55_Win_45_3set,Res55_Win_46,Res55_Win_46_2set,Res55_Win_46_3set);
        //56
        setResult(win47,win48,Res56_Win_47,Res56_Win_47_2set,Res56_Win_47_3set,Res56_Win_48,Res56_Win_48_2set,Res56_Win_48_3set);

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
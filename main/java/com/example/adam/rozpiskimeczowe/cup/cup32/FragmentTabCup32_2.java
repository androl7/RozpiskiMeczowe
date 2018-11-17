package com.example.adam.rozpiskimeczowe.cup.cup32;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
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


public class FragmentTabCup32_2 extends Fragment {
    View view;
    CustomAdapter customAdapter;
    TreeMap<Integer, Values> resultsOfMatches;
    Integer numberOfMatch=0;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment_tab_cup32_2, container, false);

        resultsOfMatches = new TreeMap<>();

        final ListView list = view.findViewById(R.id.listViewBrazFrag2);
        list.setItemsCanFocus(true);
        customAdapter = new CustomAdapter(Objects.requireNonNull(getActivity()).getApplicationContext());
        list.setAdapter(customAdapter);

        final SwipeRefreshLayout pullToRefresh = view.findViewById(R.id.cup32_pullToRefresh);
        pullToRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                assert getFragmentManager() != null;
                numberOfMatch=0;
                resultsOfMatches.clear();
                getFragmentManager().beginTransaction().detach(FragmentTabCup32_2.this).attach(FragmentTabCup32_2.this).commit();
                pullToRefresh.setRefreshing(false);
            }
        });


        final Button team1 = getActivity().findViewById(R.id.cup32Team01);
        final Button team2 = getActivity().findViewById(R.id.cup32Team2);
        final Button team3 = getActivity().findViewById(R.id.cup32Team3);
        final Button team4 = getActivity().findViewById(R.id.cup32Team4);
        final Button team5 = getActivity().findViewById(R.id.cup32Team5);
        final Button team6 = getActivity().findViewById(R.id.cup32Team6);
        final Button team7 = getActivity().findViewById(R.id.cup32Team7);
        final Button team8 = getActivity().findViewById(R.id.cup32Team8);
        final Button team9 = getActivity().findViewById(R.id.cup32Team9);
        final Button team10 = getActivity().findViewById(R.id.cup32Team10);
        final Button team11 = getActivity().findViewById(R.id.cup32Team11);
        final Button team12 = getActivity().findViewById(R.id.cup32Team12);
        final Button team13 = getActivity().findViewById(R.id.cup32Team13);
        final Button team14 = getActivity().findViewById(R.id.cup32Team14);
        final Button team15 = getActivity().findViewById(R.id.cup32Team15);
        final Button team16 = getActivity().findViewById(R.id.cup32Team16);
        final Button team17 = getActivity().findViewById(R.id.cup32Team17);
        final Button team18 = getActivity().findViewById(R.id.cup32Team18);
        final Button team19 = getActivity().findViewById(R.id.cup32Team19);
        final Button team20 = getActivity().findViewById(R.id.cup32Team20);
        final Button team21 = getActivity().findViewById(R.id.cup32Team21);
        final Button team22 = getActivity().findViewById(R.id.cup32Team22);
        final Button team23 = getActivity().findViewById(R.id.cup32Team23);
        final Button team24 = getActivity().findViewById(R.id.cup32Team24);
        final Button team25 = getActivity().findViewById(R.id.cup32Team25);
        final Button team26 = getActivity().findViewById(R.id.cup32Team26);
        final Button team27 = getActivity().findViewById(R.id.cup32Team27);
        final Button team28 = getActivity().findViewById(R.id.cup32Team28);
        final Button team29 = getActivity().findViewById(R.id.cup32Team29);
        final Button team30 = getActivity().findViewById(R.id.cup32Team30);
        final Button team31 = getActivity().findViewById(R.id.cup32Team31);
        final Button team32 = getActivity().findViewById(R.id.cup32Team32);

        final Button win1 = getActivity().findViewById(R.id.cup32WIN_1);
        final Button win2 = getActivity().findViewById(R.id.cup32WIN_2);
        final Button win3 = getActivity().findViewById(R.id.cup32WIN_3);
        final Button win4 = getActivity().findViewById(R.id.cup32WIN_4);
        final Button win5 = getActivity().findViewById(R.id.cup32WIN_5);
        final Button win6 = getActivity().findViewById(R.id.cup32WIN_6);
        final Button win7 = getActivity().findViewById(R.id.cup32WIN_7);
        final Button win8 = getActivity().findViewById(R.id.cup32WIN_8);
        final Button win9 = getActivity().findViewById(R.id.cup32WIN_9);
        final Button win10 = getActivity().findViewById(R.id.cup32WIN_10);
        final Button win11 = getActivity().findViewById(R.id.cup32WIN_11);
        final Button win12 = getActivity().findViewById(R.id.cup32WIN_12);
        final Button win13 = getActivity().findViewById(R.id.cup32WIN_13);
        final Button win14 = getActivity().findViewById(R.id.cup32WIN_14);
        final Button win15 = getActivity().findViewById(R.id.cup32WIN_15);
        final Button win16 = getActivity().findViewById(R.id.cup32WIN_16);
        /*final Button win17 = getActivity().findViewById(R.id.cup32WIN_17);
        final Button win18 = getActivity().findViewById(R.id.cup32WIN_18);
        final Button win19 = getActivity().findViewById(R.id.cup32WIN_19);
        final Button win20 = getActivity().findViewById(R.id.cup32WIN_20);
        final Button win21 = getActivity().findViewById(R.id.cup32WIN_21);
        final Button win22 = getActivity().findViewById(R.id.cup32WIN_22);
        final Button win23 = getActivity().findViewById(R.id.cup32WIN_23);
        final Button win24 = getActivity().findViewById(R.id.cup32WIN_24);*/


        final EditText res1_1 = getActivity().findViewById(R.id.cup32Res1_1);
        final EditText res1_1_2set = getActivity().findViewById(R.id.cup32Res1_1_2set);
        final EditText res1_1_3set = getActivity().findViewById(R.id.cup32Res1_1_3set);
        final EditText res1_32 = getActivity().findViewById(R.id.cup32Res1_32);
        final EditText res1_32_2set = getActivity().findViewById(R.id.cup32Res1_32_2set);
        final EditText res1_32_3set = getActivity().findViewById(R.id.cup32Res1_32_3set);


        final EditText res2_17 = getActivity().findViewById(R.id.cup32Res2_17);
        final EditText res2_17_2set = getActivity().findViewById(R.id.cup32Res2_17_2set);
        final EditText res2_17_3set = getActivity().findViewById(R.id.cup32Res2_17_3set);
        final EditText res2_16 = getActivity().findViewById(R.id.cup32Res2_16);
        final EditText res2_16_2set = getActivity().findViewById(R.id.cup32Res2_16_2set);
        final EditText res2_16_3set = getActivity().findViewById(R.id.cup32Res2_16_3set);


        final EditText res3_9 = getActivity().findViewById(R.id.cup32Res3_9);
        final EditText res3_9_2set = getActivity().findViewById(R.id.cup32Res3_9_2set);
        final EditText res3_9_3set = getActivity().findViewById(R.id.cup32Res3_9_3set);
        final EditText res3_24 = getActivity().findViewById(R.id.cup32Res3_24);
        final EditText res3_24_2set = getActivity().findViewById(R.id.cup32Res3_24_2set);
        final EditText res3_24_3set = getActivity().findViewById(R.id.cup32Res3_24_3set);


        final EditText res4_25 = getActivity().findViewById(R.id.cup32Res4_25);
        final EditText res4_25_2set = getActivity().findViewById(R.id.cup32Res4_25_2set);
        final EditText res4_25_3set = getActivity().findViewById(R.id.cup32Res4_25_3set);
        final EditText res4_8 = getActivity().findViewById(R.id.cup32Res4_8 );
        final EditText res4_8_2set = getActivity().findViewById(R.id.cup32Res4_8_2set);
        final EditText res4_8_3set = getActivity().findViewById(R.id.cup32Res4_8_3set);


        final EditText res5_5 = getActivity().findViewById(R.id.cup32Res5_5);
        final EditText res5_5_2set = getActivity().findViewById(R.id.cup32Res5_5_2set);
        final EditText res5_5_3set = getActivity().findViewById(R.id.cup32Res5_5_3set);
        final EditText res5_28 = getActivity().findViewById(R.id.cup32Res5_28);
        final EditText res5_28_2set = getActivity().findViewById(R.id.cup32Res5_28_2set);
        final EditText res5_28_3set = getActivity().findViewById(R.id.cup32Res5_28_3set);


        final EditText res6_21 = getActivity().findViewById(R.id.cup32Res6_21);
        final EditText res6_21_2set = getActivity().findViewById(R.id.cup32Res6_21_2set);
        final EditText res6_21_3set = getActivity().findViewById(R.id.cup32Res6_21_3set);
        final EditText res6_12 = getActivity().findViewById(R.id.cup32Res6_12);
        final EditText res6_12_2set = getActivity().findViewById(R.id.cup32Res6_12_2set);
        final EditText res6_12_3set = getActivity().findViewById(R.id.cup32Res6_12_3set);




        final EditText res7_13 = getActivity().findViewById(R.id.cup32Res7_13);
        final EditText res7_13_2set = getActivity().findViewById(R.id.cup32Res7_13_2set);
        final EditText res7_13_3set = getActivity().findViewById(R.id.cup32Res7_13_3set);
        final EditText res7_20 = getActivity().findViewById(R.id.cup32Res7_20);
        final EditText res7_20_2set = getActivity().findViewById(R.id.cup32Res7_20_2set);
        final EditText res7_20_3set = getActivity().findViewById(R.id.cup32Res7_20_3set);


        final EditText res8_29 = getActivity().findViewById(R.id.cup32Res8_29);
        final EditText res8_29_2set = getActivity().findViewById(R.id.cup32Res8_29_2set);
        final EditText res8_29_3set = getActivity().findViewById(R.id.cup32Res8_29_3set);
        final EditText res8_4 = getActivity().findViewById(R.id.cup32Res8_4);
        final EditText res8_4_2set = getActivity().findViewById(R.id.cup32Res8_4_2set);
        final EditText res8_4_3set = getActivity().findViewById(R.id.cup32Res8_4_3set);


        final EditText res9_3 = getActivity().findViewById(R.id.cup32Res9_3);
        final EditText res9_3_2set = getActivity().findViewById(R.id.cup32Res9_3_2set);
        final EditText res9_3_3set = getActivity().findViewById(R.id.cup32Res9_3_3set);
        final EditText res9_30 = getActivity().findViewById(R.id.cup32Res9_30);
        final EditText res9_30_2set = getActivity().findViewById(R.id.cup32Res9_30_2set);
        final EditText res9_30_3set = getActivity().findViewById(R.id.cup32Res9_30_3set);


        final EditText res10_19 = getActivity().findViewById(R.id.cup32Res10_19);
        final EditText res10_19_2set = getActivity().findViewById(R.id.cup32Res10_19_2set);
        final EditText res10_19_3set = getActivity().findViewById(R.id.cup32Res10_19_3set);
        final EditText res10_14 = getActivity().findViewById(R.id.cup32Res10_14);
        final EditText res10_14_2set = getActivity().findViewById(R.id.cup32Res10_14_2set);
        final EditText res10_14_3set = getActivity().findViewById(R.id.cup32Res10_14_3set);


        final EditText res11_11 = getActivity().findViewById(R.id.cup32Res11_11);
        final EditText res11_11_2set = getActivity().findViewById(R.id.cup32Res11_11_2set);
        final EditText res11_11_3set = getActivity().findViewById(R.id.cup32Res11_11_3set);
        final EditText res11_22 = getActivity().findViewById(R.id.cup32Res11_22);
        final EditText res11_22_2set = getActivity().findViewById(R.id.cup32Res11_22_2set);
        final EditText res11_22_3set = getActivity().findViewById(R.id.cup32Res11_22_3set);


        final EditText res12_27 = getActivity().findViewById(R.id.cup32Res12_27);
        final EditText res12_27_2set = getActivity().findViewById(R.id.cup32Res12_27_2set);
        final EditText res12_27_3set = getActivity().findViewById(R.id.cup32Res12_27_3set);
        final EditText res12_6 = getActivity().findViewById(R.id.cup32Res12_6);
        final EditText res12_6_2set = getActivity().findViewById(R.id.cup32Res12_6_2set);
        final EditText res12_6_3set = getActivity().findViewById(R.id.cup32Res12_6_3set);


        final EditText res13_7 = getActivity().findViewById(R.id.cup32Res13_7);
        final EditText res13_7_2set = getActivity().findViewById(R.id.cup32Res13_7_2set);
        final EditText res13_7_3set = getActivity().findViewById(R.id.cup32Res13_7_3set);
        final EditText res13_26 = getActivity().findViewById(R.id.cup32Res13_26);
        final EditText res13_26_2set = getActivity().findViewById(R.id.cup32Res13_26_2set);
        final EditText res13_26_3set = getActivity().findViewById(R.id.cup32Res13_26_3set);


        final EditText res14_23 = getActivity().findViewById(R.id.cup32Res14_23);
        final EditText res14_23_2set = getActivity().findViewById(R.id.cup32Res14_23_2set);
        final EditText res14_23_3set = getActivity().findViewById(R.id.cup32Res14_23_3set);
        final EditText res14_10 = getActivity().findViewById(R.id.cup32Res14_10);
        final EditText res14_10_2set = getActivity().findViewById(R.id.cup32Res14_10_2set);
        final EditText res14_10_3set = getActivity().findViewById(R.id.cup32Res14_10_3set);


        final EditText res15_15 = getActivity().findViewById(R.id.cup32Res15_15);
        final EditText res15_15_2set = getActivity().findViewById(R.id.cup32Res15_15_2set);
        final EditText res15_15_3set = getActivity().findViewById(R.id.cup32Res15_15_3set);
        final EditText res15_18 = getActivity().findViewById(R.id.cup32Res15_18);
        final EditText res15_18_2set = getActivity().findViewById(R.id.cup32Res15_18_2set);
        final EditText res15_18_3set = getActivity().findViewById(R.id.cup32Res15_18_3set);


        final EditText res16_31 = getActivity().findViewById(R.id.cup32Res16_31);
        final EditText res16_31_2set = getActivity().findViewById(R.id.cup32Res16_31_2set);
        final EditText res16_31_3set = getActivity().findViewById(R.id.cup32Res16_31_3set);
        final EditText res16_2 = getActivity().findViewById(R.id.cup32Res16_2);
        final EditText res16_2_2set = getActivity().findViewById(R.id.cup32Res16_2_2set);
        final EditText res16_2_3set = getActivity().findViewById(R.id.cup32Res16_2_3set);


        final EditText res17_Win_1 = getActivity().findViewById(R.id.cup32Res17_Win_1);
        final EditText res17_Win_1_2set = getActivity().findViewById(R.id.cup32Res17_Win_1_2set);
        final EditText res17_Win_1_3set = getActivity().findViewById(R.id.cup32Res17_Win_1_3set);
        final EditText res17_Win_2 = getActivity().findViewById(R.id.cup32Res17_Win_2);
        final EditText res17_Win_2_2set = getActivity().findViewById(R.id.cup32Res17_Win_2_2set);
        final EditText res17_Win_2_3set = getActivity().findViewById(R.id.cup32Res17_Win_2_3set);


        final EditText res18_Win_3 = getActivity().findViewById(R.id.cup32Res18_Win_3);
        final EditText res18_Win_3_2set = getActivity().findViewById(R.id.cup32Res18_Win_3_2set);
        final EditText res18_Win_3_3set = getActivity().findViewById(R.id.cup32Res18_Win_3_3set);
        final EditText res18_Win_4 = getActivity().findViewById(R.id.cup32Res18_Win_4);
        final EditText res18_Win_4_2set = getActivity().findViewById(R.id.cup32Res18_Win_4_2set);
        final EditText res18_Win_4_3set = getActivity().findViewById(R.id.cup32Res18_Win_4_3set);


        final EditText res19_Win_5 = getActivity().findViewById(R.id.cup32Res19_Win_5);
        final EditText res19_Win_5_2set = getActivity().findViewById(R.id.cup32Res19_Win_5_2set);
        final EditText res19_Win_5_3set = getActivity().findViewById(R.id.cup32Res19_Win_5_3set);
        final EditText res19_Win_6 = getActivity().findViewById(R.id.cup32Res19_Win_6);
        final EditText res19_Win_6_2set = getActivity().findViewById(R.id.cup32Res19_Win_6_2set);
        final EditText res19_Win_6_3set = getActivity().findViewById(R.id.cup32Res19_Win_6_3set);


        final EditText res20_Win_7 = getActivity().findViewById(R.id.cup32Res20_Win_7);
        final EditText res20_Win_7_2set = getActivity().findViewById(R.id.cup32Res20_Win_7_2set);
        final EditText res20_Win_7_3set = getActivity().findViewById(R.id.cup32Res20_Win_7_3set);
        final EditText res20_Win_8 = getActivity().findViewById(R.id.cup32Res20_Win_8);
        final EditText res20_Win_8_2set = getActivity().findViewById(R.id.cup32Res20_Win_8_2set);
        final EditText res20_Win_8_3set = getActivity().findViewById(R.id.cup32Res20_Win_8_3set);


        final EditText res21_Win_9 = getActivity().findViewById(R.id.cup32Res21_Win_9);
        final EditText res21_Win_9_2set = getActivity().findViewById(R.id.cup32Res21_Win_9_2set);
        final EditText res21_Win_9_3set = getActivity().findViewById(R.id.cup32Res21_Win_9_3set);
        final EditText res21_Win_10 = getActivity().findViewById(R.id.cup32Res21_Win_10);
        final EditText res21_Win_10_2set = getActivity().findViewById(R.id.cup32Res21_Win_10_2set);
        final EditText res21_Win_10_3set = getActivity().findViewById(R.id.cup32Res21_Win_10_3set);


        final EditText res22_Win_11 = getActivity().findViewById(R.id.cup32Res22_Win_11);
        final EditText res22_Win_11_2set = getActivity().findViewById(R.id.cup32Res22_Win_11_2set);
        final EditText res22_Win_11_3set = getActivity().findViewById(R.id.cup32Res22_Win_11_3set);
        final EditText res22_Win_12 = getActivity().findViewById(R.id.cup32Res22_Win_12);
        final EditText res22_Win_12_2set = getActivity().findViewById(R.id.cup32Res22_Win_12_2set);
        final EditText res22_Win_12_3set = getActivity().findViewById(R.id.cup32Res22_Win_12_3set);


        final EditText res23_Win_13 = getActivity().findViewById(R.id.cup32Res23_Win_13);
        final EditText res23_Win_13_2set = getActivity().findViewById(R.id.cup32Res23_Win_13_2set);
        final EditText res23_Win_13_3set = getActivity().findViewById(R.id.cup32Res23_Win_13_3set);
        final EditText res23_Win_14 = getActivity().findViewById(R.id.cup32Res23_Win_14);
        final EditText res23_Win_14_2set = getActivity().findViewById(R.id.cup32Res23_Win_14_2set);
        final EditText res23_Win_14_3set = getActivity().findViewById(R.id.cup32Res23_Win_14_3set);


        final EditText res24_Win_15 = getActivity().findViewById(R.id.cup32Res24_Win_15);
        final EditText res24_Win_15_2set = getActivity().findViewById(R.id.cup32Res24_Win_15_2set);
        final EditText res24_Win_15_3set = getActivity().findViewById(R.id.cup32Res24_Win_15_3set);
        final EditText res24_Win_16 = getActivity().findViewById(R.id.cup32Res24_Win_16);
        final EditText res24_Win_16_2set = getActivity().findViewById(R.id.cup32Res24_Win_16_2set);
        final EditText res24_Win_16_3set = getActivity().findViewById(R.id.cup32Res24_Win_16_3set);


        setResult(team1,team32,res1_1,res1_1_2set,res1_1_3set,res1_32,res1_32_2set,res1_32_3set);

        setResult(team17,team16,res2_17,res2_17_2set,res2_17_3set,res2_16,res2_16_2set,res2_16_3set);

        setResult(team9,team24,res3_9,res3_9_2set,res3_9_3set,res3_24,res3_24_2set,res3_24_3set);

        setResult(team25,team8,res4_25,res4_25_2set,res4_25_3set,res4_8,res4_8_2set,res4_8_3set);

        setResult(team5,team28,res5_5,res5_5_2set,res5_5_3set,res5_28,res5_28_2set,res5_28_3set);

        setResult(team21,team12,res6_21,res6_21_2set,res6_21_3set,res6_12,res6_12_2set,res6_12_3set);

        setResult(team13,team20,res7_13,res7_13_2set,res7_13_3set,res7_20,res7_20_2set,res7_20_3set);

        setResult(team29,team4,res8_29,res8_29_2set,res8_29_3set,res8_4,res8_4_2set,res8_4_3set);

        setResult(team3,team30,res9_3,res9_3_2set,res9_3_3set,res9_30,res9_30_2set,res9_30_3set);

        setResult(team19,team14,res10_19,res10_19_2set,res10_19_3set,res10_14,res10_14_2set,res10_14_3set);

        setResult(team11,team22,res11_11,res11_11_2set,res11_11_3set,res11_22,res11_22_2set,res11_22_3set);

        setResult(team27,team6,res12_27,res12_27_2set,res12_27_3set,res12_6,res12_6_2set,res12_6_3set);

        setResult(team7,team26,res13_7,res13_7_2set,res13_7_3set,res13_26,res13_26_2set,res13_26_3set);

        setResult(team23,team10,res14_23,res14_23_2set,res14_23_3set,res14_10,res14_10_2set,res14_10_3set);

        setResult(team15,team18,res15_15,res15_15_2set,res15_15_3set,res15_18,res15_18_2set,res15_18_3set);

        setResult(team31,team2,res16_31,res16_31_2set,res16_31_3set,res16_2,res16_2_2set,res16_2_3set);


        setResult(win1,win2,res17_Win_1,res17_Win_1_2set,res17_Win_1_3set,res17_Win_2,res17_Win_2_2set,res17_Win_2_3set);

        setResult(win3,win4,res18_Win_3,res18_Win_3_2set,res18_Win_3_3set,res18_Win_4,res18_Win_4_2set,res18_Win_4_3set);

        setResult(win5,win6,res19_Win_5,res19_Win_5_2set,res19_Win_5_3set,res19_Win_6,res19_Win_6_2set,res19_Win_6_3set);

        setResult(win7,win8,res20_Win_7,res20_Win_7_2set,res20_Win_7_3set,res20_Win_8,res20_Win_8_2set,res20_Win_8_3set);

        setResult(win9,win10,res21_Win_9,res21_Win_9_2set,res21_Win_9_3set,res21_Win_10,res21_Win_10_2set,res21_Win_10_3set);

        setResult(win11,win12,res22_Win_11,res22_Win_11_2set,res22_Win_11_3set,res22_Win_12,res22_Win_12_2set,res22_Win_12_3set);

        setResult(win13,win14,res23_Win_13,res23_Win_13_2set,res23_Win_13_3set,res23_Win_14,res23_Win_14_2set,res23_Win_14_3set);

        setResult(win15,win16,res24_Win_15,res24_Win_15_2set,res24_Win_15_3set,res24_Win_16,res24_Win_16_2set,res24_Win_16_3set);



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

            int b = resultsOfMatches.size()-position-1;
            Integer key = Integer.parseInt(resultsOfMatches.keySet().toArray()[b].toString());

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
package com.example.adam.rozpiskimeczowe.cup.cup64Normal;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.adam.rozpiskimeczowe.R;

import java.util.Objects;
import java.util.TreeMap;


public class FragmentTabCup64_3norm extends Fragment {
    View view;
    CustomAdapter customAdapter;
    TreeMap<Integer, String> losersOfMatches;
    Integer numberOfMatch = 0;
    String quantityOfTeams;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment_tab_cup64_3, container, false);

        losersOfMatches = new TreeMap<>();

        final ListView list = view.findViewById(R.id.listViewCup64Frag3);
        list.setItemsCanFocus(true);
        quantityOfTeams = getActivity().getIntent().getStringExtra("quantityOfTeams");

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

        final Button win49 = getActivity().findViewById(R.id.cup64WIN_49);
        final Button win50 = getActivity().findViewById(R.id.cup64WIN_50);
        final Button win51 = getActivity().findViewById(R.id.cup64WIN_51);
        final Button win52 = getActivity().findViewById(R.id.cup64WIN_52);
        final Button win53 = getActivity().findViewById(R.id.cup64WIN_53);
        final Button win54 = getActivity().findViewById(R.id.cup64WIN_54);
        final Button win55 = getActivity().findViewById(R.id.cup64WIN_55);
        final Button win56 = getActivity().findViewById(R.id.cup64WIN_56);


        //1
        setResult(team1, team64, win1);
        //2
        setResult(team33, team32, win2);
        //3
        setResult(team17, team48, win3);
        //4
        setResult(team49, team16, win4);
        //5
        setResult(team9, team56, win5);
        //6
        setResult(team41, team24, win6);
        //7
        setResult(team25, team40, win7);
        //8
        setResult(team57, team8, win8);
        //9
        setResult(team5, team60, win9);
        //10
        setResult(team37, team28, win10);
        //11
        setResult(team21, team44, win11);
        //12
        setResult(team53, team12, win12);
        //13
        setResult(team13, team52, win13);
        //14
        setResult(team45, team20, win14);
        //15
        setResult(team29, team36, win15);
        //16
        setResult(team61, team4, win16);
        //17
        setResult(team3, team62, win17);
        //18
        setResult(team35, team30, win18);
        //19
        setResult(team19, team46, win19);
        //20
        setResult(team51, team14, win20);
        //21
        setResult(team11, team54, win21);
        //22
        setResult(team43, team22, win22);
        //23
        setResult(team27, team38, win23);
        //24
        setResult(team59, team6, win24);
        //25
        setResult(team7, team58, win25);
        //26
        setResult(team39, team26, win26);
        //27
        setResult(team23, team42, win27);
        //28
        setResult(team55, team10, win28);
        //29
        setResult(team15, team50, win29);
        //30
        setResult(team47, team18, win30);
        //31
        setResult(team31, team34, win31);
        //32
        setResult(team63, team2, win32);

        //33
        setResult(win1, win2, win33);
        //34
        setResult(win3, win4, win34);
        //35
        setResult(win5, win6, win35);
        //36
        setResult(win7, win8, win36);
        //37
        setResult(win9, win10, win37);
        //38
        setResult(win11, win12, win38);
        //39
        setResult(win13, win14, win39);
        //40
        setResult(win15, win16, win40);
        //41
        setResult(win17, win18, win41);
        //42
        setResult(win19, win20, win42);
        //43
        setResult(win21, win22, win43);
        //44
        setResult(win23, win24, win44);
        //45
        setResult(win25, win26, win45);
        //46
        setResult(win27, win28, win46);
        //47
        setResult(win29, win30, win47);
        //48
        setResult(win31, win32, win48);
        //49
        setResult(win33, win34, win49);
        //50
        setResult(win35, win36, win50);
        //51
        setResult(win37, win38, win51);
        //52
        setResult(win39, win40, win52);
        //53
        setResult(win41, win42, win53);
        //54
        setResult(win43, win44, win54);
        //55
        setResult(win45, win46, win55);
        //56
        setResult(win47, win48, win56);

        for(int i=losersOfMatches.size()-1;i>0;i--){
            if (checkLossers(losersOfMatches.get(losersOfMatches.keySet().toArray()[i])) && checkLossers(losersOfMatches.get(losersOfMatches.keySet().toArray()[i-1]))) {
                losersOfMatches.remove(losersOfMatches.keySet().toArray()[i]);
            }
        }

        customAdapter = new CustomAdapter(Objects.requireNonNull(getActivity()).getApplicationContext(), losersOfMatches);
        list.setAdapter(customAdapter);

        return view;
    }


        //refresh fragment
        @Override
        public void setUserVisibleHint ( boolean isVisibleToUser){
            super.setUserVisibleHint(isVisibleToUser);
            if (isVisibleToUser) {
                assert getFragmentManager() != null;
                numberOfMatch = 0;
                losersOfMatches.clear();
                getFragmentManager().beginTransaction().detach(this).attach(this).commit();
            }
        }

        void setResult (Button team1, Button team2, Button winnerOfMatch){

            if (numberOfMatch == 0) {
                if (quantityOfTeams.equals("41")) {
                    String value = "41";
                    losersOfMatches.put(numberOfMatch, value);
                    numberOfMatch++;
                } else {
                    String value = "41 - " + quantityOfTeams;
                    losersOfMatches.put(numberOfMatch, value);
                    numberOfMatch++;
                }
            }

            if (numberOfMatch == 33) {
                String value = "25 - 40";
                losersOfMatches.put(numberOfMatch, value);
                numberOfMatch++;
            }
            if (numberOfMatch == 50) {
                String value = "17 - 24";
                losersOfMatches.put(numberOfMatch, value);
                numberOfMatch++;
            }

            String strTeam1 = team1.getText().toString();
            String strTeam2 = team2.getText().toString();
            String winner = winnerOfMatch.getText().toString();
            if (strTeam2.equals(winner) && !strTeam1.equals("")) {
                losersOfMatches.put(numberOfMatch, strTeam1);
            } else if (strTeam1.equals(winner) && !strTeam2.equals("")) {
                losersOfMatches.put(numberOfMatch, strTeam2);
            }
            numberOfMatch++;
        }


    class CustomAdapter extends BaseAdapter {
        private Context context;
        TreeMap<Integer, String> losersOfMatches;


        CustomAdapter(Context context, TreeMap<Integer, String> losersOfMatches) {
            this.context = context;
            this.losersOfMatches = losersOfMatches;
        }

        @Override
        public int getCount() {
            return losersOfMatches.size();
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
            convertView = inflater.inflate(R.layout.fragment3_item_list, null, true);


            holder.textViewTeam = convertView.findViewById(R.id.fragment3TextView);
            Object key = losersOfMatches.keySet().toArray()[position];
            String teamStr = losersOfMatches.get(key);
            teamStr = teamStr.replace("\n", "/");
            holder.textViewTeam.setText(teamStr);

            if (checkLossers(holder.textViewTeam.getText().toString())) {
                holder.textViewTeam.setTextSize(20F);
                holder.textViewTeam.setTypeface(null, Typeface.BOLD);
            } else {
                holder.textViewTeam.setTextSize(15F);
                holder.textViewTeam.setVisibility(View.VISIBLE);
            }

            convertView.setTag(holder);


            return convertView;
        }

        private class ViewHolder {
            TextView textViewTeam;
        }


    }
    boolean checkLossers(String valueToCheck){
        return valueToCheck.equals("41")||valueToCheck.equals("41 - " + quantityOfTeams)||valueToCheck.equals("25 - 40")||valueToCheck.equals("17 - 24");
    }

}



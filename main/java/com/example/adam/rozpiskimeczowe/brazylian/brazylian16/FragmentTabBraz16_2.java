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

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment_tab_braz16_2, container, false);

        resultsOfMatches = new TreeMap<>();

        final ListView list = view.findViewById(R.id.listViewBrazFrag2);
        list.setItemsCanFocus(true);
        customAdapter = new CustomAdapter(Objects.requireNonNull(getActivity()).getApplicationContext());
        list.setAdapter(customAdapter);

        //1 match
        final Button team1 = getActivity().findViewById(R.id.Team01);
        final Button team2 = getActivity().findViewById(R.id.Team02);
        final Button team3 = getActivity().findViewById(R.id.Team03);
        final Button team4 = getActivity().findViewById(R.id.Team04);
        final Button team5 = getActivity().findViewById(R.id.Team05);
        final Button team6 = getActivity().findViewById(R.id.Team06);
        final Button team7 = getActivity().findViewById(R.id.Team07);
        final Button team8 = getActivity().findViewById(R.id.Team08);

        final Button win1 = getActivity().findViewById(R.id.WIN_1);
        final Button win2 = getActivity().findViewById(R.id.WIN_2);
        final Button win3 = getActivity().findViewById(R.id.WIN_3);
        final Button win4 = getActivity().findViewById(R.id.WIN_4);
        final Button win5 = getActivity().findViewById(R.id.Win_5);
        final Button win6 = getActivity().findViewById(R.id.Win_6);
        final Button win7 = getActivity().findViewById(R.id.WIN_7);
        final Button win8 = getActivity().findViewById(R.id.WIN_8);
        final Button win9 = getActivity().findViewById(R.id.WIN_9);
        final Button win10 = getActivity().findViewById(R.id.WIN_10);
        final Button win11 = getActivity().findViewById(R.id.WIN_11);
        final Button win12 = getActivity().findViewById(R.id.WIN_12);

        final Button lost1 = getActivity().findViewById(R.id.LOST_1);
        final Button lost2 = getActivity().findViewById(R.id.LOST_2);
        final Button lost3 = getActivity().findViewById(R.id.LOST_3);
        final Button lost4 = getActivity().findViewById(R.id.LOST_4);
        final Button lost5 = getActivity().findViewById(R.id.LOST_5);
        final Button lost6 = getActivity().findViewById(R.id.LOST_6);
        final Button lost11 = getActivity().findViewById(R.id.LOST_11);
        final Button lost12 = getActivity().findViewById(R.id.LOST_12);


        final EditText res1_1 = getActivity().findViewById(R.id.brazRes1_1);
        final EditText res1_1_2set = getActivity().findViewById(R.id.brazRes1_1_2set);
        final EditText res1_1_3set = getActivity().findViewById(R.id.brazRes1_1_3set);
        final EditText res1_8 = getActivity().findViewById(R.id.brazRes1_8);
        final EditText res1_8_2set = getActivity().findViewById(R.id.brazRes1_8_2set);
        final EditText res1_8_3set = getActivity().findViewById(R.id.brazRes1_8_3set);

        final EditText res2_6 = getActivity().findViewById(R.id.brazRes2_6);
        final EditText res2_6_2set = getActivity().findViewById(R.id.brazRes2_6_2set);
        final EditText res2_6_3set = getActivity().findViewById(R.id.brazRes2_6_3set);
        final EditText res2_3 = getActivity().findViewById(R.id.brazRes2_3);
        final EditText res2_3_2set = getActivity().findViewById(R.id.brazRes2_3_2set);
        final EditText res2_3_3set = getActivity().findViewById(R.id.brazRes2_3_3set);

        final EditText res3_4 = getActivity().findViewById(R.id.brazRes3_4);
        final EditText res3_4_2set = getActivity().findViewById(R.id.brazRes3_4_2set);
        final EditText res3_4_3set = getActivity().findViewById(R.id.brazRes3_4_3set);
        final EditText res3_5 = getActivity().findViewById(R.id.brazRes3_5);
        final EditText res3_5_2set = getActivity().findViewById(R.id.brazRes3_5_2set);
        final EditText res3_5_3set = getActivity().findViewById(R.id.brazRes3_5_3set);

        final EditText res4_7 = getActivity().findViewById(R.id.brazRes4_7);
        final EditText res4_7_2set = getActivity().findViewById(R.id.brazRes4_7_2set);
        final EditText res4_7_3set = getActivity().findViewById(R.id.brazRes4_7_3set);
        final EditText res4_2 = getActivity().findViewById(R.id.brazRes4_2);
        final EditText res4_2_2set = getActivity().findViewById(R.id.brazRes4_2_2set);
        final EditText res4_2_3set = getActivity().findViewById(R.id.brazRes4_2_3set);

        final EditText brazRes5_Win_1 = getActivity().findViewById(R.id.brazRes5_Win_1);
        final EditText brazRes5_Win_1_2set = getActivity().findViewById(R.id.brazRes5_Win_1_2set);
        final EditText brazRes5_Win_1_3set = getActivity().findViewById(R.id.brazRes5_Win_1_3set);
        final EditText brazRes5_Win_2 = getActivity().findViewById(R.id.brazRes5_Win_2);
        final EditText brazRes5_Win_2_2set = getActivity().findViewById(R.id.brazRes5_Win_2_2set);
        final EditText brazRes5_Win_2_3set = getActivity().findViewById(R.id.brazRes5_Win_2_3set);

        final EditText brazRes6_Win_3 = getActivity().findViewById(R.id.brazRes6_Win_3);
        final EditText brazRes6_Win_3_2set = getActivity().findViewById(R.id.brazRes6_Win_3_2set);
        final EditText brazRes6_Win_3_3set = getActivity().findViewById(R.id.brazRes6_Win_3_3set);
        final EditText brazRes6_Win_4 = getActivity().findViewById(R.id.brazRes6_Win_4);
        final EditText brazRes6_Win_4_2set = getActivity().findViewById(R.id.brazRes6_Win_4_2set);
        final EditText brazRes6_Win_4_3set = getActivity().findViewById(R.id.brazRes6_Win_4_3set);

        final EditText brazRes7_Lost_1 = getActivity().findViewById(R.id.brazRes7_Lost_1);
        final EditText brazRes7_Lost_1_2set = getActivity().findViewById(R.id.brazRes7_Lost_1_2set);
        final EditText brazRes7_Lost_1_3set = getActivity().findViewById(R.id.brazRes7_Lost_1_3set);
        final EditText brazRes7_Lost_2 = getActivity().findViewById(R.id.brazRes7_Lost_2);
        final EditText brazRes7_Lost_2_2set = getActivity().findViewById(R.id.brazRes7_Lost_2_2set);
        final EditText brazRes7_Lost_2_3set = getActivity().findViewById(R.id.brazRes7_Lost_2_3set);

        final EditText brazRes8_Lost_3 = getActivity().findViewById(R.id.brazRes8_Lost_3);
        final EditText brazRes8_Lost_3_2set = getActivity().findViewById(R.id.brazRes8_Lost_3_2set);
        final EditText brazRes8_Lost_3_3set = getActivity().findViewById(R.id.brazRes8_Lost_3_3set);
        final EditText brazRes8_Lost_4 = getActivity().findViewById(R.id.brazRes8_Lost_4);
        final EditText brazRes8_Lost_4_2set = getActivity().findViewById(R.id.brazRes8_Lost_4_2set);
        final EditText brazRes8_Lost_4_3set = getActivity().findViewById(R.id.brazRes8_Lost_4_3set);

        final EditText brazRes9_Lost_6 = getActivity().findViewById(R.id.brazRes9_Lost_6);
        final EditText brazRes9_Lost_6_2set = getActivity().findViewById(R.id.brazRes9_Lost_6_2set);
        final EditText brazRes9_Lost_6_3set = getActivity().findViewById(R.id.brazRes9_Lost_6_3set);
        final EditText brazRes9_Win_7 = getActivity().findViewById(R.id.brazRes9_Win_7);
        final EditText brazRes9_Win_7_2set = getActivity().findViewById(R.id.brazRes9_Win_7_2set);
        final EditText brazRes9_Win_7_3set = getActivity().findViewById(R.id.brazRes9_Win_7_3set);

        final EditText brazRes10_Lost_5 = getActivity().findViewById(R.id.brazRes10_Lost_5);
        final EditText brazRes10_Lost_5_2set = getActivity().findViewById(R.id.brazRes10_Lost_5_2set);
        final EditText brazRes10_Lost_5_3set = getActivity().findViewById(R.id.brazRes10_Lost_5_3set);
        final EditText brazRes10_Win_8 = getActivity().findViewById(R.id.brazRes10_Win_8);
        final EditText brazRes10_Win_8_2set = getActivity().findViewById(R.id.brazRes10_Win_8_2set);
        final EditText brazRes10_Win_8_3set = getActivity().findViewById(R.id.brazRes10_Win_8_3set);

        final EditText brazRes11_Win_5 = getActivity().findViewById(R.id.brazRes11_Win_5);
        final EditText brazRes11_Win_5_2set = getActivity().findViewById(R.id.brazRes11_Win_5_2set);
        final EditText brazRes11_Win_5_3set = getActivity().findViewById(R.id.brazRes11_Win_5_3set);
        final EditText brazRes11_Win_9 = getActivity().findViewById(R.id.brazRes11_Win_9);
        final EditText brazRes11_Win_9_2set = getActivity().findViewById(R.id.brazRes11_Win_9_2set);
        final EditText brazRes11_Win_9_3set = getActivity().findViewById(R.id.brazRes11_Win_9_3set);

        final EditText brazRes12_Win_6 = getActivity().findViewById(R.id.brazRes12_Win_6);
        final EditText brazRes12_Win_6_2set = getActivity().findViewById(R.id.brazRes12_Win_6_2set);
        final EditText brazRes12_Win_6_3set = getActivity().findViewById(R.id.brazRes12_Win_6_3set);
        final EditText brazRes12_Win_10 = getActivity().findViewById(R.id.brazRes12_Win_10);
        final EditText brazRes12_Win_10_2set = getActivity().findViewById(R.id.brazRes12_Win_10_2set);
        final EditText brazRes12_Win_10_3set = getActivity().findViewById(R.id.brazRes12_Win_10_3set);

        final EditText brazRes13_Lost_11 = getActivity().findViewById(R.id.brazRes13_Lost_11);
        final EditText brazRes13_Lost_11_2set = getActivity().findViewById(R.id.brazRes13_Lost_11_2set);
        final EditText brazRes13_Lost_11_3set = getActivity().findViewById(R.id.brazRes13_Lost_11_3set);
        final EditText brazRes13_Lost_12 = getActivity().findViewById(R.id.brazRes13_Lost_12);
        final EditText brazRes13_Lost_12_2set = getActivity().findViewById(R.id.brazRes13_Lost_12_2set);
        final EditText brazRes13_Lost_12_3set = getActivity().findViewById(R.id.brazRes13_Lost_12_3set);

        final EditText brazRes14_Win_11 = getActivity().findViewById(R.id.brazRes14_Win_11);
        final EditText brazRes14_Win_11_2set = getActivity().findViewById(R.id.brazRes14_Win_11_2set);
        final EditText brazRes14_Win_11_3set = getActivity().findViewById(R.id.brazRes14_Win_11_3set);
        final EditText brazRes14_Win_12 = getActivity().findViewById(R.id.brazRes14_Win_12);
        final EditText brazRes14_Win_12_2set = getActivity().findViewById(R.id.brazRes14_Win_12_2set);
        final EditText brazRes14_Win_12_3set = getActivity().findViewById(R.id.brazRes14_Win_12_3set);


        // 1
        setResult(1, team1, team8, res1_1, res1_1_2set,res1_1_3set, res1_8, res1_8_2set, res1_8_3set);

        // 2
        setResult(2, team6, team3, res2_6, res2_6_2set,res2_6_3set,  res2_3, res2_3_2set, res2_3_3set);

        // 3
        setResult(3, team4, team5, res3_4, res3_4_2set, res3_4_3set, res3_5, res3_5_2set, res3_5_3set);

        // 4
        setResult(4, team7, team2, res4_2, res4_2_2set,res4_2_3set, res4_7, res4_7_2set, res4_7_3set);

        // 5

        setResult(5, win1, win2, brazRes5_Win_1, brazRes5_Win_1_2set,brazRes5_Win_1_3set, brazRes5_Win_2, brazRes5_Win_2_2set, brazRes5_Win_2_3set);

        // 6
        setResult(6, win3, win4, brazRes6_Win_3, brazRes6_Win_3_2set,brazRes6_Win_3_3set, brazRes6_Win_4, brazRes6_Win_4_2set, brazRes6_Win_4_3set);

        //7
        setResult(7, lost1, lost2, brazRes7_Lost_1, brazRes7_Lost_1_2set,brazRes7_Lost_1_3set, brazRes7_Lost_2, brazRes7_Lost_2_2set, brazRes7_Lost_2_3set);

        //8
        setResult(8, lost3, lost4, brazRes8_Lost_3, brazRes8_Lost_3_2set, brazRes8_Lost_3_3set, brazRes8_Lost_4, brazRes8_Lost_4_2set, brazRes8_Lost_4_3set);

        //9
        setResult(9, lost6, win7, brazRes9_Lost_6, brazRes9_Lost_6_2set, brazRes9_Lost_6_3set, brazRes9_Win_7, brazRes9_Win_7_2set, brazRes9_Win_7_3set);

        //10
        setResult(10, win8, lost5, brazRes10_Lost_5, brazRes10_Lost_5_2set, brazRes10_Lost_5_3set, brazRes10_Win_8, brazRes10_Win_8_2set, brazRes10_Win_8_3set);

        //11
        setResult(11, win5, win9, brazRes11_Win_5, brazRes11_Win_5_2set, brazRes11_Win_5_3set, brazRes11_Win_9, brazRes11_Win_9_2set,brazRes11_Win_9_3set);

        //12
        setResult(12, win6, win10, brazRes12_Win_6, brazRes12_Win_6_2set, brazRes12_Win_6_3set, brazRes12_Win_10, brazRes12_Win_10_2set, brazRes12_Win_10_3set);

        //13
        setResult(13, lost11, lost12, brazRes13_Lost_11, brazRes13_Lost_11_2set,brazRes13_Lost_11_3set, brazRes13_Lost_12, brazRes13_Lost_12_2set, brazRes13_Lost_12_3set);

        //14 FINAL
        setResult(14, win11, win12, brazRes14_Win_11, brazRes14_Win_11_2set, brazRes14_Win_11_3set, brazRes14_Win_12, brazRes14_Win_12_2set, brazRes14_Win_12_3set);


        return view;
    }

    //refresh fragment
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            assert getFragmentManager() != null;
            resultsOfMatches.clear();
            getFragmentManager().beginTransaction().detach(this).attach(this).commit();
        }
    }

    void setResult(Integer numberOfMatch, Button team1, Button team2, EditText res1, EditText res1_2set,EditText res1_3set, EditText res2, EditText res2_2set, EditText res2_3set) {
        if (!res1.getText().toString().equals("")) {
            Values value = new Values(numberOfMatch,team1.getText().toString(),team2.getText().toString(),res1.getText().toString(),res1_2set.getText().toString(),res1_3set.getText().toString(),res2.getText().toString(),res2_2set.getText().toString(),res2_3set.getText().toString());
            resultsOfMatches.put(numberOfMatch,value);

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
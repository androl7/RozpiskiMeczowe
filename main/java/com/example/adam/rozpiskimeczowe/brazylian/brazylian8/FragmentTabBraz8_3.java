package com.example.adam.rozpiskimeczowe.brazylian.brazylian8;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
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

public class FragmentTabBraz8_3 extends Fragment {
    View view;
    CustomAdapter customAdapter;
    TreeMap<Integer, String> losersOfMatches;
    Integer numberOfMatch = 0;
    String quantityOfTeams;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment_tab_braz8_3, container, false);
        losersOfMatches = new TreeMap<>();

        final ListView list = view.findViewById(R.id.listViewBraz8Frag3);
        list.setItemsCanFocus(true);
        quantityOfTeams = getActivity().getIntent().getStringExtra("quantityOfTeams");

        final Button win7 = getActivity().findViewById(R.id.braz8WIN_7);
        final Button win8 = getActivity().findViewById(R.id.braz8WIN_8);
        final Button win9 = getActivity().findViewById(R.id.braz8WIN_9);
        final Button win10 = getActivity().findViewById(R.id.braz8WIN_10);
        final Button win11 = getActivity().findViewById(R.id.braz8WIN_11);
        final Button win12 = getActivity().findViewById(R.id.braz8WIN_12);
        final Button win13 = getActivity().findViewById(R.id.braz8WIN_13);
        final Button win14 = getActivity().findViewById(R.id.braz8WIN_14);


        final Button lost1 = getActivity().findViewById(R.id.braz8LOST_1);
        final Button lost2 = getActivity().findViewById(R.id.braz8LOST_2);
        final Button lost3 = getActivity().findViewById(R.id.braz8LOST_3);
        final Button lost4 = getActivity().findViewById(R.id.braz8LOST_4);
        final Button lost5 = getActivity().findViewById(R.id.braz8LOST_5);
        final Button lost6 = getActivity().findViewById(R.id.braz8LOST_6);

        final Button lost11 = getActivity().findViewById(R.id.braz8LOST_11);
        final Button lost12 = getActivity().findViewById(R.id.braz8LOST_12);


        //7 MECZ
        setResult(lost1, lost2, win7);

        //8 MECZ
        setResult(lost3, lost4, win8);

        //9 MECZ
        setResult(lost6, win7, win9);

        //10 MECZ
        setResult(lost5, win8, win10);

        //13
        setResult(lost11, lost12, win13);

        //14
        setResult(win11, win12, win14);


        for (int i = losersOfMatches.size() - 1; i > 0; i--) {
            if (checkLossers(losersOfMatches.get(losersOfMatches.keySet().toArray()[i])) && checkLossers(losersOfMatches.get(losersOfMatches.keySet().toArray()[i - 1]))) {
                losersOfMatches.remove(losersOfMatches.keySet().toArray()[i]);
            }
        }
        customAdapter = new CustomAdapter(Objects.requireNonNull(getActivity()).getApplicationContext(), losersOfMatches);
        list.setAdapter(customAdapter);

        return view;


    }


    //refresh fragment
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            assert getFragmentManager() != null;
            numberOfMatch = 0;
            losersOfMatches.clear();
            getFragmentManager().beginTransaction().detach(this).attach(this).commit();
        }
    }

    void setResult(Button team1, Button team2, Button winnerOfMatch) {

        if (numberOfMatch == 0) {

            String value = "7 - 8";
            losersOfMatches.put(numberOfMatch, value);
            numberOfMatch++;
        }

        if (numberOfMatch == 3) {
            String value = "5 - 6";
            losersOfMatches.put(numberOfMatch, value);
            numberOfMatch++;
        }

        if (numberOfMatch == 6) {
            String value = "4";
            losersOfMatches.put(numberOfMatch, value);
            numberOfMatch++;
        }

        if (numberOfMatch == 8) {
            String value = "3";
            losersOfMatches.put(numberOfMatch, value);
            numberOfMatch++;
        }

        if (numberOfMatch == 10) {
            String value = "2";
            losersOfMatches.put(numberOfMatch, value);
            numberOfMatch++;
        }
        if (numberOfMatch == 12) {
            String value = "1";
            losersOfMatches.put(numberOfMatch, value);
            numberOfMatch++;
        }


        String strTeam1 = team1.getText().toString();
        String strTeam2 = team2.getText().toString();
        String winner = winnerOfMatch.getText().toString();

        if (strTeam2.equals(winner) && !strTeam1.equals("")) {
            if(numberOfMatch ==9||numberOfMatch==13) {
                losersOfMatches.put(numberOfMatch, strTeam2);
            }else {
                losersOfMatches.put(numberOfMatch, strTeam1);
            }

            if (numberOfMatch == 7) {
                losersOfMatches.put(numberOfMatch, strTeam1);
                numberOfMatch++;
                setResult(team1,team2,winnerOfMatch);
                return;
            }



            if (numberOfMatch == 11) {
                losersOfMatches.put(numberOfMatch, strTeam1);
                numberOfMatch++;
                setResult(team1,team2,winnerOfMatch);
                return;
            }



        } else if (strTeam1.equals(winner) && !strTeam2.equals("")) {
            if(numberOfMatch ==9||numberOfMatch==13) {
                losersOfMatches.put(numberOfMatch, strTeam1);
            }else {
                losersOfMatches.put(numberOfMatch, strTeam2);
            }

            if (numberOfMatch == 7) {
                losersOfMatches.put(numberOfMatch, strTeam2);
                numberOfMatch++;
                setResult(team1,team2,winnerOfMatch);
                return;
            }

            if (numberOfMatch == 11) {
                losersOfMatches.put(numberOfMatch, strTeam2);
                numberOfMatch++;
                setResult(team1,team2,winnerOfMatch);
                return;
            }

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

    boolean checkLossers(String valueToCheck) {
        return valueToCheck.equals("7 - 8") || valueToCheck.equals("5 - 6") || valueToCheck.equals("4") || valueToCheck.equals("3") || valueToCheck.equals("2") || valueToCheck.equals("1");
    }
}

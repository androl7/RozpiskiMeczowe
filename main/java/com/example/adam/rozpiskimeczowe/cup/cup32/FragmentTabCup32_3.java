package com.example.adam.rozpiskimeczowe.cup.cup32;

import android.content.Context;
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

public class FragmentTabCup32_3 extends Fragment {
    View view;
    CustomAdapter customAdapter;
    TreeMap<Integer, Values> losersOfMatches;
    Integer numberOfMatch=0;
    String quantityOfTeams;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment_tab_cup32_3, container, false);

        losersOfMatches = new TreeMap<>();

        final ListView list = view.findViewById(R.id.listViewCup32Frag3);
        list.setItemsCanFocus(true);
        quantityOfTeams = getActivity().getIntent().getStringExtra("quantityOfTeams");

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
        final Button win17 = getActivity().findViewById(R.id.cup32WIN_17);
        final Button win18 = getActivity().findViewById(R.id.cup32WIN_18);
        final Button win19 = getActivity().findViewById(R.id.cup32WIN_19);
        final Button win20 = getActivity().findViewById(R.id.cup32WIN_20);
        final Button win21 = getActivity().findViewById(R.id.cup32WIN_21);
        final Button win22 = getActivity().findViewById(R.id.cup32WIN_22);
        final Button win23 = getActivity().findViewById(R.id.cup32WIN_23);
        final Button win24 = getActivity().findViewById(R.id.cup32WIN_24);


        setResult(team1,team32,win1);

        setResult(team17,team16,win2);

        setResult(team9,team24,win3);

        setResult(team25,team8,win4);

        setResult(team5,team28,win5);

        setResult(team21,team12,win6);

        setResult(team13,team20,win7);

        setResult(team29,team4,win8);

        setResult(team3,team30,win9);

        setResult(team19,team14,win10);

        setResult(team11,team22,win11);

        setResult(team27,team6,win12);

        setResult(team7,team26,win13);

        setResult(team23,team10,win14);

        setResult(team15,team18,win15);

        setResult(team31,team2,win16);


        setResult(win1,win2,win17);

        setResult(win3,win4,win18);

        setResult(win5,win6,win19);

        setResult(win7,win8,win20);

        setResult(win9,win10,win21);

        setResult(win11,win12,win22);

        setResult(win13,win14,win23);

        setResult(win15,win16,win24);

        customAdapter = new CustomAdapter(Objects.requireNonNull(getActivity()).getApplicationContext(),losersOfMatches);
        list.setAdapter(customAdapter);

        return view;
    }

    //refresh fragment
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            assert getFragmentManager() != null;
            numberOfMatch=0;
            losersOfMatches.clear();
            getFragmentManager().beginTransaction().detach(this).attach(this).commit();
        }
    }

    void setResult(Button team1, Button team2, Button winnerOfMatch) {

        if(numberOfMatch==0) {
            if(quantityOfTeams.equals("25")){
                Values value = new Values("Miejsce 25:");
                losersOfMatches.put(numberOfMatch, value);
                numberOfMatch++;
            }else {
                Values value = new Values("Miejsca 25-" + quantityOfTeams);
                losersOfMatches.put(numberOfMatch, value);
                numberOfMatch++;
            }
        }

        if(numberOfMatch==16) {
            Values value = new Values("Miejsca 17-24:");
            losersOfMatches.put(numberOfMatch, value);
            numberOfMatch++;
        }


        String strTeam1 = team1.getText().toString();
        String strTeam2 = team2.getText().toString();
        String winner = winnerOfMatch.getText().toString();
        if (strTeam2.equals(winner)&&!strTeam1.equals("")) {
            Values value = new Values(strTeam1);
            losersOfMatches.put(numberOfMatch, value);
        } else if(strTeam1.equals(winner)&&!strTeam2.equals("")) {
            Values value = new Values(strTeam2);
            losersOfMatches.put(numberOfMatch, value);
        }
        numberOfMatch++;
    }
}

class CustomAdapter extends BaseAdapter {
    private Context context;
    TreeMap<Integer, Values> losersOfMatches;


    CustomAdapter(Context context,TreeMap<Integer, Values> losersOfMatches) {
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
        String teamStr = losersOfMatches.get(key).team;
        teamStr = teamStr.replace("\n","/");
        holder.textViewTeam.setText(teamStr);

        convertView.setTag(holder);


        return convertView;
    }

    private class ViewHolder {
        TextView textViewTeam;
    }

}

class Values {
    String team;


    Values( String team) {
        this.team = team;
    }

}


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
import android.widget.ListView;
import android.widget.TextView;

import com.example.adam.rozpiskimeczowe.R;

import java.util.Objects;
import java.util.TreeMap;

public class FragmentTabBraz16_3 extends Fragment {
    View view;
    CustomAdapter customAdapter;
    TreeMap<Integer, Values> losersOfMatches;
    Integer numberOfMatch=0;
    String quantityOfTeams;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment_tab_braz16_3, container, false);

        losersOfMatches = new TreeMap<>();

        final ListView list = view.findViewById(R.id.listViewBraz16Frag3);
        list.setItemsCanFocus(true);
        quantityOfTeams = getActivity().getIntent().getStringExtra("quantityOfTeams");

        final Button win13 = getActivity().findViewById(R.id.braz16WIN_13);
        final Button win14 = getActivity().findViewById(R.id.braz16WIN_14);
        final Button win15 = getActivity().findViewById(R.id.braz16WIN_15);
        final Button win16 = getActivity().findViewById(R.id.braz16WIN_16);
        final Button win17 = getActivity().findViewById(R.id.braz16WIN_17);
        final Button win18 = getActivity().findViewById(R.id.braz16WIN_18);
        final Button win19 = getActivity().findViewById(R.id.braz16WIN_19);
        final Button win20 = getActivity().findViewById(R.id.braz16WIN_20);

        final Button win23 = getActivity().findViewById(R.id.braz16WIN_23);
        final Button win24 = getActivity().findViewById(R.id.braz16WIN_24);
        final Button win25 = getActivity().findViewById(R.id.braz16WIN_25);
        final Button win26 = getActivity().findViewById(R.id.braz16WIN_26);
        final Button win27 = getActivity().findViewById(R.id.braz16WIN_27);
        final Button win28 = getActivity().findViewById(R.id.braz16WIN_28);
        final Button win29 = getActivity().findViewById(R.id.braz16WIN_29);
        final Button win30 = getActivity().findViewById(R.id.braz16WIN_30);

        final Button lost1 = getActivity().findViewById(R.id.braz16LOST_1);
        final Button lost2 = getActivity().findViewById(R.id.braz16LOST_2);
        final Button lost3 = getActivity().findViewById(R.id.braz16LOST_3);
        final Button lost4 = getActivity().findViewById(R.id.braz16LOST_4);
        final Button lost5 = getActivity().findViewById(R.id.braz16LOST_5);
        final Button lost6 = getActivity().findViewById(R.id.braz16LOST_6);
        final Button lost7 = getActivity().findViewById(R.id.braz16LOST_7);
        final Button lost8 = getActivity().findViewById(R.id.braz16LOST_8);
        final Button lost9 = getActivity().findViewById(R.id.braz16LOST_9);
        final Button lost10 = getActivity().findViewById(R.id.braz16LOST_10);
        final Button lost11 = getActivity().findViewById(R.id.braz16LOST_11);
        final Button lost12 = getActivity().findViewById(R.id.braz16LOST_12);
        final Button lost21 = getActivity().findViewById(R.id.braz16LOST_21);
        final Button lost22 = getActivity().findViewById(R.id.braz16LOST_22);
        final Button lost27 = getActivity().findViewById(R.id.braz16LOST_27);
        final Button lost28 = getActivity().findViewById(R.id.braz16LOST_28);





        //13 MECZ
        setResult(lost8, lost7,win13);

        //14 MECZ
        setResult(lost6, lost5,win14);

        //15 MECZ
        setResult(lost4, lost3,win15);

        //16 MECZ
        setResult(lost2, lost1,win16);

        //17 MECZ
        setResult(win13, lost10, win17);

        //18 MECZ
        setResult(win14, lost9,win18);

        //19 MECZ
        setResult(win15, lost12,win19);

        //20 MECZ
        setResult(win16, lost11,win20);



        //23 MECZ
        setResult(win17, win18,win23);

        //24 MECZ
        setResult(win19, win20, win24);

        //25 MECZ
        setResult(lost22, win23,win25);

        //26 MECZ
        setResult(lost21, win24,win26);




        //29 MECZ
        setResult(lost27, lost28,win29);

        //30 MECZ FINAL
        setResult(win27, win28,win30);

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

            Values value = new Values("Miejsca 13 - 16");
            losersOfMatches.put(numberOfMatch, value);
            numberOfMatch++;
        }

        if(numberOfMatch==5) {
            Values value = new Values("Miejsca 9-12:");
            losersOfMatches.put(numberOfMatch, value);
            numberOfMatch++;
        }

        if(numberOfMatch==10) {
            Values value = new Values("Miejsca 7-8:");
            losersOfMatches.put(numberOfMatch, value);
            numberOfMatch++;
        }

        if(numberOfMatch==13) {
            Values value = new Values("Miejsca 5-6:");
            losersOfMatches.put(numberOfMatch, value);
            numberOfMatch++;
        }

        if(numberOfMatch==16) {
            Values value = new Values("Miejsce 4:");
            losersOfMatches.put(numberOfMatch, value);
            numberOfMatch++;

            Values value2 = new Values("Miejsce 3:");
            losersOfMatches.put(numberOfMatch, value2);
            numberOfMatch++;
        }


        if(numberOfMatch==20) {
            Values value = new Values("Miejsce 2:");
            losersOfMatches.put(numberOfMatch, value);
            numberOfMatch++;

            Values value2 = new Values("Miejsce 1:");
            losersOfMatches.put(numberOfMatch, value2);
            numberOfMatch++;
        }





        String strTeam1 = team1.getText().toString();
        String strTeam2 = team2.getText().toString();
        String winner = winnerOfMatch.getText().toString();
        if (strTeam2.equals(winner)&&!strTeam1.equals("")) {
            Values value = new Values(strTeam1);
            losersOfMatches.put(numberOfMatch, value);
            if(numberOfMatch==18) {
                numberOfMatch++;
                Values value3 = new Values(strTeam2);
                losersOfMatches.put(numberOfMatch, value3);
            }
            if(numberOfMatch==22) {
                numberOfMatch++;
                Values value3 = new Values(strTeam2);
                losersOfMatches.put(numberOfMatch, value3);

            }
        } else if(strTeam1.equals(winner)&&!strTeam2.equals("")) {
            Values value = new Values(strTeam2);
            losersOfMatches.put(numberOfMatch, value);

            if(numberOfMatch==18) {
                numberOfMatch++;
                Values value3 = new Values(strTeam1);
                losersOfMatches.put(numberOfMatch, value3);
            }

            if(numberOfMatch==22) {
                numberOfMatch++;
                Values value3 = new Values(strTeam1);
                losersOfMatches.put(numberOfMatch, value3);
            }
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
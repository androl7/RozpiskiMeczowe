package com.example.adam.rozpiskimeczowe.brazylian.brazylian8;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.adam.rozpiskimeczowe.R;


public class FragmentTabBraz8_2 extends Fragment {
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment_tab_braz8_2, container, false);

        ScrollView scrollView = view.findViewById(R.id.scrollView);

        final String teamR1 = getActivity().getIntent().getStringExtra("NameOfTeam1");
        final String teamR2 = getActivity().getIntent().getStringExtra("NameOfTeam2");
        final String teamR3 = getActivity().getIntent().getStringExtra("NameOfTeam3");
        final String teamR4 = getActivity().getIntent().getStringExtra("NameOfTeam4");
        final String teamR5 = getActivity().getIntent().getStringExtra("NameOfTeam5");
        final String teamR6 = getActivity().getIntent().getStringExtra("NameOfTeam6");
        final String teamR7 = getActivity().getIntent().getStringExtra("NameOfTeam7");
        final String teamR8 = getActivity().getIntent().getStringExtra("NameOfTeam8");

        final LinearLayout linearLayout = new LinearLayout(getActivity().getApplicationContext());
        linearLayout.setOrientation(LinearLayout.VERTICAL);


        String res1_1 = ((EditText) getActivity().findViewById(R.id.brazRes1_1)).getText().toString();
        String res1_8 = ((EditText) getActivity().findViewById(R.id.brazRes1_8)).getText().toString();

        //WYNIK 1 MECZU

        TextView finalRes1 = new TextView(getContext());
        finalRes1.setText("1. " + teamR1 + " - " + teamR8 + " (" + res1_1 + ":" + res1_8 + ")");
        linearLayout.addView(finalRes1);
        finalRes1.setTextSize(20);


        //DODANIE DO LAYOUTU
        scrollView.addView(linearLayout);

        return view;
    }


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            getFragmentManager().beginTransaction().detach(this).attach(this).commit();
        }
    }
}
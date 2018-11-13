package com.example.adam.rozpiskimeczowe;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class SetResultsForGroups implements ISetResultsForGroups {
    private Context context;
    private SetDetailedResultFor2Sets setDetailedResultFor2Sets;



    public SetResultsForGroups(String typeOfTour,Context context, ViewGroup vg, String pktInSet, String pktInTieBreak){
        this.context = context;
        InputMethodManager imm = (InputMethodManager) Objects.requireNonNull(context.getSystemService(Context.INPUT_METHOD_SERVICE));
        this.setDetailedResultFor2Sets = new SetDetailedResultFor2Sets("",typeOfTour,context,vg, imm,pktInSet,pktInTieBreak);

    }

    @Override
    public void set(final LinearLayout layoutSets, final EditText pointsOfFirst1, final EditText pointsOfFirst2, final EditText pointsOfFirst3, final EditText pointsOfSecund1, final EditText pointsOfSecund2, final EditText pointsOfSecund3, final TextView firstTeamSets, final TextView secondTeamSets, final TextView firstTeamSets2, final TextView secondTeamSets2, final TextView matchNumber) {

        layoutSets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pointsOfFirst1.getText().toString().equals("")) {

                    setDetailedResultFor2Sets.setForGroup(pointsOfFirst1, pointsOfFirst2, pointsOfFirst3, pointsOfSecund1, pointsOfSecund2, pointsOfSecund3, firstTeamSets, firstTeamSets2, secondTeamSets, secondTeamSets2);

                    matchNumber.setPaintFlags(matchNumber.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }else {
                    Toast.makeText(context,"Wynik już został podany jeśli chcesz go cofnąć przytrzymaj dłużej przycisk", Toast.LENGTH_SHORT).show();
                } }


        });
        layoutSets.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                pointsOfFirst1.setText("");
                pointsOfFirst2.setText("");
                pointsOfFirst3.setText("");
                pointsOfSecund1.setText("");
                pointsOfSecund2.setText("");
                pointsOfSecund3.setText("");
                firstTeamSets.setText("");
                firstTeamSets2.setText("");
                secondTeamSets.setText("");
                secondTeamSets2.setText("");
                matchNumber.setPaintFlags(matchNumber.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                return true;
            }
        });

        firstTeamSets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pointsOfFirst1.getText().toString().equals("")) {

                    setDetailedResultFor2Sets.setForGroup(pointsOfFirst1, pointsOfFirst2, pointsOfFirst3, pointsOfSecund1, pointsOfSecund2, pointsOfSecund3, firstTeamSets, firstTeamSets2, secondTeamSets, secondTeamSets2);

                    matchNumber.setPaintFlags(matchNumber.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }else {
                    Toast.makeText(context,"Wynik już został podany jeśli chcesz go cofnąć przytrzymaj dłużej przycisk", Toast.LENGTH_SHORT).show();
                }
            }


        });
        firstTeamSets.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                pointsOfFirst1.setText("");
                pointsOfFirst2.setText("");
                pointsOfFirst3.setText("");
                pointsOfSecund1.setText("");
                pointsOfSecund2.setText("");
                pointsOfSecund3.setText("");
                firstTeamSets.setText("");
                firstTeamSets2.setText("");
                secondTeamSets.setText("");
                secondTeamSets2.setText("");
                matchNumber.setPaintFlags(matchNumber.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                return true;
            }
        });
        secondTeamSets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pointsOfFirst1.getText().toString().equals("")) {

                    setDetailedResultFor2Sets.setForGroup(pointsOfFirst1, pointsOfFirst2, pointsOfFirst3, pointsOfSecund1, pointsOfSecund2, pointsOfSecund3, firstTeamSets, firstTeamSets2, secondTeamSets, secondTeamSets2);

                    matchNumber.setPaintFlags(matchNumber.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }else {
                    Toast.makeText(context,"Wynik już został podany jeśli chcesz go cofnąć przytrzymaj dłużej przycisk", Toast.LENGTH_SHORT).show();
                }
            }


        });

        secondTeamSets.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                pointsOfFirst1.setText("");
                pointsOfFirst2.setText("");
                pointsOfFirst3.setText("");
                pointsOfSecund1.setText("");
                pointsOfSecund2.setText("");
                pointsOfSecund3.setText("");
                firstTeamSets.setText("");
                firstTeamSets2.setText("");
                secondTeamSets.setText("");
                secondTeamSets2.setText("");
                matchNumber.setPaintFlags(matchNumber.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
                return true;
            }
        });

    }
}

package com.example.adam.rozpiskimeczowe;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adam.rozpiskimeczowe.LocalDatabase.TableControllerMatches;

import java.util.Objects;

public class SetResultsForGroups implements ISetResultsForGroups {
    private Context context;
    private SetDetailedResultFor2Sets setDetailedResultFor2Sets;
    private int actualMatch = 1;


    public SetResultsForGroups(String nameOfTour,String typeOfTour,Context context, ViewGroup vg, String pktInSet, String pktInTieBreak){
        this.context = context;
        InputMethodManager imm = (InputMethodManager) Objects.requireNonNull(context.getSystemService(Context.INPUT_METHOD_SERVICE));
        this.setDetailedResultFor2Sets = new SetDetailedResultFor2Sets(nameOfTour,typeOfTour,context,vg, imm,pktInSet,pktInTieBreak);

    }

    @Override
    public void set(final LinearLayout layoutSets, final EditText pointsOfFirst1, final EditText pointsOfFirst2, final EditText pointsOfFirst3, final EditText pointsOfSecund1, final EditText pointsOfSecund2, final EditText pointsOfSecund3, final TextView firstTeamSets, final TextView secondTeamSets, final TextView firstTeamSets2, final TextView secondTeamSets2, final TextView matchNumber) {
        firstTeamSets.setTag(actualMatch);
        secondTeamSets.setTag(actualMatch);
        actualMatch++;
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
                deleteResult(pointsOfFirst1,pointsOfFirst2,pointsOfFirst3,pointsOfSecund1,pointsOfSecund2,pointsOfSecund3,firstTeamSets,firstTeamSets2,secondTeamSets,secondTeamSets2,matchNumber,context);
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
                deleteResult(pointsOfFirst1,pointsOfFirst2,pointsOfFirst3,pointsOfSecund1,pointsOfSecund2,pointsOfSecund3,firstTeamSets,firstTeamSets2,secondTeamSets,secondTeamSets2,matchNumber,context);
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
                deleteResult(pointsOfFirst1,pointsOfFirst2,pointsOfFirst3,pointsOfSecund1,pointsOfSecund2,pointsOfSecund3,firstTeamSets,firstTeamSets2,secondTeamSets,secondTeamSets2,matchNumber,context);
                return true;
            }
        });

    }

    AlertDialog deleteResult(final EditText pointsOfFirst1,final EditText pointsOfFirst2, final EditText pointsOfFirst3,final EditText pointsOfSecund1,final EditText pointsOfSecund2, final EditText pointsOfSecund3,final TextView firstTeamSets,final TextView firstTeamSets2,final TextView secondTeamSets,final TextView secondTeamSets2,final TextView matchNumber,final Context context )
    {
        return new AlertDialog.Builder(context)
                //set message, title, and icon

                .setMessage("Czy na pewno chcesz usunąć wynik ?")


                .setPositiveButton("Usuń", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int whichButton) {
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
                        new TableControllerMatches(context).delete(Integer.parseInt(firstTeamSets.getTag().toString()));
                            dialog.dismiss();
                        }


                })

                .setNegativeButton("Anuluj", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();

                    }
                })
                .show();

    }


}

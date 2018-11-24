package com.example.adam.rozpiskimeczowe;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.otaliastudios.zoom.ZoomLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SetResultsForCup implements ISetResultsForCup {
    private Context context;
    private Toast toast;
    private int numberOfMatches;
    private int actualMatch;
    private RelativeLayout relativeLayout;
    private TextView[]numbersOfMatchesArray;
    View view;
    private String numberOfCup;
    private SetDetailedResultFor2Sets setDetailedResultFor2Sets;
    private Map<Integer,ArrayList<EditText>> mapPointsInMatches;
    private ArrayList<Button> listResultButtons;
    private DeleteResultBrazAndCup deleteResultBrazAndCup;

    public SetResultsForCup(String nameOfTour,ArrayList listResultButtons,Map<Integer,ArrayList<EditText>> mapPointsInMatches,String typeOfTour,Context context, ViewGroup vg, String pktInSet, String pktInTieBreak, int numberOfMatches, int actualMatch, RelativeLayout relativeLayout, TextView[] numbersOfMatchesArray, View view, String numberOfCup, ZoomLayout zoomLayout,String local){
        this.numberOfCup = numberOfCup;
        this.context = context;
        this.numberOfMatches = numberOfMatches;
        this.actualMatch = actualMatch;
        this.relativeLayout = relativeLayout;
        this.numbersOfMatchesArray = numbersOfMatchesArray;
        this.view = view;
        this.toast = Toast.makeText(context, "Wprowadz wczesniejszy wynik !", Toast.LENGTH_SHORT);
        InputMethodManager imm = (InputMethodManager) Objects.requireNonNull(context.getSystemService(Context.INPUT_METHOD_SERVICE));
        this.setDetailedResultFor2Sets = new SetDetailedResultFor2Sets(nameOfTour,typeOfTour,context,vg, imm,pktInSet,pktInTieBreak,zoomLayout,local);
        this.mapPointsInMatches = mapPointsInMatches;
        this.listResultButtons = listResultButtons;
        deleteResultBrazAndCup = new DeleteResultBrazAndCup(context,nameOfTour,typeOfTour);
    }


    //Method to set Results to next Buttons without loser and check
    @Override
    public void withoutLosserAndCheck(final Button firstPlayer, final Button secundPlayer, final Button ResultButton, final EditText pointsFor1In1Set, final EditText pointsFor1In2Set, final EditText pointsFor1In3Set, final EditText pointsFor2In1Set, final EditText pointsFor2In2Set, final EditText pointsFor2In3Set) {
        final String winForCheck = "WIN.";
        final String undoResultString = "WIN."+(numberOfMatches+1);
        //Add NumberOfMatches
        numberOfMatches++;
        numbersOfMatchesArray[actualMatch].setText(String.valueOf(numberOfMatches));
        actualMatch++;
        ResultButton.setText(undoResultString);
        //Add number Of match for database
        pointsFor1In1Set.setTag(String.valueOf(numberOfMatches));
        pointsFor2In1Set.setTag(String.valueOf(numberOfMatches));
        //add hashMap of results
        ArrayList arrayList = new ArrayList();
        arrayList.add(pointsFor1In1Set);
        arrayList.add(pointsFor1In2Set);
        arrayList.add(pointsFor1In3Set);
        arrayList.add(pointsFor2In1Set);
        arrayList.add(pointsFor2In2Set);
        arrayList.add(pointsFor2In3Set);
        mapPointsInMatches.put(numberOfMatches,arrayList);
        listResultButtons.add(ResultButton);



        firstPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstPlayer.getText().toString().substring(0,4).equals(winForCheck) || secundPlayer.getText().toString().substring(0,4).equals(winForCheck)) {
                    toast.show();
                } else {
                    if (!pointsFor1In1Set.getText().toString().equals("")) {
                        Toast.makeText(context, "Wynik został już wprowadzony, jeśli chcesz go cofnąć przytrzymaj przycisk wygranego lub przegranego. Natomiast jeśli chcesz zobaczyć dokładny wynik, wejdz w zakladkę WYNIKI.", Toast.LENGTH_SHORT).show();
                    }else {
                        ResultButton.setText(firstPlayer.getText());
                        setDetailedResultFor2Sets.set(firstPlayer,secundPlayer,pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set, pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set);
                    }
                }

            }
        });

        secundPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstPlayer.getText().toString().substring(0,4).equals(winForCheck) || secundPlayer.getText().toString().substring(0,4).equals(winForCheck)) {
                    toast.show();
                } else {
                    if (!pointsFor1In1Set.getText().toString().equals("")) {
                        Toast.makeText(context, "Wynik został już wprowadzony, jeśli chcesz go cofnąć przytrzymaj przycisk wygranego lub przegranego. Natomiast jeśli chcesz zobaczyć dokładny wynik, wejdz w zakladkę WYNIKI.", Toast.LENGTH_SHORT).show();
                    }else {
                        ResultButton.setText(secundPlayer.getText());
                        setDetailedResultFor2Sets.set(secundPlayer,firstPlayer,pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set, pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set);

                    }
                }

            }
        });

        ResultButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog diaBox = deleteResultBrazAndCup.deleteResult(ResultButton,undoResultString,pointsFor1In1Set,pointsFor1In2Set,pointsFor1In3Set,pointsFor2In1Set,pointsFor2In2Set,pointsFor2In3Set,null);
                diaBox.show();
                return true;
            }
        });
    }


    @Override
    public void withCheckWithoutLosser(String EofFirstPlayer, String EofSecondPlayer, final Button firstPlayer, final Button secundPlayer, final Button ResultButton, final EditText pointsFor1In1Set, final EditText pointsFor1In2Set, final EditText pointsFor1In3Set, final EditText pointsFor2In1Set, final EditText pointsFor2In2Set, final EditText pointsFor2In3Set) {
        final String undoResultString = "WIN."+(numberOfMatches+1);
        //ADD E of Players
        if(firstPlayer.getText()==""){
            firstPlayer.setVisibility(View.INVISIBLE);
            secundPlayer.setVisibility(View.INVISIBLE);
            ResultButton.setText(secundPlayer.getText());


            //set the properties for textView
            TextView tv = new TextView(context);

            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            lp.addRule(RelativeLayout.START_OF,ResultButton.getId());
            lp.addRule(RelativeLayout.ALIGN_BASELINE,ResultButton.getId());


            tv.setLayoutParams(lp);

            tv.setText(EofSecondPlayer);
            tv.setTextSize(16);
            tv.setTextColor(Color.BLACK);


            //add textView to the layout
            relativeLayout.addView(tv);

            int resID = context.getResources().getIdentifier(numberOfCup+EofFirstPlayer, "id", context.getPackageName());
            TextView tvE = view.findViewById(resID);
            tvE.setVisibility(View.INVISIBLE);

            int resID2 = context.getResources().getIdentifier(numberOfCup+EofSecondPlayer, "id", context.getPackageName());
            TextView tvE2 = view.findViewById(resID2);
            tvE2.setVisibility(View.INVISIBLE);
            //Add NumberOfMatches
            actualMatch++;


        }else if(secundPlayer.getText()==""){
            firstPlayer.setVisibility(View.INVISIBLE);
            secundPlayer.setVisibility(View.INVISIBLE);
            ResultButton.setText(firstPlayer.getText());



            //set the properties for textView
            TextView tv = new TextView(context);

            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            lp.addRule(RelativeLayout.START_OF,ResultButton.getId());
            lp.addRule(RelativeLayout.ALIGN_BASELINE,ResultButton.getId());

            tv.setLayoutParams(lp);

            tv.setText(EofFirstPlayer);
            tv.setTextSize(16);
            tv.setTextColor(Color.BLACK);


            int resID = context.getResources().getIdentifier(numberOfCup+EofFirstPlayer, "id", context.getPackageName());
            TextView tvE = view.findViewById(resID);
            tvE.setVisibility(View.INVISIBLE);

            int resID2 = context.getResources().getIdentifier(numberOfCup+EofSecondPlayer, "id", context.getPackageName());
            TextView tvE2 = view.findViewById(resID2);
            tvE2.setVisibility(View.INVISIBLE);



            //add button to the layout
            relativeLayout.addView(tv);

            if(!(firstPlayer.getText()=="")) {
                actualMatch++;
            }

        }else {

            //Add NumberOfMatches
            numberOfMatches++;
            numbersOfMatchesArray[actualMatch].setText(String.valueOf(numberOfMatches));
            //Add number Of match for database
            pointsFor1In1Set.setTag(String.valueOf(numberOfMatches));
            pointsFor2In1Set.setTag(String.valueOf(numberOfMatches));
            //add hashMap of results
            ArrayList arrayList = new ArrayList();
            arrayList.add(pointsFor1In1Set);
            arrayList.add(pointsFor1In2Set);
            arrayList.add(pointsFor1In3Set);
            arrayList.add(pointsFor2In1Set);
            arrayList.add(pointsFor2In2Set);
            arrayList.add(pointsFor2In3Set);
            mapPointsInMatches.put(numberOfMatches,arrayList);
            listResultButtons.add(ResultButton);

            ResultButton.setText(undoResultString);
            actualMatch++;
        }







        firstPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!pointsFor1In1Set.getText().toString().equals("")) {
                    Toast.makeText(context, "Wynik został już wprowadzony, jeśli chcesz go cofnąć przytrzymaj przycisk wygranego lub przegranego. Jeśli chcesz zobaczyć dokładny wynik, wejdz w zakladkę WYNIKI.", Toast.LENGTH_LONG).show();
                }else {
                    ResultButton.setText(firstPlayer.getText());
                    setDetailedResultFor2Sets.set(firstPlayer,secundPlayer,pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set, pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set);

                }
            }
        });


        secundPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!pointsFor1In1Set.getText().toString().equals("")) {
                    Toast.makeText(context, "Wynik został już wprowadzony, jeśli chcesz go cofnąć przytrzymaj przycisk wygranego lub przegranego. Jeśli chcesz zobaczyć dokładny wynik, wejdz w zakladkę WYNIKI.", Toast.LENGTH_LONG).show();
                }else {
                    ResultButton.setText(secundPlayer.getText());
                    setDetailedResultFor2Sets.set(secundPlayer,firstPlayer,pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set, pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set);
                }
            }
        });

        if(!firstPlayer.getText().equals("")&&!secundPlayer.getText().equals("")) {
            ResultButton.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    AlertDialog diaBox = deleteResultBrazAndCup.deleteResult(ResultButton,undoResultString,pointsFor1In1Set,pointsFor1In2Set,pointsFor1In3Set,pointsFor2In1Set,pointsFor2In2Set,pointsFor2In3Set,null);
                    diaBox.show();
                    return true;
                }
            });
        }

    }


}

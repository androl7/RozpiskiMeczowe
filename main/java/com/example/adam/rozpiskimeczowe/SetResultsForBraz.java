package com.example.adam.rozpiskimeczowe;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.otaliastudios.zoom.ZoomLayout;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class SetResultsForBraz implements ISetResultsForBraz {
    private Context context;
    private Toast toast;
    private ISetDetailedResultFor2Sets setDetailedResultFor2Sets;
    private int actualMatch = 1;
    private Map<Integer, ArrayList<EditText>> mapPointsInMatches;
    private ArrayList<Button> listResultButtons;
    private String winForCheck = "WIN.";

    public SetResultsForBraz(String nameOfTour, ArrayList listResultButtons, Map<Integer, ArrayList<EditText>> mapPointsInMatches, String typeOfTour, Context context, ViewGroup vg, String pktInSet, String pktInTieBreak, ZoomLayout zoomLayout) {
        this.context = context;
        this.toast = Toast.makeText(context, "Wprowadz wczesniejszy wynik !", Toast.LENGTH_SHORT);
        InputMethodManager imm = (InputMethodManager) Objects.requireNonNull(context.getSystemService(Context.INPUT_METHOD_SERVICE));
        this.setDetailedResultFor2Sets = new SetDetailedResultFor2Sets(nameOfTour, typeOfTour, context, vg, imm, pktInSet, pktInTieBreak, zoomLayout);
        this.mapPointsInMatches = mapPointsInMatches;
        this.listResultButtons = listResultButtons;
    }

    //Method to set Results to next Buttons with loser and check
    @Override
    public void WithLoserAndCheck(final Button firstPlayer, final String firstPlayerString, final Button secundPlayer, final String secundPlayerString, final Button ResultButton, final String undoResultString, final Button ResultButton2, final String undoResultString2, final EditText pointsFor1In1Set, final EditText pointsFor1In2Set, final EditText pointsFor1In3Set, final EditText pointsFor2In1Set, final EditText pointsFor2In2Set, final EditText pointsFor2In3Set) {
        pointsFor1In1Set.setTag(String.valueOf(actualMatch));
        pointsFor1In2Set.setTag(String.valueOf(actualMatch));

        ArrayList arrayList = new ArrayList();
        arrayList.add(pointsFor1In1Set);
        arrayList.add(pointsFor1In2Set);
        arrayList.add(pointsFor1In3Set);
        arrayList.add(pointsFor2In1Set);
        arrayList.add(pointsFor2In2Set);
        arrayList.add(pointsFor2In3Set);
        mapPointsInMatches.put(actualMatch, arrayList);
        listResultButtons.add(ResultButton);
        actualMatch++;

        firstPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (firstPlayer.getText().equals(firstPlayerString) || secundPlayer.getText().equals(secundPlayerString)) {
                    toast.show();
                } else {
                    if (!pointsFor1In1Set.getText().toString().equals("")) {
                        Toast.makeText(context, "Wynik został już wprowadzony, jeśli chcesz go cofnąć przytrzymaj przycisk wygranego lub przegranego. Jeśli chcesz zobaczyć dokładny wynik, wejdz w zakladkę WYNIKI.", Toast.LENGTH_LONG).show();
                    } else {
                        ResultButton.setText(firstPlayer.getText());
                        ResultButton2.setText(secundPlayer.getText());
                        setDetailedResultFor2Sets.set(firstPlayer, pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set, pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set);
                    }
                }

            }
        });

        secundPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (secundPlayer.getText().equals(secundPlayerString) || firstPlayer.getText().equals(firstPlayerString)) {
                    toast.show();
                } else {
                    if (!pointsFor1In1Set.getText().toString().equals("")) {
                        Toast.makeText(context, "Wynik został już wprowadzony, jeśli chcesz go cofnąć przytrzymaj przycisk wygranego lub przegranego. Jeśli chcesz zobaczyć dokładny wynik, wejdz w zakladkę WYNIKI.", Toast.LENGTH_LONG).show();
                    } else {
                        ResultButton.setText(secundPlayer.getText());
                        ResultButton2.setText(firstPlayer.getText());
                        setDetailedResultFor2Sets.set(secundPlayer, pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set, pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set);
                    }
                }

            }
        });

        ResultButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ResultButton.setText(undoResultString);
                ResultButton2.setText(undoResultString2);
                pointsFor1In1Set.setText("");
                pointsFor1In2Set.setText("");
                pointsFor1In3Set.setText("");
                pointsFor2In1Set.setText("");
                pointsFor2In2Set.setText("");
                pointsFor2In3Set.setText("");
                return true;
            }
        });

        ResultButton2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ResultButton.setText(undoResultString);
                ResultButton2.setText(undoResultString2);
                pointsFor1In1Set.setText("");
                pointsFor1In2Set.setText("");
                pointsFor1In3Set.setText("");
                pointsFor2In1Set.setText("");
                pointsFor2In2Set.setText("");
                pointsFor2In3Set.setText("");
                return true;
            }
        });


    }


    //Method to set Results to next Buttons without loser and check
    @Override
    public void WithCheckWithoutLoser(final Button firstPlayer, final String firstPlayerString, final Button secundPlayer, final String secundPlayerString, final Button ResultButton, final String undoResultString, final EditText pointsFor1In1Set, final EditText pointsFor1In2Set, final EditText pointsFor1In3Set, final EditText pointsFor2In1Set, final EditText pointsFor2In2Set, final EditText pointsFor2In3Set) {
        pointsFor1In1Set.setTag(String.valueOf(actualMatch));
        pointsFor1In2Set.setTag(String.valueOf(actualMatch));

        ArrayList arrayList = new ArrayList();
        arrayList.add(pointsFor1In1Set);
        arrayList.add(pointsFor1In2Set);
        arrayList.add(pointsFor1In3Set);
        arrayList.add(pointsFor2In1Set);
        arrayList.add(pointsFor2In2Set);
        arrayList.add(pointsFor2In3Set);
        mapPointsInMatches.put(actualMatch, arrayList);
        listResultButtons.add(ResultButton);
        actualMatch++;

        firstPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstPlayer.getText().equals(firstPlayerString) || secundPlayer.getText().equals(secundPlayerString)) {
                    toast.show();
                } else {
                    if (!pointsFor1In1Set.getText().toString().equals("")) {
                        Toast.makeText(context, "Wynik został już wprowadzony, jeśli chcesz go cofnąć przytrzymaj przycisk wygranego lub przegranego. Natomiast jeśli chcesz zobaczyć dokładny wynik, wejdz w zakladkę WYNIKI.", Toast.LENGTH_SHORT).show();
                    } else {
                        ResultButton.setText(firstPlayer.getText());
                        setDetailedResultFor2Sets.set(firstPlayer, pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set, pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set);
                    }
                }

            }
        });

        secundPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (secundPlayer.getText().equals(secundPlayerString) || firstPlayer.getText().equals(firstPlayerString)) {
                    toast.show();
                } else {
                    if (!pointsFor1In1Set.getText().toString().equals("")) {
                        Toast.makeText(context, "Wynik został już wprowadzony, jeśli chcesz go cofnąć przytrzymaj przycisk wygranego lub przegranego. Natomiast jeśli chcesz zobaczyć dokładny wynik, wejdz w zakladkę WYNIKI.", Toast.LENGTH_SHORT).show();
                    } else {
                        ResultButton.setText(secundPlayer.getText());
                        setDetailedResultFor2Sets.set(secundPlayer, pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set, pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set);
                    }
                }

            }
        });

        ResultButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ResultButton.setText(undoResultString);
                pointsFor1In1Set.setText("");
                pointsFor1In2Set.setText("");
                pointsFor1In3Set.setText("");
                pointsFor2In1Set.setText("");
                pointsFor2In2Set.setText("");
                pointsFor2In3Set.setText("");
                return true;
            }
        });
    }

    // Method to set Results to next Buttons with loser without check
    @Override
    public void WithLoserWithoutCheck(final Button firstPlayer, final Button secundPlayer, final Button ResultButton, final String undoResultString, final Button ResultButton2, final String undoResultString2, final EditText pointsFor1In1Set, final EditText pointsFor1In2Set, final EditText pointsFor1In3Set, final EditText pointsFor2In1Set, final EditText pointsFor2In2Set, final EditText pointsFor2In3Set) {
        pointsFor1In1Set.setTag(String.valueOf(actualMatch));
        pointsFor1In2Set.setTag(String.valueOf(actualMatch));

        ArrayList arrayList = new ArrayList();
        arrayList.add(pointsFor1In1Set);
        arrayList.add(pointsFor1In2Set);
        arrayList.add(pointsFor1In3Set);
        arrayList.add(pointsFor2In1Set);
        arrayList.add(pointsFor2In2Set);
        arrayList.add(pointsFor2In3Set);
        mapPointsInMatches.put(actualMatch, arrayList);
        listResultButtons.add(ResultButton);
        actualMatch++;

        firstPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstPlayer.getText().toString().substring(0, 4).equals(winForCheck) || secundPlayer.getText().toString().substring(0, 4).equals(winForCheck)) {
                    toast.show();
                } else {
                    if (!pointsFor1In1Set.getText().toString().equals("")) {
                        Toast.makeText(context, "Wynik został już wprowadzony, jeśli chcesz go cofnąć przytrzymaj przycisk wygranego lub przegranego. Natomiast jeśli chcesz zobaczyć dokładny wynik, wejdz w zakladkę WYNIKI.", Toast.LENGTH_SHORT).show();
                    } else {
                        ResultButton.setText(firstPlayer.getText());
                        ResultButton2.setText(secundPlayer.getText());
                        setDetailedResultFor2Sets.set(firstPlayer, pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set, pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set);
                    }
                }
            }
        });


        secundPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstPlayer.getText().toString().substring(0, 4).equals(winForCheck) || secundPlayer.getText().toString().substring(0, 4).equals(winForCheck)) {
                    toast.show();
                } else {
                    if (!pointsFor1In1Set.getText().toString().equals("")) {
                        Toast.makeText(context, "Wynik został już wprowadzony, jeśli chcesz go cofnąć przytrzymaj przycisk wygranego lub przegranego. Natomiast jeśli chcesz zobaczyć dokładny wynik, wejdz w zakladkę WYNIKI.", Toast.LENGTH_SHORT).show();
                    } else{
                        ResultButton.setText(secundPlayer.getText());
                        ResultButton2.setText(firstPlayer.getText());
                        setDetailedResultFor2Sets.set(secundPlayer, pointsFor2In1Set, pointsFor2In2Set, pointsFor2In3Set, pointsFor1In1Set, pointsFor1In2Set, pointsFor1In3Set);
                    }

                }
            }
        });


        ResultButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ResultButton.setText(undoResultString);
                ResultButton2.setText(undoResultString2);
                pointsFor1In1Set.setText("");
                pointsFor1In2Set.setText("");
                pointsFor1In3Set.setText("");
                pointsFor2In1Set.setText("");
                pointsFor2In2Set.setText("");
                pointsFor2In3Set.setText("");
                return true;
            }
        });

        ResultButton2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ResultButton.setText(undoResultString);
                ResultButton2.setText(undoResultString2);
                pointsFor1In1Set.setText("");
                pointsFor1In2Set.setText("");
                pointsFor1In3Set.setText("");
                pointsFor2In1Set.setText("");
                pointsFor2In2Set.setText("");
                pointsFor2In3Set.setText("");

                return true;
            }
        });
    }

}

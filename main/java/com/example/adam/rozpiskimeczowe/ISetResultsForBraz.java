package com.example.adam.rozpiskimeczowe;

import android.widget.Button;
import android.widget.EditText;

interface ISetResultsForBraz {
    //Method to set Results to next Buttons with loser and check
    void WithLoserAndCheck(Button firstPlayer, String firstPlayerString, Button secundPlayer, String secundPlayerString, Button ResultButton, String undoResultString, Button ResultButton2, String undoResultString2, EditText pointsFor1In1Set, EditText pointsFor1In2Set, EditText pointsFor1In3Set, EditText pointsFor2In1Set, EditText pointsFor2In2Set, EditText pointsFor2In3Set);

    //Method to set Results to next Buttons without loser and check
    void WithCheckWithoutLoser(Button firstPlayer, String firstPlayerString, Button secundPlayer, String secundPlayerString, Button ResultButton, String undoResultString, EditText pointsFor1In1Set, EditText pointsFor1In2Set, EditText pointsFor1In3Set, EditText pointsFor2In1Set, EditText pointsFor2In2Set, EditText pointsFor2In3Set);

    // Method to set Results to next Buttons with loser without check
    void WithLoserWithoutCheck(Button firstPlayer, Button secundPlayer, Button ResultButton, String undoResultString, Button ResultButton2, String undoResultString2, EditText pointsFor1In1Set, EditText pointsFor1In2Set, EditText pointsFor1In3Set, EditText pointsFor2In1Set, EditText pointsFor2In2Set, EditText pointsFor2In3Set);
}

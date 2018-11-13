package com.example.adam.rozpiskimeczowe;

import android.widget.Button;
import android.widget.EditText;

interface ISetResultsForCup {
    //Method to set Results to next Buttons without loser and check
    void withoutLosserAndCheck(Button firstPlayer, Button secundPlayer, Button ResultButton, EditText pointsFor1In1Set, EditText pointsFor1In2Set, EditText pointsFor1In3Set, EditText pointsFor2In1Set, EditText pointsFor2In2Set, EditText pointsFor2In3Set);

    void withCheckWithoutLosser(String EofFirstPlayer, String EofSecondPlayer, Button firstPlayer, Button secundPlayer, Button ResultButton, EditText pointsFor1In1Set, EditText pointsFor1In2Set, EditText pointsFor1In3Set, EditText pointsFor2In1Set, EditText pointsFor2In2Set, EditText pointsFor2In3Set);
}

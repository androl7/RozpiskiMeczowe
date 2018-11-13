package com.example.adam.rozpiskimeczowe;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

interface ISetDetailedResultFor2Sets {
    // Method to add points of Sets
    void set(Button winner, EditText team1Set1, EditText team1Set2, EditText team1Set3, EditText team2Set1, EditText team2Set2, EditText team2Set3);

    void setForGroup(final EditText team1Set1, final EditText team1Set2, final EditText team1Set3, final EditText team2Set1, final EditText team2Set2, final EditText team2Set3, final TextView setsFor1, final TextView setsFor1_2, final TextView setsFor2, final TextView setsFor2_2);
}

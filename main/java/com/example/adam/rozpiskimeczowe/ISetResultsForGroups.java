package com.example.adam.rozpiskimeczowe;

import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

interface ISetResultsForGroups {
    void set(LinearLayout layoutSets, EditText pointsOfFirst1, EditText pointsOfFirst2, EditText pointsOfFirst3, EditText pointsOfSecund1, EditText pointsOfSecund2, EditText pointsOfSecund3, TextView firstTeamSets, TextView secondTeamSets, TextView firstTeamSets2, TextView secondTeamSets2, TextView matchNumber);
}

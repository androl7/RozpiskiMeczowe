package com.example.adam.rozpiskimeczowe;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.adam.rozpiskimeczowe.LocalDatabase.TableControllerMatches;

class DeleteResultBrazAndCup {
    private Context context;
    private Database database;
    private String nameOfTour;
    private String typeOfTour;

     DeleteResultBrazAndCup(Context context, String nameOfTour, String typeOfTour){
        this.database = new Database();
        this.context = context;
        this.nameOfTour = nameOfTour;
        this.typeOfTour = typeOfTour;


    }


       AlertDialog deleteResult(final Button ResultButton, final String undoResultString, final Button ResultButton2, final String undoResultString2, final EditText pointsFor1In1Set, final EditText pointsFor1In2Set, final EditText pointsFor1In3Set, final EditText pointsFor2In1Set, final EditText pointsFor2In2Set, final EditText pointsFor2In3Set, final String local)
    {
        return new AlertDialog.Builder(context)
                //set message, title, and icon

                .setMessage("Czy na pewno chcesz usunąć wynik ?")


                .setPositiveButton("Usuń", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int whichButton) {
                        if(local==null) {
                            ResultButton.setText(undoResultString);
                            ResultButton2.setText(undoResultString2);
                            pointsFor1In1Set.setText("");
                            pointsFor1In2Set.setText("");
                            pointsFor1In3Set.setText("");
                            pointsFor2In1Set.setText("");
                            pointsFor2In2Set.setText("");
                            pointsFor2In3Set.setText("");
                            database.deleteResultFromDatabase(pointsFor1In1Set.getTag().toString(), nameOfTour, typeOfTour);
                            Toast.makeText(context, "Wynik został usunięty", Toast.LENGTH_SHORT).show();
                            dialog.dismiss();
                        }else {
                            ResultButton.setText(undoResultString);
                            ResultButton2.setText(undoResultString2);
                            pointsFor1In1Set.setText("");
                            pointsFor1In2Set.setText("");
                            pointsFor1In3Set.setText("");
                            pointsFor2In1Set.setText("");
                            pointsFor2In2Set.setText("");
                            pointsFor2In3Set.setText("");
                            new TableControllerMatches(context).delete(Integer.parseInt(pointsFor1In1Set.getTag().toString()));
                            Toast.makeText(context, "Wynik został usunięty", Toast.LENGTH_SHORT).show();
                            dialog.dismiss();
                        }
                    }

                })



                .setNegativeButton("Anuluj", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();

                    }
                })
                .create();

    }

      AlertDialog deleteResult(final Button ResultButton, final String undoResultString, final EditText pointsFor1In1Set, final EditText pointsFor1In2Set, final EditText pointsFor1In3Set, final EditText pointsFor2In1Set, final EditText pointsFor2In2Set, final EditText pointsFor2In3Set,final String local)
    {
        return new AlertDialog.Builder(context)
                //set message, title, and icon

                .setMessage("Czy na pewno chcesz usunąć wynik ?")


                .setPositiveButton("Usuń", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int whichButton) {
                        if(local==null) {
                        ResultButton.setText(undoResultString);
                        pointsFor1In1Set.setText("");
                        pointsFor1In2Set.setText("");
                        pointsFor1In3Set.setText("");
                        pointsFor2In1Set.setText("");
                        pointsFor2In2Set.setText("");
                        pointsFor2In3Set.setText("");
                        database.deleteResultFromDatabase(pointsFor1In1Set.getTag().toString(),nameOfTour,typeOfTour);
                        Toast.makeText(context,"Wynik został usunięty",Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }else {
                            ResultButton.setText(undoResultString);
                            pointsFor1In1Set.setText("");
                            pointsFor1In2Set.setText("");
                            pointsFor1In3Set.setText("");
                            pointsFor2In1Set.setText("");
                            pointsFor2In2Set.setText("");
                            pointsFor2In3Set.setText("");
                            new TableControllerMatches(context).delete(Integer.parseInt(pointsFor1In1Set.getTag().toString()));
                            Toast.makeText(context,"Wynik został usunięty",Toast.LENGTH_SHORT).show();
                            dialog.dismiss();
                        }
                    }

                })



                .setNegativeButton("Anuluj", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();

                    }
                })
                .create();

    }
}

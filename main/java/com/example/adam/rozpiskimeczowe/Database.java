package com.example.adam.rozpiskimeczowe;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.adam.rozpiskimeczowe.offical.GetDataFromBeachPzps;
import com.example.adam.rozpiskimeczowe.offical.OfficalListWihTeams;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.SetOptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Database {
    private FirebaseFirestore db;
    private final String TAG = "Database";
    private Map<Integer,ArrayList<String>> mapResults;
    private Map<Integer,ArrayList<EditText>> mapPointsInMatches;
    private ArrayList<Button> listResultButtons;

    public Database(Map<Integer,ArrayList<String>> mapResults,Map<Integer,ArrayList<EditText>> mapPointsInMatches, ArrayList<Button> listResultButtons) {
        this.mapPointsInMatches = mapPointsInMatches;
        this.mapResults = mapResults;
        this.listResultButtons = listResultButtons;
        db = FirebaseFirestore.getInstance();
    }

    public Database(){
        db = FirebaseFirestore.getInstance();
    }

    public void addOfficalTournamentToDatabase(GetDataFromBeachPzps getDataFromBeachPzps, String nameOfTour, String typeOfTour, String password) {
        ArrayList listOfTeams = new ArrayList();
        for (int i = 0; i < getDataFromBeachPzps.getNameOfFirstPlayers().size(); i++) {
            String nameOfTeam = getDataFromBeachPzps.getNameOfFirstPlayers().get(i) + "\n" + getDataFromBeachPzps.getNameOfSecondPlayers().get(i);
            listOfTeams.add(nameOfTeam);
        }
        Map<String, Object> tournament = new HashMap<>();
        tournament.put("Type", typeOfTour);
        tournament.put("Teams", listOfTeams);
        tournament.put("Key",password);

        db.collection("tournaments").document(nameOfTour)
                .set(tournament)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d(TAG, "DocumentSnapshot successfully written!");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "Error writing document", e);
                    }
                });
    }

    void addResultToDatabase(String nameOfTour,String typeOfTour,Button winner,Button losser, EditText res1_1, EditText res1_2, EditText res1_3, EditText res2_1, EditText res2_2, EditText res2_3) {

        try {
            //add points to arrayList
            ArrayList<String> pointsInSets = new ArrayList<>();
            pointsInSets.add(res1_1.getText().toString());
            pointsInSets.add(res1_2.getText().toString());
            pointsInSets.add(res1_3.getText().toString());
            pointsInSets.add(res2_1.getText().toString());
            pointsInSets.add(res2_2.getText().toString());
            pointsInSets.add(res2_3.getText().toString());
            pointsInSets.add(winner.getText().toString());
            pointsInSets.add(losser.getText().toString());

            Map<String, Object> result = new HashMap<>();
            result.put(res1_1.getTag().toString(), pointsInSets);

            db.collection("tournaments").document(nameOfTour).collection("Matches").document(typeOfTour)
                    .set(result, SetOptions.merge())
                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Log.d(TAG, "DocumentSnapshot successfully written!");
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.w(TAG, "Error writing document", e);
                        }
                    });
        }catch (NullPointerException e){
            //document path is null

        }


    }


    public void getResultFromDatabaseWithUpdate(String nameOfTour, String typeOfTour){
        try {
            db.collection("tournaments").document(nameOfTour).collection("Matches").document(typeOfTour).get()
                    .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                        @Override
                        public void onSuccess(DocumentSnapshot snapshot) {
                            if(snapshot != null && snapshot.exists()){
                                mapResults = (HashMap) snapshot.getData();
                                getResultFromDatabase();
                            }
                        }
                    });

            final DocumentReference docRef = db.collection("tournaments").document(nameOfTour).collection("Matches").document(typeOfTour);
            docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
                @Override
                public void onEvent(@Nullable DocumentSnapshot snapshot,
                                    @Nullable FirebaseFirestoreException e) {
                    if (e != null) {

                        return;
                    }

                    if (snapshot != null && snapshot.exists()) {
                        mapResults = (HashMap) snapshot.getData();
                        getResultFromDatabase();
                    } else {

                    }
                }
            });
        }catch (Exception e){
            Log.e("Database","getResultFromDatabaseWithUpdate");
        }
    }

     private void getResultFromDatabase() {
        if (mapResults != null&&mapPointsInMatches!=null) {
            for (int i = 0; i < mapResults.size(); i++) {
                int key = Integer.parseInt(mapResults.keySet().toArray()[i].toString());
                for (int j = 0; j < 6; j++) {
                    mapPointsInMatches.get(key).get(j).setText(mapResults.get(String.valueOf(key)).get(j));
                }
                listResultButtons.get(key - 1).setText(mapResults.get(String.valueOf(key)).get(6));
            }
        }
    }

    public void getResultFromDatabaseWithUpdateForBraz(String nameOfTour, String typeOfTour,final HashMap<String,Button> mapLossersButtons){
        try {
            db.collection("tournaments").document(nameOfTour).collection("Matches").document(typeOfTour).get()
                    .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                        @Override
                        public void onSuccess(DocumentSnapshot snapshot) {
                            if(snapshot != null && snapshot.exists()){
                                mapResults = (HashMap) snapshot.getData();
                                getResultFromDatabaseForBraz(mapLossersButtons);
                            }
                        }
                    });

            final DocumentReference docRef = db.collection("tournaments").document(nameOfTour).collection("Matches").document(typeOfTour);
            docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
                @Override
                public void onEvent(@Nullable DocumentSnapshot snapshot,
                                    @Nullable FirebaseFirestoreException e) {
                    if (e != null) {

                        return;
                    }

                    if (snapshot != null && snapshot.exists()) {
                        mapResults = (HashMap) snapshot.getData();
                        getResultFromDatabaseForBraz(mapLossersButtons);
                    } else {

                    }
                }
            });
        }catch (Exception e){
            Log.e("Database","getResultFromDatabaseWithUpdate");
        }
    }

    private void getResultFromDatabaseForBraz(HashMap<String,Button> mapLossersButtons) {
        if (mapResults != null&&mapPointsInMatches!=null) {
            for (int i = 0; i < mapResults.size(); i++) {
                int key = Integer.parseInt(mapResults.keySet().toArray()[i].toString());
                for (int j = 0; j < 6; j++) {
                    mapPointsInMatches.get(key).get(j).setText(mapResults.get(String.valueOf(key)).get(j));
                }
                listResultButtons.get(key - 1).setText(mapResults.get(String.valueOf(key)).get(6));
                if(mapLossersButtons.get(String.valueOf(key))!=null) {
                    mapLossersButtons.get(String.valueOf(key)).setText(mapResults.get(String.valueOf(key)).get(7));
                }
            }
        }
    }

     void deleteResultFromDatabase(String numberOfMatch,String nameOfTour,String typeOfTour) {
         try {
             DocumentReference docRef = db.collection("tournaments").document(nameOfTour).collection("Matches").document(typeOfTour);
             Map<String, Object> delete = new HashMap<>();
             delete.put(numberOfMatch, FieldValue.delete());

             docRef.update(delete).addOnCompleteListener(new OnCompleteListener<Void>() {
                 @Override
                 public void onComplete(@NonNull Task<Void> task) {
                 }
             });
         }catch (NullPointerException e){
             //document path is null
         }
     }

     void checkPassword(final String password, final Context context){
        db.collection("users").document("admin").get()
                .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot snapshot) {
                        if(snapshot !=null && snapshot.exists()){
                            ArrayList pass =(ArrayList) snapshot.getData().get("haslo");
                            if(pass.contains(password)){
                                context.startActivity(new Intent(context,OfficalListWihTeams.class));
                            }else {
                                Toast.makeText(context,"Złe hasło",Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });
     }


}



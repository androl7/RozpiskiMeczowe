package com.example.adam.rozpiskimeczowe.offical;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.adam.rozpiskimeczowe.Database;
import com.example.adam.rozpiskimeczowe.GenerateKey;
import com.example.adam.rozpiskimeczowe.R;
import com.example.adam.rozpiskimeczowe.TypeOfTournaments;
import com.example.adam.rozpiskimeczowe.cup.cup32.CUPactiv32;
import com.example.adam.rozpiskimeczowe.cup.cup64.CUPactiv64;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class OfficalListWihTeams extends AppCompatActivity {

    EditText editTextNameOfTour;
    GetDataFromBeachPzps getDataFromBeachPzps;
    ArrayList<String> namesToExport;
    Database database;
    Intent intent;
    Context context = this;
    private FirebaseFirestore db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offical_list_with_teams);

        getSupportActionBar().setTitle("Oficjalny:");
        db = FirebaseFirestore.getInstance();
        database = new Database();

        editTextNameOfTour = findViewById(R.id.Offical_NameOfTour);
        final InputMethodManager imm = (InputMethodManager) Objects.requireNonNull(getSystemService(Context.INPUT_METHOD_SERVICE));
        namesToExport = new ArrayList<>();

        //ADD LIST
        final ListView list = findViewById(R.id.getDataListView);
        list.setItemsCanFocus(true);


        final Button btnGetData = findViewById(R.id.getDataBtn);
        final EditText ed = findViewById(R.id.getDataIdOfTour);


        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Get Data From Website and add to ListView
                imm.hideSoftInputFromWindow(btnGetData.getWindowToken(), 0);
                getDataFromBeachPzps = new GetDataFromBeachPzps(list, OfficalListWihTeams.this, ed.getText().toString());
                getDataFromBeachPzps.execute();
                ImageView imageView = findViewById(R.id.OfficalImageViewRoadToBeachPzps);
                imageView.setVisibility(View.INVISIBLE);


            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_bar_with_utworz_button, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menuUtworzButton:
                if(!editTextNameOfTour.getText().toString().equals("")) {
                    if (getDataFromBeachPzps != null) {
                        if (getDataFromBeachPzps.getNameOfFirstPlayers().size() != 0) {
                            final ArrayList listOfNames = new ArrayList();
                            db.collection("tournaments").get()
                                    .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                                        @Override
                                        public void onSuccess(QuerySnapshot queryDocumentSnapshots) {

                                            if (!queryDocumentSnapshots.isEmpty()) {
                                                List<DocumentSnapshot> list = queryDocumentSnapshots.getDocuments();

                                                for (DocumentSnapshot d : list) {
                                                    listOfNames.add(d.getId());

                                                }
                                                if(!listOfNames.contains(editTextNameOfTour.getText().toString())) {
                                                    final String password = GenerateKey.randomString();
                                                    //ZABEZPIECZENIE dodać sprawdzenie czy jest taki turniej już o tej nazwie !!!
                                                    AlertDialog alrD = createAlert(password);
                                                    alrD.show();
                                                }else {
                                                    Toast.makeText(context, "Zmień nazwę, istnieje już taki turniej", Toast.LENGTH_SHORT).show();
                                                }
                                            }
                                        }
                                    });

                        } else {
                            Toast.makeText(context, "Pobierz listę zawodników", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(context, "Pobierz listę zawodników", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(context, "Nazwij turniej", Toast.LENGTH_SHORT).show();
                }

        }
        return super.onOptionsItemSelected(item);
    }

    AlertDialog createAlert(final String password) {
        return new AlertDialog.Builder(context)
                //set message, title, and icon
                .setTitle(password)
                .setMessage("!!! Zapisz klucz do turnieju, musisz go mieć żeby móc go modyfikować w przyszłości !!!")


                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int whichButton) {


                        if (getDataFromBeachPzps.getNameOfFirstPlayers().size() <= 40) {
                            intent = new Intent(context, CUPactiv32.class);
                            database.addOfficalTournamentToDatabase(getDataFromBeachPzps, editTextNameOfTour.getText().toString(), TypeOfTournaments.Offical_32.toString(), password);
                        } else {
                            intent = new Intent(context, CUPactiv64.class);
                            database.addOfficalTournamentToDatabase(getDataFromBeachPzps, editTextNameOfTour.getText().toString(), TypeOfTournaments.Offical_64.toString(), password);
                        }

                        for (int i = 0; i < getDataFromBeachPzps.getNameOfFirstPlayers().size(); i++) {
                            intent.putExtra("NameOfTeam" + (i + 1), getDataFromBeachPzps.getNameOfFirstPlayers().get(i) + "\n" + getDataFromBeachPzps.getNameOfSecondPlayers().get(i));
                        }
                        intent.putExtra("quantityOfTeams", String.valueOf(getDataFromBeachPzps.getNameOfFirstPlayers().size()));
                        intent.putExtra("nameOfTour", editTextNameOfTour.getText().toString());


                        dialog.dismiss();
                        startActivity(intent);
                    }

                })

                .create();

    }


}


package com.example.adam.rozpiskimeczowe.everyoneForEveryone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.adam.rozpiskimeczowe.LocalDatabase.TableControllerTeams;
import com.example.adam.rozpiskimeczowe.LocalDatabase.TableControllerTournament;
import com.example.adam.rozpiskimeczowe.LocalDatabase.Team;
import com.example.adam.rozpiskimeczowe.LocalDatabase.TournamentLocal;
import com.example.adam.rozpiskimeczowe.R;

import java.util.List;

public class EFEactiv extends AppCompatActivity {
    Toast toastNameTeams;
    Toast toastPktInSet;
    EditText name1;
    EditText name2;
    EditText name3;
    EditText name4;
    EditText pktInSet;
    CheckBox box3;
    CheckBox box4;
    EditText nameOfTour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_efeactiv);
        getSupportActionBar().setTitle("System grupowy ");
        toastNameTeams = Toast.makeText(getApplicationContext(), "Nazwij wszyskie drużyny", Toast.LENGTH_SHORT);
        toastPktInSet = Toast.makeText(getApplicationContext(), "Podaj do ilu punktów bedzie rozgrywany set", Toast.LENGTH_SHORT);

        nameOfTour = findViewById(R.id.GroupNameOfTour);

        name1 = findViewById(R.id.Name1);
        name2 = findViewById(R.id.Name2);
        name3 = findViewById(R.id.Name3);
        name4 = findViewById(R.id.Name4);
        /*final EditText name5 =  findViewById(R.id.Name5);*/
        pktInSet = findViewById(R.id.brazEditTextPkt);

        name1.setVisibility(View.INVISIBLE);
        name2.setVisibility(View.INVISIBLE);
        name3.setVisibility(View.INVISIBLE);
        name4.setVisibility(View.INVISIBLE);
        /* name5.setVisibility(View.INVISIBLE);*/


        box3 = findViewById(R.id.checkBox3);
        box4 = findViewById(R.id.checkBox4);
        /*box5 =  findViewById(R.id.checkBox5);*/


        box3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (box3.isChecked()) {
                    box4.setChecked(false);
                    /*box5.setChecked(false);*/
                    name1.setVisibility(View.VISIBLE);
                    name2.setVisibility(View.VISIBLE);
                    name3.setVisibility(View.VISIBLE);
                    name4.setVisibility(View.INVISIBLE);
                    /*name5.setVisibility(View.INVISIBLE);*/

                }
            }
        });
        box4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (box4.isChecked()) {
                    box3.setChecked(false);
                    /*box5.setChecked(false);*/
                    name1.setVisibility(View.VISIBLE);
                    name2.setVisibility(View.VISIBLE);
                    name3.setVisibility(View.VISIBLE);
                    name4.setVisibility(View.VISIBLE);
                    /*name5.setVisibility(View.INVISIBLE);*/
                }
            }
        });

        /*box5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (box5.isChecked()) {
                    box4.setChecked(false);
                    box3.setChecked(false);
                    name1.setVisibility(View.VISIBLE);
                    name2.setVisibility(View.VISIBLE);
                    name3.setVisibility(View.VISIBLE);
                    name4.setVisibility(View.VISIBLE);
                    name5.setVisibility(View.VISIBLE);
                }
            }
        });*/


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_bar_with_start_button, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            //START WITH CHECK
            //SPRAWDZENIE NAZWY TURNIEJU W SQLITE !!!!
            case R.id.menuStartButton:
                Intent intent2 = new Intent(EFEactiv.this, Results.class);
                intent2.putExtra("Bool3", box3.isChecked());
                intent2.putExtra("Bool4", box4.isChecked());
                /*intent2.putExtra("Bool5", box5.isChecked());*/
                if (box3.isChecked()) {
                    if (pktInSet.getText().toString().isEmpty()) {
                        toastPktInSet.show();
                    } else {
                        if (name1.getText().toString().isEmpty() || name2.getText().toString().isEmpty() || name3.getText().toString().isEmpty()) {
                            toastNameTeams.show();
                        } else {
                            Intent intent = new Intent(EFEactiv.this, EFEactiv3.class);
                            intent.putExtra("NameOfTeam1", name1.getText().toString());
                            intent.putExtra("NameOfTeam2", name2.getText().toString());
                            intent.putExtra("NameOfTeam3", name3.getText().toString());
                            intent.putExtra("pktInSet", pktInSet.getText().toString());
                            intent.putExtra("nameOfTour", nameOfTour.getText().toString());

                            List<TournamentLocal> tournamets = new TableControllerTournament(getApplicationContext()).read();
                            for(TournamentLocal tour:tournamets){
                                if(tour.getNazwa().equals(nameOfTour.getText().toString())){
                                    Toast.makeText(getApplicationContext(),"Istnieje już turniej o takiej nazwie",Toast.LENGTH_SHORT).show();
                                    return super.onOptionsItemSelected(item);
                                }
                            }
                            TournamentLocal tournamentLocal = new TournamentLocal();
                            tournamentLocal.setNazwa(nameOfTour.getText().toString());
                            tournamentLocal.setTyp("Group3");
                            tournamentLocal.setPktInSet(pktInSet.getText().toString());
                            new TableControllerTournament(getApplicationContext()).create(tournamentLocal);

                            tournamets = new TableControllerTournament(getApplicationContext()).read();
                            int id=0;
                            for(TournamentLocal tour:tournamets){
                                if (tour.getNazwa().equals(nameOfTour.getText().toString())){
                                    id = tour.getId();
                                    break;
                                }
                            }

                            Team team1 = new Team(name1.getText().toString(),id);
                            new TableControllerTeams(getApplicationContext()).create(team1);
                            Team team2 = new Team(name2.getText().toString(),id);
                            new TableControllerTeams(getApplicationContext()).create(team2);
                            Team team3 = new Team(name3.getText().toString(),id);
                            new TableControllerTeams(getApplicationContext()).create(team3);

                            startActivity(intent);
                        }
                    }
                } else if (box4.isChecked()) {
                    if (pktInSet.getText().toString().isEmpty()) {
                        toastPktInSet.show();
                    } else {
                        if (name1.getText().toString().isEmpty() || name2.getText().toString().isEmpty() || name3.getText().toString().isEmpty() || name4.getText().toString().isEmpty()) {
                            toastNameTeams.show();
                        } else {
                            Intent intent = new Intent(EFEactiv.this, EFEactiv4.class);
                            intent.putExtra("NameOfTeam1", name1.getText().toString());
                            intent.putExtra("NameOfTeam2", name2.getText().toString());
                            intent.putExtra("NameOfTeam3", name3.getText().toString());
                            intent.putExtra("NameOfTeam4", name4.getText().toString());
                            intent.putExtra("pktInSet", pktInSet.getText().toString());
                            intent.putExtra("nameOfTour", nameOfTour.getText().toString());

                            TournamentLocal tournamentLocal = new TournamentLocal();
                            tournamentLocal.setNazwa(nameOfTour.getText().toString());
                            tournamentLocal.setTyp("Group4");
                            tournamentLocal.setPktInSet(pktInSet.getText().toString());
                            new TableControllerTournament(getApplicationContext()).create(tournamentLocal);

                            List<TournamentLocal> tournamets = new TableControllerTournament(getApplicationContext()).read();
                            int id=0;
                            for(TournamentLocal tour:tournamets){
                                if (tour.getNazwa().equals(nameOfTour.getText().toString())){
                                    id = tour.getId();
                                    break;
                                }
                            }

                            Team team1 = new Team(name1.getText().toString(),id);
                            new TableControllerTeams(getApplicationContext()).create(team1);
                            Team team2 = new Team(name2.getText().toString(),id);
                            new TableControllerTeams(getApplicationContext()).create(team2);
                            Team team3 = new Team(name3.getText().toString(),id);
                            new TableControllerTeams(getApplicationContext()).create(team3);
                            Team team4 = new Team(name4.getText().toString(),id);
                            new TableControllerTeams(getApplicationContext()).create(team4);
                            startActivity(intent);
                        }
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Zaznacz liczbę drużyn", Toast.LENGTH_SHORT).show();
                }

        }
        return super.onOptionsItemSelected(item);
    }
}
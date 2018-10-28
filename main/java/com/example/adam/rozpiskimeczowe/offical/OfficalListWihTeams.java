package com.example.adam.rozpiskimeczowe.offical;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.adam.rozpiskimeczowe.R;
import com.example.adam.rozpiskimeczowe.brazylian.brazylian8.BRAZactiv8;
import com.example.adam.rozpiskimeczowe.cup.cup32.CUPactiv32;
import com.example.adam.rozpiskimeczowe.cup.cup64.CUPactiv64;

import java.util.ArrayList;
import java.util.Objects;


public class OfficalListWihTeams extends AppCompatActivity {


    GetDataFromBeachPzps getDataFromBeachPzps;
    ArrayList<String> namesToExport;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offical_list_with_teams);

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
                        getDataFromBeachPzps = new GetDataFromBeachPzps(list, OfficalListWihTeams.this,ed.getText().toString());
                        getDataFromBeachPzps.execute();


            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_bar_with_start_button,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menuStartButton:
                //ZABEZPIECZENIE !!!
                if(getDataFromBeachPzps!=null) {
                    if(getDataFromBeachPzps.getNameOfFirstPlayers().size()!=0) {

                        Intent intent;
                        if(getDataFromBeachPzps.getNameOfFirstPlayers().size()<=40) {
                            intent = new Intent(this, CUPactiv32.class);
                        }else {
                            intent = new Intent(this, CUPactiv64.class);
                        }

                        for (int i = 0; i < getDataFromBeachPzps.getNameOfFirstPlayers().size(); i++) {
                            intent.putExtra("NameOfTeam" + (i + 1), getDataFromBeachPzps.getNameOfFirstPlayers().get(i) + "\n" + getDataFromBeachPzps.getNameOfSecondPlayers().get(i));
                        }
                        startActivity(intent);

                    }else {
                        Toast.makeText(this,"Najpierw pobierz listę zawodników",Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(this,"Najpierw pobierz listę zawodników",Toast.LENGTH_SHORT).show();
                }
        }
        return super.onOptionsItemSelected(item);
    }
}


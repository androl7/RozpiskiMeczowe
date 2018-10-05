package com.example.adam.rozpiskimeczowe.everyoneForEveryone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.adam.rozpiskimeczowe.R;

public class EFEactiv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_efeactiv);

        final Toast nazwijDruzyny = Toast.makeText(getApplicationContext(),"Nazwij wszyskie drużyny :)", Toast.LENGTH_SHORT);
        final Toast toastPktInSet = Toast.makeText(getApplicationContext(),"Podaj do ilu pkt bedzie rozgrywany set", Toast.LENGTH_SHORT);


        final EditText name1 =  findViewById(R.id.Name1);
        final EditText name2 =  findViewById(R.id.Name2);
        final EditText name3 =  findViewById(R.id.Name3);
        final EditText name4 =  findViewById(R.id.Name4);
        final EditText name5 =  findViewById(R.id.Name5);
        final EditText name6 =  findViewById(R.id.Name6);
        final EditText pktInSet = findViewById(R.id.editTextPkt);

        name1.setVisibility(View.INVISIBLE);
        name2.setVisibility(View.INVISIBLE);
        name3.setVisibility(View.INVISIBLE);
        name4.setVisibility(View.INVISIBLE);
        name5.setVisibility(View.INVISIBLE);
        name6.setVisibility(View.INVISIBLE);

        final CheckBox box3 =  findViewById(R.id.checkBox3);
        final CheckBox box4 =  findViewById(R.id.checkBox4);
        final CheckBox box5 =  findViewById(R.id.checkBox5);
        final CheckBox box6 =  findViewById(R.id.checkBox6);
        final CheckBox boxSets1 =  findViewById(R.id.checkBoxSets1);
        final CheckBox boxSets2 =  findViewById(R.id.checkBoxSets2);

        boxSets1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boxSets2.setChecked(false);
            }
        });

        boxSets2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boxSets1.setChecked(false);
            }
        });


        box3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (box3.isChecked()) {
                    box4.setChecked(false);
                    box5.setChecked(false);
                    box6.setChecked(false);
                    name1.setVisibility(View.VISIBLE);
                    name2.setVisibility(View.VISIBLE);
                    name3.setVisibility(View.VISIBLE);
                    name4.setVisibility(View.INVISIBLE);
                    name5.setVisibility(View.INVISIBLE);
                    name6.setVisibility(View.INVISIBLE);
                }
            }
        });
        box4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (box4.isChecked()) {
                    box3.setChecked(false);
                    box5.setChecked(false);
                    box6.setChecked(false);
                    name1.setVisibility(View.VISIBLE);
                    name2.setVisibility(View.VISIBLE);
                    name3.setVisibility(View.VISIBLE);
                    name4.setVisibility(View.VISIBLE);
                    name5.setVisibility(View.INVISIBLE);
                    name6.setVisibility(View.INVISIBLE);
                }
            }
        });

        box5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (box5.isChecked()) {
                    box4.setChecked(false);
                    box3.setChecked(false);
                    box6.setChecked(false);
                    name1.setVisibility(View.VISIBLE);
                    name2.setVisibility(View.VISIBLE);
                    name3.setVisibility(View.VISIBLE);
                    name4.setVisibility(View.VISIBLE);
                    name5.setVisibility(View.VISIBLE);
                    name6.setVisibility(View.INVISIBLE);
                }
            }
        });

        box6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (box6.isChecked()) {
                    box4.setChecked(false);
                    box5.setChecked(false);
                    box3.setChecked(false);
                    name1.setVisibility(View.VISIBLE);
                    name2.setVisibility(View.VISIBLE);
                    name3.setVisibility(View.VISIBLE);
                    name4.setVisibility(View.VISIBLE);
                    name5.setVisibility(View.VISIBLE);
                    name6.setVisibility(View.VISIBLE);
                }
            }
        });


            Button EFE = findViewById(R.id.start);
            EFE.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent(EFEactiv.this, Results.class);
                    intent2.putExtra("Bool3", box3.isChecked());
                    intent2.putExtra("Bool4", box4.isChecked());
                    intent2.putExtra("Bool5", box5.isChecked());
                      if (box3.isChecked()) {
                          if(pktInSet.getText().toString().isEmpty()){
                               toastPktInSet.show();
                          }else {
                              if (name1.getText().toString().isEmpty() || name2.getText().toString().isEmpty() || name3.getText().toString().isEmpty()) {
                                  nazwijDruzyny.show();
                              } else {
                                  Intent intent = new Intent(EFEactiv.this, EFEactiv3.class);
                                  intent.putExtra("NameOfTeam1", name1.getText().toString());
                                  intent.putExtra("NameOfTeam2", name2.getText().toString());
                                  intent.putExtra("NameOfTeam3", name3.getText().toString());
                                  intent.putExtra("BoolSets", boxSets1.isChecked());
                                  intent.putExtra("pktInSet", pktInSet.getText().toString());
                                  startActivity(intent);
                              }
                          }
                      } else if (box4.isChecked()) {
                          if(pktInSet.getText().toString().isEmpty()){
                              toastPktInSet.show();
                          }else {
                              if (name1.getText().toString().isEmpty() || name2.getText().toString().isEmpty() || name3.getText().toString().isEmpty() || name4.getText().toString().isEmpty()) {
                                  nazwijDruzyny.show();
                              } else {
                                  Intent intent = new Intent(EFEactiv.this, EFEactiv4.class);
                                  intent.putExtra("NameOfTeam1", name1.getText().toString());
                                  intent.putExtra("NameOfTeam2", name2.getText().toString());
                                  intent.putExtra("NameOfTeam3", name3.getText().toString());
                                  intent.putExtra("NameOfTeam4", name4.getText().toString());
                                  intent.putExtra("BoolSets", boxSets1.isChecked());
                                  intent.putExtra("pktInSet", pktInSet.getText().toString());
                                  startActivity(intent);
                              }
                          }
                      } else {
                          Toast.makeText(getApplicationContext(), "Zaznacz ile druzyn !!!", Toast.LENGTH_SHORT).show();
                      }
                }
            });
    }
}

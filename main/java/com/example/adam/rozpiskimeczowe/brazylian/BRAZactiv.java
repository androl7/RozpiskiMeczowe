package com.example.adam.rozpiskimeczowe.brazylian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.adam.rozpiskimeczowe.R;
import com.example.adam.rozpiskimeczowe.brazylian.brazylian8.BRAZactiv8;

public class BRAZactiv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brazactiv);

        final EditText name1 = (EditText) findViewById(R.id.Name1);
        final EditText name2 = (EditText) findViewById(R.id.Name2);
        final EditText name3 = (EditText) findViewById(R.id.Name3);
        final EditText name4 = (EditText) findViewById(R.id.Name4);
        final EditText name5 = (EditText) findViewById(R.id.Name5);
        final EditText name6 = (EditText) findViewById(R.id.Name6);
        final EditText name7 = (EditText) findViewById(R.id.Name7);
        final EditText name8 = (EditText) findViewById(R.id.Name8);

        name1.setVisibility(View.INVISIBLE);
        name2.setVisibility(View.INVISIBLE);
        name3.setVisibility(View.INVISIBLE);
        name4.setVisibility(View.INVISIBLE);
        name5.setVisibility(View.INVISIBLE);
        name6.setVisibility(View.INVISIBLE);
        name7.setVisibility(View.INVISIBLE);
        name8.setVisibility(View.INVISIBLE);


        final CheckBox box3 = (CheckBox) findViewById(R.id.checkBox3);
        final CheckBox box4 = (CheckBox) findViewById(R.id.checkBox4);
        final CheckBox box5 = (CheckBox) findViewById(R.id.checkBox5);
        final CheckBox box6 = (CheckBox) findViewById(R.id.checkBox6);

        box3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(box3.isChecked()){
                    box4.setChecked(false);
                    box5.setChecked(false);
                    box6.setChecked(false);
                    name1.setVisibility(View.VISIBLE);
                    name2.setVisibility(View.VISIBLE);
                    name3.setVisibility(View.VISIBLE);
                    name4.setVisibility(View.VISIBLE);
                    name5.setVisibility(View.VISIBLE);
                    name6.setVisibility(View.VISIBLE);
                    name7.setVisibility(View.VISIBLE);
                    name8.setVisibility(View.VISIBLE);
                }
            }
        });
        box4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(box4.isChecked()){
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
                if(box5.isChecked()) {
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
                if(box6.isChecked()) {
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


        Button EFE = (Button)findViewById(R.id.start);
        EFE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (BRAZactiv.this, BRAZactiv8.class);
                intent.putExtra("NameOfTeam1",name1.getText().toString());
                intent.putExtra("NameOfTeam2",name2.getText().toString());
                intent.putExtra("NameOfTeam3",name3.getText().toString());
                intent.putExtra("NameOfTeam4",name4.getText().toString());
                intent.putExtra("NameOfTeam5",name5.getText().toString());
                intent.putExtra("NameOfTeam6",name6.getText().toString());
                intent.putExtra("NameOfTeam7",name7.getText().toString());
                intent.putExtra("NameOfTeam8",name8.getText().toString());
                startActivity(intent);
            }
        });
    }
}

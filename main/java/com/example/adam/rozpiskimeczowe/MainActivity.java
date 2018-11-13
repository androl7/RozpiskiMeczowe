package com.example.adam.rozpiskimeczowe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.adam.rozpiskimeczowe.loadDatabase.LoadingList;
import com.example.adam.rozpiskimeczowe.offical.OfficalListWihTeams;
import com.example.adam.rozpiskimeczowe.everyoneForEveryone.EFEactiv;
import com.example.adam.rozpiskimeczowe.brazylian.BRAZactiv;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent intent = new Intent (this, EFEactiv.class);
        ImageButton EFE = findViewById(R.id.menu_Button_EFE);
        EFE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        final Intent intent2 = new Intent (this, BRAZactiv.class);
        ImageButton BRAZ = findViewById(R.id.menu_Button_Braz);
        BRAZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
            }
        });

        final Intent intent3 = new Intent (this, OfficalListWihTeams.class);
        ImageButton Get = findViewById(R.id.menu_Button_Offical);
        Get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent3);
            }
        });


        final Intent intent4 = new Intent (this, LoadingList.class);
        ImageButton Load = findViewById(R.id.menu_Button_Load);
        Load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent4);
            }
        });



        getSupportActionBar().hide();


    }
}

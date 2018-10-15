package com.example.adam.rozpiskimeczowe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.adam.rozpiskimeczowe.everyoneForEveryone.EFEactiv;
import com.example.adam.rozpiskimeczowe.brazylian.BRAZactiv;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent intent = new Intent (this, EFEactiv.class);
        Button EFE = findViewById(R.id.EveryOneForEveryOne);
        EFE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        final Intent intent2 = new Intent (this, BRAZactiv.class);
        Button BRAZ = findViewById(R.id.Brazilian);
        BRAZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
            }
        });
        getSupportActionBar().hide();
    }
}

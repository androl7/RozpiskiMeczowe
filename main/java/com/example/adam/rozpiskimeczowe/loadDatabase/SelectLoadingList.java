package com.example.adam.rozpiskimeczowe.loadDatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.adam.rozpiskimeczowe.R;

public class SelectLoadingList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_loading_list);

        Button offical = findViewById(R.id.SelectLoadingOfficalList);

        offical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),LoadingListOffical.class));
            }
        });

        Button local = findViewById(R.id.SelectLoadingLocalList);

        local.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),LoadingListLocal.class));
            }
        });
    }
}

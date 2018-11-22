package com.example.adam.rozpiskimeczowe;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


import com.example.adam.rozpiskimeczowe.loadDatabase.LoadingListOffical;
import com.example.adam.rozpiskimeczowe.everyoneForEveryone.EFEactiv;
import com.example.adam.rozpiskimeczowe.brazylian.BRAZactiv;
import com.example.adam.rozpiskimeczowe.loadDatabase.SelectLoadingList;
import com.example.adam.rozpiskimeczowe.offical.OfficalListWihTeams;

public class MainActivity extends AppCompatActivity {

Context context;
Database database;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

       database = new Database();

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

        /*final Intent intent3 = new Intent (this, OfficalListWihTeams.class);*/
        ImageButton Get = findViewById(R.id.menu_Button_Offical);
        Get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = createAlert();
                alertDialog.show();
                /*startActivity(intent3);*/
            }
        });


        final Intent intent4 = new Intent (this, SelectLoadingList.class);
        ImageButton Load = findViewById(R.id.menu_Button_Load);
        Load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent4);
            }
        });



        getSupportActionBar().hide();


    }

    AlertDialog createAlert()
    {
        final Intent intent = new Intent(context,OfficalListWihTeams.class);
        final EditText editText = new EditText(context);
        editText.setTransformationMethod(new AsteriskPasswordTransformationMethod());
        editText.setHint("Hasło");
        editText.setTextColor(Color.WHITE);
        editText.getBackground().mutate().setColorFilter(getResources().getColor(R.color.Grey), PorterDuff.Mode.SRC_ATOP);
        editText.setHintTextColor(getResources().getColor(R.color.Grey));
        //KURSOR ZMIENIC NA BIAŁY OGÓLNIE STYL TEGO ALERTU !!!!!!!!!!
        LoadingListOffical.setCursorColor(editText, Color.WHITE);

        final AlertDialog alertDialog = new  AlertDialog.Builder(new ContextThemeWrapper(context,R.style.AlertDialogCustom))
                //set message, title, and icon
                .setTitle("Podaj hasło:")
                .setView(editText)
                .setPositiveButton("Ok", null)

                .setNegativeButton("Anuluj", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();
                    }
                })

                .setNeutralButton("Lokalnie", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        intent.putExtra("Local","true");
                        dialog.dismiss();
                        startActivity(intent);
                    }
                })



                .create();

        alertDialog.setOnShowListener(new DialogInterface.OnShowListener() {

            @Override
            public void onShow(final DialogInterface dialog) {

                final Button b = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
                b.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                        database.checkPassword(editText.getText().toString(),context);
                    }
                });
            }
        });

        return alertDialog;


    }
}

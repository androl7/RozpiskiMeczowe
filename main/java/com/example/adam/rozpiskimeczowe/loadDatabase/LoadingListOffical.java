package com.example.adam.rozpiskimeczowe.loadDatabase;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adam.rozpiskimeczowe.AsteriskPasswordTransformationMethod;
import com.example.adam.rozpiskimeczowe.R;
import com.example.adam.rozpiskimeczowe.Tournament;
import com.example.adam.rozpiskimeczowe.TypeOfTournaments;
import com.example.adam.rozpiskimeczowe.cup.cup32.CUPactiv32;
import com.example.adam.rozpiskimeczowe.cup.cup64.CUPactiv64;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import dmax.dialog.SpotsDialog;

public class LoadingListOffical extends AppCompatActivity {
    private FirebaseFirestore db;
    private AlertDialog alertDialog;
    ArrayList<Tournament> adapterArrayList;
    Context context= this;
    InputMethodManager imm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Lista Turniejów: ");
        setContentView(R.layout.activity_loading_list);
        db = FirebaseFirestore.getInstance();
        final ListView listview = findViewById(R.id.Loading_list);
        adapterArrayList = new ArrayList<>();
        imm = (InputMethodManager) Objects.requireNonNull(getSystemService(Context.INPUT_METHOD_SERVICE));

        final CustomAdapter adapter = new CustomAdapter(this);


        alertDialog = new SpotsDialog.Builder().setContext(this).setTheme(R.style.Custom).build();


        //Get all data of Tournament
        alertDialog.show();
        //add names
        db.collection("tournaments").get()
                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {

                        if (!queryDocumentSnapshots.isEmpty()) {
                            List<DocumentSnapshot> list = queryDocumentSnapshots.getDocuments();

                            for (DocumentSnapshot d : list) {
                                Tournament tournament = new Tournament();
                                tournament.setName(d.getId());
                                tournament.setType(d.getData().get("Type").toString());
                                tournament.setPassword(d.getData().get("Key").toString());
                                tournament.setTeams((ArrayList<String>) d.getData().get("Teams"));
                                adapterArrayList.add(tournament);
                            }
                        }
                        if (adapterArrayList.size() != 0) {
                            listview.setAdapter(adapter);
                        }
                        alertDialog.dismiss();

                    }
                });

    }


    class CustomAdapter extends BaseAdapter {
        private Context context;

        CustomAdapter(Context context) {
            this.context = context;
        }


        @Override
        public int getViewTypeCount() {
            return getCount();
        }

        @Override
        public int getItemViewType(int position) {
            return position;
        }

        @Override
        public int getCount() {
            return adapterArrayList.size();
        }

        @Override
        public Tournament getItem(int position) {
            return adapterArrayList.get(position);
        }


        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            final ViewHolder holder;

            if (convertView == null) {
                holder = new ViewHolder();

                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.loading_item_list, null, true);


                holder.names = convertView.findViewById(R.id.LoadingNameTextView);
                holder.names.setText(adapterArrayList.get(position).getName());


                convertView.setTag(holder);

                convertView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AlertDialog alrD = createAlert(adapterArrayList.get(position).getPassword(),position);
                        alrD.show();

                    }
                });


            }

            return convertView;
        }

        private class ViewHolder {

            protected TextView names;

        }


    }

    AlertDialog createAlert(final String password, final int position)
    {
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
                .setTitle(adapterArrayList.get(position).getName())
                .setView(editText)
                .setPositiveButton("Ok", null)

                .setNegativeButton("Anuluj", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();
                    }
                })

                .setNeutralButton("Oberwator", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        Intent intent;
                        imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                        if (adapterArrayList.get(position).getType().equals(TypeOfTournaments.Offical_64.toString())) {

                            intent = new Intent(getApplicationContext(), CUPactiv64.class);


                        } else if(adapterArrayList.get(position).getType().equals(TypeOfTournaments.Offical_32.toString())) {

                            intent = new Intent(getApplicationContext(),CUPactiv32.class);
                        }else {
                            intent = new Intent(getApplicationContext(),CUPactiv32.class);
                        }

                        for (int j = 0; j < adapterArrayList.get(position).getTeams().size(); j++) {
                            intent.putExtra("NameOfTeam" + (j + 1), adapterArrayList.get(position).getTeams().get(j));
                        }
                        intent.putExtra("quantityOfTeams", String.valueOf(adapterArrayList.get(position).getTeams().size()));
                        intent.putExtra("nameOfTour", adapterArrayList.get(position).getName());
                        intent.putExtra("OnlyWatch","true");
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
                        if(editText.getText().toString().equals(password)){
                            imm.hideSoftInputFromWindow(b.getWindowToken(), 0);
                            Intent intent;
                            if (adapterArrayList.get(position).getType().equals(TypeOfTournaments.Offical_64.toString())) {

                                intent = new Intent(getApplicationContext(), CUPactiv64.class);


                            } else if(adapterArrayList.get(position).getType().equals(TypeOfTournaments.Offical_32.toString())) {

                                intent = new Intent(getApplicationContext(),CUPactiv32.class);
                            }else {
                                intent = new Intent(getApplicationContext(),CUPactiv32.class);
                            }

                            for (int i = 0; i < adapterArrayList.get(position).getTeams().size(); i++) {
                                intent.putExtra("NameOfTeam" + (i + 1), adapterArrayList.get(position).getTeams().get(i));
                            }
                            intent.putExtra("quantityOfTeams", String.valueOf(adapterArrayList.get(position).getTeams().size()));
                            intent.putExtra("nameOfTour", adapterArrayList.get(position).getName());
                            dialog.dismiss();

                            startActivity(intent);

                        }else {
                            Toast.makeText(context,"Złe Hasło, spróbuj jeszcze raz",Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }
        });

        return alertDialog;


    }

    public static void setCursorColor(EditText view, @ColorInt int color) {
        try {
            // Get the cursor resource id
            Field field = TextView.class.getDeclaredField("mCursorDrawableRes");
            field.setAccessible(true);
            int drawableResId = field.getInt(view);

            // Get the editor
            field = TextView.class.getDeclaredField("mEditor");
            field.setAccessible(true);
            Object editor = field.get(view);

            // Get the drawable and set a color filter
            Drawable drawable = ContextCompat.getDrawable(view.getContext(), drawableResId);
            drawable.setColorFilter(color, PorterDuff.Mode.SRC_IN);
            Drawable[] drawables = {drawable, drawable};

            // Set the drawables
            field = editor.getClass().getDeclaredField("mCursorDrawable");
            field.setAccessible(true);
            field.set(editor, drawables);
        } catch (Exception ignored) {
        }
    }



}

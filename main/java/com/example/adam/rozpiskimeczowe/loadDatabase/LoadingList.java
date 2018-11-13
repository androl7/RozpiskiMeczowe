package com.example.adam.rozpiskimeczowe.loadDatabase;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adam.rozpiskimeczowe.R;
import com.example.adam.rozpiskimeczowe.Tournament;
import com.example.adam.rozpiskimeczowe.TypeOfTournaments;
import com.example.adam.rozpiskimeczowe.cup.cup64.CUPactiv64;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dmax.dialog.SpotsDialog;

public class LoadingList extends AppCompatActivity {
    private FirebaseFirestore db;
    private AlertDialog alertDialog;
    ArrayList<Tournament> adapterArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_list);
        db = FirebaseFirestore.getInstance();
        final ListView listview = findViewById(R.id.Loading_list);
        adapterArrayList = new ArrayList<>();

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
                        if (adapterArrayList.get(position).getType().equals(TypeOfTournaments.Offical_64.toString())) {

                            Intent intent = new Intent(getApplicationContext(), CUPactiv64.class);
                            for (int i = 0; i < adapterArrayList.get(position).getTeams().size(); i++) {
                                intent.putExtra("NameOfTeam" + (i + 1), adapterArrayList.get(position).getTeams().get(i));
                            }
                            intent.putExtra("quantityOfTeams", String.valueOf(adapterArrayList.get(position).getTeams().size()));
                            intent.putExtra("nameOfTour", adapterArrayList.get(position).getName());
                            startActivity(intent);

                        } else {

                        }
                    }
                });


            }

            return convertView;
        }

        private class ViewHolder {

            protected TextView names;

        }


    }

}

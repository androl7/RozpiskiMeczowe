package com.example.adam.rozpiskimeczowe.loadDatabase;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adam.rozpiskimeczowe.LocalDatabase.TableControllerTeams;
import com.example.adam.rozpiskimeczowe.LocalDatabase.TableControllerTournament;
import com.example.adam.rozpiskimeczowe.LocalDatabase.Team;
import com.example.adam.rozpiskimeczowe.LocalDatabase.TournamentLocal;
import com.example.adam.rozpiskimeczowe.R;
import com.example.adam.rozpiskimeczowe.brazylian.brazylian16.BRAZactiv16;
import com.example.adam.rozpiskimeczowe.brazylian.brazylian8.BRAZactiv8;

import java.util.List;

public class LoadingListLocal extends AppCompatActivity {
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_list_local);
        final ListView listview = findViewById(R.id.Loading_list_local);

        adapter = new CustomAdapter(this);
        if(adapter.getCount()!=0) {
            listview.setAdapter(adapter);
        }

        listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(final AdapterView<?> adapterView, View view, final int position, long l) {
                new  AlertDialog.Builder(new ContextThemeWrapper(LoadingListLocal.this,R.style.AlertDialogCustom))
                        //set message, title, and icon
                        .setTitle("Usunąć turniej ?")
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                new TableControllerTournament(getApplicationContext()).delete(adapter.tournaments.get(position).getId());
                                TournamentLocal tournamentLocal = adapter.tournaments.get(position);
                                adapter.tournaments.remove(tournamentLocal);
                                listview.setAdapter(adapter);
                                dialog.dismiss();
                            }})

                        .setNegativeButton("Anuluj", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.dismiss();
                            }
                        }).show();

                return false;
            }
        });

    }

    class CustomAdapter extends BaseAdapter {
        private Context context;
        List<TournamentLocal> tournaments;
        CustomAdapter(Context context) {
            this.context = context;
            tournaments = new TableControllerTournament(getApplicationContext()).read();
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
            return tournaments.size();
        }

        @Override
        public TournamentLocal getItem(int position) {
            return tournaments.get(position);
        }


        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View convertView, final ViewGroup parent) {
            final ViewHolder holder;

            if (convertView == null) {
                holder = new ViewHolder();

                final LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.loading_item_list, null, true);

                holder.names = convertView.findViewById(R.id.LoadingNameTextView);
                holder.names.setText(tournaments.get(position).getNazwa());

                convertView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent;
                        if(tournaments.get(position).getTyp().equals("braz16")){
                            intent = new Intent(getApplicationContext(),BRAZactiv16.class);
                        }else {
                            intent = new Intent(getApplicationContext(),BRAZactiv8.class);
                        }

                        List<Team> teams = new TableControllerTeams(getApplicationContext()).read(String.valueOf(tournaments.get(position).getId()));
                        for (int i = 0; i < teams.size(); i++) {
                            intent.putExtra("NameOfTeam" + (i + 1), teams.get(i).getNazwa());
                        }
                        intent.putExtra("quantityOfTeams", String.valueOf(teams.size()));
                        intent.putExtra("nameOfTour", tournaments.get(position).getNazwa());

                        startActivity(intent);

                    }
                });

                convertView.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View view) {

                        return false;
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

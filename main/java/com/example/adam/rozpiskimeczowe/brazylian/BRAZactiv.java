package com.example.adam.rozpiskimeczowe.brazylian;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adam.rozpiskimeczowe.LocalDatabase.TableControllerTeams;
import com.example.adam.rozpiskimeczowe.LocalDatabase.TableControllerTournament;
import com.example.adam.rozpiskimeczowe.LocalDatabase.Team;
import com.example.adam.rozpiskimeczowe.LocalDatabase.TournamentLocal;
import com.example.adam.rozpiskimeczowe.R;
import com.example.adam.rozpiskimeczowe.Tournament;
import com.example.adam.rozpiskimeczowe.brazylian.brazylian16.BRAZactiv16;
import com.example.adam.rozpiskimeczowe.brazylian.brazylian8.BRAZactiv8;

import java.util.List;
import java.util.Objects;


public class BRAZactiv extends AppCompatActivity {
    int quantityOfTeam = 0;
    String[] names;
    CustomAdapter customAdapter;
    String type ="";
    EditText nameOfTour;
    EditText editTextPkt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brazactiv);

        nameOfTour = findViewById(R.id.brazNameOfTour);
        getSupportActionBar().setTitle("System brazylijski");

        final ListView list = findViewById(R.id.listView);
        list.setItemsCanFocus(true);

        // lost focus after set points in set
        editTextPkt = findViewById(R.id.brazEditTextPkt);
        final RelativeLayout relativeLayout = findViewById(R.id.brazMainLayout);
        final InputMethodManager imm = (InputMethodManager) Objects.requireNonNull(getApplicationContext()).getSystemService(Context.INPUT_METHOD_SERVICE);

        editTextPkt.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (editTextPkt.getText().toString().length() == 2) {
                    relativeLayout.requestFocus();
                    imm.hideSoftInputFromWindow(editTextPkt.getWindowToken(), 0);
                }
            }

            public void afterTextChanged(Editable s) {
            }
        });

        //RadioButtons with modify listView

        final RadioButton radioButton8 = findViewById(R.id.brazRadioButton8);
        final RadioButton radioButton16 = findViewById(R.id.brazRadioButton16);
        /*final RadioButton radioButton24 = findViewById(R.id.brazRadioButton24);*/

        radioButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quantityOfTeam != 8) {
                    quantityOfTeam = 8;
                    customAdapter = new CustomAdapter(getApplicationContext());
                    list.setAdapter(customAdapter);
                }
            }
        });

        radioButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quantityOfTeam != 16) {
                    quantityOfTeam = 16;
                    customAdapter = new CustomAdapter(getApplicationContext());
                    list.setAdapter(customAdapter);
                }
            }
        });

        /*radioButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quantityOfTeam != 24) {
                    quantityOfTeam = 24;
                    customAdapter = new CustomAdapter(getApplicationContext());
                    list.setAdapter(customAdapter);
                }
            }
        });*/

    }

    //zobacz czy potrzebne
    @Override
    protected void onPause() {
        View current = getCurrentFocus();
        if (current != null) current.clearFocus();
        super.onPause();
    }


    class CustomAdapter extends BaseAdapter {
        private Context context;
        private String[] rValues = new String[quantityOfTeam];

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
            return quantityOfTeam;
        }

        @Override
        public String getItem(int position) {
            return names[position] + "\n" + names[position + quantityOfTeam];
        }


        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View convertView, final ViewGroup parent) {
            final ViewHolder holder;
            for (int i = 0; i < quantityOfTeam; i++) {
                rValues[i] = "R" + (i + 1);
            }
            if (convertView == null) {
                holder = new ViewHolder();

                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.brazylian_item_list, null, true);

                names = new String[quantityOfTeam * 2];
                holder.editText = convertView.findViewById(R.id.brazItemListEditTextName1);
                holder.editText2 = convertView.findViewById(R.id.brazItemListEditTextName2);
                holder.textView = convertView.findViewById(R.id.brazItemListtextViewR);


                convertView.setTag(holder);
            } else {
                // the getTag returns the viewHolder object set as a tag to the view
                holder = (ViewHolder) convertView.getTag();
            }

            holder.textView.setText(rValues[position]);

            holder.editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean b) {
                    if (!b) {
                        names[position] = holder.editText.getText().toString();

                    }
                }
            });

            holder.editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean b) {
                    if (!b) {
                        names[position+quantityOfTeam] = holder.editText2.getText().toString();

                    }
                }
            });


            holder.editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                    if (actionId == EditorInfo.IME_ACTION_NEXT) {
                        holder.editText2.requestFocus();
                    }
                    return false;
                }

            });

            holder.editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                    if (actionId == EditorInfo.IME_ACTION_DONE) {

                    }
                    return false;
                }

            });

            return convertView;
        }

        private class ViewHolder {

            EditText editText;
            EditText editText2;
            TextView textView;

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_bar_with_start_button, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            //START WITH CHECK
            case R.id.menuStartButton:

                if (quantityOfTeam != 0) {
                    boolean checkNull = true;
                    for (String name : names) {
                        if (name == null || name.equals("")) {
                            //TU MA BYĆ FALSE !!!
                            checkNull = false;
                            break;
                        }
                    }
                    Intent intent;
                    if (checkNull) {
                        if (quantityOfTeam == 8) {
                            intent = new Intent(this, BRAZactiv8.class);
                            type = "braz8";
                        } else if (quantityOfTeam == 16) {
                            intent = new Intent(this, BRAZactiv16.class);
                            type = "braz16";
                        } else {
                            Toast.makeText(this, "24 Coming soon", Toast.LENGTH_SHORT).show();
                            return super.onOptionsItemSelected(item);
                        }

                        String nameTour =  nameOfTour.getText().toString();

                        List<TournamentLocal> tournamets = new TableControllerTournament(getApplicationContext()).read();
                        for(TournamentLocal tour:tournamets){
                            if(tour.getNazwa().equals(nameTour)){
                                Toast.makeText(getApplicationContext(),"Istnieje już turniej o takiej nazwie",Toast.LENGTH_SHORT).show();
                                return super.onOptionsItemSelected(item);
                            }
                        }
                        TournamentLocal tournamentLocal = new TournamentLocal();
                        tournamentLocal.setNazwa(nameTour);
                        tournamentLocal.setTyp(type);
                        tournamentLocal.setPktInSet(editTextPkt.getText().toString());
                        new TableControllerTournament(getApplicationContext()).create(tournamentLocal);

                        tournamets = new TableControllerTournament(getApplicationContext()).read();
                        int id=0;
                        for(TournamentLocal tour:tournamets){
                            if (tour.getNazwa().equals(nameTour)){
                                id = tour.getId();
                                break;
                            }
                        }
                        for (int i = 0; i < names.length / 2; i++) {
                            intent.putExtra("NameOfTeam" + (i + 1), customAdapter.getItem(i));
                            Team team = new Team(customAdapter.getItem(i),id);
                            new TableControllerTeams(getApplicationContext()).create(team);
                        }
                        intent.putExtra("nameOfTour",nameTour);
                        intent.putExtra("local","true");
                        intent.putExtra("pktInSet",editTextPkt.getText().toString());
                        startActivity(intent);

                    } else {
                        Toast.makeText(getApplicationContext(), "Podaj nazwiska wszystkich graczy", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Wybierz liczbę drużyn.", Toast.LENGTH_SHORT).show();
                }

        }
        return super.onOptionsItemSelected(item);
    }
}
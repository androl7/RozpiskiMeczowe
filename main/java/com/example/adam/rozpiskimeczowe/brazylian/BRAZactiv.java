package com.example.adam.rozpiskimeczowe.brazylian;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adam.rozpiskimeczowe.R;
import com.example.adam.rozpiskimeczowe.brazylian.brazylian8.BRAZactiv8;



public class BRAZactiv extends AppCompatActivity {
    int quantityOfTeam=0;
    String[] names;
    CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brazactiv);

        getSupportActionBar().setTitle("System brazylijski");

        final ListView list = findViewById(R.id.listView);
        list.setItemsCanFocus(true);





        final RadioButton radioButton8 = findViewById(R.id.brazRadioButton8);
        final RadioButton radioButton16 = findViewById(R.id.brazRadioButton16);
        final RadioButton radioButton24 = findViewById(R.id.brazRadioButton24);

        radioButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quantityOfTeam!=8) {
                    quantityOfTeam = 8;
                    customAdapter = new CustomAdapter(getApplicationContext());
                    list.setAdapter(customAdapter);
                }
            }
        });

        radioButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quantityOfTeam!=16) {
                    quantityOfTeam = 16;
                    customAdapter = new CustomAdapter(getApplicationContext());
                    list.setAdapter(customAdapter);
                }
            }
        });

        radioButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quantityOfTeam!=24) {
                    quantityOfTeam = 24;
                    customAdapter = new CustomAdapter(getApplicationContext());
                    list.setAdapter(customAdapter);
                }
            }
        });




        Button EFE = findViewById(R.id.start);
        EFE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantityOfTeam!=0) {
                boolean checkNull=true;
                for(int i =0;i<names.length;i++){
                    if(names[i]==null||names[i].equals("")){
                        checkNull=false;
                        break;
                    }
                }
                if(checkNull) {
                    Intent intent = null;
                    switch (quantityOfTeam) {
                        case 8:intent = new Intent(BRAZactiv.this, BRAZactiv8.class);
                        case 16:intent = new Intent(BRAZactiv.this, BRAZactiv8.class);
                        case 24:intent = new Intent(BRAZactiv.this, BRAZactiv8.class);
                    }

                        for (int i = 0; i < names.length / 2; i++) {
                            intent.putExtra("NameOfTeam" + (i+1), customAdapter.getItem(i));
                        }
                        startActivity(intent);

                    }else {
                    Toast.makeText(getApplicationContext(),"Podaj nazwiska wszystkich graczy",Toast.LENGTH_SHORT).show();
                }
                }else {
                    Toast.makeText(getApplicationContext(),"Wybierz ilość drużyn.",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    protected void onPause() {
        View current = getCurrentFocus();
        if (current != null) current.clearFocus();
        super.onPause();
    }


    class CustomAdapter extends BaseAdapter {
        private Context context;
        private String[] rValues = {"R1", "R2", "R3", "R4", "R5", "R6", "R7", "R8", "R9", "R10", "R11", "R12", "R13", "R14", "R15", "R16", "R17", "R18", "R19", "R20", "R21", "R22", "R23", "R24"};

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
            return names[position] +"\n" + names[position + quantityOfTeam];
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
                        names[position + quantityOfTeam] = holder.editText2.getText().toString();
                    }
                }
            });

            return convertView;
        }

        private class ViewHolder {

            protected EditText editText;
            protected EditText editText2;
            protected TextView textView;

        }

    }
}
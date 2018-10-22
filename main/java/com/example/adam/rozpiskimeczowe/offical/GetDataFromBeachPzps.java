package com.example.adam.rozpiskimeczowe.offical;

import android.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.adam.rozpiskimeczowe.R;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.w3c.dom.Text;


import java.util.ArrayList;
import java.util.Map;

import dmax.dialog.SpotsDialog;

public class GetDataFromBeachPzps extends AsyncTask<Void, Void, Void> {

    private Document doc;
    private int quantityOfTeam = 0;
    private ArrayList<String> nameOfFirstPlayers;
    private ArrayList<String> nameOfSecondPlayers;
    private CustomAdapter customAdapter;
    private ListView list;
    private AlertDialog alertDialog;
    private Context context;
    private String idOfTour;

    GetDataFromBeachPzps(ListView list, Context context,String idOfTour) {
        this.idOfTour = idOfTour;
        this.list = list;
        this.context = context;
        list.setItemsCanFocus(true);

    }

    @Override
    protected void onPreExecute() {
        alertDialog = new SpotsDialog.Builder().setContext(context).setTheme(R.style.Custom).build();

        alertDialog.show();
    }

    @Override
    protected Void doInBackground(Void... arg0) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        try {
            nameOfFirstPlayers = new ArrayList<>();
            nameOfSecondPlayers = new ArrayList<>();
            Connection.Response res = Jsoup.connect("http://beach.pzps.pl/pl/site/login")
                    .data("LoginForm[email]", "aleknicpon@wp.pl", "LoginForm[password]", "aleknicpon")
                    .method(Connection.Method.POST)
                    .execute();

            Map<String, String> loginCookies = res.cookies();
            String urlToTour = "http://beach.pzps.pl/pl/tournament/"+idOfTour;
            doc = Jsoup.connect(urlToTour)
                    .cookies(loginCookies)
                    .get();

            Element innerTable = doc.select(".items tbody").first();
            Elements rows = innerTable.select("tr");

            for (Element row : rows) {
                Elements namesOFTeams = row.select("td:eq(4)");
                Elements withdrawn = row.select("td:eq(5)");
                //MOŻLIWA ZMIANA Z UWAGI NA TROCHE INNA TABELE CZY TURNIEJ NIE JEST ZAKONCZONY !!!!!!!!!!!!!!!!!!!!!!!!!!!^^^^^^^
                if(!withdrawn.text().equals("wycofana")) {

                    quantityOfTeam++;

                    //convert and Add to arrays
                    String namesOfPlayers = namesOFTeams.text().replaceAll("\\(.*?\\)", "");

                    String firstPlayer = namesOfPlayers.split("/")[0];
                    String secondPlayer = namesOfPlayers.split("/")[1];

                    firstPlayer = firstPlayer.substring(indexOfFirstCapitalLetter(firstPlayer));
                    secondPlayer = secondPlayer.substring(indexOfFirstCapitalLetter(secondPlayer));

                    firstPlayer = firstPlayer.split(" ")[0];
                    secondPlayer = secondPlayer.split(" ")[0];

                    nameOfFirstPlayers.add(firstPlayer);
                    nameOfSecondPlayers.add(secondPlayer);

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    protected void onPostExecute(Void result) {
        alertDialog.dismiss();

        if(nameOfFirstPlayers.size()!=0) {
            customAdapter = new CustomAdapter(context);
            list.setAdapter(customAdapter);
        } else {
        Toast.makeText(context,"Nie istnieje turniej o takim ID",Toast.LENGTH_SHORT).show();
    }}


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
            return nameOfFirstPlayers.get(position) + "\n" + nameOfSecondPlayers.get(position);
        }


        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            final ViewHolder holder;
            for (int i = 0; i < quantityOfTeam; i++) {
                rValues[i] = "R" + (i + 1);
            }
            if (convertView == null) {
                holder = new ViewHolder();

                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.cup_item_list, null, true);


                holder.editText = convertView.findViewById(R.id.OfficalListEditTextName1);
                holder.editText2 = convertView.findViewById(R.id.OfficalListEditTextName2);
                holder.textView = convertView.findViewById(R.id.OfficalItemListtextViewR);



                    holder.editText.setText(nameOfFirstPlayers.get(position));
                    holder.editText2.setText(nameOfSecondPlayers.get(position));



                convertView.setTag(holder);
            } else {
                // the getTag returns the viewHolder object set as a tag to the view
                holder = (ViewHolder) convertView.getTag();
            }

            holder.textView.setText(rValues[position]);



            return convertView;
        }

        private class ViewHolder {

            protected TextView editText;
            protected TextView editText2;
            protected TextView textView;

        }



    }

    private int indexOfFirstCapitalLetter(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) return i;
        }
        return -1;
    }

    public ArrayList<String> getNameOfFirstPlayers() {
        return nameOfFirstPlayers;
    }

    public ArrayList<String> getNameOfSecondPlayers() {
        return nameOfSecondPlayers;
    }
}

package com.example.adam.rozpiskimeczowe.LocalDatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class TableControllerMatches extends DBHelper  {

    public TableControllerMatches(Context context){
        super(context);
    }

    public boolean create(Match match) {

        ContentValues values = new ContentValues();

        values.put("nrM", match.getNrM());
        values.put("winner",match.getWinner());
        values.put("losser",match.getLosser());
        values.put("res1_1", match.getRes1_1());
        values.put("res1_2", match.getRes1_2());
        values.put("res1_3", match.getRes1_3());
        values.put("res2_1", match.getRes2_1());
        values.put("res2_2", match.getRes2_2());
        values.put("res2_3", match.getRes2_3());
        values.put("idTour", match.getIdTour());

        SQLiteDatabase db = this.getWritableDatabase();

        boolean createSuccessful = db.insert("matches", null, values) > 0;
        db.close();

        return createSuccessful;
    }

    public List<Match> read(String tourId) {

        List<Match> recordsList = new ArrayList<>();

        String sql = "SELECT * FROM matches WHERE idTour=="+tourId+"  ORDER BY idM DESC";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {

                int idM = Integer.parseInt(cursor.getString(cursor.getColumnIndex("idM")));
                String nrM = cursor.getString(cursor.getColumnIndex("nrM"));
                String winner = cursor.getString(cursor.getColumnIndex("winner"));
                String losser = cursor.getString(cursor.getColumnIndex("losser"));
                String res1_1 = cursor.getString(cursor.getColumnIndex("res1_1"));
                String res1_2 = cursor.getString(cursor.getColumnIndex("res1_2"));
                String res1_3 = cursor.getString(cursor.getColumnIndex("res1_3"));
                String res2_1 = cursor.getString(cursor.getColumnIndex("res2_1"));
                String res2_2 = cursor.getString(cursor.getColumnIndex("res2_2"));
                String res2_3 = cursor.getString(cursor.getColumnIndex("res2_3"));

                int teamidTour = Integer.parseInt(cursor.getString(cursor.getColumnIndex("idTour")));

                Match match = new Match();
                match.setIdM(idM);
                match.setNrM(nrM);
                match.setWinner(winner);
                match.setLosser(losser);
                match.setRes1_1(res1_1);
                match.setRes1_2(res1_2);
                match.setRes1_3(res1_3);
                match.setRes2_1(res2_1);
                match.setRes2_2(res2_2);
                match.setRes2_3(res2_3);
                match.setIdTour(teamidTour);

                recordsList.add(match);

            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();

        return recordsList;
    }

    public boolean delete(int nrM) {
        boolean deleteSuccessful;

        SQLiteDatabase db = this.getWritableDatabase();
        deleteSuccessful = db.delete("matches", "nrM ='" + nrM + "'", null) > 0;
        db.close();

        return deleteSuccessful;

    }
}

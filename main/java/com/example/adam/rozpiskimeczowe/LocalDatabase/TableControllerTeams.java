package com.example.adam.rozpiskimeczowe.LocalDatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TableControllerTeams extends DBHelper {

    public TableControllerTeams(Context context){
        super(context);
    }

    public boolean create(Team team) {

        ContentValues values = new ContentValues();

        values.put("name", team.getNazwa());
        values.put("idTour", team.getIdTour());

        SQLiteDatabase db = this.getWritableDatabase();

        boolean createSuccessful = db.insert("teams", null, values) > 0;
        db.close();

        return createSuccessful;
    }

    public List<Team> read(String tourId) {

        List<Team> recordsList = new ArrayList<>();

        String sql = "SELECT * FROM teams WHERE idTour=="+tourId+"  ORDER BY idTeam DESC";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {

                int idTeam = Integer.parseInt(cursor.getString(cursor.getColumnIndex("idTeam")));
                String teamsName = cursor.getString(cursor.getColumnIndex("name"));
                int teamidTour = Integer.parseInt(cursor.getString(cursor.getColumnIndex("idTour")));

                Team team = new Team();
                team.setId(idTeam);
                team.setNazwa(teamsName);
                team.setIdTour(teamidTour);

                recordsList.add(team);

            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();
        Collections.reverse(recordsList);
        return recordsList;
    }
}

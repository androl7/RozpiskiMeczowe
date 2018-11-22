package com.example.adam.rozpiskimeczowe.LocalDatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class TableControllerTournament extends DBHelper{

    public TableControllerTournament(Context context){
        super(context);
    }

    public boolean create(TournamentLocal tournamentLocal) {

        ContentValues values = new ContentValues();

        values.put("name", tournamentLocal.getNazwa());
        values.put("typ", tournamentLocal.getTyp());

        SQLiteDatabase db = this.getWritableDatabase();

        boolean createSuccessful = db.insert("tournaments", null, values) > 0;
        db.close();

        return createSuccessful;
    }

    public List<TournamentLocal> read() {

        List<TournamentLocal> recordsList = new ArrayList<>();

        String sql = "SELECT * FROM tournaments ORDER BY idTour DESC";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {

                int idTour = Integer.parseInt(cursor.getString(cursor.getColumnIndex("idTour")));
                String tournamentName = cursor.getString(cursor.getColumnIndex("name"));
                String tournamentType = cursor.getString(cursor.getColumnIndex("typ"));

                TournamentLocal tournamentLocal = new TournamentLocal();
                tournamentLocal.setId(idTour);
                tournamentLocal.setNazwa(tournamentName);
                tournamentLocal.setTyp(tournamentType);

                recordsList.add(tournamentLocal);

            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();

        return recordsList;
    }

    public boolean delete(int id) {
        boolean deleteSuccessful;

        SQLiteDatabase db = this.getWritableDatabase();
        deleteSuccessful = db.delete("tournaments", "idTour ='" + id + "'", null) > 0;
        db.close();

        return deleteSuccessful;

    }
}

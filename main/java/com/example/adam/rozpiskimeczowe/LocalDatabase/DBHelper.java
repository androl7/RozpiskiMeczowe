package com.example.adam.rozpiskimeczowe.LocalDatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    private static  final String DB_NAME = "Tournaments";
    private static  final int DB_VERSION = 1;

    public DBHelper(@Nullable Context context) {
        super(context,DB_NAME,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlTour = "CREATE TABLE tournaments"+
                "( idTour INTEGER PRIMARY KEY AUTOINCREMENT, "+
                "name TEXT, " +
                "typ TEXT) ";
        db.execSQL(sqlTour);

        String sqlTeams = "CREATE TABLE teams"+
                "( idTeam INTEGER PRIMARY KEY AUTOINCREMENT, "+
                "name TEXT, " +
                "idTour INTEGER,"+
                "FOREIGN KEY(idTour) REFERENCES tournaments(idTour) ON DELETE CASCADE)";
        db.execSQL(sqlTeams);

        String sqlMatches = "CREATE TABLE matches"+
                "( idM INTEGER PRIMARY KEY AUTOINCREMENT, "+
                " NrM INTEGER , "+
                "res1_1 INTEGER, " +
                "res1_2 INTEGER, " +
                "res1_3 INTEGER, " +
                "res2_1 INTEGER, " +
                "res2_2 INTEGER, " +
                "res2_3 INTEGER, " +
                "idTour INTEGER,"+
                "FOREIGN KEY(idTour) REFERENCES tournaments(idTour)ON DELETE CASCADE)";
        db.execSQL(sqlMatches);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String sql = "DROP TABLE IF EXISTS students";
        db.execSQL(sql);

        onCreate(db);
    }
}

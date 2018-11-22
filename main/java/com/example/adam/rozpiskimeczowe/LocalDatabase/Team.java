package com.example.adam.rozpiskimeczowe.LocalDatabase;

public class Team {
    private int id;
    private String nazwa;
    private int idTour;

    public Team(String nazwa, int idTour){
        this.nazwa=nazwa;
        this.idTour = idTour;
        this.id = 2;
    }

    public Team(){

    }

    public String getNazwa() {
        return nazwa;
    }
    public int getId() {
        return id;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTour() {
        return idTour;
    }

    public void setIdTour(int idTour) {
        this.idTour = idTour;
    }
}


package com.example.adam.rozpiskimeczowe.LocalDatabase;



public class TournamentLocal {
    private int id;
    private String nazwa;
    private String typ;
    private String pktInSet;

    TournamentLocal(String nazwa, String typ){
        this.nazwa = nazwa;
        this.typ = typ;
    }

    public TournamentLocal(){

    }

    public int getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getTyp() {
        return typ;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void setPktInSet(String pktInSet) {
        this.pktInSet = pktInSet;
    }

    public String getPktInSet() {
        return pktInSet;
    }
}

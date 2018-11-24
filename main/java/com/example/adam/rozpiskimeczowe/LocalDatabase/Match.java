package com.example.adam.rozpiskimeczowe.LocalDatabase;

public class Match {
    private int idM;
    private String nrM;
    private String winner;
    private String losser;
    private String res1_1;
    private String res1_2;
    private String res1_3;
    private String res2_1;
    private String res2_2;
    private String res2_3;
    private int idTour;

    public Match(String nrM,String winner,String losser, String res1_1, String res1_2, String res1_3, String res2_1, String res2_2, String res2_3,int idTour) {
        this.nrM = nrM;
        this.winner = winner;
        this.losser = losser;
        this.res1_1 = res1_1;
        this.res1_2 = res1_2;
        this.res1_3 = res1_3;
        this.res2_1 = res2_1;
        this.res2_2 = res2_2;
        this.res2_3 = res2_3;
        this.idTour = idTour;
    }

    Match(){

    }

    public String getNrM() {
        return nrM;
    }

    public String getRes1_1() {
        return res1_1;
    }

    public String getRes1_2() {
        return res1_2;
    }

    public String getRes1_3() {
        return res1_3;
    }

    public String getRes2_1() {
        return res2_1;
    }

    public String getRes2_2() {
        return res2_2;
    }

    public String getRes2_3() {
        return res2_3;
    }

    public void setNrM(String nrM) {
        this.nrM = nrM;
    }

    public void setRes1_1(String res1_1) {
        this.res1_1 = res1_1;
    }

    public void setRes1_2(String res1_2) {
        this.res1_2 = res1_2;
    }

    public void setRes1_3(String res1_3) {
        this.res1_3 = res1_3;
    }

    public void setRes2_1(String res2_1) {
        this.res2_1 = res2_1;
    }

    public void setRes2_2(String res2_2) {
        this.res2_2 = res2_2;
    }

    public void setRes2_3(String res2_3) {
        this.res2_3 = res2_3;
    }

    public int getIdTour() {
        return idTour;
    }

    public void setIdTour(int idTour) {
        this.idTour = idTour;
    }

    public int getIdM() {
        return idM;
    }

    public void setIdM(int idM) {
        this.idM = idM;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getWinner() {
        return winner;
    }

    public String getLosser() {
        return losser;
    }

    public void setLosser(String losser) {
        this.losser = losser;
    }
}

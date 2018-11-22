package com.example.adam.rozpiskimeczowe.LocalDatabase;

public class Match {
    private int idM;
    private int nrM;
    private int res1_1;
    private int res1_2;
    private int res1_3;
    private int res2_1;
    private int res2_2;
    private int res2_3;
    private int idTour;

    public Match(int nrM, int res1_1, int res1_2, int res1_3, int res2_1, int res2_2, int res2_3,int idTour) {
        this.nrM = nrM;
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

    public int getNrM() {
        return nrM;
    }

    public int getRes1_1() {
        return res1_1;
    }

    public int getRes1_2() {
        return res1_2;
    }

    public int getRes1_3() {
        return res1_3;
    }

    public int getRes2_1() {
        return res2_1;
    }

    public int getRes2_2() {
        return res2_2;
    }

    public int getRes2_3() {
        return res2_3;
    }

    public void setNrM(int nrM) {
        this.nrM = nrM;
    }

    public void setRes1_1(int res1_1) {
        this.res1_1 = res1_1;
    }

    public void setRes1_2(int res1_2) {
        this.res1_2 = res1_2;
    }

    public void setRes1_3(int res1_3) {
        this.res1_3 = res1_3;
    }

    public void setRes2_1(int res2_1) {
        this.res2_1 = res2_1;
    }

    public void setRes2_2(int res2_2) {
        this.res2_2 = res2_2;
    }

    public void setRes2_3(int res2_3) {
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
}

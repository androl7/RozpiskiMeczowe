package com.example.adam.rozpiskimeczowe;

import java.util.ArrayList;
import java.util.HashMap;

public class Tournament{
    String name;
    String type;
    private ArrayList<String> teams;
    private HashMap<String,ArrayList<String>> eliminationResults;
    private HashMap<String,ArrayList<String>> mainResults;
    private String password;

    public Tournament(String name, String type, ArrayList<String> teams, HashMap<String, ArrayList<String>> eliminationResults,HashMap<String, ArrayList<String>> mainResults) {
        this.name = name;
        this.type = type;
        this.teams = teams;
        this.eliminationResults = eliminationResults;
        this.mainResults = mainResults;
    }
    public Tournament(){
        this.name = "";
        this.type = "";
        this.teams = new ArrayList<>();
        this.eliminationResults = new HashMap<>();
        this.mainResults = new HashMap<>();

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public ArrayList<String> getTeams() {
        return teams;
    }


    public HashMap<String, ArrayList<String>> getEliminationResults() {
        return eliminationResults;
    }

    public HashMap<String, ArrayList<String>> getMainResults() {
        return mainResults;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTeams(ArrayList<String> teams) {
        this.teams = teams;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

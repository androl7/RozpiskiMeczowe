package com.example.adam.rozpiskimeczowe;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adam.rozpiskimeczowe.LocalDatabase.Match;
import com.example.adam.rozpiskimeczowe.LocalDatabase.TableControllerMatches;
import com.example.adam.rozpiskimeczowe.LocalDatabase.TableControllerTournament;
import com.example.adam.rozpiskimeczowe.LocalDatabase.TournamentLocal;
import com.otaliastudios.zoom.ZoomLayout;

import java.util.List;

public class SetDetailedResultFor2Sets implements ISetDetailedResultFor2Sets {
    private Context context;
    private ViewGroup vg;
    private InputMethodManager imm;
    private String pktInSet;
    private String pktInTieBreak;
   // private ZoomLayout zoomLayout;
    private Database database;
    private String typeOfTour;
    private String nameOfTour;
    private String local;


    SetDetailedResultFor2Sets(String nameOfTour,String typeOfTour,Context context, ViewGroup vg, InputMethodManager imm, String pktInSet, String pktInTieBreak) {
        this.nameOfTour=nameOfTour;
        this.context = context;
        this.vg = vg;
        this.imm = imm;
        this.pktInSet = pktInSet;
        this.pktInTieBreak = pktInTieBreak;
        database = new Database();
        this.typeOfTour = typeOfTour;

    }

    SetDetailedResultFor2Sets(String nameOfTour,String typeOfTour,Context context, ViewGroup vg, InputMethodManager imm, String pktInSet, String pktInTieBreak,ZoomLayout zoomLayout,String local) {
        this.nameOfTour = nameOfTour;
        this.context = context;
        this.vg = vg;
        this.imm = imm;
        this.pktInSet = pktInSet;
        this.pktInTieBreak = pktInTieBreak;
     //   this.zoomLayout = zoomLayout;
        database = new Database();
        this.typeOfTour = typeOfTour;
        this.local = local;
    }



    // Method to add points of Sets
    @Override
    public void set(final Button winner,final Button losser, final EditText team1Set1, final EditText team1Set2, final EditText team1Set3, final EditText team2Set1, final EditText team2Set2, final EditText team2Set3) {
        //OGARNĄĆ TUTAJ PRZESUNIECIE
        /*int [] coor = new int[2];
        team1Set1.getLocationInWindow(coor);
        int a = - 1290 - coor[0];
        int b = - 2033 - coor[1];


        zoomLayout.moveTo(3,a,b,true);*/

        //onbackpressed

        team1Set1.setFocusableInTouchMode(true);
        team2Set1.setFocusableInTouchMode(true);

        disableEnableControls(false, vg);
        team1Set2.setFocusableInTouchMode(false);
        team1Set3.setFocusableInTouchMode(false);
        team2Set2.setFocusableInTouchMode(false);
        team2Set3.setFocusableInTouchMode(false);

        team1Set1.setVisibility(View.VISIBLE);
        team2Set1.setVisibility(View.VISIBLE);
        team1Set2.setVisibility(View.VISIBLE);
        team2Set2.setVisibility(View.VISIBLE);
        team1Set3.setVisibility(View.VISIBLE);
        team2Set3.setVisibility(View.VISIBLE);
        team1Set1.requestFocus();
        imm.showSoftInput(team1Set1, InputMethodManager.SHOW_IMPLICIT);

        team1Set1.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                team1Set1.setFocusableInTouchMode(true);
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                team1Set1.setFocusableInTouchMode(false);

                /*if (team1Set1.getText().toString().length() == 2) {

                    team2Set1.requestFocus();
                    if (Integer.parseInt(team1Set1.getText().toString()) >= Integer.parseInt(pktInSet)) {
                        team1Set2.setFocusableInTouchMode(true);
                    }
                }*/
            }

            public void afterTextChanged(Editable s) {
            }
        });

        team2Set1.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                team2Set1.setFocusableInTouchMode(false);

                /*if (team2Set1.getText().toString().length() == 2) {
                    team1Set2.setFocusableInTouchMode(true);
                    if (checkPointsInSet(team1Set1, team2Set1, pktInSet)) {
                        team1Set2.requestFocus();
                        imm.showSoftInput(team1Set2, InputMethodManager.SHOW_IMPLICIT);
                    } else {
                        Toast.makeText(context, "Wynik jest niepoprawny", Toast.LENGTH_SHORT).show();
                        team1Set1.setText(null);
                        team2Set1.setText(null);
                        team1Set1.setFocusableInTouchMode(true);
                        team2Set1.setFocusableInTouchMode(true);
                        team1Set1.requestFocus();

                    }
                }*/
            }

            public void afterTextChanged(Editable s) {

            }
        });

        //AFTER CLICK ACTION NEXT CHECK EVERYTHINK
        team2Set1.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {

                    if (checkPointsInSet(team1Set1, team2Set1, pktInSet)) {
                        team1Set2.setFocusableInTouchMode(true);
                        team1Set2.requestFocus();
                        imm.showSoftInput(team1Set2, InputMethodManager.SHOW_IMPLICIT);
                    } else {
                        Toast.makeText(context, "Wynik jest niepoprawny", Toast.LENGTH_SHORT).show();
                        team1Set1.setText(null);
                        team2Set1.setText(null);
                        team1Set1.setFocusableInTouchMode(true);
                        team2Set1.setFocusableInTouchMode(true);
                        team1Set1.requestFocus();

                    }
                }
                return false;
            }
        });


        team1Set2.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                team2Set2.setFocusableInTouchMode(true);
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                team1Set2.setFocusableInTouchMode(false);

                /*if (team1Set2.getText().toString().length() == 2) {

                    team2Set2.requestFocus();
                    if (Integer.parseInt(team1Set2.getText().toString()) >= Integer.parseInt(pktInSet)) {
                        team1Set3.setFocusableInTouchMode(true);
                    }

                }*/
            }

            public void afterTextChanged(Editable s) {
            }
        });

        team2Set2.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                team2Set2.setFocusableInTouchMode(false);

                /*if (team2Set2.getText().toString().length() == 2) {

                    team1Set3.setFocusableInTouchMode(true);
                    if (checkPointsInSet(team1Set2, team2Set2, pktInSet)) {
                        if (checkTieBreak(team1Set1, team1Set2, team2Set1, team2Set2)) {
                            team1Set3.requestFocus();
                        } else {

                            disableEnableControls(true, vg);
                            Runnable delayedTask = new Runnable() {
                                @Override
                                public void run() {
                                    imm.hideSoftInputFromWindow(team2Set2.getWindowToken(), 0);
                                    team1Set1.setVisibility(View.INVISIBLE);
                                    team2Set1.setVisibility(View.INVISIBLE);
                                    team1Set2.setVisibility(View.INVISIBLE);
                                    team2Set2.setVisibility(View.INVISIBLE);
                                    team1Set3.setVisibility(View.INVISIBLE);
                                    team2Set3.setVisibility(View.INVISIBLE);
                                }
                            };
                            view.postDelayed(delayedTask, 500);

                        }
                    } else {
                        Toast.makeText(context, "Wynik jest niepoprawny", Toast.LENGTH_SHORT).show();
                        team1Set2.setText(null);
                        team2Set2.setText(null);

                        team1Set2.setFocusableInTouchMode(true);
                        team2Set2.setFocusableInTouchMode(true);
                        team1Set2.requestFocus();

                    }

                }*/
            }


            public void afterTextChanged(Editable s) {

            }
        });


        //AFTER CLICK ACTION NEXT CHECK EVERYTHINK
        team2Set2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    if (checkPointsInSet(team1Set2, team2Set2, pktInSet)) {
                        if (checkTieBreak(team1Set1, team1Set2, team2Set1, team2Set2)) {
                            team1Set3.setFocusableInTouchMode(true);
                            team1Set3.requestFocus();
                            imm.showSoftInput(team1Set3, InputMethodManager.SHOW_IMPLICIT);
                        } else {
                            if (checkSets(team1Set1, team1Set2, team1Set3, team2Set1, team2Set2, team2Set3)) {

                                disableEnableControls(true, vg);
                                if(local!=null) {
                                    List<TournamentLocal> tournamets = new TableControllerTournament(context).read();
                                    int id = 0;
                                    for (TournamentLocal tour : tournamets) {
                                        if (tour.getNazwa().equals(nameOfTour)) {
                                            id = tour.getId();
                                            break;
                                        }
                                    }
                                    new TableControllerMatches(context).create(new Match(team1Set1.getTag().toString(), winner.getText().toString(),losser.getText().toString(), team1Set1.getText().toString(), team1Set2.getText().toString(), team1Set3.getText().toString(), team2Set1.getText().toString(), team2Set2.getText().toString(), team2Set3.getText().toString(), id));
                                }else {
                                    database.addResultToDatabase(nameOfTour, typeOfTour, winner,losser, team1Set1, team1Set2, team1Set3, team2Set1, team2Set2, team2Set3);
                                }
                                imm.hideSoftInputFromWindow(team2Set2.getWindowToken(), 0);
                                team1Set1.setVisibility(View.INVISIBLE);
                                team2Set1.setVisibility(View.INVISIBLE);
                                team1Set2.setVisibility(View.INVISIBLE);
                                team2Set2.setVisibility(View.INVISIBLE);
                                team1Set3.setVisibility(View.INVISIBLE);
                                team2Set3.setVisibility(View.INVISIBLE);

                                //Reset all
                                team1Set1.setOnEditorActionListener(null);
                                team2Set1.setOnEditorActionListener(null);
                                team1Set2.setOnEditorActionListener(null);
                                team2Set2.setOnEditorActionListener(null);
                                team1Set3.setOnEditorActionListener(null);
                                team2Set3.setOnEditorActionListener(null);



                            } else {
                                Toast.makeText(context, "Wynik jest niepoprawny", Toast.LENGTH_SHORT).show();
                                team1Set1.setText(null);
                                team2Set1.setText(null);
                                team1Set2.setText(null);
                                team2Set2.setText(null);

                                team1Set1.setFocusableInTouchMode(true);
                                team2Set1.setFocusableInTouchMode(true);
                                team1Set1.requestFocus();
                            }


                        }
                    } else {
                        Toast.makeText(context, "Wynik jest niepoprawny", Toast.LENGTH_SHORT).show();
                        team1Set2.setText(null);
                        team2Set2.setText(null);

                        team1Set2.setFocusableInTouchMode(true);
                        team2Set2.setFocusableInTouchMode(true);
                        team1Set2.requestFocus();

                    }
                }
                return false;
            }
        });

        team1Set3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                team2Set3.setFocusableInTouchMode(true);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                team1Set3.setFocusableInTouchMode(false);

                /*if (team1Set3.getText().toString().length() == 2) {

                    team2Set3.requestFocus();

                }*/
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        team2Set3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                team2Set3.setFocusableInTouchMode(false);
                /*if (team2Set3.getText().toString().length() == 2) {
                    if (checkPointsInSet(team1Set3, team2Set3, pktInTieBreak)) {
                        disableEnableControls(true, vg);
                        Runnable delayedTask = new Runnable() {
                            @Override
                            public void run() {
                                imm.hideSoftInputFromWindow(team2Set3.getWindowToken(), 0);
                                team1Set1.setVisibility(View.INVISIBLE);
                                team2Set1.setVisibility(View.INVISIBLE);
                                team1Set2.setVisibility(View.INVISIBLE);
                                team2Set2.setVisibility(View.INVISIBLE);
                                team1Set3.setVisibility(View.INVISIBLE);
                                team2Set3.setVisibility(View.INVISIBLE);
                            }
                        };
                        view.postDelayed(delayedTask, 500);

                    } else {
                        Toast.makeText(context, "Wynik jest niepoprawny", Toast.LENGTH_SHORT).show();
                        team1Set3.setText(null);
                        team2Set3.setText(null);

                        team1Set3.setFocusableInTouchMode(true);
                        team2Set3.setFocusableInTouchMode(true);
                        team1Set3.requestFocus();

                    }

                }*/
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        team2Set3.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    if (checkPointsInSet(team1Set3, team2Set3, pktInTieBreak)) {
                        if (checkSets(team1Set1, team1Set2, team1Set3, team2Set1, team2Set2, team2Set3)) {
                            disableEnableControls(true, vg);
                            //OFFLINE
                            if(local!=null) {
                                List<TournamentLocal> tournamets = new TableControllerTournament(context).read();
                                int id = 0;
                                for (TournamentLocal tour : tournamets) {
                                    if (tour.getNazwa().equals(nameOfTour)) {
                                        id = tour.getId();
                                        break;
                                    }
                                }
                                new TableControllerMatches(context).create(new Match(team1Set1.getTag().toString(), winner.getText().toString(),losser.getText().toString(), team1Set1.getText().toString(), team1Set2.getText().toString(), team1Set3.getText().toString(), team2Set1.getText().toString(), team2Set2.getText().toString(), team2Set3.getText().toString(), id));
                            }else {
                                //ONLINE
                                database.addResultToDatabase(nameOfTour,typeOfTour,winner,losser,team1Set1, team1Set2, team1Set3, team2Set1, team2Set2, team2Set3);
                            }
                            imm.hideSoftInputFromWindow(team2Set3.getWindowToken(), 0);
                            team1Set1.setVisibility(View.INVISIBLE);
                            team2Set1.setVisibility(View.INVISIBLE);
                            team1Set2.setVisibility(View.INVISIBLE);
                            team2Set2.setVisibility(View.INVISIBLE);
                            team1Set3.setVisibility(View.INVISIBLE);
                            team2Set3.setVisibility(View.INVISIBLE);

                            //Reset all
                            team1Set1.setOnEditorActionListener(null);
                            team2Set1.setOnEditorActionListener(null);
                            team1Set2.setOnEditorActionListener(null);
                            team2Set2.setOnEditorActionListener(null);
                            team1Set3.setOnEditorActionListener(null);
                            team2Set3.setOnEditorActionListener(null);
                        } else {
                            Toast.makeText(context, "Wynik jest niepoprawny", Toast.LENGTH_SHORT).show();
                            team1Set3.setText(null);
                            team1Set2.setText(null);
                            team1Set1.setText(null);
                            team2Set3.setText(null);
                            team2Set2.setText(null);
                            team2Set1.setText(null);


                            team1Set1.setFocusableInTouchMode(true);
                            team2Set1.setFocusableInTouchMode(true);
                            team1Set1.requestFocus();
                        }


                    } else {
                        Toast.makeText(context, "Wynik jest niepoprawny", Toast.LENGTH_SHORT).show();
                        team1Set3.setText(null);
                        team2Set3.setText(null);

                        team1Set3.setFocusableInTouchMode(true);
                        team2Set3.setFocusableInTouchMode(true);
                        team1Set3.requestFocus();

                    }
                }
                return false;
            }
        });

    }


    private void disableEnableControls(boolean enable, ViewGroup vg) {
        for (int i = 0; i < vg.getChildCount(); i++) {
            View child = vg.getChildAt(i);
            if (child instanceof Button) {
                child.setEnabled(enable);

            } else if (child instanceof ViewGroup) {
                disableEnableControls(enable, (ViewGroup) child);
            }
        }
    }


    private boolean checkPointsInSet(EditText team1, EditText team2, String pktInSet) {
        String Res1 = team1.getText().toString();
        String Res2 = team2.getText().toString();
        return !Res1.equals("") && !Res2.equals("") && ((Math.abs(Integer.parseInt(Res1) - Integer.parseInt(Res2)) > 2 && (Integer.parseInt(pktInSet) == Integer.parseInt(Res1) && Integer.parseInt(Res2) < Integer.parseInt(pktInSet)) || (Integer.parseInt(pktInSet) == Integer.parseInt(Res2) && Integer.parseInt(Res1) < Integer.parseInt(pktInSet))) || (Math.abs(Integer.parseInt(Res1) - Integer.parseInt(Res2)) == 2 && ((Integer.parseInt(Res1) >= Integer.parseInt(pktInSet)) || Integer.parseInt(Res2) >= Integer.parseInt(pktInSet))));
    }

    private boolean checkTieBreak(EditText team1Set1, EditText team1Set2, EditText team2Set1, EditText team2Set2) {
        return (Integer.parseInt(team1Set1.getText().toString()) > Integer.parseInt(team2Set1.getText().toString()) && Integer.parseInt(team1Set2.getText().toString()) < Integer.parseInt(team2Set2.getText().toString())) || (Integer.parseInt(team1Set1.getText().toString()) < Integer.parseInt(team2Set1.getText().toString()) && Integer.parseInt(team1Set2.getText().toString()) > Integer.parseInt(team2Set2.getText().toString()));
    }

    private boolean checkSets(EditText winner_1, EditText winner_2, EditText winner_3, EditText losser_1, EditText losser_2, EditText losser_3) {
        String strTeam1_1 = winner_1.getText().toString();
        String strTeam1_2 = winner_2.getText().toString();
        String strTeam1_3 = winner_3.getText().toString();
        String strTeam2_1 = losser_1.getText().toString();
        String strTeam2_2 = losser_2.getText().toString();
        String strTeam2_3 = losser_3.getText().toString();

        int setFor1 = 0;
        int setFor2 = 0;

        if (Integer.parseInt(strTeam1_1) > Integer.parseInt(strTeam2_1)) {
            setFor1++;
        }
        if (Integer.parseInt(strTeam1_1) < Integer.parseInt(strTeam2_1)) {
            setFor2++;
        }
        if (Integer.parseInt(strTeam1_2) > Integer.parseInt(strTeam2_2)) {
            setFor1++;
        }
        if (Integer.parseInt(strTeam1_2) < Integer.parseInt(strTeam2_2)) {
            setFor2++;
        }
        if (!strTeam1_3.equals("") && !strTeam2_3.equals("")) {
            if (Integer.parseInt(strTeam1_3) > Integer.parseInt(strTeam2_3)) {
                setFor1++;
            }
            if (Integer.parseInt(strTeam1_3) < Integer.parseInt(strTeam2_3)) {
                setFor2++;
            }
        }

        return setFor1 > setFor2;
    }


    public void setForGroup(final EditText team1Set1, final EditText team1Set2, final EditText team1Set3, final EditText team2Set1, final EditText team2Set2, final EditText team2Set3, final TextView setsFor1, final TextView setsFor1_2, final TextView setsFor2, final TextView setsFor2_2) {


        setsFor1.setVisibility(View.INVISIBLE);
        setsFor2.setVisibility(View.INVISIBLE);
        team1Set1.setFocusableInTouchMode(true);
        team2Set1.setFocusableInTouchMode(true);

        disableEnableControls(false, vg);
        team1Set2.setFocusableInTouchMode(false);
        team1Set3.setFocusableInTouchMode(false);
        team2Set2.setFocusableInTouchMode(false);
        team2Set3.setFocusableInTouchMode(false);

        team1Set1.setVisibility(View.VISIBLE);
        team2Set1.setVisibility(View.VISIBLE);
        team1Set2.setVisibility(View.VISIBLE);
        team2Set2.setVisibility(View.VISIBLE);
        team1Set3.setVisibility(View.VISIBLE);
        team2Set3.setVisibility(View.VISIBLE);
        team1Set1.requestFocus();
        imm.showSoftInput(team1Set1, InputMethodManager.SHOW_IMPLICIT);

        team1Set1.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                team1Set1.setFocusableInTouchMode(true);
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                team1Set1.setFocusableInTouchMode(false);

                /*if (team1Set1.getText().toString().length() == 2) {

                    team2Set1.requestFocus();
                    if (Integer.parseInt(team1Set1.getText().toString()) >= Integer.parseInt(pktInSet)) {
                        team1Set2.setFocusableInTouchMode(true);
                    }
                }*/
            }

            public void afterTextChanged(Editable s) {
            }
        });

        team2Set1.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                team2Set1.setFocusableInTouchMode(false);

                /*if (team2Set1.getText().toString().length() == 2) {
                    team1Set2.setFocusableInTouchMode(true);
                    if (checkPointsInSet(team1Set1, team2Set1, pktInSet)) {
                        team1Set2.requestFocus();
                        imm.showSoftInput(team1Set2, InputMethodManager.SHOW_IMPLICIT);
                    } else {
                        Toast.makeText(context, "Wynik jest niepoprawny", Toast.LENGTH_SHORT).show();
                        team1Set1.setText(null);
                        team2Set1.setText(null);
                        team1Set1.setFocusableInTouchMode(true);
                        team2Set1.setFocusableInTouchMode(true);
                        team1Set1.requestFocus();

                    }
                }*/
            }

            public void afterTextChanged(Editable s) {

            }
        });

        //AFTER CLICK ACTION NEXT CHECK EVERYTHINK
        team2Set1.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {

                    if (checkPointsInSet(team1Set1, team2Set1, pktInSet)) {
                        team1Set2.setFocusableInTouchMode(true);
                        team1Set2.requestFocus();
                        imm.showSoftInput(team1Set2, InputMethodManager.SHOW_IMPLICIT);
                    } else {
                        Toast.makeText(context, "Wynik jest niepoprawny", Toast.LENGTH_SHORT).show();
                        team1Set1.setText(null);
                        team2Set1.setText(null);
                        team1Set1.setFocusableInTouchMode(true);
                        team2Set1.setFocusableInTouchMode(true);
                        team1Set1.requestFocus();

                    }
                }
                return false;
            }
        });


        team1Set2.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                team2Set2.setFocusableInTouchMode(true);
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                team1Set2.setFocusableInTouchMode(false);

                /*if (team1Set2.getText().toString().length() == 2) {

                    team2Set2.requestFocus();
                    if (Integer.parseInt(team1Set2.getText().toString()) >= Integer.parseInt(pktInSet)) {
                        team1Set3.setFocusableInTouchMode(true);
                    }

                }*/
            }

            public void afterTextChanged(Editable s) {
            }
        });

        team2Set2.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                team2Set2.setFocusableInTouchMode(false);

                /*if (team2Set2.getText().toString().length() == 2) {

                    team1Set3.setFocusableInTouchMode(true);
                    if (checkPointsInSet(team1Set2, team2Set2, pktInSet)) {
                        if (checkTieBreak(team1Set1, team1Set2, team2Set1, team2Set2)) {
                            team1Set3.requestFocus();
                        } else {

                            disableEnableControls(true, vg);
                            Runnable delayedTask = new Runnable() {
                                @Override
                                public void run() {
                                    imm.hideSoftInputFromWindow(team2Set2.getWindowToken(), 0);
                                    team1Set1.setVisibility(View.INVISIBLE);
                                    team2Set1.setVisibility(View.INVISIBLE);
                                    team1Set2.setVisibility(View.INVISIBLE);
                                    team2Set2.setVisibility(View.INVISIBLE);
                                    team1Set3.setVisibility(View.INVISIBLE);
                                    team2Set3.setVisibility(View.INVISIBLE);
                                }
                            };
                            view.postDelayed(delayedTask, 500);

                        }
                    } else {
                        Toast.makeText(context, "Wynik jest niepoprawny", Toast.LENGTH_SHORT).show();
                        team1Set2.setText(null);
                        team2Set2.setText(null);

                        team1Set2.setFocusableInTouchMode(true);
                        team2Set2.setFocusableInTouchMode(true);
                        team1Set2.requestFocus();

                    }

                }*/
            }


            public void afterTextChanged(Editable s) {

            }
        });


        //AFTER CLICK ACTION NEXT CHECK EVERYTHINK
        team2Set2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    if (checkPointsInSet(team1Set2, team2Set2, pktInSet)) {
                        if (checkTieBreak(team1Set1, team1Set2, team2Set1, team2Set2)) {
                            team1Set3.setFocusableInTouchMode(true);
                            team1Set3.requestFocus();
                            imm.showSoftInput(team1Set3, InputMethodManager.SHOW_IMPLICIT);
                        } else {

                            disableEnableControls(true, vg);

                            imm.hideSoftInputFromWindow(team2Set2.getWindowToken(), 0);
                            team1Set1.setVisibility(View.INVISIBLE);
                            team2Set1.setVisibility(View.INVISIBLE);
                            team1Set2.setVisibility(View.INVISIBLE);
                            team2Set2.setVisibility(View.INVISIBLE);
                            team1Set3.setVisibility(View.INVISIBLE);
                            team2Set3.setVisibility(View.INVISIBLE);

                            String strTeam1_1 = team1Set1.getText().toString();
                            String strTeam1_2 = team1Set2.getText().toString();
                            String strTeam2_1 = team2Set1.getText().toString();
                            String strTeam2_2 = team2Set2.getText().toString();

                            int setFor1 = 0;
                            int setFor2 = 0;

                            if (Integer.parseInt(strTeam1_1) > Integer.parseInt(strTeam2_1)) {
                                setFor1++;
                            }
                            if (Integer.parseInt(strTeam1_1) < Integer.parseInt(strTeam2_1)) {
                                setFor2++;
                            }
                            if (Integer.parseInt(strTeam1_2) > Integer.parseInt(strTeam2_2)) {
                                setFor1++;
                            }
                            if (Integer.parseInt(strTeam1_2) < Integer.parseInt(strTeam2_2)) {
                                setFor2++;
                            }


                            setsFor1.setText(String.valueOf(setFor1));
                            setsFor1_2.setText(String.valueOf(setFor1));

                            setsFor2.setText(String.valueOf(setFor2));
                            setsFor2_2.setText(String.valueOf(setFor2));


                            setsFor1.setVisibility(View.VISIBLE);
                            setsFor2.setVisibility(View.VISIBLE);

                            List<TournamentLocal> tournamets = new TableControllerTournament(context).read();
                            int id = 0;
                            for (TournamentLocal tour : tournamets) {
                                if (tour.getNazwa().equals(nameOfTour)) {
                                    id = tour.getId();
                                    break;
                                }
                            }
                            new TableControllerMatches(context).create(new Match(setsFor1.getTag().toString(), String.valueOf(setFor1),String.valueOf(setFor2), team1Set1.getText().toString(), team1Set2.getText().toString(), team1Set3.getText().toString(), team2Set1.getText().toString(), team2Set2.getText().toString(), team2Set3.getText().toString(), id));
                            //Reset all
                            team1Set1.setOnEditorActionListener(null);
                            team2Set1.setOnEditorActionListener(null);
                            team1Set2.setOnEditorActionListener(null);
                            team2Set2.setOnEditorActionListener(null);
                            team1Set3.setOnEditorActionListener(null);
                            team2Set3.setOnEditorActionListener(null);


                        }
                    } else {
                        Toast.makeText(context, "Wynik jest niepoprawny", Toast.LENGTH_SHORT).show();
                        team1Set2.setText(null);
                        team2Set2.setText(null);

                        team1Set2.setFocusableInTouchMode(true);
                        team2Set2.setFocusableInTouchMode(true);
                        team1Set2.requestFocus();

                    }
                }
                return false;
            }
        });

        team1Set3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                team2Set3.setFocusableInTouchMode(true);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                team1Set3.setFocusableInTouchMode(false);

                /*if (team1Set3.getText().toString().length() == 2) {

                    team2Set3.requestFocus();

                }*/
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        team2Set3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                team2Set3.setFocusableInTouchMode(false);
                /*if (team2Set3.getText().toString().length() == 2) {
                    if (checkPointsInSet(team1Set3, team2Set3, pktInTieBreak)) {
                        disableEnableControls(true, vg);
                        Runnable delayedTask = new Runnable() {
                            @Override
                            public void run() {
                                imm.hideSoftInputFromWindow(team2Set3.getWindowToken(), 0);
                                team1Set1.setVisibility(View.INVISIBLE);
                                team2Set1.setVisibility(View.INVISIBLE);
                                team1Set2.setVisibility(View.INVISIBLE);
                                team2Set2.setVisibility(View.INVISIBLE);
                                team1Set3.setVisibility(View.INVISIBLE);
                                team2Set3.setVisibility(View.INVISIBLE);
                            }
                        };
                        view.postDelayed(delayedTask, 500);

                    } else {
                        Toast.makeText(context, "Wynik jest niepoprawny", Toast.LENGTH_SHORT).show();
                        team1Set3.setText(null);
                        team2Set3.setText(null);

                        team1Set3.setFocusableInTouchMode(true);
                        team2Set3.setFocusableInTouchMode(true);
                        team1Set3.requestFocus();

                    }

                }*/
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        team2Set3.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    if (checkPointsInSet(team1Set3, team2Set3, pktInTieBreak)) {

                        disableEnableControls(true, vg);

                        imm.hideSoftInputFromWindow(team2Set2.getWindowToken(), 0);
                        team1Set1.setVisibility(View.INVISIBLE);
                        team2Set1.setVisibility(View.INVISIBLE);
                        team1Set2.setVisibility(View.INVISIBLE);
                        team2Set2.setVisibility(View.INVISIBLE);
                        team1Set3.setVisibility(View.INVISIBLE);
                        team2Set3.setVisibility(View.INVISIBLE);

                        String strTeam1_1 = team1Set1.getText().toString();
                        String strTeam1_2 = team1Set2.getText().toString();
                        String strTeam1_3 = team1Set3.getText().toString();
                        String strTeam2_1 = team2Set1.getText().toString();
                        String strTeam2_2 = team2Set2.getText().toString();
                        String strTeam2_3 = team2Set3.getText().toString();

                        int setFor1 = 0;
                        int setFor2 = 0;

                        if (Integer.parseInt(strTeam1_1) > Integer.parseInt(strTeam2_1)) {
                            setFor1++;
                        }
                        if (Integer.parseInt(strTeam1_1) < Integer.parseInt(strTeam2_1)) {
                            setFor2++;
                        }
                        if (Integer.parseInt(strTeam1_2) > Integer.parseInt(strTeam2_2)) {
                            setFor1++;
                        }
                        if (Integer.parseInt(strTeam1_2) < Integer.parseInt(strTeam2_2)) {
                            setFor2++;
                        }

                        if (Integer.parseInt(strTeam1_3) > Integer.parseInt(strTeam2_3)) {
                            setFor1++;
                        }
                        if (Integer.parseInt(strTeam1_3) < Integer.parseInt(strTeam2_3)) {
                            setFor2++;
                        }


                        setsFor1.setText(String.valueOf(setFor1));
                        setsFor1_2.setText(String.valueOf(setFor1));

                        setsFor2.setText(String.valueOf(setFor2));
                        setsFor2_2.setText(String.valueOf(setFor2));


                        setsFor1.setVisibility(View.VISIBLE);
                        setsFor2.setVisibility(View.VISIBLE);

                        List<TournamentLocal> tournamets = new TableControllerTournament(context).read();
                        int id = 0;
                        for (TournamentLocal tour : tournamets) {
                            if (tour.getNazwa().equals(nameOfTour)) {
                                id = tour.getId();
                                break;
                            }
                        }
                        new TableControllerMatches(context).create(new Match(setsFor1.getTag().toString(), String.valueOf(setFor1),String.valueOf(setFor2), team1Set1.getText().toString(), team1Set2.getText().toString(), team1Set3.getText().toString(), team2Set1.getText().toString(), team2Set2.getText().toString(), team2Set3.getText().toString(), id));

                        //Reset all
                        team1Set1.setOnEditorActionListener(null);
                        team2Set1.setOnEditorActionListener(null);
                        team1Set2.setOnEditorActionListener(null);
                        team2Set2.setOnEditorActionListener(null);
                        team1Set3.setOnEditorActionListener(null);
                        team2Set3.setOnEditorActionListener(null);


                    } else {
                        Toast.makeText(context, "Wynik jest niepoprawny", Toast.LENGTH_SHORT).show();
                        team1Set3.setText(null);
                        team2Set3.setText(null);

                        team1Set3.setFocusableInTouchMode(true);
                        team2Set3.setFocusableInTouchMode(true);
                        team1Set3.requestFocus();

                    }
                }
                return false;
            }
        });


    }
}

package com.example.adam.rozpiskimeczowe.cup.cup64;


import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.adam.rozpiskimeczowe.R;
import com.example.adam.rozpiskimeczowe.cup.PagerAdapter;


public class CUPactiv64 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cup64);


        NonSwipeableViewPagerCup64 mViewPager = findViewById(R.id.containerCup64);
        setupViewPager(mViewPager);

        TabLayout tabLayout = findViewById(R.id.tabs64);
        tabLayout.setupWithViewPager(mViewPager);
        getSupportActionBar().setTitle("System pucharowy: Eliminacje");

        setTheme(R.style.AppTheme);
        tabLayout.setTabTextColors(ColorStateList.valueOf(Color.WHITE));

    }

    private void setupViewPager(ViewPager viewPager){
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentTabCup64_1(),"ROZPISKA");
        adapter.addFragment(new FragmentTabCup64_2(),"WYNIKI");
        adapter.addFragment(new FragmentTabCup64_3(),"MIEJSCA");
        viewPager.setAdapter(adapter);
    }
}
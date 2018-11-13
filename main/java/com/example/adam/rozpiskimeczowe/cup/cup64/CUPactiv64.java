package com.example.adam.rozpiskimeczowe.cup.cup64;


import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.adam.rozpiskimeczowe.R;
import com.example.adam.rozpiskimeczowe.brazylian.brazylian16.BRAZactiv16;
import com.example.adam.rozpiskimeczowe.cup.PagerAdapter;


public class CUPactiv64 extends AppCompatActivity {
    NonSwipeableViewPagerCup64 mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cup64);


        mViewPager = findViewById(R.id.containerCup64);
        setupViewPager(mViewPager);

        TabLayout tabLayout = findViewById(R.id.tabs64);
        tabLayout.setupWithViewPager(mViewPager);
        //getSupportActionBar().setTitle("System pucharowy: Eliminacje");

        setTheme(R.style.AppTheme);
        tabLayout.setTabTextColors(ColorStateList.valueOf(Color.WHITE));


    }

    private void setupViewPager(ViewPager viewPager){
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentTabCup64_1(),"ROZPISKA");
        adapter.addFragment(new FragmentTabCup64_2(),"WYNIKI");
        adapter.addFragment(new FragmentTabCup64_3(),"MIEJSCA");
        viewPager.setOffscreenPageLimit(2);
        viewPager.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        if (mViewPager.getCurrentItem() == 0) {
            super.onBackPressed();
        }
        else {
            mViewPager.setCurrentItem(mViewPager.getCurrentItem() - 1);
        }
    }

}
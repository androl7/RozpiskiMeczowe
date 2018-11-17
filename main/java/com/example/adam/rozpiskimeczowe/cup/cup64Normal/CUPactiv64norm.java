package com.example.adam.rozpiskimeczowe.cup.cup64Normal;


import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.adam.rozpiskimeczowe.R;
import com.example.adam.rozpiskimeczowe.cup.PagerAdapter;


public class CUPactiv64norm extends AppCompatActivity {
    NonSwipeableViewPagerCup64norm mViewPager;


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
        adapter.addFragment(new FragmentTabCup64_1norm(),"ROZPISKA");
        adapter.addFragment(new FragmentTabCup64_2norm(),"WYNIKI");
        adapter.addFragment(new FragmentTabCup64_3norm(),"MIEJSCA");
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
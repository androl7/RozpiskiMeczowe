package com.example.adam.rozpiskimeczowe.brazylian.brazylian8;


import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.adam.rozpiskimeczowe.brazylian.PagerAdapter;
import com.example.adam.rozpiskimeczowe.R;


public class BRAZactiv8 extends AppCompatActivity {
    NonSwipeableViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brazactiv8);


        mViewPager = findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        getSupportActionBar().setTitle("Brazylijski: 8");
        tabLayout.setTabTextColors(ColorStateList.valueOf(Color.WHITE));

    }

    private void setupViewPager(ViewPager viewPager){
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentTabBraz8_1(),"ROZPISKA");
        adapter.addFragment(new FragmentTabBraz8_2(),"WYNIKI");
        adapter.addFragment(new FragmentTabBraz8_3(),"MIEJSCA");
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
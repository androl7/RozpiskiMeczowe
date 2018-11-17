package com.example.adam.rozpiskimeczowe.cup.cup32;


import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.adam.rozpiskimeczowe.R;
import com.example.adam.rozpiskimeczowe.cup.PagerAdapter;


public class CUPactiv32 extends AppCompatActivity {
    NonSwipeableViewPagerCup32 mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cup32);


        mViewPager = findViewById(R.id.containerCup32);
        setupViewPager(mViewPager);

        TabLayout tabLayout = findViewById(R.id.tabs32);
        tabLayout.setupWithViewPager(mViewPager);
        getSupportActionBar().setTitle("Puchar 32: Eliminacje");

        setTheme(R.style.AppTheme);
        tabLayout.setTabTextColors(ColorStateList.valueOf(Color.WHITE));

    }

    private void setupViewPager(ViewPager viewPager){
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentTabCup32_1(),"ROZPISKA");
        adapter.addFragment(new FragmentTabCup32_2(),"WYNIKI");
        adapter.addFragment(new FragmentTabCup32_3(),"MIEJSCA");
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
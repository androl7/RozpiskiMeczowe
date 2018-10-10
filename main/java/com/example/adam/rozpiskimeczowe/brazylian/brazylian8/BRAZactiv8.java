package com.example.adam.rozpiskimeczowe.brazylian.brazylian8;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.adam.rozpiskimeczowe.brazylian.PagerAdapter;
import com.example.adam.rozpiskimeczowe.R;


public class BRAZactiv8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brazactiv8);


        NonSwipeableViewPager mViewPager = findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        getSupportActionBar().setTitle("System brazylijski dla 8 zespołów");

    }

    private void setupViewPager(ViewPager viewPager){
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentTabBraz8_1(),"ROZPISKA");
        adapter.addFragment(new FragmentTabBraz8_2(),"WYNIKI");
        adapter.addFragment(new FragmentTabBraz8_3(),"MIEJSCA");
        viewPager.setAdapter(adapter);
    }
}
package com.example.tab_demo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Main2Activity extends AppCompatActivity implements OnFragmentInteractionListener {
    ViewPager viewPager;
    TabLayout tabLayout;    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();
        viewPager=findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tabs);
        SectionsPage sectionsPagerAdapter= new SectionsPage(getSupportFragmentManager(),1,this);
        viewPager.setAdapter(sectionsPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setOffscreenPageLimit(3);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}

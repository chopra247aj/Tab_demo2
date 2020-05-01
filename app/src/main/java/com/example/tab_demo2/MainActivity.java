package com.example.tab_demo2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener {
    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         getSupportActionBar().setIcon(R.drawable.ajayphoto);
        viewPager=findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tabs);
        SectionsPagerAdapter sectionsPagerAdapter=new SectionsPagerAdapter(this,getSupportFragmentManager(),1);
        viewPager.setAdapter(sectionsPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setOffscreenPageLimit(3);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch(id){
            case R.id.pac_eats:
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);

                break;
            case R.id.recycle:
                Intent i2=new Intent(MainActivity.this,Owners.class);
                startActivity(i2);
                break;
            case R.id.item3:
                Toast.makeText(this, "View Activity", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}

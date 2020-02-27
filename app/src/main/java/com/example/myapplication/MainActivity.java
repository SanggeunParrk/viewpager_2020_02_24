package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager pager;
    private Fragment fragment1,fragment2,fragment3,fragment1_instance,fragment3_instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);
        pager.setOnPageChangeListener(new CircularViewPagerHandler(pager));
        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragment1_instance = new Fragment1();
        fragment3_instance = new Fragment3();


        myPagerAdapter.addItem(fragment3_instance);
        myPagerAdapter.addItem(fragment1);
        myPagerAdapter.addItem(fragment2);
        myPagerAdapter.addItem(fragment3);
        myPagerAdapter.addItem(fragment1_instance);

        pager.setAdapter(myPagerAdapter);
        pager.setCurrentItem(1);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(3);
            }
        });

    }
}


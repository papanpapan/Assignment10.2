package com.example.amit.assignment102;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button B1,B2,B3,B4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1=(Button)findViewById(R.id.layout1);
        B2=(Button)findViewById(R.id.layout2);
        B3=(Button)findViewById(R.id.layout3);
        B4=(Button)findViewById(R.id.layout4);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                FirstFragment firstFragment=new FirstFragment();
                ft.add(R.id.frag,firstFragment);
                ft.addToBackStack("FirstFragment");
                ft.commit();
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                SecondFragment secondFragment=new SecondFragment();
                ft.replace(R.id.frag,secondFragment);
                ft.addToBackStack("SecondFragment");
                ft.commit();
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
               ThireFragment thireFragment=new ThireFragment();
                ft.replace(R.id.frag,thireFragment);
                ft.addToBackStack("ThirdFragment");
                ft.commit();
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
               ForthFragment forthFragment=new ForthFragment();
                ft.replace(R.id.frag,forthFragment);
                ft.addToBackStack("ForthFragment");
                ft.commit();
            }
        });
    }

    }


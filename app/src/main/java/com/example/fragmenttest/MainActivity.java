package com.example.fragmenttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragment();
    }

    private void initFragment() {

//        BlankFragment blankFragment  =new BlankFragment();
//        FragmentManager fm = getSupportFragmentManager();
//        fm.beginTransaction().add(R.id.conteiner,blankFragment).commit();
       getSupportFragmentManager().beginTransaction().add(R.id.conteiner,new BlankFragment()).commit();

    }
}

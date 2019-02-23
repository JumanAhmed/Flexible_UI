package com.example.juman.flexibleui;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AnotherActivity extends AppCompatActivity {

    FragmentB f2;
    FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Intent intent = getIntent();
        int index = intent.getIntExtra("index", 0);

         manager = getFragmentManager();
         f2= (FragmentB) manager.findFragmentById(R.id.fragment2);

          if (f2 != null){
              f2.changeData(index);
          }





    }
}

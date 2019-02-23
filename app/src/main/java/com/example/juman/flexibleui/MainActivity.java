package com.example.juman.flexibleui;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Communicator{

    FragmentA f1;
    FragmentB f2;
    FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getFragmentManager();
        f1 = (FragmentA) manager.findFragmentById(R.id.fragment);
        f2 = (FragmentB) manager.findFragmentById(R.id.fragment2);
    }

    
    @Override
    public void respond(int index) {
        if (f2 != null && f2.isVisible()){
            f2.changeData(index);

        }else{
            Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
            intent.putExtra("index", index);
            startActivity(intent);
        }
    }
}

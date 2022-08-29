package com.example.activity4;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.transition.Fade;
import androidx.transition.Slide;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    FragmentTransaction transaction;
    Fragment erenInfo, mikasaInfo, leviInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        erenInfo = new ErenInfo();
    }

    public void onClick(View view) {
        transaction=getSupportFragmentManager().beginTransaction();
        switch (view.getId()){
            case R.id.button: transaction.replace(R.id.fragment_container, erenInfo);
                findViewById(R.id.dimmer).setVisibility(1);
                transaction.setCustomAnimations(R.animator.slide_in, R.animator.slide_out);
                transaction.addToBackStack(null); break;
        }
        transaction.commit();
    }
}
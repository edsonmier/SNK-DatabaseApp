package com.example.activity4;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.transition.Fade;
import androidx.transition.Slide;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class MainActivity extends AppCompatActivity {
    BottomSheetDialogFragment erenInfo, mikasaInfo, leviInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        erenInfo = new ErenInfo();
        mikasaInfo = new MikasaInfo();
        leviInfo = new LeviInfo();
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                erenInfo.show(getSupportFragmentManager(), "TAG"); break;
            case R.id.butto2:
                mikasaInfo.show(getSupportFragmentManager(), "TAG"); break;
            case R.id.button3:
                leviInfo.show(getSupportFragmentManager(), "TAG"); break;
        }
    }
}
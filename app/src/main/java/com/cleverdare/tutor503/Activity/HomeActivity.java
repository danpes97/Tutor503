package com.cleverdare.tutor503.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.cleverdare.tutor503.Fragments.CompartirTransmisionFragment;
import com.cleverdare.tutor503.Fragments.VideosFragment;
import com.cleverdare.tutor503.R;

public class HomeActivity extends AppCompatActivity {


    VideosFragment videosFragment;
    CompartirTransmisionFragment transmisionFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        videosFragment = new VideosFragment();
        transmisionFragment = new CompartirTransmisionFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragments, videosFragment).commit();

    }

    public void onClick(View view) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        switch (view.getId()) {

            case R.id.btnHome:
                fragmentTransaction.replace(R.id.contenedorFragments, videosFragment);
                break;

            //case R.id.btnAsignaturas:
              //  fragmentTransaction.replace(R.id.contenedorFragments, videosFragment);
                //break;

            //case R.id.btnFavoritos:
              //  fragmentTransaction.replace(R.id.contenedorFragments, videosFragment);
                //break;

            case R.id.btnTransmision:
                fragmentTransaction.replace(R.id.contenedorFragments, transmisionFragment);
                break;
        }

        fragmentTransaction.commit();
    }
}
package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button firstFragment, secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstFragment = findViewById(R.id.btnPrimeiroFragmento);
        secondFragment = findViewById(R.id.btnSegundoFragmento);

        firstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment newFragment = new ExemploFragmento();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.flFragment, newFragment);
                transaction.addToBackStack(null);

                transaction.commit();
            }
        });

        secondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment newFragment = new SegundoFragmento();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.flFragment, newFragment);
                transaction.addToBackStack(null);

                transaction.commit();
            }
        });


    }
}
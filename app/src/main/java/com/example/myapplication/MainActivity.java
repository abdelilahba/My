package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inserer(View view) {


    }

    public void acces(View view) {

        Intent i = null;


        switch (view.getId())
        {


            case R.id.b1:   i= new Intent(getApplicationContext(),Liste_des_produit.class);break;
            case R.id.b2:   i = new Intent(getApplicationContext(),Fiche_produit.class);break;
            case R.id.b3:   i = new Intent(getApplicationContext(),Neveaux_produit.class);break;
            case R.id.b4:  i = new Intent(getApplicationContext(),Editer_produit.class);break;
            default:

        }

        startActivity(i);
    }
}
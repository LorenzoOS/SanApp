package com.example.sanapp.sanapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class main extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuprincipal);


        Toolbar mytoolbar = findViewById(R.id.idToolbar);
        setSupportActionBar(mytoolbar);
        mytoolbar.setTitleTextColor(Color.GREEN);
        mytoolbar.setBackgroundColor(Color.WHITE);
        mytoolbar.setNavigationIcon(R.drawable.point);


        mytoolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Info.class);
                startActivityForResult(intent, 0);
            }
        });



        Button btnMapas = (Button) findViewById(R.id.btnMapas);
        btnMapas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent (v.getContext(), Mapa.class);
                    startActivityForResult(intent, 0);
                }
            });



        Button btnRestaurantes = (Button) findViewById(R.id.btnRestaurantes);
        btnRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Restaurante.class);
                startActivityForResult(intent, 0);
            }
        });



        Button btnAlojamiento = (Button) findViewById(R.id.btnAlojamiento);
        btnAlojamiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), alojamiento.class);
                startActivityForResult(intent, 0);
            }
        });


        Button btnAyuda = (Button) findViewById(R.id.btnServicios);
        btnAyuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Ayuda.class);
                startActivityForResult(intent, 0);
            }
        });

        Button btnArte = (Button) findViewById(R.id.btnArte);
        btnArte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Arte.class);
                startActivityForResult(intent, 0);
            }
        });

        Button btnRutas = (Button) findViewById(R.id.btnRutas);
        btnRutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Rutas.class);
                startActivityForResult(intent, 0);
            }
        });


    }





}









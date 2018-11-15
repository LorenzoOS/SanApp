package com.example.sanapp.sanapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mapa extends Activity {

    Button btnSitios,btnUbicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        btnSitios = (Button) findViewById(R.id.btnSitios);
        btnUbicacion= (Button) findViewById(R.id.btnUbicacion);

        btnSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),GPS.class);
                startActivity(intent);
            }
        });
    }



}

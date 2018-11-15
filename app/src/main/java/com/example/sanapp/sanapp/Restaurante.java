package com.example.sanapp.sanapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Restaurante extends Activity {

    private String[] nombre = { "A Granxa", "Muiño do Pepe", "Mesón Cazadores", "Restaurante A serra",
            "Mesón o Ferrador", "Casa Carballo", "Restaurante Delfino", "Casa Pena", "Parrillada Riboira", "Meson Carballo" };
    private String[] Descripcion = { "A Granxa Restaurante", "Muiño Meson", "Cazadores Meson",
            "A serra Restaurante", "O Ferrador Mesón", "Carballo Casa de comidas", "Defino Restaurante", "Pena Casa de comidas",
            "Riboira Parrillada", "Carballo Mesón" };
    private TextView tv1;
    private ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        tv1=(TextView)findViewById(R.id.idAlojamiento);
        lv1 =(ListView)findViewById(R.id.idList);
        ArrayAdapter <String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, nombre);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                tv1.setText("Pequeña Descripción sobre restaurante "+ lv1.getItemAtPosition(i) + " es "+ Descripcion[i]);
            }
        });

}}
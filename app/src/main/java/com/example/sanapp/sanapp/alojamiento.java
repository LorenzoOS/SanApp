package com.example.sanapp.sanapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class alojamiento extends Activity {

    private String[] nombre = { "Hotel Marcial", "Hotel Kesington", "Casa Rural Aguamiel", "Casa Carballo",
            "Pensión residencia Maragoto", "Casa Veiga", "Hotel Pazo Libunca", "Hotel Valdoviño Express", "Hotel A Roda", "Casa Amando" };
private String[] zona = { "Narón", "Narón", "Bardaos","Liñares", "Neda", "Narón", "Narón", "Valdoviño", "Valdoviño", "Somozas" };
    private TextView tv1;
    private ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alojamiento);

        tv1=(TextView)findViewById(R.id.idAlojamiento);
        lv1 =(ListView)findViewById(R.id.idList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, nombre);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                tv1.setText("Localización del siguiente alojamiento  de : "+ lv1.getItemAtPosition(i) + " es "+ zona[i]);
            }
        });

    }}
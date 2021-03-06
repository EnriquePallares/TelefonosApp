package com.example.android.telefonosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Reportes extends AppCompatActivity {

    private ListView lv;
    private String [] opc;
    private Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);

        lv = findViewById(R.id.lstReportes);
        opc = getResources().getStringArray(R.array.opReportes);

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, opc);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        in = new Intent(Reportes.this, ReporteUno.class);
                        startActivity(in);
                        break;
                    case 1:
                        in = new Intent(Reportes.this, ReporteCuatro.class);
                        startActivity(in);
                        break;
                    case 2:
                        in = new Intent(Reportes.this, ReporteCinco.class);
                        startActivity(in);
                        break;
                }
            }
        });
    }
}

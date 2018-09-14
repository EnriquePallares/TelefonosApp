package com.example.android.telefonosapp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class ReporteCuatro extends AppCompatActivity {

    private ArrayList<Celular> celulares;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte_cuatro);

        dialog = new AlertDialog.Builder(this);
        dialog.setTitle(getResources().getString(R.string.reporteCuatro));

        celulares = Datos.obtener();
        int cantidad = 0;

        for (int i = 0; i < celulares.size() ; i++) {
            if (celulares.get(i).getMarca().equalsIgnoreCase("Apple")
                    && celulares.get(i).getColor().equalsIgnoreCase("Negro")){
                cantidad++;
            }
        }
        dialog.setMessage(getResources().getString(R.string.mensajeReporte4)+": "+cantidad).show();
    }
}

package com.example.android.telefonosapp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class ReporteCinco extends AppCompatActivity {

    private ArrayList<Celular> celulares;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte_cinco);

        dialog = new AlertDialog.Builder(this);
        dialog.setTitle(getResources().getString(R.string.reporteCinco));

        celulares = Datos.obtener();
        int cantidad = 0;
        int sumatoria = 0;
        

        for (int i = 0; i < celulares.size(); i++) {
            if (celulares.get(i).getMarca().equalsIgnoreCase("Nokia")) {
                cantidad++;
                sumatoria += celulares.get(i).getPrecio();
            }
        }
        if (cantidad > 0) {
            dialog.setMessage(getResources().getString(R.string.mensajeReporte5) + ": " + (sumatoria / cantidad)).show();
        } else {
            dialog.setMessage(getResources().getString(R.string.errDatosVacios)).show();
        }
    }
}

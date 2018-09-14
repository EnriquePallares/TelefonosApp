package com.example.android.telefonosapp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ReporteUno extends AppCompatActivity {

    private TableLayout tblReporteUno;
    private ArrayList<Celular> celulares;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte_uno);

        dialog = new AlertDialog.Builder(this);
        dialog.setTitle(getResources().getString(R.string.reporteUno));

        tblReporteUno = findViewById(R.id.tblReporteUno);
        celulares = Datos.obtener();

        if (celulares.size() > 0) {
            for (int i = 0; i < celulares.size(); i++) {
                TableRow fila = new TableRow(this);
                TextView c1 = new TextView(this);
                TextView c2 = new TextView(this);
                TextView c3 = new TextView(this);

                if (celulares.get(i).getMarca().equalsIgnoreCase("Samsung")
                        && celulares.get(i).getColor().equalsIgnoreCase("Negro")
                        && celulares.get(i).getSistOperativo().equalsIgnoreCase("Android")) {

                    c1.setText(String.valueOf(i + 1));
                    c2.setText("" + celulares.get(i).getCapacidad());
                    c3.setText("" + celulares.get(i).getPrecio());

                    fila.addView(c1);
                    fila.addView(c2);
                    fila.addView(c3);

                    tblReporteUno.addView(fila);
                }
            }
        } else {
            dialog.setMessage(getResources().getString(R.string.errDatosVacios)).show();
        }
    }
}

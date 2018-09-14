package com.example.android.telefonosapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class Registrar extends AppCompatActivity {

    private Spinner cmbMarca, cmbColor, cmbCapacidad, cmbSistOp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        cmbMarca = findViewById(R.id.cmbMarca);
        cmbColor = findViewById(R.id.cmbColor);
        cmbCapacidad = findViewById(R.id.cmbCapacidad);
        cmbSistOp = findViewById(R.id.cmbSistOP);
    }

    public void registrar(View v){
        String marca, color, sistOp;
        int capacidad;

        if (validar()){
            marca = cmbMarca.getSelectedItem().toString();
            color = cmbMarca.getSelectedItem().toString();
            sistOp = cmbMarca.getSelectedItem().toString();
            capacidad = Integer.parseInt(cmbCapacidad.getSelectedItem().toString());

            Celular c = new Celular(marca, color, capacidad, sistOp);
            c.guardar();

            Toast.makeText(this, getResources().getString(R.string.mensaje), Toast.LENGTH_SHORT).show();
            borrar();
        }
    }

    public void limpiar(View v){
        borrar();
    }

    public boolean validar(){
        int marca = cmbMarca.getSelectedItemPosition();
        int color = cmbColor.getSelectedItemPosition();
        int capacidad = cmbCapacidad.getSelectedItemPosition();
        int sistOp = cmbSistOp.getSelectedItemPosition();

        if (marca == 0){
            Toast.makeText(this, getResources().getString(R.string.errMarca), Toast.LENGTH_SHORT).show();
            return false;
        }
        if (color == 0){
            Toast.makeText(this, getResources().getString(R.string.errColor), Toast.LENGTH_SHORT).show();
            return false;
        }
        if (capacidad == 0){
            Toast.makeText(this, getResources().getString(R.string.errCapacidad), Toast.LENGTH_SHORT).show();
            return false;
        }
        if (sistOp == 0){
            Toast.makeText(this, getResources().getString(R.string.errSistOp), Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    public void borrar(){
        cmbMarca.setSelection(0);
        cmbColor.setSelection(0);
        cmbCapacidad.setSelection(0);
        cmbSistOp.setSelection(0);
    }

}

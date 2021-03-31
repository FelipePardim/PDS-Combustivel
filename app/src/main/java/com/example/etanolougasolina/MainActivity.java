package com.example.etanolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularEficienciaCombusivel (View view) {
        EditText precoEtanol = findViewById(R.id.precoEtanol);
        EditText precoGasolina = findViewById(R.id.precoGasolina);
        TextView combustivelIndicado = findViewById(R.id.combustivelIndicado);

        String stringPrecoEtanol = precoEtanol.getText().toString();
        String stringPrecoGasolina = precoGasolina.getText().toString();

        float numeroPrecoEtanol = Float.parseFloat(stringPrecoEtanol);
        float numeroPrecoGasolina = Float.parseFloat(stringPrecoGasolina);

        if ( (numeroPrecoGasolina * 0.7) > (numeroPrecoEtanol) ) {
            combustivelIndicado.setText("Etanol");
        } else {
            combustivelIndicado.setText("Gasolina");
        }
    }
}

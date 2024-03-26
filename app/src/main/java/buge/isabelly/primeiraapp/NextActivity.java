package buge.isabelly.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent i = getIntent();
        String textoDigitado = i.getStringExtra("texto");
        TextView tvTexto = findViewById(R.id.tvTexto);//obter o elemento de interface textview
        tvTexto.setText(textoDigitado);//colocar dentro da textview o textoDigitado
    }
}
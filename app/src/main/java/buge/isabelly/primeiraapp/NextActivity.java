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
        Intent i = getIntent();//obtem o intent que veio da MainActivity
        String textoDigitado = i.getStringExtra("texto");//pega o texto que esta dentro do intent
        TextView tvTexto = findViewById(R.id.tvTexto);//obtem o elemento de interface textview pelo seu id
        tvTexto.setText(textoDigitado);//colocar dentro da textview o textoDigitado
    }
}
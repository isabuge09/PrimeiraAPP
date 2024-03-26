package buge.isabelly.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnEnviar = findViewById(R.id.btnEnviar);//encontra o botão btnEnviar pelo id
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);//obtem o elemento de interface etDigiteAqui pelo id
                String textoDigitado = etDigiteAqui.getText().toString();//pega o texto do etDigiteAqui e converte para string
                Intent i = new Intent(MainActivity.this,NextActivity.class);//cria uma intenção, em que sinaliza a navegação de uma tela à outra
                i.putExtra("texto",textoDigitado);//passa o texto dentro do intent
                startActivity(i);//executa a activity

            }
        });
    }
}


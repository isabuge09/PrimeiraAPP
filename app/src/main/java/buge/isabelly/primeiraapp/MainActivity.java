package buge.isabelly.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {//a classe mainActivity e a activity principal da aplicacao

    @Override
    protected void onCreate(Bundle savedInstanceState) {//onCreate e o metodo chamado toda vez que a tela esta sendo criada
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//constroi/cria os elementos de interface que foram definidos no arquivo xml
        Button btnEnviar = findViewById(R.id.btnEnviar);//obtem o botao btnEnviar atraves do id
        btnEnviar.setOnClickListener(new View.OnClickListener() {//define o que vai acontecer quando o botao e clicado

            @Override
            public void onClick(View v) {//executado quando o botao for clicado
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);//obtem o elemento de interface etDigiteAqui/campo de texto
                String textoDigitado = etDigiteAqui.getText().toString();//pega o texto do etDigiteAqui e converte para string
                Intent i = new Intent(MainActivity.this,NextActivity.class);//cria uma intenção, em que sinaliza a navegação de uma tela para outra
                i.putExtra("texto",textoDigitado);//passa o textoDigitado para dentro do intent
                startActivity(i);//inicia a activity e passa como parametro a intent i

            }
        });
    }
}


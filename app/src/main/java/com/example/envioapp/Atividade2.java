package com.example.envioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Atividade2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade2);

        Intent it = getIntent();
        Bundle dados = it.getExtras();

        boolean isnulo = dados == null;
        if(!isnulo){
            String nome = dados.getString("meunome");
            String fone = dados.getString("meufone");

            String mensagem = "Nome: "+nome + "\n";
            mensagem += "Telefone: "+fone;

            Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();
        }
    }
}

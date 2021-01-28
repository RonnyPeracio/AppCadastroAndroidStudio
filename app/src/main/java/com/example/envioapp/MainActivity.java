package com.example.envioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void Enviar (View elemento){
        EditText camponome = findViewById(R.id.edtNome);
        EditText campofone = findViewById(R.id.edtFone);

        String nome = camponome.getText().toString();
        String fone = campofone.getText().toString();

        Bundle dados = new Bundle();
        dados.putString("meunome",nome);
        dados.putString("meufone",fone);

        Intent it = new Intent(MainActivity.this, Atividade2.class);
        it.putExtras(dados);
        startActivity(it);

    }
}

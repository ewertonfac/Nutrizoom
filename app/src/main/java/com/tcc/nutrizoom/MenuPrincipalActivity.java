package com.tcc.nutrizoom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

public class MenuPrincipalActivity extends AppCompatActivity {

    private Button btPerfil,btPesquisa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        btPerfil = findViewById(R.id.btPerfil);
        btPesquisa = findViewById(R.id.btPesquisa);
        btPerfil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrarTelaPerfil();
            }
        });
        btPesquisa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrarTelaPesquisa();
            }
        });
    }
        private void mostrarTelaPerfil(){
            Intent intent = new Intent(MenuPrincipalActivity.this, PerfilActivity.class);
            startActivity(intent);
            finish();
        }
        private void mostrarTelaPesquisa(){
            Intent intent = new Intent(MenuPrincipalActivity.this, PesquisaActivity.class);
            startActivity(intent);
            finish();
        }
}
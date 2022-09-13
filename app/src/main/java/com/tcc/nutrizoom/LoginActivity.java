package com.tcc.nutrizoom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {

    private List<String> nome,senha;
    private Button btConfirmar;
    private EditText tpnUsuario,tpSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        nome = new ArrayList<String>();
        senha = new ArrayList<String>();
        nome.add("Ewerton");
        senha.add("1234");
        btConfirmar = (Button)findViewById(R.id.btConfirmar);
        tpnUsuario = (EditText)findViewById(R.id.tpnUsuario);
        tpSenha = (EditText)findViewById(R.id.tpSenha);
        btConfirmar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(tpnUsuario.getText().toString().equals(nome.get(0)) && tpSenha.getText().toString().equals(senha.get(0))) {
                    mostrarTelaConf();
                }
                else{
                    String toastMessage = "Usuário ou senha incorretos ";
                    Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    /*
    public void confirmarLogin(View view){
            btConfirmar.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(tpnUsuario.getText().toString() == nome.get(0)) {
                        mostrarTelaConf();
                    }
                    else{
                        String toastMessage = "Username or Password are not populated";
                        Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
                    }
                }
            });
    }*/
    private void mostrarTelaConf() {
        Intent intent = new Intent(LoginActivity.this, MenuPrincipalActivity.class);
        startActivity(intent);
        finish();
    }
}
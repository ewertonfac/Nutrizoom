package com.tcc.nutrizoom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PerfilActivity extends AppCompatActivity {

    private EditText txeNome,txeIdade,txePeso,txeAltura, txeImc;
    private Button btImc;
    //private int UsIdade, UsPeso,UsAltura;
    //private double UsImc;
    private String UsIdade, UsPeso,UsAltura,UsImc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        txeNome = (EditText)findViewById(R.id.txeNome);
        txeIdade = (EditText)findViewById(R.id.txeIdade);
        txeAltura = (EditText)findViewById(R.id.txeAltura);
        txePeso = (EditText)findViewById(R.id.txePeso);
        txeImc = (EditText)findViewById(R.id.txeImc);
        btImc = (Button)findViewById(R.id.btImc);

        /*txePeso.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                if(!txeAltura.getText().equals(null)){
                    int peso = Integer.parseInt(txePeso.getText().toString());
                    int altura = Integer.parseInt(txeAltura.getText().toString());
                    double imc = calculaImc(peso,altura);
                    txeImc.setText(String.valueOf(imc));
                }
            }
        });

        txeAltura.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                //if(!txePeso.getText().equals(null)){
                    int peso = Integer.parseInt(txePeso.getText().toString());
                    int altura = Integer.parseInt(txeAltura.getText().toString());
                    double imc = 0;
                    if(peso>0 && altura>0){
                        imc = calculaImc(peso,altura);
                        txeImc.setText(String.valueOf(imc));
                }
                //}
            }
        });

*/
        btImc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int peso = Integer.parseInt(txePeso.getText().toString());
                double altura = Double.parseDouble(txeAltura.getText().toString());
                double imc = 0;
                //if (peso > 0 && altura > 0) {
                    imc = calculaImc(peso, altura);
                    txeImc.setText(String.valueOf(imc));
                //}
            }
        });
    }
    public double calculaImc(int peso,double altura){
        return peso/(altura*altura);
    }
}

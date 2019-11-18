package com.example.smartyour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;

public class SituacaoActivity extends AppCompatActivity {

    private RadioButton quebrado;
    private RadioButton trincado;
    private RadioButton queimado;
    private RadioButton outros;
    private Button sairSi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situacao);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

            quebrado =  (RadioButton)  findViewById(R.id.radioQuebradoId);
            trincado =  (RadioButton)  findViewById(R.id.radioTrincadoId);
            queimado =  (RadioButton)  findViewById(R.id.radioQueimadoId);
            outros   =  (RadioButton)  findViewById(R.id.radioOutrosId);
            sairSi   =  (Button)  findViewById(R.id.btnSairSituaçãoId);

            sairSi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(SituacaoActivity.this,LoginActivity.class);
                    startActivity(intent);
                }
            });

        quebrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SituacaoActivity.this,MarcaActivity.class);
                startActivity(intent);
            }
        });

        trincado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SituacaoActivity.this,MarcaActivity.class);
                startActivity(intent);
            }
        });

        queimado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SituacaoActivity.this,MarcaActivity.class);
                startActivity(intent);
            }
        });

        outros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SituacaoActivity.this,MarcaActivity.class);
                startActivity(intent);
            }
        });




    }
}

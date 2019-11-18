package com.example.smartyour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class SolicitacaoActivity extends AppCompatActivity {

    private TextView text;
    private RadioButton solicitar;
    private RadioButton cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitacao);




        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        text = (TextView) findViewById (R.id.editTextId);
        solicitar = (RadioButton) findViewById(R.id.radioSolicitar);
        cancelar = (RadioButton) findViewById(R.id.radioCancelar);


        // Recebendo valor em atividade usando intent.
        String TempHolder = getIntent (). getStringExtra ("ListViewClickedValue");

        // Configurando o valor recebido no EditText.
        text.setText (TempHolder);

        solicitar . setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SolicitacaoActivity.this, DadosActivity.class);
                startActivity(intent);
            }
        });

        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SolicitacaoActivity.this, SituacaoActivity.class);
                startActivity(intent);
            }
        });
    }
}

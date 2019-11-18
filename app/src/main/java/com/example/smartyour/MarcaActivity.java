package com.example.smartyour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.RadioButton;

public class MarcaActivity extends AppCompatActivity {

    private RadioButton motorola;
    private RadioButton samsung;
    private RadioButton asus;
    private RadioButton lg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marca);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        motorola = (RadioButton)findViewById(R.id.radioMotorolaId);
        samsung = (RadioButton)findViewById(R.id.radioSamsungId);
        asus = (RadioButton)findViewById(R.id.radioAsusId);
        lg = (RadioButton)findViewById(R.id.radioLgId);


        motorola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MarcaActivity.this,MotorolaActivity.class);
                startActivity(intent);


            }
        });

        samsung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MarcaActivity.this,SamsungActivity.class);
                startActivity(intent);


            }
        });

        asus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MarcaActivity.this,AsusActivity.class);
                startActivity(intent);


            }
        });

        lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MarcaActivity.this,LgActivity.class);
                startActivity(intent);


            }
        });


    }
}

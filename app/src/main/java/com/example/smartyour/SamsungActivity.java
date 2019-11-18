package com.example.smartyour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SamsungActivity extends AppCompatActivity {

    private ListView ListaItens;

    private String[] Itens = {
            "Galaxy note 10 plus", "Galaxy note 10 ",  "Galaxy note 9",  "Galaxy S10 plus", "Galaxy S10 ",
            "Galaxy S10e ", "Galaxy S9 PLUS", "Galaxy A80", "Galaxy A50", "Galaxy A30",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samsung);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ListaItens = (ListView)findViewById(R.id.ListaSamsungId);


        final String[] valeus = new String[] {   "Galaxy note 10 plus", "Galaxy note 10 ",  "Galaxy note 9",  "Galaxy S10 plus", "Galaxy S10 ",
                "Galaxy S10e ", "Galaxy S9 PLUS", "Galaxy A80", "Galaxy A50", "Galaxy A30",} ;


        final String[] valeus1 = new String[] {  "R$ 200,00", "R$ 400,00", "R$ 300,00", "R$ 250,00", "R$ 220,00",
                "R$ 100,00","R$ 350,00", "R$ 310,00","R$ 200,00", "R$ 450,00", };


        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2, android.R.id.text1, valeus);

        ListaItens.setAdapter(adapter);



        ListaItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){

                    Intent myintent = new Intent(view.getContext(),SolicitacaoActivity.class);
                    startActivityForResult(myintent,0);




                }

                if (position==1){

                    Intent myintent = new Intent(view.getContext(),SolicitacaoActivity.class);
                    startActivityForResult(myintent,1);


                }

                if (position==2){

                    Intent myintent = new Intent(view.getContext(),SolicitacaoActivity.class);
                    startActivityForResult(myintent,2);


                }

                if (position==3){

                    Intent myintent = new Intent(view.getContext(),SolicitacaoActivity.class);
                    startActivityForResult(myintent,3);


                }

                if (position==4){

                    Intent myintent = new Intent(view.getContext(),SolicitacaoActivity.class);
                    startActivityForResult(myintent,4);


                }

                if (position==5){

                    Intent myintent = new Intent(view.getContext(),SolicitacaoActivity.class);
                    startActivityForResult(myintent,5);


                }

                if (position==6){

                    Intent myintent = new Intent(view.getContext(),SolicitacaoActivity.class);
                    startActivityForResult(myintent,6);


                }

                if (position==7){

                    Intent myintent = new Intent(view.getContext(),SolicitacaoActivity.class);
                    startActivityForResult(myintent,7);


                }

                if (position==8){

                    Intent myintent = new Intent(view.getContext(),SolicitacaoActivity.class);
                    startActivityForResult(myintent,8);


                }

                if (position==9){

                    Intent myintent = new Intent(view.getContext(),SolicitacaoActivity.class);
                    startActivityForResult(myintent,9);


                }


                String TempListViewClickedValue = valeus1  [position] .toString ();
                Intent intent = new Intent (SamsungActivity.this, SolicitacaoActivity.class);

                // Enviando valor para outra atividade usando intent.
                intent.putExtra ("ListViewClickedValue",TempListViewClickedValue );

                startActivity (intent);
            }


        });
    }
}

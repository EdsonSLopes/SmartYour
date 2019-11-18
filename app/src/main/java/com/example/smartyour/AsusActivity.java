package com.example.smartyour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AsusActivity extends AppCompatActivity {

    private ListView ListaItens;

    private String[] Itens = {
            "Zefone live", "Zefone 4 max",  "Zefone 4 Selfie",  "Zefone Zoom s", "Zefone 5 Selfie",
            "Zefone max pro N1", "Zefone max plus", "Zefone 4", "Maz shot", "Zefone 5",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asus);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        ListaItens = (ListView)findViewById(R.id.ListaAsusId);


        final String[] valeus = new String[] { "Zefone live", "Zefone 4 max",  "Zefone 4 Selfie",  "Zefone Zoom s", "Zefone 5 Selfie",
                "Zefone max pro N1", "Zefone max plus", "Zefone 4", "Maz shot", "Zefone 5",  };

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
                Intent intent = new Intent(AsusActivity.this, SolicitacaoActivity.class);

                // Enviando valor para outra atividade usando intent.
                intent.putExtra ("ListViewClickedValue",TempListViewClickedValue );

                startActivity (intent);
            }


        });
    }
}

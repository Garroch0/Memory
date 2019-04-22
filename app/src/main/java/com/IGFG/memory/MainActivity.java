package com.IGFG.memory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Integer numeros;
    Integer indice = 0;
    Button reiniciar;
    Button botao1;
    Button botao2;
    Button botao3;
    Button botao4;
    Button botao5;
    Button botao6;
    TextView parabens;
    TextView parabens_2;
    ProgressBar progresso;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numeros = geraNumeros();
        reiniciar = (Button)findViewById(R.id.reiniciar);
        botao1 = (Button)findViewById(R.id.um);
        botao2 = (Button)findViewById(R.id.dois);
        botao3 = (Button)findViewById(R.id.tres);
        botao4 = (Button)findViewById(R.id.quatro);
        botao5 = (Button)findViewById(R.id.cinco);
        botao6 = (Button)findViewById(R.id.seis);
        parabens = (TextView)findViewById(R.id.prb);
            parabens.setVisibility(View.GONE);
        parabens_2 = (TextView)findViewById(R.id.prb_2);
            parabens_2.setVisibility(View.GONE);
    }

    public List<Integer> geraNumeros() {
        List<Integer> numeros = new ArrayList<>();
            numeros.add(1);
            numeros.add(2);
            numeros.add(3);
            numeros.add(4);
            numeros.add(5);
            numeros.add(6);
            Collections.shuffle(numeros);
            return numeros;
    }
}

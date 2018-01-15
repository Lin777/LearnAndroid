package com.example.lin777.contador;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;
    }

    public void incrementaContador(View vista){
        contador++;
        mostrarResultados();
    }

    public void restaContador(View vista){
        contador--;
        mostrarResultados();
    }

    public void reseteaContador(View vista){
        contador = 0;
        mostrarResultados();
    }

    public void mostrarResultados(){
        TextView textoResultado = (TextView)findViewById(R.id.contador);
        textoResultado.setText(""+contador);
    }
}

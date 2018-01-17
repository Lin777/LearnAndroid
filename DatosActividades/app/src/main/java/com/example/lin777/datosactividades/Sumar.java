package com.example.lin777.datosactividades;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by lin777 on 1/17/18.
 */

public class Sumar extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);
        Bundle datos= getIntent().getExtras();

        int num1 = datos.getInt("numero1");
        int num2 = datos.getInt("numero2");

        TextView texto = (TextView)findViewById(R.id.texto_resultado);
        texto.setText("El resultado es: "+(num1+num2));
    }
}

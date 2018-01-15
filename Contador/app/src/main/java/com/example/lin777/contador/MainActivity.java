package com.example.lin777.contador;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    public int contador;

    TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoResultado = (TextView)findViewById(R.id.contador);
        contador = 0;
    }

    public void incrementaContador(View vista){
        contador++;
        textoResultado.setText(""+contador);
    }

    public void restaContador(View vista){

        contador--;

        if(contador<0){
            CheckBox negativos = (CheckBox)findViewById(R.id.negativos);
            if(!negativos.isChecked()) {
                contador = 0;
            }
        }
        textoResultado.setText(""+contador);
    }

    public void reseteaContador(View vista){
        EditText numeroReset = (EditText)findViewById(R.id.n_reseteo);
        try {
            contador = Integer.parseInt(numeroReset.getText().toString());
        }catch (Exception e){
            contador=0;
        }
        numeroReset.setText("");
        textoResultado.setText(""+contador);

        InputMethodManager miTeclado = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        miTeclado.hideSoftInputFromWindow(numeroReset.getWindowToken(),0);
    }

}

package com.example.lin777.datosactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sumar(View vista){
        Intent i = new Intent(this, Sumar.class);
        EditText campo1 = (EditText)findViewById(R.id.num1);
        EditText campo2 = (EditText)findViewById(R.id.num2);
        int n1 = Integer.parseInt(campo1.getText().toString());
        int n2 = Integer.parseInt(campo2.getText().toString());
        i.putExtra("numero1", n1);
        i.putExtra("numero2", n2);
        startActivity(i);
    }
}

package com.example.lin777.pruebas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = (ImageView)findViewById(R.id.icono_edicion);

        img.setImageResource(android.R.drawable.ic_menu_edit);
    }
}

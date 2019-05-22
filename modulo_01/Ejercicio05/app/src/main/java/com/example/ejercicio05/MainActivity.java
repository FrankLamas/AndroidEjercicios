package com.example.ejercicio05;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {


    EditText edT;
    Spinner Sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edT = (EditText) findViewById(R.id.editText);
        Sp = (Spinner) findViewById(R.id.spinner);

        String []opciones = {"Negrita","Cursiva","Cursiva Negrita","Normal"};
        //Adapter
        ArrayAdapter<String> adptador = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,opciones);

        //Modelos
        Sp.setAdapter(adptador);

        Sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.e("Aplicación","Se Presionó.");

                String opcion = Sp.getSelectedItem().toString();
                switch (opcion){
                    case "Negrita":
                        edT.setTypeface(null, Typeface.BOLD);
                        break;
                    case "Cursiva":
                        edT.setTypeface(null, Typeface.ITALIC);
                        break;
                    case "Cursiva Negrita":
                        edT.setTypeface(null, Typeface.BOLD_ITALIC);
                        break;
                    case "Normal":
                        edT.setTypeface(null, Typeface.NORMAL);
                        break;
                        default:
                            edT.setTypeface(null, Typeface.NORMAL);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}

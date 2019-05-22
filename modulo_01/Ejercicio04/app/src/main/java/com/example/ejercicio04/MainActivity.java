package com.example.ejercicio04;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    CheckBox cb1,cb2;
    EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = (CheckBox) findViewById(R.id.checkBox);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        edt = (EditText) findViewById(R.id.editText);
    }

    public void cambiaTexto(View v){
        if (cb1.isChecked()==false && cb2.isChecked()==false)
            edt.setTypeface(null, Typeface.NORMAL);
        else if (cb1.isChecked()==true && cb2.isChecked()==false)
            edt.setTypeface(null, Typeface.BOLD);
        else if (cb1.isChecked()==false && cb2.isChecked()==true)
            edt.setTypeface(null, Typeface.ITALIC);
        else if (cb1.isChecked()==true && cb2.isChecked()==true)
            edt.setTypeface(null, Typeface.BOLD_ITALIC);
    }
}

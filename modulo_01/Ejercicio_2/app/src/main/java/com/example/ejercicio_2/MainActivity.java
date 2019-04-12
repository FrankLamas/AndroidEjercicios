package com.example.ejercicio_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tN1)
    EditText tNum1;
    @BindView(R.id.tN2)
    EditText tNum2;

    @BindView(R.id.radioResta)
    RadioButton rResta;
    @BindView(R.id.radioSuma)
    RadioButton rSuma;

    @BindView(R.id.tResultado)
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonCalculo)
    public void hacerOperacion(){
        double resultado;
        if (rResta.isChecked()==true){
            resultado = convertToDouble(tNum1.getText().toString())-convertToDouble(tNum2.getText().toString());
            res.setText(resultado+"");
        }else{
            resultado = convertToDouble(tNum1.getText().toString())+convertToDouble(tNum2.getText().toString());
            res.setText(resultado+"");
        }
        Toast.makeText(this,resultado+"",Toast.LENGTH_LONG).show();
    }
    private double convertToDouble(String cadena){
        try{
            return Double.parseDouble(cadena);
        }catch (NumberFormatException e){
            return 0;
        }
    }
}

package com.example.listaaplicacionpf;

import android.app.AliasActivity;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.listaaplicacionpf.Modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

public class TomarListaAct extends AppCompatActivity {
    int actual =0;
    FloatingActionButton fa;
    FloatingActionButton fa2;
    TextView txtAlumno,Estado;
    ImageView avatar;
    List<Alumno> salon = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomar_lista);

        fa= (FloatingActionButton) findViewById(R.id.floatingActionButton);
        fa2= (FloatingActionButton) findViewById(R.id.floatingActionButton2);
        txtAlumno = (TextView) findViewById(R.id.txtNombre);
        Estado=(TextView) findViewById(R.id.txtEstado);
        avatar = (ImageView) findViewById(R.id.imageAlumno);

        salon.add(new Alumno("16061018","Frank Lamas"));
        salon.add(new Alumno("16062003","El Ray"));
        salon.add(new Alumno("16072910","El Tigre"));
        salon.add(new Alumno("15962828","El Lampard"));
        salon.add(new Alumno("16062323","El Pillo"));
        salon.add(new Alumno("16062020","La Amiguita"));
        salon.add(new Alumno("16066060","El Illan"));
        salon.add(new Alumno("16063010","El Coby"));
        actualizaVista();

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    private void actualizaVista(){
        if (actual==0){
            fa.hide();
        }else{
            fa.show();
        }
        if (actual==salon.size()-1)
            fa2.hide();
        else
            fa2.show();
        Alumno alumno = salon.get(actual);
        txtAlumno.setText(alumno.getNombre());
        if (alumno.getRuta().equals("none"))
            avatar.setImageDrawable(getResources().getDrawable(R.drawable.alumno));
        else
            Toast.makeText(this,"Pendiente",Toast.LENGTH_LONG).show();
    }

    public void Asistencia(View v){

    }
    public void Falta(View v){

    }
    public void Jutificar(View v){

    }
    public void Siguiente(View v){
        actual++;
        actualizaVista();
    }
    public void Anterior(View v){
        actual--;
        actualizaVista();
    }
}

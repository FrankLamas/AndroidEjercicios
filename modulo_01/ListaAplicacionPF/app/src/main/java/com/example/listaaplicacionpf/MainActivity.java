package com.example.listaaplicacionpf;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.listaaplicacionpf.Adaptadores.AdaptadorCurso;
import com.example.listaaplicacionpf.Modelo.Cursos;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.rv = (RecyclerView) findViewById(R.id.rv);
        llenarRecycler();
    }

    private void llenarRecycler() {
        Cursos c1 = new Cursos();
        c1.setId(1);
        c1.setNombre("Moviles");
        c1.setPorcentaje(20);
        Cursos c2 = new Cursos();
        c2.setId(2);
        c2.setNombre("Apps Web");
        c2.setPorcentaje(70);
        Cursos c3 = new Cursos();
        c3.setId(3);
        c3.setNombre("Bases de Datos");
        c3.setPorcentaje(60);
        List<Cursos> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        AdaptadorCurso adaptadorCurso = new AdaptadorCurso(this,lista);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setAdapter(adaptadorCurso);
    }
}

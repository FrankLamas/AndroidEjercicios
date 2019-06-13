package com.example.listaaplicacionpf.Modelo;

public class Alumno {

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String numControl;
    private String nombre;

    public Alumno(String numControl, String nombre) {
        this.numControl = numControl;
        this.nombre = nombre;
        this.ruta = "none";
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    private int idCurso;
    private String ruta;

}

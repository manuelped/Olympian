package com.example.olympian.model;

public class Rutina {
    String nombre;
    int series;
    int repeticiones;
    String imagenURL;

    public Rutina() {}

    public Rutina(String nombre, int series, int repeticiones, String imagen) {
        this.nombre = nombre;
        this.series = series;
        this.repeticiones = repeticiones;
        this.imagenURL = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public String getImagen() {
        return imagenURL;
    }

    public void setImagen(String imagen) {
        this.imagenURL = imagen;
    }
}
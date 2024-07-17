package com.example.dam_examen_final_talledo;

public class Nota {
    private String titulo;
    private String contenido;
    private boolean favoritas;
    private int color;

    public Nota(String titulo, String contenido, boolean favoritas, int color) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.favoritas = favoritas;
        this.color = color;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public boolean isFavoritas() {
        return favoritas;
    }

    public void setFavoritas(boolean favoritas) {
        this.favoritas = favoritas;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}

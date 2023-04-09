package com.example.actividadn3.Models;

import java.io.Serializable;

public class Pelicula implements Serializable {
    private String titulo;
    private int imagenUrl;
    private String description;
    private String actores;
    private String director;

    public Pelicula(String titulo, int imagenUrl, String description, String actores, String director) {
        this.titulo = titulo;
        this.imagenUrl = imagenUrl;
        this.description = description;
        this.actores = actores;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(int imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}

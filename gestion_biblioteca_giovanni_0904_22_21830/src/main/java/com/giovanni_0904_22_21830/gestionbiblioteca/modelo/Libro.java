package com.giovanni_0904_22_21830.gestionbiblioteca.modelo;

public class Libro {
    private String titulo;
    private String autor;
    private int yearPublicacion;

    public Libro(String titulo, String autor, int yearPublicacion) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título no estar vacío.");
        }
        
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("El autor no puede estar vacío.");
        }
        
        if (yearPublicacion <= 0) {
            throw new IllegalArgumentException("El año de publicación debe ser mayor a 0.");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.yearPublicacion = yearPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getYearPublicacion() {
        return yearPublicacion;
    }


    public boolean esAntiguo() {
        return this.yearPublicacion < 2000;
    }
}
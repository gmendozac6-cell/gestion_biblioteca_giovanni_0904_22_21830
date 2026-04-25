package com.giovanni_0904_22_21830.gestionbiblioteca.servicio;

import com.giovanni_0904_22_21830.gestionbiblioteca.modelo.Libro;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        if (libro != null) {
            libros.add(libro);
        }
    }

    public List<Libro> obtenerLibros() {
        // Devolvemos una copia para proteger la lista original (Encapsulamiento)
        return new ArrayList<>(libros);
    }

    public Libro buscarPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null; // Retorna null si no lo encuentra
    }
}
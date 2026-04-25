package com.giovanni_0904_22_21830.gestionbiblioteca.app;

import com.giovanni_0904_22_21830.gestionbiblioteca.modelo.Libro;
import com.giovanni_0904_22_21830.gestionbiblioteca.servicio.Biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca();

        // 1. Agregar 3 libros válidos
        try {
            miBiblioteca.agregarLibro(new Libro("El Quijote", "Miguel de Cervantes", 1605));
            miBiblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967));
            miBiblioteca.agregarLibro(new Libro("Harry Potter", "J.K. Rowling", 1997));
            System.out.println("--- Libros agregados exitosamente ---");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al agregar libros válidos: " + e.getMessage());
        }

        // 2. Intentar agregar 1 libro inválido (año <= 0)
        try {
            System.out.println("\nIntentando agregar libro inválido...");
            miBiblioteca.agregarLibro(new Libro("", null, -5));
        } catch (IllegalArgumentException e) {
            System.out.println("Captura de error esperada: " + e.getMessage());
        }

        // 3. Imprimir todos los libros
        System.out.println("\n--- Listado de Libros en la Biblioteca ---");
        for (Libro l : miBiblioteca.obtenerLibros()) {
            String antiguedad = l.esAntiguo() ? "(Antiguo)" : "(Moderno)";
            System.out.println("Título: " + l.getTitulo() + " | Autor: " + l.getAutor() + " | Año: " + l.getYearPublicacion() + " " + antiguedad);
        }

        // 4. Buscar un libro por título
        String tituloBuscar = "Harry Potter";
        System.out.println("\nBuscando libro: " + tituloBuscar);
        Libro encontrado = miBiblioteca.buscarPorTitulo(tituloBuscar);

        if (encontrado != null) {
            System.out.println("¡Encontrado! Autor: " + encontrado.getAutor());
        } else {
            System.out.println("El libro '" + tituloBuscar + "' no se encuentra en el sistema.");
        }
    }
}

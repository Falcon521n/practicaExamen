package org.practicaExamen.lecturaComunitaria;

import java.util.ArrayList;

public class BibliotecaComunitaria {

    private ArrayList<Libro> lista;

    public BibliotecaComunitaria() {
        lista = new ArrayList<>();
    }

    public void agregarLibro(Libro l) {
        lista.add(l);
    }

    public void mostrarLibrosPendientes() {
        int totalDeLibros = 0;
        int librosSinLeer = 0;

        for (Libro l : lista) {
            totalDeLibros++;

            if (!l.isLeido()) { // Suponiendo que tienes un método isLeido()
                System.out.println("Título: " + l.getTitulo() + " — Este libro está pendiente");
                librosSinLeer++;
            }
        }

        System.out.println("Total de libros: " + totalDeLibros);
        System.out.println("Libros sin leer: " + librosSinLeer);
    }

    public double porcentajeDeLibrosLeidos() {
        if (lista.isEmpty()) return 0;

        int leidos = 0;
        for (Libro l : lista) {
            if (l.isLeido()) {
                leidos++;
            }
        }

        return (double) leidos * 100 / lista.size();
    }
}
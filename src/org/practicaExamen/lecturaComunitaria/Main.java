package org.practicaExamen.lecturaComunitaria;


public class Main {
    public static void main(String[] args) {
        // Crear instancia de BibliotecaComunitaria
        BibliotecaComunitaria biblioteca = new BibliotecaComunitaria();

        // Crear libros
        Libro l1 = new Libro("La rata", "Desconocido", 301, true);
        Libro l2 = new Libro("La casa", "Desconocido", 300, false);
        Libro l3 = new Libro("La cama", "Desconocido", 30, false);

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(l1);
        biblioteca.agregarLibro(l2);
        biblioteca.agregarLibro(l3);

        // Mostrar detalles de cada libro
        l1.mostrarFicha();
        l2.mostrarFicha();
        l3.mostrarFicha();

        // Mostrar estado de lectura
        l1.estadoDeLectura();
        l2.estadoDeLectura();
        l3.estadoDeLectura();

        // Mostrar libros pendientes y porcentaje
        biblioteca.mostrarLibrosPendientes();
        System.out.println("Porcentaje de libros leídos: " + biblioteca.porcentajeDeLibrosLeidos() + "%");
    }
}
package org.practicaExamen.lecturaComunitaria;

public class Libro{

    public String titulo;
    public String autor;
    public int paginas;
    public boolean leido;

    public Libro(String titulo, String autor, int paginas, boolean leido) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.leido = leido;
    }


    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getPaginas(){
        return paginas;
    }

    public void setPaginas(int paginas){
        this.paginas = paginas;
    }

    public boolean isLeido(){
        return leido;
    }

    public void setLeido(boolean leido){
        this.leido = leido;
    }

    public void mostrarFicha(){

        System.out.println("Titulo: " + titulo);
        System.out.println("Autor, "+ autor);
        System.out.println("Paginas: "+paginas);
        System.out.println("Estado del libro"+ leido);
    }

    public void esLargo(int paginas){
        if(paginas > 300){
            System.out.println("true");
        }
    }

    public void estadoDeLectura(){
        if(leido == true){
            System.out.println("Leido");
        }else{
            System.out.println("Pendiente");
        }
    }

}

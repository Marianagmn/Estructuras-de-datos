/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist_2;

/**
 *
 * @author dulce
 */
public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private String estadoPrestamo;

    public Libro() {
    }

    public Libro(String titulo, String autor, String ISBN, String estadoPrestamo) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.estadoPrestamo = estadoPrestamo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEstadoPrestamo() {
        return estadoPrestamo;
    }

    public void setEstadoPrestamo(String estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
    }
    
    public void prestarLibro(){
    }
    public void devolverLibro(){
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", estadoPrestamo=" + estadoPrestamo + '}';
    }
    
    
    
}

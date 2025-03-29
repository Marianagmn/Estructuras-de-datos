/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist_2;

/**
 *
 * @author dulce
 */
public class Prestamo {
    private String libroPrestado;
    private String usuario;
    private String fecha;
    private String fechaDevolucion;

    public Prestamo() {
    }

    public Prestamo(String libroPrestado, String usuario, String fecha, String fechaDevolucion) {
        this.libroPrestado = libroPrestado;
        this.usuario = usuario;
        this.fecha = fecha;
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(String libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "libroPrestado=" + libroPrestado + ", usuario=" + usuario + ", fecha=" + fecha + ", fechaDevolucion=" + fechaDevolucion + '}';
    }
    
    
}

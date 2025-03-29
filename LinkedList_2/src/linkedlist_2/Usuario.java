/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist_2;

import java.util.LinkedList;

/**
 *
 * @author dulce
 */
public class Usuario {
    private String nombre;
    private String ID;
    LinkedList<Prestamo> listaPrestamo= new LinkedList();

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public LinkedList<Prestamo> getListaPrestamo() {
        return listaPrestamo;
    }

    public void setListaPrestamo(LinkedList<Prestamo> listaPrestamo) {
        this.listaPrestamo = listaPrestamo;
    }
    
    public void agregarPrestamo(){}
    public void eliminarPrestamo(){}

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", ID=" + ID + ", listaPrestamo=" + listaPrestamo + '}';
    }
    
    
}

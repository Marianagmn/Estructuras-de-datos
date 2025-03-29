/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author dulce
 */
public class Estudiante {

    String nombre;
    int ID;
    double promedio;

    public Estudiante(String nombre, int ID, double promedio) {
        this.nombre = nombre;
        this.ID = ID;
        this.promedio = promedio;
    }

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", ID=" + ID + ", promedio=" + promedio + '}';
    }

    public static void main(String[] args) {
        ListaEstudiante lista = new ListaEstudiante();
        lista.agregarEstudiante(new Estudiante("Lina", 001, 45.0));
        lista.agregarEstudiante(new Estudiante("Diana", 002, 50.0));
        lista.agregarEstudiante(new Estudiante("Carlos", 003, 35.0));
        lista.agregarEstudiante(new Estudiante("Miryam", 004, 25.0));
        System.out.println("La lista es: ");
        lista.imprimirLista();
        
        System.out.println();
        
        System.out.println("Estudiante ID 2:");
        System.out.println(lista.buscarEstudiante(2));
        
        System.out.println();
        
        System.out.println("Eliminandi estudiante ID 3");
        System.out.println(lista.eliminarEstudiante(3));        
        lista.imprimirLista();
        
        System.out.println();
        
        System.out.println("Top estudiantes: ");
        LinkedList <Estudiante> top = lista.obtenerTopEstudiantes(2);
        for (Estudiante estudiante : top) {
            System.out.println(estudiante);
        }
        System.out.println();
        System.out.println("Estudiantes reprobados: ");
        lista.eliminarReprobados();
        lista.imprimirLista();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author dulce
 */
public class ListaEstudiante {

    private LinkedList<Estudiante> otraLista;
    Estudiante est = new Estudiante();

    public ListaEstudiante() {
        this.otraLista = new LinkedList<>();
    }

    public void agregarEstudiante(Estudiante e) {
        //Añade un estudiante al final de la lista.
        otraLista.addLast(e);
    }

    public void insertarEstudiante(int index, Estudiante e) {
        //Inserta un estudiante en una posición específica. 
        if (index>=0 && index<=otraLista.size()) {
            otraLista.add(index, e);
        }
    }

    public Estudiante eliminarEstudiante(int id) {
        //Elimina un estudiante por su ID. 
        otraLista.removeIf(e-> e.ID == id);
        return null;
    }

    public Estudiante buscarEstudiante(int id) {
        //Busca y devuelve un estudiante por su ID.
        for (Estudiante e : otraLista) {
            if (e.ID==id) {
                return e;
            }
        }
        return null;
    }

    public LinkedList<Estudiante> obtenerTopEstudiantes(int n) {
        //Devuelve una nueva LinkedList con los n estudiantes con mejor promedio.
        if(est.promedio>30){
            System.out.println(n);
        }
        LinkedList<Estudiante> topest = new LinkedList<>(otraLista);
        topest.sort(Comparator.comparingDouble(e -> -e.promedio));
        return new LinkedList<>(topest.subList(0, Math.min(n, topest.size())));
    }

    public void fusionarListas(LinkedList<Estudiante> lista) {
        //Fusiona la lista actual con otra lista de estudiantes. 
        otraLista.addAll(lista);
        
    }

    public void eliminarReprobados() {
        //Elimina de la lista los estudiantes con promedio menor a 30.0.
        otraLista.removeIf(e-> e.promedio < 30);
    }

    public void imprimirLista() {
        //Imprime la información de todos los estudiantes en la lista.
        for (Estudiante estudiante : otraLista) {
            System.out.println(estudiante.toString());
        }
    }
}

package Controlador;

import Modelo.Coche;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class ListaCoches extends ArrayList{
    ArrayList<Coche> listaCoches = new ArrayList<>();
    private int actual;

    public ListaCoches(int actual) {
        this.actual = actual;
    }
    
    public boolean esVacia() {
        return isEmpty();
    }
    
    public void avanzar() {
        if (!esVacia() && !esUltimo()) actual++;
    }
    
    public void retroceder() {
        if (!esVacia() && !esPrimero()) actual--;
    }
    
    public void irAlPrimero() {
        if (!esVacia()) actual = 0;
    }
    public void irAlUltimo() {
        if (!esVacia()) actual = size() - 1;
    }
    
    public boolean esPrimero() {
        return actual == 0;
    }
    
    public boolean esUltimo() {
        return !esVacia() && actual == size() - 1;
    }
    
    public void anadirCoche(Coche coche) {
        add(coche);
    }
    
    public Coche obtenerCocheActual() {
        if (esVacia()){ 
            return null;
        }
        return (Coche) get(actual);
    }
    
    public void borrarCoche() {
        if (!esVacia()) {
            remove(actual);
        if (actual >= size() && !esVacia()) {
            actual = size() - 1;
            }
        }
    }
    
    public void ordenarPorMatricula() {
        Coche cocheselec = obtenerCocheActual();
        
    }
}

package Objetos;

import java.util.ArrayList;


public class Alumno {
    
    public String nombre;
    public ArrayList<Double> listaNota = new ArrayList();

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Double> getListaNota() {
        return listaNota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaNota(ArrayList<Double> listaNota) {
        this.listaNota = listaNota;
    }
    
    
    
    
}

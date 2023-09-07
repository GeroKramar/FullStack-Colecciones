package Servicios;

import Objetos.Alumno;
import java.util.ArrayList;
import java.util.Scanner;


public class AlumnoServicios {

    
    public final Scanner leer = new Scanner(System.in);

    public void crearListaAlumnos(ArrayList<Alumno> listaAlumno) {
        Alumno a = new Alumno();
        ArrayList<Double> aux = new ArrayList<>();
        String opc = "";
        do {
            System.out.println("INGRESE EL NOMBRE DEL ALUMNO");
            a.setNombre(leer.next());
            
            for (int i = 0; i < 3; i++) {
                System.out.println("INGRESE LA NOTA " + (i + 1));
                aux.add(leer.nextDouble());
            }
            a.setListaNota(aux);

            listaAlumno.add(a);

            System.out.println("¿QUIERE INGRESAR OTRO ALUMNO? (S/N)");
            opc = leer.next();

        } while (opc.equalsIgnoreCase("S"));

    }

//    public Alumno crearAlumnos(){
//        ArrayList<Double> aux = new ArrayList<>();
//        System.out.println("INGRESE EL NOMBRE DEL ALUMNO");
//        a.setNombre(leer.next());
//        
//        for (int i = 0; i < 3; i++) {
//            System.out.println("INGRESE LA NOTA " + (i + 1));
//            aux.add(leer.nextDouble());
//        }
//        a.setListaNota(aux);
//        return a;
//    }
    public void notaFinal(ArrayList<Alumno> listaAlumno) {
        System.out.println("INGRESE EL ALUMNO PARA CALCULAR SU NOTA FINAL");
        String nombre = leer.next();

        for (Alumno aux : listaAlumno) {
            if (aux.getNombre().equals(nombre)) {

                System.out.println("EL PROMEDIO FINAL ES: " + CalcularNota(aux));
            } else {
                System.out.println("NO SE ENCONTRO EL ALUMNO EN LA LISTA");
            }

        }
    }

    public Double CalcularNota(Alumno a) {
        Double prom = 0.0;
        for (Double aux : a.getListaNota()) {

            prom = prom + aux;

        }

        return prom / 3;
    }

    public void mostrarLista(ArrayList a) {
        for (Object object : a) {
            System.out.println(object.toString());

        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_colecciones_04;

import Servicios.Cine;

public class Ejercicio_Colecciones_04 {

 
    public static void main(String[] args) {
        
        Cine cine = new Cine();
        
        cine.crearPelicula();

        cine.mostrarPeliculas();
        cine.mostrarPeliculasDuracionMayorAUnaHora();

        cine.ordenarPeliculasPorDuracionDescendente();
        System.out.println("--- Películas ordenadas por duración (de mayor a menor) ---");
        cine.mostrarPeliculas();

        cine.ordenarPeliculasPorDuracionAscendente();
        System.out.println("--- Películas ordenadas por duración (de menor a mayor) ---");
        cine.mostrarPeliculas();

        cine.ordenarPeliculasPorTitulo();
        System.out.println("--- Películas ordenadas por título ---");
        cine.mostrarPeliculas();

        cine.ordenarPeliculasPorDirector();
        System.out.println("--- Películas ordenadas por director ---");
        cine.mostrarPeliculas();
        
    }
}

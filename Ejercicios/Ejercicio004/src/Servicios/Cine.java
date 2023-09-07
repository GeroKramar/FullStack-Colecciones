/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Pelicula.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Cine {
    private List<Pelicula> peliculas;

    public Cine() {
        peliculas = new ArrayList<>();
    }
    
    public void crearPelicula () {
        Scanner scanner = new Scanner(System.in);
     char opcion;
        do {
            System.out.println("Ingrese los datos de la película:");
            System.out.print("Título: ");
            String titulo = scanner.nextLine();
            System.out.print("Director: ");
            String director = scanner.nextLine();
            System.out.print("Duración (en horas): ");
            double duracion = Double.parseDouble(scanner.nextLine());

            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            agregarPelicula(pelicula);

            System.out.print("¿Desea agregar otra película? (s/n): ");
            opcion = scanner.nextLine().charAt(0);
        } while (opcion == 's');
}
    
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void mostrarPeliculas() {
        System.out.println("--- Todas las películas ---");
        for (Pelicula pelicula : peliculas) {
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duración: " + pelicula.getDuracion() + " horas");
            System.out.println("------------------------");
        }
    }

    public void mostrarPeliculasDuracionMayorAUnaHora() {
        System.out.println("--- Películas con duración mayor a 1 hora ---");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println("Título: " + pelicula.getTitulo());
                System.out.println("Director: " + pelicula.getDirector());
                System.out.println("Duración: " + pelicula.getDuracion() + " horas");
                System.out.println("------------------------");
            }
        }
    }

    public void ordenarPeliculasPorDuracionDescendente() {
        Collections.sort(peliculas, Comparator.comparingDouble(Pelicula::getDuracion).reversed());
    }

    public void ordenarPeliculasPorDuracionAscendente() {
        Collections.sort(peliculas, Comparator.comparingDouble(Pelicula::getDuracion));
    }

    public void ordenarPeliculasPorTitulo() {
        Collections.sort(peliculas, Comparator.comparing(Pelicula::getTitulo));
    }

    public void ordenarPeliculasPorDirector() {
        Collections.sort(peliculas, Comparator.comparing(Pelicula::getDirector));
    }
 }
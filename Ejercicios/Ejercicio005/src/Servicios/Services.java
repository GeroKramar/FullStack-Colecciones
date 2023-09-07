package Servicios;

import Objeto.*;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Services {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Pelicula crearPelicula() {
        Pelicula p = new Pelicula();
        System.out.println("INGRESE EL TITULO DE LA PELICULA");
        p.setTitulo(leer.next());
        System.out.println("INGRESE LA DURACIÓN DE LA PELICULA");
        p.setDuracion(leer.nextDouble());
        System.out.println("INGRESE LA EDAD MINIMA PARA VER ESTA PELICULA");
        p.setEdadMinima(leer.nextInt());
        return p;
    }
    
    public void crearEspectador(ArrayList<Espectador> listaEspectador) {
        Random random = new Random();
        ArrayList<String> nombres = new ArrayList(Arrays.asList("Juan", "Sebas", "Saulo", "Gero", "Carla", "David"));
        Integer randomAux = random.nextInt(500);
        
        for (int i = 0; i < randomAux; i++) {
            Espectador es = new Espectador();
            
            es.setNombre(nombres.get(random.nextInt(6)));
            
            es.setEdad(random.nextInt(50));
            
            es.setDineroDisponible(Double.valueOf(random.nextInt(500)));
            
            listaEspectador.add(es);
        }
        System.out.println("SON " + randomAux + " Espectadores");
        
    }
    
    public Cine crearCine(ArrayList<Espectador> listaEspectador, Pelicula p) {
        Cine c = new Cine();
        Random random = new Random();
        String[][] aux = new String[8][6];
        Integer cont = 0;
        Espectador[][] listaAux = new Espectador[8][6];
        c.setPelicula(p);
        boolean validar;
        Integer contPobres = 0;
        Integer contMenores = 0;
        Integer contSalaLlena = 0;
        
        
        System.out.println("INGRESE EL PRECIO DE LA PELICULA");
        c.setPrecio(leer.nextDouble());
        
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                listaAux[i][j] = new Espectador("",0,0.0);
                switch (j) {
                    case 0:
                        aux[i][j] = (i + 1) + "A";
                        
                        break;
                    case 1:
                        aux[i][j] = (i + 1) + "B";
                        break;
                    case 2:
                        aux[i][j] = (i + 1) + "C";
                        break;
                    case 3:
                        aux[i][j] = (i + 1) + "D";
                        break;
                    case 4:
                        aux[i][j] = (i + 1) + "E";
                        break;
                    case 5:
                        aux[i][j] = (i + 1) + "F";
                        break;
                    
                }
                
            }
            
        }
        
        for (Espectador espec : listaEspectador) {
            
            if (espec.getDineroDisponible() >= c.getPrecio()) {
                if (espec.getEdad() >= c.getPelicula().getEdadMinima()) {
                    if (cont < 48) {
                        
                        do {
                            validar = false;
                            Integer randomi = random.nextInt(8);
                            Integer randomj = random.nextInt(6);
                            if (listaAux[randomi][randomj].getNombre().equals("")) {
                                listaAux[randomi][randomj] = espec;
                                aux[randomi][randomj]+= "X";
                                
                                cont++;
                                validar = true;
                            }
                        } while (validar == false);
                        
                    }else{
                        contSalaLlena++;
                    }
                } else {
                    contMenores++;
                }
            } else {
                contPobres++;
            }
        }
        
        System.out.println("LA CANTIDAD DE MENORES QUE NO ENTRARON ES: " + contMenores);
        System.out.println("LA CANTIDAD DE POBRES QUE NO ENTRARON ES: " + contPobres);
        System.out.println("LA CANTIDAD QUE NO LOGRARON ENTRAR POR SALA LLENA SON: " + contSalaLlena);
        System.out.println("EL TOTAL DE INFELICES: " + (contSalaLlena + contMenores + contPobres));
        
        
        mostrarMatriz(aux);
        c.setSala(listaAux);
        return c;
        
    }
    
    public void mostrarMatriz(String[][] aux) {
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                System.out.print("| " + aux[i][j] + " |");
            }
            System.out.println("");
            
        }
    }    
    
}

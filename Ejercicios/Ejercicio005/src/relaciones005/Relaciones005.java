

package relaciones005;
import java.util.Scanner;
import Objeto.*;
import Servicios.Services;
import java.util.ArrayList;

public class Relaciones005 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Services s = new Services();
        ArrayList<Espectador> listaEspectador = new ArrayList();
        Pelicula p = s.crearPelicula();
        
        s.crearEspectador(listaEspectador);
        Cine c = s.crearCine(listaEspectador, p);
        
        
       
        
     
        
        
        
        
        
        
        
    }

}

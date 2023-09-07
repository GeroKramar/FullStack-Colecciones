

package coleccionesejercicio3;
import java.util.Scanner;
import Servicios.AlumnoServicios;
import Objetos.Alumno;
import java.util.ArrayList;
public class ColeccionesEjercicio3 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        AlumnoServicios as = new AlumnoServicios();
        ArrayList<Alumno> listaAlumno = new ArrayList<>();
                
        as.crearListaAlumnos(listaAlumno);
        
        as.notaFinal(listaAlumno);
 
    }

}

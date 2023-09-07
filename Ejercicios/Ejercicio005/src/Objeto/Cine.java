
package Objeto;


public class Cine {
    
    Pelicula pelicula;
    Double Precio;
    Espectador[][] sala = new Espectador[8][6];

    public Cine(Pelicula pelicula, Double Precio, Espectador[][] sala) {
        this.pelicula = pelicula;
        this.Precio = Precio;
        this.sala = sala;
    }

    public Espectador[][] getSala() {
        return sala;
    }



    public void setSala(Espectador[][] sala) {
        this.sala = sala;
    }

    public Cine() {
    }

    public Cine(Pelicula pelicula, Double Precio) {
        this.pelicula = pelicula;
        this.Precio = Precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }
    
    
    
}

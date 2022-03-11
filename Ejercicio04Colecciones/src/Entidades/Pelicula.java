
package Entidades;


public class Pelicula {
    
    private String titulo;
    private String director;
    private double horas;

    public Pelicula() {
    }
   
    
    

    public Pelicula(String titulo, String director, double horas) {
        this.titulo = titulo;
        this.director = director;
        this.horas = horas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Double getHoras() {
        return horas;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", horas=" + horas + '}';
    }
    
    
    
    
    
    
    
}

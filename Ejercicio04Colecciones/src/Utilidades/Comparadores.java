
package Utilidades;

import Entidades.Pelicula;
import java.util.Comparator;


public class Comparadores {
    
    public static Comparator<Pelicula> listaC = new Comparator<Pelicula> (){
    @Override
    
    public int compare(Pelicula objeto2, Pelicula objeto1){
    
    return objeto2.getHoras().compareTo(objeto1.getHoras());
    
    
    
    }
    
    
    
    
    };
    
    
    public static Comparator<Pelicula> listaT = new Comparator<Pelicula> (){
     @Override
     
     public int compare(Pelicula objeto1, Pelicula objeto2){
     
     return objeto1.getTitulo().compareTo(objeto2.getTitulo());
     
     
     
     }
     
    };
    
    public static Comparator<Pelicula> listaD = new Comparator<Pelicula> (){
     @Override
     
     public int compare(Pelicula objeto1, Pelicula objeto2){
     
     return objeto1.getTitulo().compareTo(objeto2.getTitulo());
     
     
     
     }
     
    };
    
    
    
    }
  
    
    
    


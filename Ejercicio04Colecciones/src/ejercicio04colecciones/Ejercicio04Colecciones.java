
package ejercicio04colecciones;

import Entidades.Pelicula;
import Utilidades.Comparadores;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.Scanner;


public class Ejercicio04Colecciones {

  
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
      ArrayList<Pelicula> lisP = new ArrayList();
      String respuesta = "";
    
       
    do{ Pelicula p1 = new Pelicula();
        System.out.println("Ingrese titulo de la pelicula");
        p1.setTitulo(read.next());
        
        System.out.println("Ingrese director de la pelicula"); 
        p1.setDirector(read.next());
        
        System.out.println("Ingrese duracion de la pelicula en horas");
        p1.setHoras(read.nextDouble());
        
       lisP.add(p1);
       
        System.out.println("Quiere agregar otra pelicula a la lista");
        respuesta = read.next();
    
    } while (respuesta.equalsIgnoreCase("Si")) ; 
        
        
     //MOSTRAR EN PANTALLA PELICULAS
     
     for (Pelicula m : lisP){
             System.out.println(m);
        
      }
     
        System.out.println(" ");
     
     //MOSTRAR EN PANTALLA PELICULAS CON DURACION DE MAS DE UNA HORA
    
    for (Pelicula m1 : lisP){
             if(m1.getHoras()>1){
                 System.out.println("Las peliculas que duran mas de 1 hs son"+ " " + m1.getTitulo() );
             
             
             }
        
      }
    //ORDENAR PELIS DE MAYOR A MENOR Y MOSTRARLO EN PANTALLA
    
        System.out.println(" ");
        
      
           Collections.sort(lisP, Comparadores.listaC);
               
           for (Pelicula m2 : lisP){
           
               System.out.println(m2);
           
           }
           
           System.out.println(" ");
           
           //Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
           
           
           
           Collections.sort(lisP, Comparadores.listaT);
               
           for (Pelicula m2 : lisP){
           
               System.out.println(m2);
           
           }
           
           System.out.println(" ");
           
           //Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
           
           Collections.sort(lisP, Comparadores.listaD);
               
           for (Pelicula m2 : lisP){
           
               System.out.println(m2);
           
           }
           
           
           
           
           }
          
        
      }
    
    
    
    
    
    
        
        
        
        
        
    
    


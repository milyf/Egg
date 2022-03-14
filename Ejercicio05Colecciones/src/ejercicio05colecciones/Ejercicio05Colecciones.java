
package ejercicio05colecciones;

//CONJUNTOS (SET) NO PERMITEN ELEMENTOS DUPLICADOS A DIFERENCIA DE LAS LISTAS

import Identidades.Paises;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio05Colecciones {

   
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);//NO SE DEBEN REPETIR PAISES
        
        
   Set <String> nombres = new TreeSet();
        String respuesta = " ";
        
    do {Paises p1 = new Paises();
        System.out.println("Ingrese paises");
        p1.setPaises(read.next());
      
        nombres.add(p1.getPaises());
    
        System.out.println("Desea ingresar otro pais? Si o No");
        respuesta= read.next();
     
    
    } while (respuesta.equalsIgnoreCase("Si"));  
        
     
     if(respuesta.equalsIgnoreCase("No")){
     
     
    for (String n1 : nombres){
             System.out.println(n1);
        
      }
    
    
    }
     
        System.out.println(" ");
     
     
        System.out.println("Ingrese un pais"); 
        String respuesta2="";
        respuesta2 = read.next();
        boolean aux = false;
        
        Iterator<String> it = nombres.iterator();
        while(it.hasNext()){
   
        if(it.next().equals(respuesta2)){
          it.remove(); aux = true;System.out.println("El pais se elimino");
        
        
        }
        else;
        
        
        }
        if(aux== false){
            System.out.println("El pais no se encuentra");}
        
        System.out.println(" ");
    
     for(String n2 : nombres){
     
         System.out.println(n2);}
     
    
    }
}


package coleccionesejercicio03;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;

import java.util.Scanner;

public class ColeccionesEjercicio03 {

   
    public static void main(String[] args) {
        
    
       Scanner read = new Scanner(System.in);
       ArrayList<Alumno> lisA = new ArrayList();
      
       String respuesta = "";

       
       do{
            Alumno a1 = new Alumno();
           System.out.println("Ingrese nombre del alumno");
             a1.setNombre(read.next());
           
            System.out.println("Ingrese las 3 notas del alumno");
           
       for (int i=0; i<3;i++){
          
           a1.setListaNota(read.nextInt());
     
       
          }
         
              lisA.add(a1);
              
    
       
       System.out.println("Quiere ingresar otro alumno?");
        respuesta = read.next();
       
       } while (respuesta.equalsIgnoreCase("Si"));
       
      
        System.out.println("Ingrese nombre del alumno que desea buscar");
        String nombuscado = read.next();
        Iterator<Alumno> it = lisA.iterator();
        while(it.hasNext()){
        Alumno m = new Alumno();
        m =it.next(); //ACCEDE A TODA LA LISTA CON NOMBRES Y NOTAS.//GUARDO LOS ALUMNOS.
        
        if(m.getNombre().equalsIgnoreCase(nombuscado)){
            System.out.println("La nota final es"+ ""+ m.notaFinal());
        
        
        }
        
        }
        
        //OTRO METODO PARA MOSTRAR POR PANTALLA*
              
     
        //for (Alumno m : lisA){
             //if(m.getNombre().equalsIgnoreCase(nombuscado)){
           
             
            //System.out.println("La nota final es"+ " "+ m.notaFinal());
        
        
       // }
            




}
         
        
       
            
        }
        
        

       
       
       


    
    
    
    
    
    
    
    
    
    


package ejercicio06colecciones;

//HAY MAPAS CON ELEMENTOS DUPLICADOS Y OTROS QUE NO.

import Identidades.Tienda;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import javax.swing.text.html.HTMLDocument;

//SE PUEDEN ORDENAR
public class Ejercicio06Colecciones {

  
    public static void main(String[] args) {
        
       Scanner read = new Scanner(System.in);
      HashMap<String,Integer > Tienda = new HashMap();
      String respuesta = "";
      
      do{ //AGREGAR PRODUCTO 
          Tienda t1 = new Tienda();
         System.out.println("Ingrese 1ero el precio y luego el producto para almacenar");
         t1.setPrecio(read.nextInt());
         t1.setProducto(read.next());
         
          Tienda.put(t1.getProducto(),t1.getPrecio());
          System.out.println("Desea ingresar mas productos?");
          respuesta= read.next();
                  
                  
                  
      }while(respuesta.equalsIgnoreCase("Si"));
      
        for (Map.Entry<String, Integer> aux : Tienda.entrySet()) {
            String key = aux.getKey();
            Integer value = aux.getValue();
        
            System.out.println("key"+" "+ key+ " " +"value"+ " " +value);
         
        }  
         
          //MODIFICAR SU PRECIO
          
            System.out.println("Ingrese el producto que desea reemplazar"  + "");
            String remplazo = read.next();
            System.out.println("Ingrese el nuevo precio");
            Integer newp= read.nextInt();
           
            for (Map.Entry<String, Integer> aux2 : Tienda.entrySet()) {
            if(aux2.getKey().equalsIgnoreCase(remplazo)){
               String key = aux2.getKey();
               Integer value= newp;
               Tienda.replace(key,value);
              System.out.println("key"+" "+ key+ " " +"value"+ " " +value);
            }
            
            }
            
            
            for (Map.Entry<String, Integer> aux3 : Tienda.entrySet()) {
            
                System.out.println(aux3);
            }
            
            //INTRODUCIR UN PRODUCTO NUEVO
            System.out.println("Ingrese el nuevo producto que desea agregar y su precio");
            //String n2 = read.next();
            //Integer n3 = read.nextInt();
           
            String key = read.next();
            Integer value = read.nextInt();
            Tienda.put(key, value);
            

            
            for (Map.Entry<String, Integer> aux5 : Tienda.entrySet()) {
            
                System.out.println(aux5);
            }
            System.out.println(" ");
            
            //ELIMINAR UN PRODUCTO
            System.out.println("Ingrese el producto que desea eliminar");
            String nuevop= read.next();
            
           for (Map.Entry<String, Integer> n5 : Tienda.entrySet()) {
            key = n5.getKey(); 
            value = n5.getValue();
            
            if(n5.getKey().equalsIgnoreCase(nuevop)){
            Tienda.remove(key);
            
            
            }
            
        }
           
           
           System.out.println(" ");
        
           for (Map.Entry<String, Integer> aux6 : Tienda.entrySet()) {
            
                System.out.println(aux6);
            } 
        
      
            
            
        
            
            
            
            
            
            
            
            
            
        }
      
      
      
      
      
       
    }
    


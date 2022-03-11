
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


public class Alumno {
    
private String nombre;
private ArrayList<Integer> listaNota;
private Scanner leer;

    
public Alumno() {
    this.listaNota = new ArrayList();
    this.leer= new Scanner(System.in).useDelimiter("\n");
           
  }

    public Alumno(String nombre, ArrayList<Integer> listaNota) {
        this.nombre = nombre;
        this.listaNota = listaNota;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getListaNota() {
        return listaNota; 
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaNota(Integer listaNota) {
        this.listaNota.add(listaNota);
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", listaNota=" + listaNota + '}';
    }
    
    public Double notaFinal() {
    Double contador =0.0;
       Iterator<Integer> it = listaNota.iterator();  
    while(it.hasNext()){
        
    contador = contador + it.next();
     
    }
    
    return (contador/ listaNota.size()); //RETORNO PROMEDIO
    
    }
    




    
    
    
    
}


package Identidades;


public class Paises implements Comparable<Paises> {
    
    
    
    private String paises;

    public Paises() {
    }

    public Paises(String paises) {
        this.paises = paises;
    }

    public void setPaises(String paises) {
        this.paises = paises;
    }

    public String getPaises() {
        return paises;
    }

    @Override
    public String toString() {
        return "Paises{" + "paises=" + paises + '}';
    }

    @Override
    public int compareTo(Paises o) {
       //return this.paises.compareTo(o.getPaises());
       return o.getPaises().compareTo(this.paises);
    }
    
    
    
    
}

/**
 * Clase que modela el comportamiento de un dado
 */

public class Dado{

    //Atributos 
    private int valor;

    
    //Métodos
    public Dado(){
    }

    public int lanzar(){
        return valor = 1 + (int)(Math.random()*6);
    }

    public int getValor(){
        return this.valor;
    }


}
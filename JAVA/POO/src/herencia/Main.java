
package herencia;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Gato gatito1 = new Gato("carnivoro","lacio",2,"felix");
        Gato gatito2 = new Gato();
        
        System.out.println("Este gatito es " + gatito1.getTipo()+" y tiene "+ gatito1.getEdad()+" años"+ "y se llama "+ gatito1.getNombre());
        gatito1.hacerRuido();
        gatito1.trepar();
        
        //arrays estaticos
        int [] a = {123,123,2,3,4};
        
        //librerias de arrays
        ArrayList <String> ListaPalabras = new  ArrayList<>();     
        ListaPalabras.add("Hola");
        ListaPalabras.add("Chau");
        ListaPalabras.add("NosVemos");
        //.size es igual a .length 
        for (int i = 0; i < ListaPalabras.size(); i++) {
            System.out.println(ListaPalabras.get(i));
        }
    }
        
    
}

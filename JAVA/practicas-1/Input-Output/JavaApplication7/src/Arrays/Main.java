package Arrays;

import javax.swing.*;

/*una matriz/arrays es una estructura de datos que contiene uan coleccion 
de valores del mismo tipo
Para almacenar valores que normalmente tienen alguna relacion entre si
sintaxis int[] mi_matriz=new int[10]; Despues del new "tipo de dato"
se pone la cantidad de elementos dentro de la matriz*/
public class Main {

 
    public static void main(String[] args) {
      
        //int[] matriz = new int[3];
        //int[] matriz2 ={15,25,45,35,78,54,54,21,98,32,87,65,98,234,68,51,68};//declaracion implicita
 
/*Recorremos el array utilizando un bucle for, donde "i" seria el numero de indice
 indicandole al bucle la cantidad de elementos que tiene el array*/
        //for (int i = 0; i <matriz2.length; i++) {
        //System.out.println("Valor del indice "+i+" = "+matriz2[i]);}
        
        //String [] paises= new String[8];
        
//        paises[0]="España";
//        paises[1]="Peru";
//        paises[2]="Argentina";
//        paises[3]="Venezuela";
//        paises[4]="Paraguay";
//        paises[5]="Uruguay";
//        paises[6]="Chile";
//        paises[7]="Francia";
//        
        
        /*for (int i = 0; i<paises.length; i++) {
            System.out.println("Pais " + (i+1)+ " " +paises[i]);
        }*/
        
        //crear el array de forma simplificada
         //String[] paises ={"España","Peru","Argentina","Venezuela","Paraguay","Uruguay","Chile","Francia"};
        
        //bucle for Each
       
       /* for(int i=0;i<8;i++){
            paises[i]=JOptionPane.showInputDialog("Introduce pais " +(i+1) );
                            

        }
        for(String element:paises){
            System.out.println("Paises: "+ element);
        }*/
        //crear un array con numeros random
       int[] matriz_aleatorio=new int [150];
        for (int i = 0; i < matriz_aleatorio.length; i++) {
            matriz_aleatorio[i]=(int)Math.round(Math.random()*100);
            
        }
       for(int numeros:matriz_aleatorio){
           System.out.print(numeros + " ");
       }
       
       
      }
   }
    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;


public class JavaApplication1 {

    
    public static void main(String[] args) {
        
        //TIPOS DE DATOS2
        
        /*
        int - entero
        float - numero decimal
        double -decimal grande
        long - entero grande
        boolean 
        String - cadena de caracteres
        char - caracter
        short - emtero corto
        byte
         */
        int numero = 3;
        int numero2=5;
        int numero3 = 10; 
        int suma = numero * numero2;
        boolean Esverdadero=true;
        float decimal=(float) 2.6;
        char ñetra = 'a';
        String palabra = "perro";
        
        //OPERADORES ARIMETICOS
        /*
        
        + suma 
        - resta
        / division
        * multiplicacion
        == igualdad
        != es distinto
        <= >=
        
        */
        
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
       
        int numeroA,numeroB;
        System.out.println("Ingrese un numero");
        numeroA= sc.nextInt();
        
        System.out.println("Ingrese otro numero");
        numeroB= sc.nextInt();
        
        int resultado = numeroA + numeroB;
        System.out.println("El resultado es: "+ resultado);
        System.out.println("Digite alguna cadena de caracteres");
        String palabrotas = sc2.nextLine();
        
         System.out.println(palabrotas);
        
        
        
    }
    
}

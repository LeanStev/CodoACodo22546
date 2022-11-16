
package varibales;

/*String no es un tipo primitivo(int,double), es una clase*/
public class ClaseString {
    public static void main(String[] args) {
/*Al crear un String la variable "mi_nombre" se convierte en un tipo de objeto,
"mi_nombre" es una istencia de la clase String y tambien es un ejemplar de la clase String
instanciar y ejemplar es lo mismo*/
      //String mi_nombre = "leandro";
      //System.out.println(mi_nombre);
/*La clase String tiene metodos al igual que la clase Math que nos permite
manipular una cadena de caracteres*/   

/*METODO length()- Devuelve la longitud de un string*/
      //String mi_nombre = "JuanAnastacioDeLaRural";
      //System.out.println("Mi nombre tiene " + mi_nombre.length()+" caracteres");
        
/*METODO charAt(n)- Devuelve la posicion de un caracter dentro de un string--
 (Se empieza a contar desde 0)*/
      //String mi_nombre2 = "JuanAnastacioDeLaRural";
      //int ultima_letra=mi_nombre2.length();
      //System.out.println("La primera letras de mi nombre es: " + mi_nombre2.charAt(ultima_letra-1));
      //System.out.println(mi_nombre2.charAt(1));
      //System.out.println(mi_nombre2.charAt(3));
      //System.out.println(mi_nombre2.charAt(4));
      //System.out.println(mi_nombre2.charAt(5));
      //System.out.println(mi_nombre2.charAt(6));
      
/*METODO subsring(X,Y) - Devuelve una subcadena  dentro de la cadena,
siendo X el caracter a partir del cual se extrae e Y el n° de caracteres que se quieren extraer */

      //String mi_nombre2 = "leandro";
      //System.out.println(mi_nombre2.substring(2,5));
  
 /*METODO equals(cadena)- Devuelve true si dos cadenas que se comparan son iguales 
    o false si no lo son. Distingue mayusculas y minusculas*/
        //String alumno1,alumno2;
        //alumno1="Leandro";
        //alumno2="leandro";
        
        //System.out.println(alumno1.equals(alumno2));
 /*METODO equalsIgnoreCase(cadena)- igual que el anterior pero sin tener en cuenta
 mayusculas y minusculas*/
       //String alumno1,alumno2;
       //alumno1="Leandro";
       //alumno2="leandro";
        
       //System.out.println(alumno1.equalsIgnoreCase(alumno2));
    }
    
}

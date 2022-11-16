
package varibales;
/*PRACTICAS CON LA CLASE MATH*/
public class ClaseMath {
 
    public static void main(String[] args) {
        
 /*MATH.SQRT - devuelve una varible de tipo double*/
        // double raiz = Math.sqrt(9);

  /*-------------------*/      
 /*MATH.ROUND - devuleve una variable de tipo long*/      
 /*Hay que poner un sufijo F para las variables de tipo float*/
        //float num1= 5.85F;
        //double num1= 5.85;
        
/*Como no podemos transformar una variable de tipo Long
 a una variable de tipo int debemos hacer una "refundicion"
 que conciste en dicrle que el resultado se convierta en 
 uno de tipo int!!!*/
        //int resultado=(int)Math.round(num1);

  /*-------------------*/      
 /*MATH.POW - devuelve un numero elevado a una potencia*/
/*El metodo pow recibe dos parametros el numero a elevar y su exponente que deben ser de tipo double*/
          double base =5;
          double exponente=3;
          int resultado=(int)Math.pow(base, exponente);

        System.out.println("El resultado de "+base+" elevado a "+exponente+" da como resultado "+resultado);
    }
    
}
 
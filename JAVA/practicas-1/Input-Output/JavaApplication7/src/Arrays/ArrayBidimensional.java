
package Arrays;
/*ARRAY BIDIMENSIONAL*/
public class ArrayBidimensional {
    public static void main(String[] args) {
        
        int [][] matrix=new int[4][5];
        
        matrix[0][0]=15;
        matrix[0][1]=54;
        matrix[0][2]=54;
        matrix[0][3]=68;
        matrix[0][4]=78;
        
        matrix[1][0]=47;
        matrix[1][1]=89;
        matrix[1][2]=68;
        matrix[1][3]=24;
        matrix[1][4]=67;
        
        matrix[2][0]=24;
        matrix[2][1]=75;
        matrix[2][2]=57;
        matrix[2][3]=68;
        matrix[2][4]=37;
        
        matrix[3][0]=14;
        matrix[3][1]=17;
        matrix[3][2]=19;
        matrix[3][3]=20;
        matrix[3][4]=68; 
        
        /*BUCLES FOR PARA RECORRER EL ARRAY BIDIMENSIONAL*/
        //en el primer for aclaramos que recorra la primera dimension del array(4)      
        for (int i = 0; i <4; i++) {
            //se pone 5 al segundo array para que recorra la segunda dimension
            System.out.println();
            for (int j = 0; j <5; j++) {
                System.out.print(matrix[i][j]+" ");
                
            }
            
        }
 /*ACLARACION: el codigo ejecuta el primer bucle for con la variable i en 0
 , ingresa al segundo ciclo for y va aumentando el indice de J [0][0]
 hasta que este llegue a 5(como le indicamos,[0][4]) finaliza el segundo bucle
como el primer bucle aun no finalizo, el mismo incrementa el valor de i en 1,
 de esta forma vuelve a a recorrer el segundo bucle que seria J hasta llegar a 5 (en este segundo recorrido seria [1][0]) y asi esta finalizar todos los bucles */
    }
}

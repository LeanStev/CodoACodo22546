
package com.mycompany.ejercicion_en_clase;


public class Main {

   /*Debemos entregar un trabajo para una distribuidora de productos
    por lo que vamos a generar un programa que genere diferentes tipos de operaciones.
    Tenemos 2 tipos de productos: Perecederos y No Perecederos.
    
    1- Crear una clase Producto que cuente con los siguentes atributos: String nombre,
    double precio, no olvidarse de agregar métodos getters y setters y redefinir el método 
    toString(). Crear en esta clase el método calcular() el cual va a recibir por parametro
    de tipo entero llamado cantidadDeProductos; este metodo tiene que multiplicar el metodo 
    por la cantidad de productos recibidos.
    
    2-Crear la clase Perecedero que tiene un atributo diasPorCaducar de tipo entero y al igual
    que producto tiene getters, setters, constructor y metodo toString. Esta clase debe ser subclase
    de producto y sobrescribir el metodo calcular(), el cual tiene que hacer lo mismo que la clase Producto
    y adicionalmente reduce el precio segun los diasPorCaducar:
        .- Si le resta un dia para caducar, se reducirá 4 veces el precio final.
        .- Si le restan dos dias para caducar, se reducirá 3 veces el precio final.
        .- Si le restan tres dias para caducar, se reducirá a la mitad el precio final.
    
    3-Crear la clase NoPerecedero, la misma va a tener un atributo llamado "tipo", que es un String
    (crear todos los métodos). En esta clase el método calcular hará lo mismo que en Producto.
    
    4-Crear un array en Main de productos e imprimir el precio total al vender 5 productos de cada tipo.*/
       
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

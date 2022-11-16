        
package poo;


public class Persona {
    //Definimos los atributos de nuestra persona
    //a los atributos tambien se los llama variables de instancia
    
    private String nombre;
    private String apellido;
    private int edad;
    private String origen;
    private String sexo;
    private boolean tieneMascota;
    //Definimos un constructor con la palabra public y el nombre de la clase
    public Persona(String nombre,String apellido,int edad,
            String origen, String sexo,boolean tieneMascota){
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.origen = origen;
            this.sexo = sexo;
            this.tieneMascota= tieneMascota;
            //El this nos permite dentro del construcyor o cualquier metodo hacer referencia a una variable de instancia en vez de a lo que recibo por parametro
            
    }
    public Persona(String nombre, String apellido){
           this.nombre=nombre;
           this.apellido=apellido; 
    }
    public Persona(){};
    
    //Los metodos de una clase tambien son conocidos como metodos de instancia
    public void caminar(){
        System.out.println("La persona "+ nombre + " esta caminando");
        
        
        
    }
    
    public void presentacion(){//Metodo de instancia puro, xq requiere de una variable para ejecutarse
        System.out.println("Me llamo "+ nombre + " Tengo "+edad+" soy de "+origen + ", mi sexo es "+sexo);
        if(tieneMascota!=true){
            System.out.println( nombre +" no puede pasar si no tiene animal");
        }
        if(!"Argentina".equals(origen)){
            System.out.println("Debdido a que no eres de -Argentina- Necesitamos tu pasaporte para continuar");
        }
        if(edad<18){
            System.out.println(nombre+" eres menor, entonces no puedes continuar");
        }
    }
    
}

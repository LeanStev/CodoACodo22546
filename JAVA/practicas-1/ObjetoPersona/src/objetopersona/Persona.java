
package objetopersona;


public class Persona {
    //Definimos los atributos del objeto persona
    private String nombre;
    private String edad;
    private int dni;
    private double peso;
    private double altura;
    //Creamos los constructors correspondientes
    public Persona(String nombre,String edad,int dni,double peso,double altura)
        {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
        
            }
    public Persona(String nombre,String edad,int dni)
        {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
            }
    public Persona(){};
    
    public int calcularIMC(){
        double result;
        result= peso/(Math.pow(altura,2));
        
        if(result < 20){
            return -1;
        }
        else if(result>=20 && result <=25){
            return 0;
        } return 1;
    }
    
    public boolean esMayorDeEdad(){
     int edadEntero = Integer.parseInt(edad);
    return edadEntero >= 18;
     }
    //Con el metodo toString mostramos los atributos que pose el objeto
    @Override
    public String toString(){
       return "Nombre: "+ nombre+"\n"+
               "Edad: "+edad + "\n"+
               "DNI: "+ dni+ "\n"+
               "Peso  "+peso+"\n"+
               "Altura "+altura+" mts"; 
    }
}
   
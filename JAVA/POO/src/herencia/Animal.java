package herencia;

 
public class Animal {
    //atributos son privados
    private String tipo;
    private String pelaje;
    private int edad;
    private String nombre;

    public Animal(String tipo, String pelaje, int edad, String nombre) {
        this.tipo = tipo;
        this.pelaje = pelaje;
        this.edad = edad;
        this.nombre = nombre;
    }
    
    public Animal(){};
    
    
    //metodos son publicos
    public void hacerRuido(){
        System.out.println("El aimal hace ruido!");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}

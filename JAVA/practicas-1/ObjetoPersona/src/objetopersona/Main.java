
package objetopersona;


public class Main {

    
    public static void main(String[] args) {
      
        Persona p1 = new Persona(
        "Leandro",
        "25",
        40254456,
        80,
        1.73
        );
      
      
        Persona p2 = new Persona(
      "juanita",
      "50",
      56435786
      );
    
     
        Persona p3 = new Persona(
     "juan",
     "17",
     25486987,
     60,
     1.70
     );
     
     
        Persona p4 = new Persona();
     
     System.out.println("El codigo se ejecuta pero no se muestran los metodos");
        System.out.println(p1.calcularIMC());
        System.out.println(p1.esMayorDeEdad());
        System.out.println("  ");
        System.out.println(p3.calcularIMC());
        System.out.println(p3.esMayorDeEdad());
        System.out.println("  ");
        System.out.println(p1.toString());
     
     
    }
    
}

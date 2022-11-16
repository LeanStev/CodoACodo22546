
package poo;

  //PARA AÑADIR UNA CLASE OBJETO A JAVA           
  //TENEMOS QUE CREAR APARTE UNA CLASE PERSONA.JAVA
public class Main {

  
    public static void main(String[] args) {
 
        Persona p1 = new Persona
        (
                "julian",
                "lopez",
                30,
                "Argentina",
                "Masculino",
                true
        );
        
        Persona p2 = new Persona
        (
                "Raul",
                "ramirez",
                25,
                "Argentina",
                "Masculino",
                false
        );
        
        Persona p3 = new Persona
        (
                "Sheila",
                "Stevens",
                31,
                "Suiza",
                "Femenino",
                true
        );
         Persona p4 = new Persona
        (
                "leandro",
                "Stevens",
                15,
                "Argentina",
                "Masculino",
                true
        );
      
        
        p4.caminar();
        p4.presentacion();
     
       
    }
    
}

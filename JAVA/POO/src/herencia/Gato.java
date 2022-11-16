package herencia;


public class Gato extends Animal{
    private String bigotes;
   
    public Gato (String tipo,String pelaje,int edad, String nombre){
        super(tipo,pelaje,edad,nombre);
    };
    public Gato (){};
    
    @Override
    public void hacerRuido(){   
        System.out.println("El gatito hace miau");
    }
    public void trepar(){  
        System.out.println("El gatito puede trepar");
    }
    
    
    public String getBigotes() {
        return bigotes;
    };

    public void setBigotes(String bigotes) {
        this.bigotes = bigotes;
    };

    
    
}

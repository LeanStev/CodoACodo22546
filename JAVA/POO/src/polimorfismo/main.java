 
package polimorfismo;


public class main {
    
    public static void main(String[] args) {
        
        double x = 12.2;
        int a = 12;
        Duplicador d = new Duplicador();
        //polimorfismo por coversion
        System.out.println(d.duplicar(x));
        System.out.println(d.duplicar(a));
    }
}
  
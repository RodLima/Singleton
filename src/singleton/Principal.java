package singleton;

/**
 *
 * @author rodrigo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Singleton c1 = Singleton.getInstance();
        c1.setTexto("Singleton");
        
        
        Singleton c2 = Singleton.getInstance();
        System.out.println(c2.getTexto());
        
        c2.setTexto("Singleton só existe um objeto");
        System.out.println(c1.getTexto());
    }
}

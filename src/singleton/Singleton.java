package singleton;

/**
 *
 * @author rodrigo
 */
public class Singleton {

    private static Singleton instance = null;
    private String texto;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}

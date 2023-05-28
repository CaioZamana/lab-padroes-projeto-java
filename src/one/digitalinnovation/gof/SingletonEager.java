package one.digitalinnovation.gof;

/**
 * Singleton "Apressado"
 * @autor Caio B
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }
    public static SingletonEager getInstancia(){

        return instancia;
    }
}

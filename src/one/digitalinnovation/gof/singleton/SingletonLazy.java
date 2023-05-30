package one.digitalinnovation.gof.singleton;

/**
 * Singleton "pregyicoso"
 * @autor Caio B
 */

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }
    public static SingletonLazy getInstancia(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}

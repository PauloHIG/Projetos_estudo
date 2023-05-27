package classes.singleton;
/**
 * Singleton apressado, instanciamos a clásse logo apos ela ser
 * inicializada
 */
public class SingletonApressado extends Singleton{
    private SingletonApressado(){}
    private static SingletonApressado singletonApressado = new SingletonApressado();
    public static SingletonApressado getInstance(){return singletonApressado;}
}

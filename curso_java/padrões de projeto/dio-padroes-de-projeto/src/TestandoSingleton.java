import classes.singleton.Singleton;
import classes.singleton.SingletonApressado;
import classes.singleton.SingletonLazy;
import classes.singleton.SingletonLazyHolder;

public class TestandoSingleton {
    public static void main(String[] args) throws Exception {
        System.out.println("Singleton Lazy");
        Singleton classe = SingletonLazy.getInstance();
        System.out.println(classe);
        classe = SingletonLazy.getInstance2();
        System.out.println(classe);
        
        System.out.println("Singleton apressado");
        classe = SingletonApressado.getInstance();
        System.out.println(classe);
        classe = SingletonApressado.getInstance();
        System.out.println(classe);
        
        System.out.println("Singleton Lazy Holder");
        classe = SingletonLazyHolder.getInstance();
        System.out.println(classe);
        classe = SingletonLazyHolder.getInstance();
        System.out.println(classe);

        
    }
}

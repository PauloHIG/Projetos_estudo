package classes.singleton;

public class SingletonLazyHolder implements Singleton{
    private SingletonLazyHolder(){}
    
    private static class guardarInstancia{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    public static SingletonLazyHolder getInstance(){return guardarInstancia.instancia;}
}

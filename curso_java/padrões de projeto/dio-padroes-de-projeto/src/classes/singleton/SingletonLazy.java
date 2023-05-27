package classes.singleton;
/**
 * Aprendendo o padrão de prpjeto singleton,
 * uma forma de forçar a classe a ter apenas uma instancia
 * para isso, deixamos o construtor privado pois assim não será possível instanciar fora da classe
 * depois criamos um método getInstance que retorna a instancia que já existe e só cria
 * uma nova instancia se for a primeira vez que foi instanciado
 */
public class SingletonLazy implements Singleton{
    public String nome = "Larry";
    private static SingletonLazy singletonLazy;
    private SingletonLazy() {
    }
    public static SingletonLazy getInstance2(){
        return singletonLazy == null? singletonLazy = new SingletonLazy():singletonLazy;
    }

    public static SingletonLazy getInstance(){
        if(singletonLazy == null){
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}

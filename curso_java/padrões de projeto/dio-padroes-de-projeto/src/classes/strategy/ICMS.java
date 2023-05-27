package classes.strategy;

public class ICMS implements Imposto{
    Double valor;
    public ICMS(Double valor) {
        this.valor = valor;
    }

    @Override
    public double calcular(){
        return  valor * 0.10;
    }
}
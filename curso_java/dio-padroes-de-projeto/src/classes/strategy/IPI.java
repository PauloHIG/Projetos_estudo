package classes.strategy;

public class IPI implements Imposto{
    Double valor;
    public IPI(Double valor) {
        this.valor = valor;
    }
    @Override
    public double calcular(){
        return valor * 0.20;
    }
}

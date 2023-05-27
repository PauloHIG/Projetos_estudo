import classes.strategy.ICMS;
import classes.strategy.IPI;

public class TestandoCalculoImposto {
    public static void main(String[] args) {
        ICMS icms = new ICMS(100d);
        IPI ipi = new IPI(200d);
        System.out.println(icms.calcular());
        System.out.println(ipi.calcular());
    }
    
}

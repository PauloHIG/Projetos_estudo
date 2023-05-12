package dio.teste;
import dio.exercicios.CalculadoraSimples;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class ClasseTeste {
    @Test
    public void testeSoma(){
        assertEquals(3, CalculadoraSimples.somar(1,2));
    }
    @Test
    public void testeDivisão(){
        assertEquals(4, CalculadoraSimples.dividir(8, 2),0);
        for(int i = 1;i<10;i++){
            assertEquals("Conta errada",3, CalculadoraSimples.dividir(i*3, i),0);
        }
    }

}

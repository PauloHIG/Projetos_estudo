package dio.jav.exercicios;
/**
 * @author Paulo Henrique Ito
 * @since 22/04/2023
 */
public class CalculadoraSimples {
    //para treinar criação de métodos
    /**
     * @author Paulo H. Ito
     * @param a primeiro número
     * @param b segundo número
     * @return soma entre esses dois números
     */
    public static int somar(int a,int b) {
        return a+b;
    }
    /**
     * 
     * @param n1 o número que vai sofrer a subtração
     * @param n2 o número que vai subtrair
     * @return o resultado da operação
     */
    public static int subtrair(int n1,int n2){
        return n1-n2;
    }
    public static double multiplicar(int a, int b){
        return a*b;
    }
    public static double dividir(int dividendo, int divisor){
        return dividendo/divisor;
    }
    public static void main(String[] args) {
        //deixei essa instancia que eu fiz para nunca esquecer o que o static faz, tira a necessidade de instancia
        //CalculadoraSimples calculadora = new CalculadoraSimples();
        int soma = somar(1,1);
        System.out.println(soma);

        System.out.println(multiplicar(3, 3));
        System.out.println(dividir(6, 3));
    }
}

package dio.jav.exercicios;

public class CalculadoraSimples {
    //para treinar criação de métodos
    public static int somar(int a,int b) {
        return a+b;
    }
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
        int soma = CalculadoraSimples.somar(1,1);
        System.out.println(soma);

        System.out.println(CalculadoraSimples.multiplicar(3, 3));
        System.out.println(CalculadoraSimples.dividir(6, 3));
    }

}

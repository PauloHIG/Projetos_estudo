package dio.exercicios;

public class MediaClassica {
    public static void main(String[] args) {
        //consegui usar os métodos de outra classe, sem instanciar
        int somaNotas = CalculadoraSimples.somar(6, 3);
        double media = CalculadoraSimples.dividir(somaNotas, 2); 
        if(media>=6)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
    }
}
package dio.exercicios;
import java.util.Scanner;;
public class Tabuada {
    public static void exibirTabuada(int num){
        for(int i=1;i<=10;i++){
            System.out.println(""+num+" X "+i+" = "+(num*i)+"");
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero do qual quer saber a tabuada");
        int numero = entrada.nextInt();
        exibirTabuada(numero);
    }
}

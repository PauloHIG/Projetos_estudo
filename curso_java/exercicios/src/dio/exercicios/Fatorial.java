package dio.exercicios;

public class Fatorial {
    public static long calcularFatorial(long num){
        long resultado=1;
        int i;
        for(i=1;i<=num;i++){
            resultado = resultado * i;
        }
        return resultado;
    }
    public static void main(String[] args) {
        int i=0;
        //a partir do numero 20 eu já ultrapasso o limite do tipo long
        while(i <=21){
            System.out.println("O fatorial de "+i+" é "+calcularFatorial(i));
            i++;
        }
        
    }
}

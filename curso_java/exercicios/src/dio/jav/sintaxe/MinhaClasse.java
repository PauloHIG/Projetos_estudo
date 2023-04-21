package dio.jav.sintaxe;
public class MinhaClasse {
    //por convenção, as classes são nomeadas com letra maiuscula no inicio de cada palavra
    public static void main(String [] args){
        int numeroUm = 1;//usando a convenção camelCase para nomear uma variavel, diferente do python onde eu usava snake_case
        System.out.println(numeroUm*2);
        System.out.println("Sole mia");
        System.out.println(somar(4, 3));//Espera-se 7
    }
    public static int somar(int a,int b){
        //os métodos devem possuir um tipo de retorno na declaração, um verbo para nomea-lo e seus parametros
        return a+b;
    }
}   
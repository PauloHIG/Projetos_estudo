package dio.exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArcoIris {
    public static void main(String[] args) {
        Set<String> arcoIris = new HashSet<>();
        arcoIris.add("Vermelho");
        arcoIris.add("Laranja");
        arcoIris.add("Amarelo");
        arcoIris.add("Verde");
        arcoIris.add("Azul");
        arcoIris.add("Anil");
        arcoIris.add("Violeta");
        System.out.println("Exiba todas as cores uma abaixo da outra");
        for(String cor:arcoIris)System.out.println(cor);
        System.out.println("A quantidade de cores que o arco-íris tem ");
        System.out.println(arcoIris.size());

        System.out.println("Exiba as cores em ordem alfabética");
        System.out.println("Exiba as cores na ordem inversa da que foi informada");

        System.out.println("Exiba todas as cores que começam com a letra 'v' ");
        for(String cor:arcoIris){
            if(cor.startsWith("V"))System.out.println(cor);
        }
        
        System.out.println("Remova todas as cores que não começam com a letra 'v'");
        Iterator<String> iteracao = arcoIris.iterator();
        while(iteracao.hasNext()){
            String cor = iteracao.next();
            if (!cor.startsWith("V"))iteracao.remove();;
        }
        System.out.println(arcoIris);
        
        //Limpe o conjunto e Confira se o conjunto está
        arcoIris.clear();
        System.out.println(arcoIris.isEmpty());//Espera-se true
    }
}

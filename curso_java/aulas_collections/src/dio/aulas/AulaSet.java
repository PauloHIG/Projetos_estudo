package dio.aulas;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class AulaSet {
    public static void main(String[] args) {
        //criando uma lista com notas de alunos
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,0d,3.6));
        System.out.println(notas);
        //nota: por não ter indexação, o set exibe os elementos de forma aleatoria
        //a não ser que seja linked hash set
        //execute o programa varias vezes e verá

        System.out.println("Confira se a nota 5 está no conjunto");
        System.out.println(notas.contains(5d));
        System.out.println("Removendo a nota 0");
        notas.remove(0.0);
        System.out.println("Menor nota: "+ Collections.min(notas));
        System.out.println("Maior nota: "+ Collections.max(notas));
        
        System.out.println("Soma das notas");
        Double soma = 0d;
        for(Double nota:notas){
            soma+=nota;
        }
        System.out.println(soma);
        System.out.println("Média das notas: "+(soma/notas.size()));
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 na lista");
        Iterator<Double> iteracao = notas.iterator();
        while(iteracao.hasNext()){
            Double nota = iteracao.next();
            if (nota < 7d) iteracao.remove();
        }
        System.out.println(notas);
        System.out.println("Notas em ordem crescente(Use TreeSet)");
        Set<Double> notaOrdenada = new TreeSet<>(notas);// dê uma BOA observada na sintaxe, um outro set está sendo criado
        System.out.println(notaOrdenada);

        System.out.println("Limpe o conjunto de notas");
        notas.clear();
        System.out.println(notas);
        System.out.println(notaOrdenada);
    }
}

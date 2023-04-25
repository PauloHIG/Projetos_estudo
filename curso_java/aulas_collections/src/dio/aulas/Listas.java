package dio.aulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class Listas {
    /**
     * Método criado para simular a função sum() em python,
     * o obstaculo aqui é que não consigo usar a sobrecarga para que o método 
     * receba qualquer tipo de lista, por agora só consigo somar lista do tipo Double,
     * o que funciona apenas nessa classe para testes
     * @param lista lista do tipo double
     * @return soma dos elementos da lista
     */
    public static double sum(List<Double> lista){
        Double soma=0d ;
        for(Double elemento:lista){
            soma+=elemento;
        }
        return soma;
    }
   
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione 7 notas");
        List<Double> notas = new ArrayList<Double>();//jdk 5
        notas.add(10.0);
        notas.add(9.0);
        notas.add(5.0);
        notas.add(4.0);
        notas.add(7.0);
        notas.add(6.6);
        notas.add(5.5);
        System.out.println(notas);

        System.out.println(notas.indexOf(6.6));//espera-se 5

        System.out.println("Adicione a nota 5 na posição 4");
        notas.add(4, 5.0);
        System.out.println(notas);
        //obs: ele adicionou um elemento ao indice 4 e não substituiu o que estava lá antes

        System.out.println("Substitua a nota 5 pela nota 6");
        notas.set(notas.indexOf(5.0), 6d);
        System.out.println(notas);
        
        System.out.println("Confira se a nota 5 está na lista");
        System.out.println(notas.contains(5d));
        //para a felicidade do pythonista, isso equivale a elemento in lista

        System.out.println("Exibir uma nota em cada linha");
        for(Double nota:notas) System.out.println(""+(notas.indexOf(nota)+1)+"ª nota: "+nota);
        //para a felicidade do pythonista, isso equivale a for nota in notas

        System.out.println("Exiba a 3ª nota adicionada");
        System.out.println(notas.get(2));
        //anotação: get() recebe indice e retorna valor .indexOF() recebe valor e retorna o indice do primeiro valor correspondente

        System.out.println("Imprima a maior e a menor nota");
        System.out.println("Maior nota: "+Collections.max(notas));
        System.out.println("Menor nota: "+Collections.min(notas));
        //observe a necessidade de importar a classe Collections

        System.out.println("Somando todos os elementos de uma lista");
        Iterator <Double> iterator = notas.iterator();
        Double soma =0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println(soma);

        System.out.println("Já que não tem no java, eu mesmo faço");
        System.out.println(sum(notas));

        System.out.println("Calcular a média do aluno");
        Double media = sum(notas)/notas.size();
        System.out.println("A média do aluno é: "+media);
        //para a felicidade do pythonista notas.size() equivale a len(notas) no python

    }
}
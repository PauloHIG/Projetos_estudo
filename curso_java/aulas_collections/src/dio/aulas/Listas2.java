package dio.aulas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Listas2 {
    public static void main(String[] args) {
        List<Double> lista = new ArrayList<Double>();
        lista.add(7.1);
        lista.add(4d);
        lista.add(3d);
        lista.add(7d);
        lista.add(10d);
        lista.add(8d);
        System.out.println(Listas.sum(lista));
        System.out.println("Remova o valor 3");
        lista.remove(3d);
        //MUITA ATENÇÃO COM ESSE MÉTODO, pois o mesmo pode remover por valor ou por indice
        //como o indice é sempre inteiro, é bom deixar claro que o item que você quer remover não é inteiro
        System.out.println(lista);

        System.out.println("Remova numeros menores que 7");
        //Aqui um exemplo de como se usa o iterator
        Iterator<Double> iteracao =  lista.iterator();
        while(iteracao.hasNext()){
            Double numero = iteracao.next(); 
            if(numero<7) iteracao.remove();
            //obs, note que o iterator permite remover itens DURANTE uma iteração
        }
        System.out.println(lista);
    }
}

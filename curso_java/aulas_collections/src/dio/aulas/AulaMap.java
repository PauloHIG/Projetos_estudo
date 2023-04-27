package dio.aulas;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AulaMap {
    public static Double sum(Collection<Double> lista){
        Double soma=0d ;
        for(Double elemento:lista){
            soma+=elemento;
        }
        return soma;
    }
    public static void main(String[] args) {
        //para o pythonista, equivale ao dicionário
        Map<String,Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 16.2);
            put("Mobi", 16.2);
            put("hb20", 13.2);
            put("Kwid", 15.2);
        }};

        System.out.println(carrosPopulares);
        System.out.println("Substitua o consumo do Gol por 15,2 km/L");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);
        System.out.println("Confira se o modelo tucson está no map: "+ carrosPopulares.containsKey("Tucson"));
        System.out.println("Exiba o consumo do uno: "+carrosPopulares.get("Uno"));

        System.out.println("Exiba os modelos (ou seja, as chaves)");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        //note que como as chaves no map não podem se repetir, nós as colocamos em um set, uma vez que em um conjunto um valor não pode se repetir

        System.out.println("Exiba os consumos (ou seja, os valores)");
        Collection<Double> consumos = carrosPopulares.values();//reaproveitarei algumas vezes
        System.out.println(consumos);

        System.out.println("Exiba o maior consumo");
        System.out.println(Collections.max(consumos));
        System.out.println("Exiba o(s) carro(s) mais eficiente");        
        for(String carro:carrosPopulares.keySet()){
            if (carrosPopulares.get(carro).equals(Collections.max(consumos))) System.out.println(carro);
        }//mais uma vez, use coisa1.equals(coisa2) ao invés de coisa1 == coisa2

        System.out.println("Exiba o(s) carro(s) menos eficiente e seu consumo");
        for(String carro:carrosPopulares.keySet()){
            if (carrosPopulares.get(carro).equals(Collections.min(consumos)))
                System.out.println("Modelo: "+carro+" consumo: "+carrosPopulares.get(carro));
        }
        
        System.out.println("Exiba a soma dos consumos ");
        System.out.println(sum(consumos));
    }
}

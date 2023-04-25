package dio.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/
public class Temperaturas {
    public static Double sum(List<Double> lista){
        Double soma = 0.0;
        for(Double elemento:lista) soma+=elemento;
        return soma;
    }
    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList<Double>(Arrays.asList(24d,32d,24.4,28.2,18.9,27.0));
        List<String> meses = new ArrayList<String>(Arrays.asList("Janeiro","Fevereiro","Março","Abril","Junho","Julho"));
       

        Double temperaturaMedia = sum(temperaturas)/temperaturas.size();
        System.out.println(temperaturas);

        System.out.println("Meses com temperatura acima da media");
        int i=0;
        for(Double temperatura:temperaturas){
            if(temperatura>temperaturaMedia){
                System.out.println(""+meses.get(i)+": "+temperatura);
            }
            i+=1;
        } 
    }
}
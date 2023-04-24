package dio.aulas;

import javax.sound.midi.Soundbank;
import javax.sound.sampled.SourceDataLine;

public class Sobrecarga {
    //um exemplo prático de aplicação de sobregarga

   
    public static double calcularArea(double lado){
        return lado*lado;
    }
   
    public static double calcularArea(double lado1, double lado2){
        return lado1*lado2;
    }

    public static void main(String[] args) {
        System.out.println(calcularArea(7));

        //a lição de hoje é: nome do método não é o mesmo que assinatura, pois a assinatura consiste no nome+parametros
        //assim, os dois métodos nesta classe tem o mesmo nome, mas assinaturas diferentes
        //e o python não suporta sobrecarga
    }
}

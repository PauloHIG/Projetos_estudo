package dio.exercicios;
/*
 * Utilizando listas, faça um programa que faça 5 perguntas para uma
pessoa sobre um crime. As perguntas são:

"Telefonou para a vítima?"

"Esteve no local do crime?"

"Mora perto da vítima?"

"Devia para a vítima?"

"Já trabalhou com a vítima?"

Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassina". Caso contrário, ela será classificado como "Inocente".
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Crime {
    
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<String>();
        Scanner ouvido = new Scanner(System.in);
        System.out.println("Telefonou para a vítima?");
        respostas.add(ouvido.next());
        System.out.println("Esteve no local do crime?");
        respostas.add(ouvido.next());
        System.out.println("Mora perto da vítima?");
        respostas.add(ouvido.next());
        System.out.println("Devia para a vítima?");
        respostas.add(ouvido.next());
        System.out.println("Já trabalhou com a vítima?");
        respostas.add(ouvido.next());
        int cont =0;
        System.out.println(respostas);
        for(String resposta:respostas){
            if(resposta.equals("s")) cont+=1;
        }

        if (cont ==2)System.out.println("Suspeita");
        else if (cont>2 && cont<=4)System.out.println("Cúmplice");
        else if(cont==5)System.out.println("Assassina");
        else System.out.println("Inocente");
    }

}

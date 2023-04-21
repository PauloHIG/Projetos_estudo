package dio.jav.exercicios;

import java.util.Scanner;
public class TrafficLight {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um numero de 1 a 3");
    int numero = sc.nextInt();
    if(numero == 1) System.out.println("Pare! O sinal está vermelho.");
    if(numero == 2) System.out.println("Atenção! O sinal está amarelo.");
    if(numero == 3) System.out.println("Siga em frente! O sinal está verde.");
    else System.out.println("Valor inválido! Digite 1, 2 ou 3 para indicar a cor do semáforo.");
    
  }
}
package dio.jav.exercicios;


public class TrafficLight {
  
  public static void main(String[] args) {
    
    //Note que está dando erro, porque precisa de uma validação de input 
    //para impedir que o usuario trave o programa ao inserir um valor inválido
    
    int numero = 1;
    if(numero == 1) System.out.println("Pare! O sinal está vermelho.");
    if(numero == 2) System.out.println("Atenção! O sinal está amarelo.");
    if(numero == 3) System.out.println("Siga em frente! O sinal está verde.");
    else System.out.println("Valor inválido! Digite 1, 2 ou 3 para indicar a cor do semáforo.");
    
  }
}
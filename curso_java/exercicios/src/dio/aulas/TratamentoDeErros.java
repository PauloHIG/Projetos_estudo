package dio.aulas;

import java.util.Scanner;

public class TratamentoDeErros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        while(true){
            System.out.println("Digite um número");
            String n1 = s.nextLine();
            System.out.println("Digite outro para dividi-lo");
            String n2 = s.nextLine();
        
            try {
                System.out.println(Integer.parseInt(n1)/Integer.parseInt(n2));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Não consigo converter palavras em números");
            } catch(ArithmeticException a) {
                System.out.println("Divisão por zero");
            }
        }
    }
}

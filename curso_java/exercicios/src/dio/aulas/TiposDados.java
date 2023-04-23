package dio.aulas;


public class TiposDados {
    public static void main(String[] args) {
        //resumindo, a variavel é um endereço de memoria
        //para declarar uma var em java é necessario tipo nome = valor
        //caso ela seja declarada sem valor, no caso dos numericos, terá por padrão um valor 0
        byte idade = 111;
        short ano  = 2021;
        int cep = 10495000; //0 á esquerda é a causa do erro, é necessário uma atenção especial a isso pois alguns CEPs e CPFs brasileiros podem começar com 0
        long cpf =65432198723L;// precisa colocar o L para o java entender que é long e não int
        double salarioMerreca=1000.00;
        System.out.println(idade+ano+cep+cpf+salarioMerreca);
        
        //constantes, variaveis cujo valor não é alterado no código
        //por convenção, são nomeadas com UPPERCASE e tem o final antes do tipo
        final double PI = 3.1415;
        System.out.println((PI*4)*(PI*4));

        //para mostrar o operador ! que inverte um valor booleano
        boolean bola = false;
        System.out.println(!bola);// espera-se true 
    }
}

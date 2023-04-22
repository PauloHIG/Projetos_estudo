package dio.jav.sintaxe;

public class TiposDados {
    public static void main(String[] args) {
        byte idade = 111;
        short ano  = 2021;
        int cep = 10495000; //0 á esquerda é a causa do erro, é necessário uma atenção especial a isso pois alguns CEPs e CPFs brasileiros podem começar com 0
        long cpf =65432198723L;// precisa colocar o L para o java entender que é long e não int
        double salarioMerreca=1000.00;
        System.out.println(idade+ano+cep+cpf+salarioMerreca);
    }
}

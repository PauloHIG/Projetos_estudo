package dio.jav.sintaxe;

public class Relacionais {
    public static void main(String[] args) {
        String nomeUm = "Paulo";
        String nomeDois = new String("Paulo");

        System.out.println("veja o que acontece quando uma string está em outro objeto");
        System.out.println(nomeUm == nomeDois);

        System.out.println("e a maneira correta de fazer comparações nesse caso");
        System.out.println(nomeDois.equals(nomeUm));
        //a lição de hoje é: compare objetos com o método .equals()

        System.out.println("Comparações booleanas");
        System.out.println("esse && equivale ao 'e'(and)");
        System.out.println(true && true);
        System.out.println("Esse || equivale ao 'ou'(or) ");
        System.out.println(false || true);
        //a lição de hoje é, Java não é igual ao python e pare de chorar
    }
}
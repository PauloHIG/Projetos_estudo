package dio.jav.sintaxe;

public class Concatenacao {
    public static void main(String[] args) {
        System.out.println('?');
        String stringue = " string ";
        System.out.println(1+1+1+stringue+(1+1)+" fui concatenado"+1+1);
        //observe que os números são somados antes da string e depois da primeira string são concatenados
        //portanto, se quisermos adicionar operações aritimeticas em uma concatenação, devemos coloca-la em evidência, usando parentesis
    }
}
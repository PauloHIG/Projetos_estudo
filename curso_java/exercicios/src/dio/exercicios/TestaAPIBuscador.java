package dio.exercicios;
public class TestaAPIBuscador {
    //https://arthur-almeida.medium.com/consumindo-uma-api-de-maneira-simples-com-java-2a386010e4b9
    public static void main(String[] args) throws Exception {
        Endereco minhaCasa = APIdoServicoDeCep.buscaEnderecoPeloCep("04950140");
        System.out.println(minhaCasa);
    }
}

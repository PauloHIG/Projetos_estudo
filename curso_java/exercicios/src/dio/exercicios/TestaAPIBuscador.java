package dio.exercicios;
public class TestaAPIBuscador {
    public static void main(String[] args) throws Exception {
        Endereco minhaCasa = APIdoServicoDeCep.buscaEnderecoPeloCep("04950140");
        System.out.println(minhaCasa);
    }
}

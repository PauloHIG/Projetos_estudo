package dio.exercicios;
public class TestaAPIBuscador {
    public static void main(String[] args) {
        try {
            Endereco minhaCasa = APIdoServicoDeCep.buscaEnderecoPeloCep("04950000");
            System.out.println(minhaCasa);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}

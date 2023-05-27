package classes.facade;
/* A idéia é reduzir a complexidade de integrações entre sistemas
com um certo nível de abstração
*/
public class TesteFacade {
    public static void main(String[] args) {
        Cliente cliente = criaCliente("Paulo","00000-00");
        System.out.println(cliente);
    }
    static Cliente criaCliente(String nome,String cep){
        return new Cliente(nome,cep,CepConsumer.cidade,CepConsumer.estado);
    }
}

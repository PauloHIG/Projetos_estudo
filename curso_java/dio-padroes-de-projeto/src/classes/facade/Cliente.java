package classes.facade;

public class Cliente {
    String nome;
    String cep;
    String cidade;
    String estado;
    public Cliente(String nome, String cep, String cidade, String estado) {
        this.nome = nome;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }
    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", cep=" + cep + ", cidade=" + cidade + ", estado=" + estado + "]";
    }

}

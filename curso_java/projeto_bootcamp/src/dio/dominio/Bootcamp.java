package dio.dominio;

import java.time.LocalDate;
import java.util.List;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate DATA_INICIAL = LocalDate.now();
    private final LocalDate DATA_FINAL = DATA_INICIAL.plusDays(45);
    private List<Dev> inscritos;
    private List<Conteudo> conteudos;  

    public String getDescricao() {
        return descricao;
    }
    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }


    @Override
    public String toString() {
        String descricaoGeral;
        descricaoGeral = "=========="+nome+"==========\n"
        +descricao+"\nTermine o bootcamp até: "+DATA_FINAL;
        return descricaoGeral;
    }

    public String getNome() {
        return nome;
    }
    public LocalDate getDATA_INICIAL() {
        return DATA_INICIAL;
    }
    public LocalDate getDATA_FINAL() {
        return DATA_FINAL;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public List<Dev> getInscritos() {
        return inscritos;
    }
    public List<Conteudo> getConteudos() {
        return conteudos;
    }
    
}

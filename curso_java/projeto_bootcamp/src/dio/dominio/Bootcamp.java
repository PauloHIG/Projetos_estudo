package dio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate DATA_INICIAL = LocalDate.now();
    private final LocalDate DATA_FINAL = DATA_INICIAL.plusDays(45);
    private List<Dev> devsInscritos = new ArrayList<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();  

    
    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    public void receveDev(Dev dev){
        //TODO Garantir que somente o Dev possa decidir se matricular
        //pois atualmente o bootcamp pode matricular um dev nele, o que eu não quero
        devsInscritos.add(dev);
        for(Conteudo conteudo:conteudos){
            dev.matricularEmConteudo(conteudo);
        }
    }
    public void exibirDevsInscritos(){
        for(Dev dev:devsInscritos)System.out.println(dev);
    }
    

    @Override
    public String toString() {
        String descricaoGeral;
        descricaoGeral = "=========="+nome+"==========\n"
        +descricao+"\nTermine o bootcamp até: "+DATA_FINAL;
        return descricaoGeral;
    }

    
    public LocalDate getDATA_INICIAL() {
        return DATA_INICIAL;
    }
    public LocalDate getDATA_FINAL() {
        return DATA_FINAL;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    public void exibirConteudoBootcamp(){
        //não criarei um getConteudoBootcamp
        System.out.println("Veja tudo o que você irá aprender nesse bootcamp:\n");
        for(Conteudo conteudo:conteudos)System.out.println(conteudo.getTitulo());
    }
    
}

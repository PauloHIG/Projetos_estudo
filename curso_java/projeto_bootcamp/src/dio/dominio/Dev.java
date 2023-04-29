package dio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private String bio;
    private Set<Conteudo> cursosInscritos =new LinkedHashSet<>();
    private Set<Conteudo> cursosConcluidos =new  LinkedHashSet<>();
   
    public Dev(String nome){
        this.nome = nome;
        this.bio= "Olá eu sou "+nome;
    }
    
    public void inscreverNoBootcamp(Bootcamp bootcamp){
        bootcamp.receveDev(this);
    }
    
    public Double calcularXp(){
        Double soma=0d;
        for(Conteudo curso:cursosConcluidos){
            soma+=curso.calcularXp();
        }
        //tudo que envolve esse método me ensinou o poder do polimorfismo e da herança
        return soma;
    }
    
    public void matricularEmConteudo(Conteudo conteudo) {
        if(cursosConcluidos.contains(conteudo))System.out.println("Você já concluiu esse curso");
        else cursosInscritos.add(conteudo);
    }
    public void cancelarMatricula(Conteudo conteudo) {
        if(cursosConcluidos.contains(conteudo)) System.out.println("Você já concluiu esse curso");
        else if(cursosInscritos.contains(conteudo)) cursosInscritos.remove(conteudo);
        else System.out.println("Você não está matriculado nesse curso");
    }
    public void concluirConteudo(Conteudo conteudo){
        //progredir
        if(cursosConcluidos.contains(conteudo)) System.out.println("Curso já concluido");
        else if(cursosInscritos.contains(conteudo)){cursosConcluidos.add(conteudo);cursosInscritos.remove(conteudo);}
        else System.out.println("Matricule-se e Realize as atividades primeiro");
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
    public String getBio() {
        return bio;
    }

    public void exibeCursosInscritos() {
        for(Conteudo conteudo:cursosInscritos)System.out.println("====================================\n"+conteudo);
        System.out.println("====================================");
    }
    public void exibeCursosConcluidos() {
        for(Conteudo conteudo:cursosConcluidos)System.out.println("====================================\n"+conteudo);
        System.out.println("====================================");

    }

    @Override
    public String toString() {
        return "Dev [nome=" + nome + ", bio=" + bio + "]";
    }
    
    
}

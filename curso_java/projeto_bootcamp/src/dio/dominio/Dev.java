package dio.dominio;

import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> cursosInscritos;
    private Set<Conteudo> cursosConcluidos;
    //um elemento de cursosConcluidos não pode estar contido no elemento de cursos inscritos
    //e um curso concluido obrigatoriamente já foi inscrito, eu saberia implementar isso em python
    //TODO aprender a fazer bom uso do Set em java
    
    public Dev(String nome){
        this.nome = nome;
    }
    

    public void inscreverNoBootcamp(Bootcamp bootcamp){}
    public void progredir(){}
    public Double calcularXp(){
        //a lógica aplicada será a de somar o retorno do método .calcularXp das objetos Conteudo
        return 0d;
    }

    public String getNome() {
        return nome;
    }

    
    
    
}

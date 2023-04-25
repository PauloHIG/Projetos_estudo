package dio.aulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacao {
    //Ahhhahahhahahahahahh eu to coringando porque o dela dá certo e o meu não
    //Descobri... eu tava criando a classe dentro da classe principal Ordenacao
    //uma das lições que eu aprendi é que classes sempre são instanciadas como se a classe fosse um tipo primitivo
    public static void main(String[] args) {
       
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 12, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 18, "amarelo"));
            add(new Gato("Fuinha",20,"Cinza"));
        }};
        System.out.println(meusGatos);
        System.out.println("Bagunçando a ordem das listas");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Colocando em Ordem Natural");
        Collections.sort(meusGatos);//para funcionar é necessário o implements
        System.out.println(meusGatos);
        //nota: consegui ordenar pela idade também alterando o método compareTo
    }    

}
class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;
    public Gato(String nome,Integer idade,String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getCor() {
        return cor;
    }
    public Integer getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return "Nome do bichano: "+nome+"\n idade do bichano: "+idade+"\n cor do bichano: "+cor+"\n\n";
    }
    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
   
}
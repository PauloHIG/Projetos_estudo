package dio.aulas;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class AulaSet2 {
    
    public static void main(String[] args) {
        
        Set<Serie> series = new LinkedHashSet<>(){{
        add(new Serie("Dr. House",45d,"Medico/investigação"));
        add(new Serie("Lupin", 60d, "Drama"));
        add(new Serie("Lupin", 59d, "Drama"));
        add(new Serie("TrollHunters",25d,"Animação"));
        new Serie("Vandinha", 50d, "Dark humor/investigação/escolar");
        }};
        for(Serie serie:series)System.out.println(serie);

        System.out.println("Ordenação com desempates");
        Set<Serie> ordenacaoHierarquica = new TreeSet<>(new ComparatorTituloGeneroDuracao());
        ordenacaoHierarquica.addAll(series);
        for(Serie serie:ordenacaoHierarquica)System.out.println(serie);

        /*System.out.println("Ordenada pela duração dos eps");
        Set<Serie> listaOrdenadaDuracao = new  TreeSet<>(series);
        for(Serie serie:listaOrdenadaDuracao)System.out.println(serie);*/
    }
}
class Serie implements Comparable<Serie>{
    private String titulo;
    private Double duracaoEp;
    private String genero;
    public Serie(String titulo,Double duracaoEp, String genero){
        this.titulo = titulo;
        this.duracaoEp = duracaoEp;
        this.genero = genero;
    }
    public String getTitulo() {
        return titulo;
    }
    public Double getDuracaoEp() {
        return duracaoEp;
    }
    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Título: "+this.titulo+", Duração: "+this.duracaoEp+" minutos, Genero: "+this.genero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo,duracaoEp,genero);
    }
    @Override
    public int compareTo(Serie serie2) {
        //pela duração
        return this.getDuracaoEp().compareTo(serie2.getDuracaoEp());
    }
}
//crie um compareto que compare na ordem Titulo, Genero, tempo de ep
class ComparatorTituloGeneroDuracao implements Comparator<Serie>{
    @Override
    public int compare(Serie serie1, Serie serie2) {
        int compara = serie1.getTitulo().compareToIgnoreCase(serie2.getTitulo());
        if (compara != 0) return compara;
        compara = serie1.getGenero().compareToIgnoreCase(serie2.getGenero());
        if (compara != 0) return compara;
        return serie1.getDuracaoEp().compareTo(serie2.getDuracaoEp());
    }
}
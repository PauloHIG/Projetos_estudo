package dio.dominio;


public abstract class Conteudo {
    protected static final Double XP_PADRAO=10.25;
    private String titulo;
    private String descricao;
    
    
    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }
    public abstract double calcularXp();
    @Override
    public String toString() {
        return "Vim da classe mãe: " + titulo + ", Descrição: " + descricao + "]";
    }

    public static Double getXpPadrao() {
        return XP_PADRAO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}

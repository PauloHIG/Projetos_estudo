package dio.dominio;

public class Curso extends Conteudo {
    Integer cargaHoraria;
    
    public Curso(String titulo, String descricao, Integer cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO*cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: "+getTitulo()+"\n"+getDescricao()+" \nCarga Horaria: " + cargaHoraria+" horas";
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
}

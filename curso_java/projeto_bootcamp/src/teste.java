import java.time.LocalDate;

import dio.dominio.Conteudo;
import dio.dominio.Dev;
import dio.dominio.Mentoria;

public class teste {
    
    public static void main(String[] args) {
        
        Mentoria ment = new Mentoria("Boas praticas","Não deixe seu código com gambiarras",LocalDate.of(2023, 4, 24));
        System.out.println(ment);
    }
}

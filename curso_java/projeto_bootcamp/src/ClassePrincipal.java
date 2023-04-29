
import java.time.LocalDate;

import dio.dominio.Bootcamp;
import dio.dominio.Curso;
import dio.dominio.Dev;
import dio.dominio.Mentoria;

public class ClassePrincipal {
    public static void main(String[] args) {    
        
        Mentoria ment = new Mentoria("Boas praticas","Não deixe seu código com gambiarras",LocalDate.of(2023, 4, 24));
        Curso pooEmJava = new Curso("POO em java", "Eu, Paulo, sinto que de fato estou aprendendo orientação a objetos", 3);
        System.out.println(boot1);
    }

}

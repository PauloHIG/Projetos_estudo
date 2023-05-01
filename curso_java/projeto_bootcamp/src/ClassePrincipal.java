
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

import dio.dominio.Bootcamp;
import dio.dominio.Conteudo;
import dio.dominio.Curso;
import dio.dominio.Dev;
import dio.dominio.Mentoria;

public class ClassePrincipal {
    public static void main(String[] args) {    
        Dev dev1 = new Dev("Paulo");
        
        Mentoria ment = new Mentoria("Boas praticas","Não deixe seu código com gambiarras",LocalDate.of(2023, 4, 24));
        Curso curso1 = new Curso("Sintaxe basica do kotlin", "Comandos basicos de lógica", 2);
        
        Bootcamp bootKotlin = new Bootcamp("Java e Kotlin", "Curso intensivo para o mercado de trabalho");
        Set<Conteudo> conteudosBootKotlin = new LinkedHashSet<>();
        conteudosBootKotlin.add(ment);
        conteudosBootKotlin.add(curso1);
        bootKotlin.setConteudos(conteudosBootKotlin);

        dev1.inscreverNoBootcamp(bootKotlin);
        dev1.exibeCursosInscritos();
        dev1.concluirConteudo(curso1);
        System.out.println(dev1.calcularXp());
        dev1.exibeCursosInscritos();

    }

}

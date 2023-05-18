package dio.paulo.aula.dio.credit.api.dominio;
import java.math.BigDecimal;
import java.util.List;

public class Customer {
    private String name;
    private String lastName;
    private String cpf;
    private String email;
    private String password;
    private Address adress;
    private BigDecimal income;
    private List<Credit> credits;
    private long id;
}

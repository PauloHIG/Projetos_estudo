package dio.paulo.aula.dio.credit.api.dominio;
import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) private String name;
    @Column(nullable = false) private String lastName;
    @Column(nullable = false,unique = true) private String cpf;
    @Column(nullable = false,unique = true) private String email;
    @Column(nullable = false) private String password;

    @Embedded
    private Address address;

    @Column(nullable = true) private BigDecimal income;
    
    @OneToMany(mappedBy = "customer")
    private List<Credit> credits;
}

package dio.paulo.aula.dio.credit.api.dominio;
import java.math.BigDecimal;
import java.util.List;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Tu tem nome, coloca teu nome")
    @Column(nullable = false) private String name;
    @NotBlank(message = "Tu tem sobrenome, coloca teu sobrenome")
    @Column(nullable = false) private String lastName;
    
    @CPF(message = "CPF inválido")
    @Column(nullable = false,unique = true) private String cpf;

    @Email(message = "Coloque um e-mail válido")
    @Column(nullable = false,unique = true) private String email;

    @NotBlank(message = "Defina uma senha")
    @Column(nullable = false) private String password;

    @Column(nullable = true) private BigDecimal income;
    
    @Embedded
    private Address address;

    @OneToMany(mappedBy = "customer")
    private List<Credit> credits;

    public List<Credit> getCredits() {
        return credits;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Address getAddress() {
        return address;
    }

    public BigDecimal getIncome() {
        return income;
    }
}

package dio.paulo.aula.dio.credit.api.dominio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true) private UUID creditCode = UUID.randomUUID();
    @Column(nullable = false) private BigDecimal creditValue;
    @Column(nullable = false) private LocalDate dayFirstInstallment;
    @Column(nullable = false) private int numberOfInstallments;
    @Enumerated private Status status;
    @ManyToOne private Customer customer;
    
    
}

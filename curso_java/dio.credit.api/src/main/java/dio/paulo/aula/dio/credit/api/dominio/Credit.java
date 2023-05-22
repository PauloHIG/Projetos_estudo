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
    @Enumerated private Status status = Status.IN_PROGRESS;
    @ManyToOne private Customer customer;
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BigDecimal getCreditValue() {
        return creditValue;
    }

    public void setCreditValue(BigDecimal creditValue) {
        this.creditValue = creditValue;
    }

    public LocalDate getDayFirstInstallment() {
        return dayFirstInstallment;
    }

    public void setDayFirstInstallment(LocalDate dayFirstInstallment) {
        this.dayFirstInstallment = dayFirstInstallment;
    }

    public int getNumberOfInstallments() {
        return numberOfInstallments;
    }

    public void setNumberOfInstallments(int numberOfInstallments) {
        this.numberOfInstallments = numberOfInstallments;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    
}

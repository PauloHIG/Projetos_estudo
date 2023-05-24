package dio.paulo.aula.dio.credit.api.controller.dto;

import java.math.BigDecimal;
import java.util.UUID;

import dio.paulo.aula.dio.credit.api.dominio.Credit;
import dio.paulo.aula.dio.credit.api.dominio.Status;

public class CreditView {
    public UUID creditCode;
    public BigDecimal creditValue;
    public int numberOfInstallments;
    public Status status;
    public String emailCustomer;
    public BigDecimal incomeCustomer;
    public CreditView(Credit credit) {
        this.creditCode = credit.getCreditCode();
        this.creditValue = credit.getCreditValue();
        this.numberOfInstallments = credit.getNumberOfInstallments();
        this.status = credit.getStatus();
        this.emailCustomer = credit.getCustomer().getEmail();
        this.incomeCustomer = credit.getCustomer().getIncome();
    }
    
}

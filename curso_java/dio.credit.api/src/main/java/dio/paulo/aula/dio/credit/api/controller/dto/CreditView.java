package dio.paulo.aula.dio.credit.api.controller.dto;

import java.math.BigDecimal;
import java.util.UUID;

import dio.paulo.aula.dio.credit.api.dominio.Credit;
import dio.paulo.aula.dio.credit.api.dominio.Status;

public class CreditView {
    UUID creditCode;
    BigDecimal creditValue;
    int numberOfInstallments;
    Status status;
    String emailCustomer;
    BigDecimal incomeCustomer;
    public CreditView(Credit credit) {
        this.creditCode = credit.getCreditCode();
        this.creditValue = credit.getCreditValue();
        this.numberOfInstallments = credit.getNumberOfInstallments();
        this.status = credit.getStatus();
        this.emailCustomer = credit.getCustomer().getEmail();
        this.incomeCustomer = credit.getCustomer().getIncome();
    }
    
}

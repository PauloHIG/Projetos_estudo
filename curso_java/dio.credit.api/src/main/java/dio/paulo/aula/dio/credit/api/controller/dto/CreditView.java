package dio.paulo.aula.dio.credit.api.controller.dto;

import java.math.BigDecimal;
import java.util.UUID;

import dio.paulo.aula.dio.credit.api.dominio.Credit;

public class CreditView {
    UUID creditCode;
    BigDecimal creditValue;
    int numberOfInstallments;
    public CreditView(Credit credit) {
        this.creditCode = credit.getCreditCode();
        this.creditValue = credit.getCreditValue();
        this.numberOfInstallments = credit.getNumberOfInstallments();
    }
    
}

package dio.paulo.aula.dio.credit.api.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import dio.paulo.aula.dio.credit.api.dominio.Credit;
import dio.paulo.aula.dio.credit.api.service.impl.CreditService;

public class CreditDto {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public CreditService creditService;
    
    public BigDecimal creditValue;
    public String dayFirstInstallment;
    public int numberOfInstallments;
    public Long customerId;
    public Credit toEntity(){
        Credit credit = new Credit();
        credit.setCreditValue(this.creditValue);
        credit.setDayFirstInstallment(LocalDate.parse(dayFirstInstallment, formatter));
        credit.setNumberOfInstallments(this.numberOfInstallments);
        credit.setCustomer(this.creditService.findCustomerById(customerId));
        return credit;
    }
}

package dio.paulo.aula.dio.credit.api.controller.dto.request;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import dio.paulo.aula.dio.credit.api.entidade.Credit;
import dio.paulo.aula.dio.credit.api.service.impl.CreditService;
import jakarta.validation.constraints.Future;

public class CreditDto {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public CreditService creditService;

    public BigDecimal creditValue;
    @Future(message = "Coloque uma data válida")
    public LocalDate dayFirstInstallment;
    public int numberOfInstallments;
    public Long customerId;
    
    
    public Credit toEntity(){
        Credit credit = new Credit();
        credit.setCreditValue(this.creditValue);
        credit.setDayFirstInstallment(dayFirstInstallment);
        credit.setNumberOfInstallments(this.numberOfInstallments);
        credit.setCustomer(this.creditService.findCustomerById(customerId));
        return credit;
    }
}

package dio.paulo.aula.dio.credit.api.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import dio.paulo.aula.dio.credit.api.dominio.Credit;
import dio.paulo.aula.dio.credit.api.service.impl.CustomerService;

public class CreditDto {
    public CustomerService customerService;
    public BigDecimal creditValue;
    public LocalDate dayFirstInstallment;
    public int numberOfInstallments;
    public Long customerId;
    public Credit toEntity(){
        Credit credit = new Credit();
        credit.setCreditValue(this.creditValue);
        credit.setDayFirstInstallment(this.dayFirstInstallment);
        credit.setNumberOfInstallments(this.numberOfInstallments);
        credit.setCustomer(customerService.findById(customerId));
        return credit;
    }
}

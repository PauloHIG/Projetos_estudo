package dio.paulo.aula.dio.credit.api.controller.dto.request;

import java.math.BigDecimal;

import dio.paulo.aula.dio.credit.api.entidade.Customer;

public class CustomerUpdateDto {
    public String name;
    public String lastName;
    public BigDecimal income;
    public String address_zipCode;
    public String address_street;
    
    public Customer toEntity(Customer customer){
        customer.setName(this.name);
        customer.setLastName(this.lastName);
        customer.setIncome(this.income);
        customer.getAddress().zipCode = address_zipCode;
        customer.getAddress().street = address_street;
        return customer;
    }
}
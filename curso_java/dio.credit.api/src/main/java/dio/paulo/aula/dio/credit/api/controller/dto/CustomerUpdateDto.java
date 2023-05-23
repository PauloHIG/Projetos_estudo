package dio.paulo.aula.dio.credit.api.controller.dto;

import java.math.BigDecimal;

import dio.paulo.aula.dio.credit.api.dominio.Customer;

public class CustomerUpdateDto {
    String name;
    String lastName;
    BigDecimal income;
    String address_zipCode;
    String address_street;
    
    public Customer toEntity(Customer customer){
        customer.setName(this.name);
        customer.setLastName(this.lastName);
        customer.setIncome(this.income);
        customer.getAddress().zipCode = address_zipCode;
        customer.getAddress().street = address_street;
        return customer;
    }
}
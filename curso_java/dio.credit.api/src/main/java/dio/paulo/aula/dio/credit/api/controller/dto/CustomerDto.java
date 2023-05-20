package dio.paulo.aula.dio.credit.api.controller.dto;

import java.math.BigDecimal;

import dio.paulo.aula.dio.credit.api.dominio.Address;
import dio.paulo.aula.dio.credit.api.dominio.Customer;

public class CustomerDto {
    String name;
    String lastName;
    String cpf;
    String email;
    String password;
    BigDecimal income;
    String address_zipCode;
    String address_street;
    
    public Customer toEntity(){
        Customer customer = new Customer();
        customer.setName(this.name);
        customer.setLastName(this.lastName);
        customer.setCpf(this.cpf);
        customer.setEmail(this.email);
        customer.setPassword(this.password);
        customer.setIncome(this.income);
        customer.setAddress(new Address(this.address_zipCode, this.address_street));
        return customer;
    }
}

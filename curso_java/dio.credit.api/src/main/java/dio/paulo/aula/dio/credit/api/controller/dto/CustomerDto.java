package dio.paulo.aula.dio.credit.api.controller.dto;

import java.math.BigDecimal;

import dio.paulo.aula.dio.credit.api.dominio.Address;
import dio.paulo.aula.dio.credit.api.dominio.Customer;

public class CustomerDto {
    @Override
    public String toString() {
        return "CustomerDto [name=" + name + ", lastName=" + lastName + "]";
    }

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
        Address address = new Address();
        address.zipCode = this.address_zipCode;
        address.street = this.address_street;
        customer.setName(this.name);
        customer.setLastName(this.lastName);
        customer.setCpf(this.cpf);
        customer.setEmail(this.email);
        customer.setPassword(this.password);
        customer.setIncome(this.income);
        customer.setAddress(address);
        return customer;
    }
}
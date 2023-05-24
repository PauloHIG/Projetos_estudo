package dio.paulo.aula.dio.credit.api.controller.dto;

import java.math.BigDecimal;

import dio.paulo.aula.dio.credit.api.dominio.Customer;

public class CustomerView {
    public String name;
    public String lastName;
    public String cpf;
    public String email;
    public BigDecimal income;
    public String address_zipCode;
    public String address_street;
    public CustomerView(Customer customer) {
        this.name = customer.getName();
        this.lastName = customer.getLastName();
        this.cpf = customer.getCpf();
        this.email = customer.getEmail();
        this.income = customer.getIncome();
        this.address_zipCode = customer.getAddress().zipCode;
        this.address_street = customer.getAddress().street;
    }
}

package dio.paulo.aula.dio.credit.api.controller.dto;

import java.math.BigDecimal;
import dio.paulo.aula.dio.credit.api.dominio.Customer;

public class CustomerView {
    String name;
    String lastName;
    String cpf;
    String email;
    BigDecimal income;
    String address_zipCode;
    String address_street;
    public CustomerView(Customer customer) {
        this.name = customer.getName();
        this.lastName = customer.getLastName();
        this.cpf = customer.getCpf();
        this.email = customer.getEmail();
        this.income = customer.getIncome();
        this.address_zipCode = customer.getAddress().getZipCode();
        this.address_street = customer.getAddress().getStreet();
    }
}

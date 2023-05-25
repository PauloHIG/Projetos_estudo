package dio.paulo.aula.dio.credit.api.controller.dto.request;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.br.CPF;

import dio.paulo.aula.dio.credit.api.entidade.Address;
import dio.paulo.aula.dio.credit.api.entidade.Customer;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class CustomerDto {
    @Override
    public String toString() {
        return "CustomerDto [name=" + name + ", lastName=" + lastName + "]";
    }
    @NotBlank(message = "Tu tem nome, coloca teu nome")
    public String name;

    @NotBlank(message = "Tu tem sobrenome, coloca teu sobrenome")
    public String lastName;
    
    @CPF(message = "CPF inválido")
    public String cpf;
    
    @Email(message = "Coloque um e-mail válido")
    public String email;
    @NotBlank(message = "Defina uma senha")
    public String password;
    public BigDecimal income;
    public String address_zipCode;
    public String address_street;
    
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
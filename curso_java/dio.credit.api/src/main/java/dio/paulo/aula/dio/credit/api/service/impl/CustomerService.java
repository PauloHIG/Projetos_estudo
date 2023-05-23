package dio.paulo.aula.dio.credit.api.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import dio.paulo.aula.dio.credit.api.dominio.Customer;
import dio.paulo.aula.dio.credit.api.repository.CustomerRepository;
import dio.paulo.aula.dio.credit.api.service.ICustomerService;

@Service
public class CustomerService implements ICustomerService{
    private CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    
    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void delete(long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer findById(long id) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        return optionalCustomer.orElseThrow(() -> new RuntimeException("Usuário do ID: " + id + " não encontrado"));
    }
}

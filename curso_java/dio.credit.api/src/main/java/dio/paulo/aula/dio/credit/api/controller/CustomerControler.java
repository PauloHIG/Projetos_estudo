package dio.paulo.aula.dio.credit.api.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.paulo.aula.dio.credit.api.controller.dto.CustomerDto;
import dio.paulo.aula.dio.credit.api.controller.dto.CustomerView;
import dio.paulo.aula.dio.credit.api.dominio.Customer;
import dio.paulo.aula.dio.credit.api.service.impl.CustomerService;


@RestController
@RequestMapping("/api/customer")
public class CustomerControler {
    CustomerService customerService;
    
    public CustomerControler(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    String saveCustomer(@RequestBody CustomerDto customerDto){
        Customer customer = this.customerService.save(customerDto.toEntity());
        return "Os dados de "+customer.getName()+" foram salvos com sucesso";
    }
    @GetMapping("/{id}")
    CustomerView findById(@PathVariable Long id){
        Customer customer = this.customerService.findById(id);
        return new CustomerView(customer);
    }

    @DeleteMapping("/{id}")
    void deleteCustomer(@PathVariable long id){this.deleteCustomer(id);}

}

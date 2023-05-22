package dio.paulo.aula.dio.credit.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dio.paulo.aula.dio.credit.api.controller.dto.CustomerDto;
import dio.paulo.aula.dio.credit.api.controller.dto.CustomerUpdateDto;
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
    ResponseEntity<String> saveCustomer(@RequestBody CustomerDto customerDto){
        Customer customer = this.customerService.save(customerDto.toEntity());
        return ResponseEntity.status(HttpStatus.CREATED).body("Os dados de "+customer.getName()+" foram salvos com sucesso");
    }
    @GetMapping("/{id}")
    ResponseEntity<CustomerView> findById(@PathVariable Long id){
        Customer customer = this.customerService.findById(id);
        CustomerView customerView = new CustomerView(customer);
        return ResponseEntity.status(HttpStatus.OK).body(customerView);
    }

    @DeleteMapping("/{id}")
    void deleteCustomer(@PathVariable long id){this.deleteCustomer(id);}

    @PatchMapping
    ResponseEntity<String> updateCustomer(@RequestParam(value = "customerId") long id,
    @RequestBody CustomerUpdateDto customerUpdateDto){
        Customer customer = this.customerService.findById(id);
        Customer customerUpdated = this.customerService.save(customerUpdateDto.toEntity(customer));
        CustomerView customerView = new CustomerView(customerUpdated);
        return ResponseEntity.status(HttpStatus.OK)
        .body("Usuario atualizado com sucesso"+customerView);
    }
}

package dio.paulo.aula.dio.credit.api.controller;

import java.util.List;

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
public class CustomerController {
    CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    ResponseEntity<String> saveCustomer(@RequestBody CustomerDto customerDto){
        try {
            Customer customer = this.customerService.save(customerDto.toEntity());
            return ResponseEntity.status(HttpStatus.CREATED).body("Os dados de " + customer.getName() + " foram salvos com sucesso");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body("Ocorreu um erro ao salvar os dados do cliente: " + e.getMessage());
        }
        
    }
    @PostMapping("save_multiple")
    ResponseEntity<String> saveMultipleCustomer(@RequestBody List<CustomerDto> listOfCustomers){
        String savedCustomers="";
        ResponseEntity<String> retorno;
        try {
            for(CustomerDto customerInsertData:listOfCustomers){
                retorno = saveCustomer(customerInsertData);
                savedCustomers += "\n"+customerInsertData.name;
                if(retorno.getStatusCode()==HttpStatus.INTERNAL_SERVER_ERROR){
                    return retorno;
                }
            }
            return ResponseEntity.status(HttpStatus.CREATED)
            .body("Todos os clientes foram salvos "+savedCustomers);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body("Ocorreu um erro ao salvar um cliente "+e.getMessage()+"\nClientes salvos até aqui"+savedCustomers);
        }
        

    }

    @GetMapping("/{id}")
    ResponseEntity<CustomerView> findById(@PathVariable Long id){
        Customer customer = this.customerService.findById(id);
        CustomerView customerView = new CustomerView(customer);
        return ResponseEntity.status(HttpStatus.OK).body(customerView);
    }

    @DeleteMapping
    void deleteCustomer(@RequestParam(value = "customerId") long id){this.customerService.delete(id);}

    @PatchMapping
    ResponseEntity<String> updateCustomer(@RequestParam(value = "customerId") long id,
    @RequestBody CustomerUpdateDto customerUpdateDto){
        Customer customer = this.customerService.findById(id);
        Customer customerUpdated = this.customerService.save(customerUpdateDto.toEntity(customer));
        CustomerView customerView = new CustomerView(customerUpdated);
        return ResponseEntity.status(HttpStatus.OK)
        .body("Usuario "+customerView.name +" atualizado com sucesso");
    }
}

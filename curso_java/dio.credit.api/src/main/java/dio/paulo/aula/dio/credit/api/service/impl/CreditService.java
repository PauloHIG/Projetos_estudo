package dio.paulo.aula.dio.credit.api.service.impl;

import java.util.List;
import java.util.UUID;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import dio.paulo.aula.dio.credit.api.entidade.Credit;
import dio.paulo.aula.dio.credit.api.entidade.Customer;
import dio.paulo.aula.dio.credit.api.repository.CreditRepository;
import dio.paulo.aula.dio.credit.api.service.ICreditService;

@Service
public class CreditService implements ICreditService {
    private CreditRepository creditRepository;
    private CustomerService customerService;
    public CreditService(CreditRepository creditRepository, CustomerService customerService) {
        this.creditRepository = creditRepository;
        this.customerService = customerService;
    }

    @Override
    public Credit save(Credit credit) {
        credit.setCustomer(customerService.findById(credit.getCustomer().getId()));
        return this.creditRepository.save(credit);
    }

    @Override
    public List<Credit> findAllByCustomer(long customerId) {
        return creditRepository.findAllByCustomer(customerId);
    }

    @Override
    public Credit findByCreditCode(long customerId,UUID creditCode) throws RuntimeException {
        Credit credit = this.creditRepository.findByCreditCode(creditCode);
        if(credit.getCustomer().getId() == customerId){
            return credit;
        }else{
            throw new RuntimeErrorException(null, "Contate o administrador");
        }
    }

    public Customer findCustomerById(long id){
        return customerService.findById(id);
    }
    
}

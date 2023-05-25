package dio.paulo.aula.dio.credit.api.service;

import dio.paulo.aula.dio.credit.api.entidade.Customer;

public interface ICustomerService {
    public Customer save(Customer customer);
    public Customer findById(long id);
    public void delete(long id);
}

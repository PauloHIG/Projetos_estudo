package dio.paulo.aula.dio.credit.api.service;

import java.util.List;
import java.util.UUID;

import dio.paulo.aula.dio.credit.api.dominio.Credit;

public interface ICreditService {
    public Credit save(Credit credit);
    public List<Credit> findAllByCustomer(long customerId);
    public Credit findByCreditCode(long customerId,UUID creditId);
}

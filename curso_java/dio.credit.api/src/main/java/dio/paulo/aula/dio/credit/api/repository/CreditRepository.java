package dio.paulo.aula.dio.credit.api.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dio.paulo.aula.dio.credit.api.dominio.Credit;

public interface CreditRepository extends JpaRepository<Credit, Long>{
    public Credit findByCreditCode(UUID creditCode);

    //isto aqui é maravilhoso, a saber o ?1 representa o primeiro parametro da função abaixo da anotação
    @Query(value = "SELECT * FROM CREDIT WHERE customer_id = ?1",nativeQuery = true)
    public List<Credit> findAllByCustomer(long customerId);
}

package dio.paulo.aula.dio.credit.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.paulo.aula.dio.credit.api.dominio.Credit;

public interface CreditRepository extends JpaRepository<Credit, Long>{}

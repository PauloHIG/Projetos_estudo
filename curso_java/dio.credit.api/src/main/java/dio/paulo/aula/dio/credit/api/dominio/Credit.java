package dio.paulo.aula.dio.credit.api.dominio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Credit {
    private UUID creditCode = UUID.randomUUID();
    private BigDecimal creditValue;
    private LocalDate dayFirstInstallment;
    private int numberOfInstallments;
    private Status status;
    private Customer customer;
    private Long id;
    
}

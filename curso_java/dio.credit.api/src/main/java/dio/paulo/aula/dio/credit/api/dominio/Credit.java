package dio.paulo.aula.dio.credit.api.dominio;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Credit {
    private UUID creditCode;
    private BigDecimal creditValue;
    private LocalDate dayFirstInstallment;
    private int numberOfInstallments;
    private Status status;
    private Customer customer;
    private Long id;
    
}

package dio.paulo.aula.dio.credit.api.dominio;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String zipCode;//equivalente ao nosso CEP
    private String street;
}
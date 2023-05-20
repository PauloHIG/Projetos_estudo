package dio.paulo.aula.dio.credit.api.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    @Column(nullable = false) private String zipCode;//equivalente ao nosso CEP
    @Column(nullable = false) private String street;
    public Address(String zipCode, String street) {
        this.zipCode = zipCode;
        this.street = street;
    }
    public String getZipCode() {
        return zipCode;
    }
    public String getStreet() {
        return street;
    }
}

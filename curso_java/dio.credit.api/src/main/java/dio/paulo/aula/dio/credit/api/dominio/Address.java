package dio.paulo.aula.dio.credit.api.dominio;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
  
    @Column(nullable = false) public String zipCode;//equivalente ao nosso CEP
    @Column(nullable = false) public String street;
}

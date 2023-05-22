package dio.paulo.aula.dio.credit.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.paulo.aula.dio.credit.api.controller.dto.CreditDto;
import dio.paulo.aula.dio.credit.api.dominio.Credit;
import dio.paulo.aula.dio.credit.api.service.impl.CreditService;

@RestController
@RequestMapping("/api/credit")
public class CreditController {
    CreditService creditService;

    public CreditController(CreditService creditService) {
        this.creditService = creditService;
    }
    @PostMapping
    String saveCredit(@RequestBody CreditDto creditDto){
        Credit credit = creditDto.toEntity();
        this.creditService.save(credit);
        return "Credito "+credit+"salvo com sucesso";
    }
}

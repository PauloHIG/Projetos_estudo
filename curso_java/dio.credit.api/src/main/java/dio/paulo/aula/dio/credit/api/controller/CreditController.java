package dio.paulo.aula.dio.credit.api.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dio.paulo.aula.dio.credit.api.controller.dto.CreditDto;
import dio.paulo.aula.dio.credit.api.controller.dto.CreditView;
import dio.paulo.aula.dio.credit.api.dominio.Credit;
import dio.paulo.aula.dio.credit.api.service.impl.CreditService;

@RestController
@RequestMapping("/api/credit")
public class CreditController {
    CreditService creditService;

    public CreditController(CreditService creditService) {
        this.creditService = creditService;
    }
    //(CRUD) create(post) read(get, consulta) update(patch) delete
    @PostMapping
    ResponseEntity<String> saveCredit(@RequestBody CreditDto creditDto){
        try {
            creditDto.creditService = creditService;
            Credit credit = creditDto.toEntity();
            
            this.creditService.save(credit);
            return ResponseEntity.status(HttpStatus.CREATED).body("Credito "+credit+"salvo com sucesso");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
        
    }
    @GetMapping("/customer/{id}")
    ResponseEntity<List<CreditView>> findAllByCustomerId(@PathVariable Long id){
        List<Credit> creditList = creditService.findAllByCustomer(id);
        List<CreditView> creditViewList = new ArrayList<CreditView>();
        for(Credit credit:creditList){
            creditViewList.add(new CreditView(credit));
        }
        return ResponseEntity.status(HttpStatus.OK).body(creditViewList);
    }
    
    @GetMapping("/{uuid}")
    ResponseEntity<CreditView> findByCreditCode(
    @RequestParam(value = "customerId") long customerId,
    @PathVariable UUID creditCode){
        Credit credit = creditService.findByCreditCode(customerId, creditCode);
        CreditView creditView = new CreditView(credit);
        return ResponseEntity.status(HttpStatus.OK).body(creditView);
    }

}



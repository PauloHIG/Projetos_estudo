package dio.padroesdeprojeto.dio.aula.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.padroesdeprojeto.dio.aula.model.Cliente;
import dio.padroesdeprojeto.dio.aula.service.implement.ImplClienteService;

@RestController
@RequestMapping("/aula/cliente")
public class ClienteController {
    ImplClienteService clienteService;

    @PostMapping
    void salvarCliente(@RequestBody Cliente cliente){
        clienteService.inserir(cliente);
    }
}

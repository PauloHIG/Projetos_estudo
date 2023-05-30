package dio.padroesdeprojeto.dio.aula.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dio.padroesdeprojeto.dio.aula.model.Endereco;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepConsumer {
    @RequestMapping(method = RequestMethod.GET,value = "/{cep}/json")
    Endereco consultarCep(@PathVariable("cep") String cep);
}

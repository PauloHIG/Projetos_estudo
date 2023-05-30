package dio.padroesdeprojeto.dio.aula.service;

import java.util.List;

import dio.padroesdeprojeto.dio.aula.model.Cliente;

public interface IClienteService {
    
    void inserir(Cliente cliente);

    List<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);

    void atualizar(long id,Cliente cliente);
    
    void deletar(long id);
}

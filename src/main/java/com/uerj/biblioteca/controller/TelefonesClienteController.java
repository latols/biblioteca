package com.uerj.biblioteca.controller;

import com.uerj.biblioteca.model.Cliente;
import com.uerj.biblioteca.model.TelefonesCliente;
import com.uerj.biblioteca.repository.ClienteRepository;
import com.uerj.biblioteca.repository.TelefonesClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TelefonesClienteController {

    /*@Autowired
    TelefonesClienteRepository telefonesClienteRepository;

    @PutMapping("/telefoneCliente")
    public void updateNote(@PathVariable(value = "cpf") String cpf,
                           @Valid @RequestBody String telefonesCliente){
        telefonesClienteRepository.atualiza(cpf, telefonesCliente);
    }*/
    /*@Autowired
    ClienteRepository clienteRepository;

    @GetMapping("/clientes")
    public List<Cliente> selectTodosOsTelefones() {
        return clienteRepository.selectTodosOsClientes();
    }


    @GetMapping("/clientes/{cpf}")
    public Cliente pegarClientePeloCpf(@PathVariable(value = "cpf") String cpf) {
        return clienteRepository.selectClientePorCpf(cpf);

    }

    @PostMapping("/clientes")
    public Cliente cadastrarCliente(@Valid @RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }*/


    //Melhoria utilizando query nativa
    /*@PostMapping("/clientes")
    public void criarClientes(@Valid @RequestBody Cliente cliente) {
        clienteRepository.createCadastroCliente(cliente.getCpf(),cliente.getNome(),cliente.getEmail(),cliente.getEndereco());
    }

    @DeleteMapping("/clientes")
    public void deletarCliente(@PathVariable(value = "cpf") String cpf) {
        clienteRepository.deleteCliente(cpf);
    }*/
}

package com.gymplus.Gym.Plus.controllers;

import com.gymplus.Gym.Plus.models.Cliente;
import com.gymplus.Gym.Plus.models.DadosCadastroClientes;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.gymplus.Gym.Plus.repository.ClienteRepository;
import com.gymplus.Gym.Plus.models.DadosListagemClientes;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    @Transactional //Responsável por realizar um hollback
    public void cadastrarCliente(@RequestBody @Valid DadosCadastroClientes dados) {
        clienteRepository.save(new Cliente(dados));
    }

    @GetMapping
    public List<DadosListagemClientes> listar() {
        return clienteRepository.findAll().stream().map(DadosListagemClientes::new).toList();
    }
}

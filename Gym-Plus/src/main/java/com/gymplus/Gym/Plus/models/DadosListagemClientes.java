package com.gymplus.Gym.Plus.models;

public record DadosListagemClientes(String nome, String cpf, String email, String senha, Plano plano) {

    public DadosListagemClientes(Cliente cliente) {
        this(cliente.getNome(), cliente.getCpf(), cliente.getEmail(), cliente.getSenha(), cliente.getPlano());
    }
}

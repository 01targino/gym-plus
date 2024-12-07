package com.gymplus.Gym.Plus.models;

import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

public record DadosCadastroClientes(

        @NotBlank
        String nome,

        @CPF
        String cpf,

        @Email
        String email,

        @NotBlank
        String senha,

        @Enumerated
        Plano plano) {

}

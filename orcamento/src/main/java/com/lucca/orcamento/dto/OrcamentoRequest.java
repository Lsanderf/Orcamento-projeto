package com.lucca.orcamento.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class OrcamentoRequest {
    @NotBlank(message = "Perfil não pode ser vazio")
    private String perfil;

    @NotNull(message = "Salário é obrigatorio!")
    @Positive(message = "Salario tem que ser maior que zero!")
    private Double salario;

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}

package com.lucca.orcamento.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;


@Entity
public class OrcamentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private Double salario;

    @Column(nullable = false)
    private String perfil;


    public OrcamentoEntity(){}

    public Long getId(){ 
        return id;
    }

    public Double getSalario(){
        return salario;
    }

    public String getPerfil(){
        return perfil;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }

    public void setPerfil(String perfil){
        this.perfil = perfil;
    }
}

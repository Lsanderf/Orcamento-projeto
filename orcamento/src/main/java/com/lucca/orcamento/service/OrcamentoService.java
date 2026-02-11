package com.lucca.orcamento.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.lucca.orcamento.dto.OrcamentoResponse;
import com.lucca.orcamento.entity.OrcamentoEntity;
import com.lucca.orcamento.repository.OrcamentoRepository;

@Service
public class OrcamentoService {
    
    private final OrcamentoRepository orcamentoRepository;

    public OrcamentoService(OrcamentoRepository orcamentoRepository) {
        this.orcamentoRepository = orcamentoRepository;
    }

    public OrcamentoResponse calcularOrcamento(double salario){
        double investimento = salario * 0.2;
        double desejos = salario * 0.3;
        double contas = salario * 0.5;
        return new OrcamentoResponse(investimento, desejos, contas);
    }

     public OrcamentoResponse criarOrcamento(String perfil, Double salario) {

        OrcamentoResponse calculo = calcularOrcamento(salario);

        OrcamentoEntity entity = new OrcamentoEntity();
        entity.setPerfil(perfil);
        entity.setSalario(salario);

        orcamentoRepository.save(entity);

        return calculo;
    }
    
    public List<OrcamentoEntity> listar() {
        return orcamentoRepository.findAll();
    } 
}

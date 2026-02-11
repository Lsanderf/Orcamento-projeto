package com.lucca.orcamento.controller;

import java.util.List;
import com.lucca.orcamento.entity.OrcamentoEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.lucca.orcamento.service.OrcamentoService;
import com.lucca.orcamento.dto.OrcamentoResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.lucca.orcamento.dto.OrcamentoRequest;
import jakarta.validation.Valid;


@RequestMapping("/orcamento")
@RestController

public class OrcamentoController {
    private final OrcamentoService orcamentoService;
    
    public OrcamentoController(OrcamentoService orcamentoService){
        this.orcamentoService = orcamentoService;
    }
    @GetMapping
    public OrcamentoResponse calcular(@RequestParam double salario){
        return orcamentoService.calcularOrcamento(salario);
    }

    @PostMapping
    public OrcamentoResponse criar(@Valid @RequestBody OrcamentoRequest request) {
        return orcamentoService.criarOrcamento(
            request.getPerfil(),
            request.getSalario()
    );
}

    @GetMapping("/listar")
    public List<OrcamentoEntity> listar() {
        return orcamentoService.listar();
    }

}

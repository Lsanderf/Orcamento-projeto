package com.lucca.orcamento.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.lucca.orcamento.entity.OrcamentoEntity;

public interface OrcamentoRepository extends JpaRepository<OrcamentoEntity, Long>{
    
}

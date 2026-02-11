package com.lucca.orcamento.dto;

public class OrcamentoResponse {

    private double investimentos;
    private double contas;
    private double desejos;

    public OrcamentoResponse(double investimentos, double desejos, double contas){
        this.investimentos = investimentos;
        this.contas = contas;
        this.desejos = desejos;

    }

    public double getInvestimentos(){
        return investimentos;
    }

    public double getContas(){
        return contas;
    }

    public double getDesejos(){
        return desejos;
    }

}

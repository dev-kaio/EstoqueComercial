package com.mycompany.estoquecomercial.Classes;

public class Movimentacao {
    public String nomep;
    public String dataMovimentacao; // considerar troca de tipo de variável (diferente de String
    public int qtdeMovimentada;
    public String tipoMovimentacao; // entrada ou saída

    public Movimentacao(String nomep, String dataMovimentacao, int qtdeMovimentada, String tipoMovimentacao) {
        this.nomep = nomep;
        this.dataMovimentacao = dataMovimentacao;
        this.qtdeMovimentada = qtdeMovimentada;
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public String getNomep() {
        return nomep;
    }

    public void setNomep(String nomep) {
        this.nomep = nomep;
    }

    public String getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(String dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public int getQtdeMovimentada() {
        return qtdeMovimentada;
    }

    public void setQtdeMovimentada(int qtdeMovimentada) {
        this.qtdeMovimentada = qtdeMovimentada;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }
    
    
}

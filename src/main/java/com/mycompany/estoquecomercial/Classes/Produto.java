package com.mycompany.estoquecomercial.Classes;

public class Produto extends Categoria {

    public String nomep;
    public double preco;
    public int unidade;
    public int quantidade;
    public int qtdeMin;
    public int qtdeMax;
    public String categoria;

    public Produto(String nomep, double preco, int unidade, int quantidade, int qtdeMin, int qtdeMax, String categoria, String nome, String tamanho, String embalagem) {
        super(nome, tamanho, embalagem);
        this.nomep = nomep;
        this.preco = preco;
        this.unidade = unidade;
        this.quantidade = quantidade;
        this.qtdeMin = qtdeMin;
        this.qtdeMax = qtdeMax;
        this.categoria = categoria;
    }

    public String getNomep() {
        return nomep;
    }

    public void setNomep(String nomep) {
        this.nomep = nomep;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQtdeMin() {
        return qtdeMin;
    }

    public void setQtdeMin(int qtdeMin) {
        this.qtdeMin = qtdeMin;
    }

    public int getQtdeMax() {
        return qtdeMax;
    }

    public void setQtdeMax(int qtdeMax) {
        this.qtdeMax = qtdeMax;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}

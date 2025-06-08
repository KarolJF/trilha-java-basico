package com.mona.estoque.model;

public class Produto {
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidadeInicial) {
        this.nome = nome;
        this.quantidade = quantidadeInicial;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void entrada(int qtd) {
        quantidade += qtd;
    }

    public boolean saida(int qtd) {
        if (qtd <= quantidade) {
            quantidade -= qtd;
            return true;
        }
        return false;
    }
}

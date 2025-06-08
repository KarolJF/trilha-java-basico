package com.mona.estoque.service;

import com.mona.estoque.model.Produto;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    private Produto produto;

    public void criarProduto(String nome, int quantidade) {
        this.produto = new Produto(nome, quantidade);
    }

    public String atualizarEstoque(String operacao, int valor) {
        if (produto == null) {
            return "Erro: produto ainda não foi criado.";
        }

        if (operacao.equalsIgnoreCase("entrada")) {
            produto.entrada(valor);
            return "Entrada realizada com sucesso!";
        } else if (operacao.equalsIgnoreCase("saida")) {
            if (produto.saida(valor)) {
                return "Saída realizada com sucesso!";
            } else {
                return "Erro: estoque insuficiente.";
            }
        } else {
            return "Erro: operação inválida.";
        }
    }

    public Produto getProduto() {
        return produto;
    }
}

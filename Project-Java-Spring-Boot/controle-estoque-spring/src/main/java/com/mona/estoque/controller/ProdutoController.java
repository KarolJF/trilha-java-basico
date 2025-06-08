package com.mona.estoque.controller;

import com.mona.estoque.model.Produto;
import com.mona.estoque.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estoque")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/criar")
    public String criarProduto(@RequestParam String nome, @RequestParam int quantidade) {
        produtoService.criarProduto(nome, quantidade);
        return "Produto criado com sucesso.";
    }

    @PostMapping("/atualizar")
    public String atualizarEstoque(@RequestParam String operacao, @RequestParam int quantidade) {
        return produtoService.atualizarEstoque(operacao, quantidade);
    }

    @GetMapping("/ver")
    public Produto verProduto() {
        return produtoService.getProduto();
    }
}

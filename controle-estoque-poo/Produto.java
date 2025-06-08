// Produto.java
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
        System.out.println("Entrada realizada: " + qtd + " unidades do produto " + nome);
    }

    public void saida(int qtd) {
        if (qtd <= quantidade) {
            quantidade -= qtd;
            System.out.println("Saída realizada: " + qtd + " unidades do produto " + nome);
        } else {
            System.out.println("Erro: Estoque insuficiente para saída.");
        }
    }
}

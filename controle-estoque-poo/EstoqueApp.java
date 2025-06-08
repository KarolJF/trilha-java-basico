// EstoqueApp.java
import java.util.Scanner;

public class EstoqueApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();

        System.out.println("Digite a quantidade atual:");
        int quantidadeInicial = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        Produto produto = new Produto(nome, quantidadeInicial);

        System.out.println("Digite a operação (entrada ou saida):");
        String operacao = scanner.nextLine();

        System.out.println("Digite a quantidade da operação:");
        int qtdOperacao = scanner.nextInt();

        if (operacao.equalsIgnoreCase("entrada")) {
            produto.entrada(qtdOperacao);
        } else if (operacao.equalsIgnoreCase("saida")) {
            produto.saida(qtdOperacao);
        } else {
            System.out.println("Erro: Operação inválida.");
        }

        System.out.println("Estoque atual do produto " + produto.getNome() + ": " + produto.getQuantidade());
    }
}


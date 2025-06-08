import java.util.Scanner;

public class EstoqueA {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Quantidade atual: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        Produto produto = new Produto(nome, quantidade);

        System.out.print("Operação (entrada ou saida): ");
        String operacao = scanner.nextLine();

        System.out.print("Quantidade da operação: ");
        int valor = scanner.nextInt();

               // Chama o método correto na instância do produto, dependendo da operação
        if (operacao.equalsIgnoreCase("entrada")) {
            produto.entrada(valor);
        } else if (operacao.equalsIgnoreCase("saida")) {
            produto.saida(valor);
        } else {
            System.out.println("Operação inválida. Use 'entrada' ou 'saida'.");
        }

        System.out.println("Estoque atual do produto '" + produto.getNome() + "': " + produto.getQuantidade());
        
        scanner.close();
    }
}


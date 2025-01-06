import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e capturar os dados do usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();
        scanner.nextLine();
        // Exibir a mensagem final
        System.out.println("Olá " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + 
            ", conta " + numero + 
            " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque.");
            scanner.nextLine();
        scanner.close();
    }
}
## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


##Explicação da Estrutura criada passo a passo:

#Importação de Bibliotecas
java

#Copiar código
import java.util.Scanner;

#O que é?
Essa linha importa a classe Scanner do Java.
Por que usamos?
#O Scanner é como uma "ferramenta" que ajuda a ler o que o usuário digita no teclado e traz essas informações para dentro do programa.

##Método Principal
public static void main(String[] args) {

#O que é?
Esse é o ponto de entrada do programa. Quando o programa começa a rodar, ele olha para dentro do método main para saber o que fazer.
#Por que usamos?
É obrigatório para que o programa funcione. O Java precisa saber por onde começar.

##Criar o Scanner
Scanner scanner = new Scanner(System.in);

*O que é?
Aqui estamos criando um "objeto" chamado scanner. Ele é como um "ouvido" que escuta o que o usuário digita no teclado.
#Por que usamos?
Para capturar informações do teclado, como o número da agência, conta, nome do cliente e saldo.

##Solicitar a Agência, Conta, Nome do cliente, etc ...

#Código Exemplo
System.out.println("Por favor, digite o número da Agência:");
String agencia = scanner.nextLine();
#O que é?
System.out.println: Mostra uma mensagem na tela.
scanner.nextLine(): Lê o texto digitado pelo usuário.
String agencia: Guarda o texto da agência numa "caixinha" chamada agencia.
scanner.nextInt(): Lê um número inteiro digitado pelo usuário.
scanner.nextLine(): Consome a quebra de linha deixada pelo nextInt() para evitar problemas no próximo nextLine().

##Exibir a Mensagem Final

System.out.println("Olá " + nomeCliente + 
    ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + 
    ", conta " + numero + 
    " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque.");

#O que é?
System.out.println: Mostra a mensagem final ao usuário.
String.format("%.2f", saldo): Formata o saldo com 2 casas decimais.
O uso de +: Serve para juntar (concatenar) as partes da mensagem.
#Por que usamos?
Para informar ao usuário os dados da conta que ele criou.

##Fechar o Scanner

Copiar código
scanner.close();

#O que é?
Fecha o "ouvido" do scanner para economizar recursos do sistema.
#Por que usamos?
É uma boa prática liberar os recursos usados pelo programa.


##Pontos Importantes
Entrada de Dados: Usamos "nextLine" para texto, "nextInt" para números inteiros e "nextDouble" para números decimais.
Tratamento de Problemas: Após um "nextInt" ou "nextDouble", sempre use nextLine() para limpar o buffer.
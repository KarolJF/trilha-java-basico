public class ExemploForArray {
        public static void main(String[] args) {
                 //public static void main(String[] args): Este é o ponto de entrada do programa Java. Sempre que você executa um programa Java, ele começa a rodar a partir daqui.
                //public: Significa que este método pode ser acessado por qualquer parte do programa.
                //static: Indica que o método pode ser chamado sem criar um objeto da classe.
                //void: Significa que o método não retorna nenhum valor.
                //String[] args: É um array de Strings que pode conter argumentos passados ao programa (não usamos neste exemplo).

        String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos" };
        //Declaração de um Array:
        //String alunos[]: Aqui estamos criando um array chamado alunos. Um array é como uma "caixa" que armazena vários valores do mesmo tipo, no caso, Strings (textos).
        //{"Felipe", "Jonas", "Julia", "Marcos"}: Estes são os valores do array, ou seja, os nomes dos alunos armazenados.
        //Como funciona o array?

        //O array alunos tem 4 posições (ou índices).
        //Os índices começam em 0, então:
        //alunos[0] = "Felipe"
        //alunos[1] = "Jonas"
        //alunos[2] = "Julia"
        //alunos[3] = "Marcos"


                for (int x=0; x<alunos.length; x++) {
                //Laço de Repetição (for):

//O for é usado para repetir uma ação várias vezes, no caso, percorrer o array alunos.
//Vamos dividir o for em 3 partes:
//int x = 0;: Define a variável x (contador), que começa com o valor 0 (primeiro índice do array).
//x < alunos.length;: Diz que o laço vai continuar enquanto x for menor que o tamanho do array (alunos.length, que é 4).
//x++: Depois de cada repetição, o valor de x aumenta em 1.
//O que ele faz?
//O laço começa em x = 0 e vai aumentando até x = 3 (porque o tamanho do array é 4, e o último índice é 3).        

                        System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);

                        //Exibindo os Resultados:
//System.out.println: Comando que imprime informações no console.
//Aqui, ele combina:
//"O aluno no índice x=": Um texto fixo.
//x: O valor atual do índice (ex: 0, 1, 2, 3).
//alunos[x]: O nome do aluno correspondente ao índice atual.
//Exemplo de saída no console:
//mathematica
//Copiar código
//O aluno no índice x=0 é Felipe
//O aluno no índice x=1 é Jonas
//O aluno no índice x=2 é Julia
//O aluno no índice x=3 é Marcos
                } 
        }
        
}

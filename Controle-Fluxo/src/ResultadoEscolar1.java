//Condicional Encadeada

public class ResultadoEscolar1 {
    public static void main(String[] args) {
        int nota = 4;

    if(nota >= 7)//true
        System.out.println("Aprovado");

    else if(nota >= 5 && nota < 7)
        System.out.println("Prova Reprovado");

    else
        System.out.println("Reprovado");//true ou false
    }
}

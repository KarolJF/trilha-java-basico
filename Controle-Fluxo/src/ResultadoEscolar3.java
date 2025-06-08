//Condicional ternária

public class ResultadoEscolar3 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int nota = 7;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ?"Recuperação" : "reprovado";// apos o ponto de interrogação ele atribui o valor da variavels "Aprovado"
        System.out.println("Resultado");//true ou false // : é se não
    }
}
// refatorando o codigo ResultadoEscolar1
// linha 4 se a nota fora >=7 imprime pra mim "Aprovado" se não a no0ta  for  >=5 i nota <7 imprime pra mim "Recuperação ou se não Reprovado"
public class SistemaMedida {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        String sigla = "M";

        if (sigla == "p")
            System.out.println("Pequeno");
        else if(sigla == "M")
            System.out.println("Medio");
        else if(sigla == "G")
            System.out.println("Grande");
        else
            System.out.println("INDEFINIDO");    
            
    }
}
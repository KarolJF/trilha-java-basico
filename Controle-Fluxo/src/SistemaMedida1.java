// refatorando o codigo SistemaMedida1 Swithc Case
public class SistemaMedida1 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String sigla = "A";
        switch (sigla) {
            case "P":{
                System.out.println("Pequeno");                
                break;
            }
            case "M":{
                System.out.println("Medio");                
                break;
            }    
            case "G":{
                System.out.println("Grande");                
                break;
            } 
            default:
                System.out.println("INDEFINIDO"); 

            }
    }
}

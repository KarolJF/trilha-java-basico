//Joãozinho resolveu ligar para o seu amigo dizendo que hoje seentupiu de comer docinhos;

import java.util.Random;

public class DoWhile2 {
        public static void main(String[] args) {
                System.out.println("Discando ...");

                do{
                        // executando repetidas vezes até alguém atender
                        System.out.println("Telefone tocando");
                }while(tocando());
                System.out.println("Alô !!!");
        }
        private static boolean tocando(){
                boolean atendeu = new Random().nextInt(3)==1;
                System.out.println("Atendeu? " + atendeu);
                // negando o ato de coninuar tocando
                return ! atendeu;
        }    
}

//Joãozinho recebeu r$50,00 de mesada e foi em uma loja de doces gastar todo o seu dinheiro, logo, "enquanto" o valor dos doces não igualar a r$50,00 ele foi adicionando intens no carrinho.

import java.util.concurrent.*;

public class ExemploWhile {
        public static void main(String[] args) {
                double mesada = 50.0;
                
                while (mesada > 0) {
                        Double valorDoce = valorAleatorio();
                                                /*
                                                if(valorDoce > mesada)
                                                        valorDoce = mesada;
                                                */        
                                                System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho ");
                                                mesada = mesada - valorDoce;
                                        }
                                        System.out.println("Mesada:" + mesada);
                                        System.out.println("Joãozinho gastou toda a sua mesada em doces");
                        
                                }
                        
                                private static Double valorAleatorio() {
                                        // TODO Auto-generated method stub
                                        throw new UnsupportedOperationException("Unimplemented method 'valorAleatorio'");
                                }
        
}

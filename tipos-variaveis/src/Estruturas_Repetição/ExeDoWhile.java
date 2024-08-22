//João resolver ligar para o seu amigo dizendo que cansou de comer doce.

package Estruturas_Repetição;

import java.util.Random;

public class ExeDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando");
        } while (tocando());
        
        System.out.println("Alo !!!");
    }

    private static boolean tocando() {
        // Use o método correto `nextInt(int bound)` para gerar um número aleatório entre 0 e 2
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;
    }
}


//Exemplo
//Joao recebeu 50 reais de mesada e foi em uma loja de doces gastar todo seu dinheiro, logo, enquanto o valor dos doces não igualar a 50 ele foi adicionando itens no carrinho.

package Estruturas_Repetição;

import java.util.concurrent.ThreadLocalRandom;

public class ExemWhile {

    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada; // Garante que não compre um doce mais caro que a mesada restante

            System.out.println("Doce do valor: " + valorDoce + " adicionado no carrinho");
            mesada -= valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces.");
    }

    private static double valorAleatorio() {
        // Usa ThreadLocalRandom para gerar um valor aleatório entre 2 e 15
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}


package Estruturas_Repetição;

public class ExemploFor {
    public static void main(String[] args) {
        // Laço "for" que inicializa a variável 'carneirinhos' com valor 1 e repete até que seu valor seja 20
        for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
            // Imprime o texto seguido pelo número atual da contagem
            System.out.println("Contando carneirinhos " + carneirinhos);
        }
        System.out.println("Fim");
    }
}
/*
    Método principal que é o ponto de entrada do programa.
    Este método utiliza um laço "for" para contar de 1 a 20, imprimindo a cada iteração a frase 
    "Contando carneirinhos" seguido pelo número atual da contagem.
*/
//AULA 1
public class Variaveis {
    // Variáveis primitivas
    byte diasDaSemana = 7; // Tipo byte, armazena pequenos inteiros (-128 a 127)
    short anoNascimento = 1995; // Tipo short, armazena inteiros de -32.768 a 32.767
    int populacaoCidade = 1500000; // Tipo int, armazena inteiros de -2.147.483.648 a 2.147.483.647
    long distanciaEstrela = 9460730472580800L; // Tipo long, armazena grandes inteiros, termine com 'L'

    float altura = 1.75F; // Tipo float, armazena números decimais com precisão simples, termine com 'F'
    double saldoBancario = 1250.75; // Tipo double, armazena números decimais com precisão dupla

    boolean isVacinado = true; // Tipo boolean, armazena verdadeiro (true) ou falso (false)
    char inicialDoNome = 'A'; // Tipo char, armazena um único caractere, como 'A', 'B', etc.

    public static void main(String[] args) throws Exception {
    Variaveis exemplo = new Variaveis(); 

    // Exibindo valores das variáveis
    System.out.println("Dias da Semana: " + exemplo.diasDaSemana);
    System.out.println("Ano de Nascimento: " + exemplo.anoNascimento);
    System.out.println("População da Cidade: " + exemplo.populacaoCidade);
    System.out.println("Distância até a Estrela mais próxima (em km): " + exemplo.distanciaEstrela);
    System.out.println("Altura: " + exemplo.altura);
    System.out.println("Saldo Bancário: " + exemplo.saldoBancario);
    System.out.println("Vacinado: " + exemplo.isVacinado);
    System.out.println("Inicial do Nome: " + exemplo.inicialDoNome);
    }
} 
    /* -----EXEMPLO----
public class Variaveis {
    public static void main(String[] args) throws Exception {
        
        double salarioMinimo = 2500;
        int numero = 5;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        numero = 10;

        System.err.println(numero);

        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
    }
}*/

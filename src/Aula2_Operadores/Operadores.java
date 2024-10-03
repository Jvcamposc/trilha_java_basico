package Aula2_Operadores;
/*//AULA 2
public class Operadores {
    public static void main(String[] args) {
        // Operadores Aritméticos
        int soma = 10 + 5; // Adição
        int subtracao = 10 - 5; // Subtração
        int multiplicacao = 10 * 5; // Multiplicação
        int divisao = 10 / 5; // Divisão
        int resto = 10 % 3; // Módulo (resto da divisão)

        // Operadores de Atribuição
        int numero = 10;
        numero += 5; // Equivalente a numero = numero + 5; (valor final: 15)
        numero -= 3; // Equivalente a numero = numero - 3; (valor final: 12)
        numero *= 2; // Equivalente a numero = numero * 2; (valor final: 24)
        numero /= 4; // Equivalente a numero = numero / 4; (valor final: 6)
        numero %= 2; // Equivalente a numero = numero % 2; (valor final: 0)

        // Operadores de Comparação
        boolean isMaior = 10 > 5; // Maior que (true)
        boolean isMenor = 10 < 5; // Menor que (false)
        boolean isIgual = 10 == 10; // Igual a (true)
        boolean isDiferente = 10 != 5; // Diferente de (true)
        boolean isMaiorOuIgual = 10 >= 5; // Maior ou igual a (true)
        boolean isMenorOuIgual = 10 <= 5; // Menor ou igual a (false)

        // Operadores Lógicos
        boolean isVerdadeiro = true && false; // Operador E (false)
        boolean isFalso = true || false; // Operador OU (true)
        boolean isNegacao = !true; // Negação (false)

        // Operador Ternário
        int idade = 20;
        String mensagem = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        // Se idade >= 18, mensagem é "Maior de idade", senão "Menor de idade"

        // Exibindo os resultados
        System.out.println("Operadores Aritméticos:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto da divisão: " + resto);

        System.out.println("\nOperadores de Atribuição:");
        System.out.println("Resultado final de numero: " + numero);

        System.out.println("\nOperadores de Comparação:");
        System.out.println("10 > 5: " + isMaior);
        System.out.println("10 < 5: " + isMenor);
        System.out.println("10 == 10: " + isIgual);
        System.out.println("10 != 5: " + isDiferente);
        System.out.println("10 >= 5: " + isMaiorOuIgual);
        System.out.println("10 <= 5: " + isMenorOuIgual);

        System.out.println("\nOperadores Lógicos:");
        System.out.println("true && false: " + isVerdadeiro);
        System.out.println("true || false: " + isFalso);
        System.out.println("!true: " + isNegacao);

        System.out.println("\nOperador Ternário:");
        System.out.println("Mensagem: " + mensagem);
    }
}*/

public class Operadores {
    public static void main(String[] args) {
        // Operadores de Incremento e Decremento
        int contador = 0; // Etapa 1: Inicializa a variável 'contador' com o valor 0

        contador++; // Etapa 2: Incrementa o valor de 'contador' em 1 (agora 'contador' é 1)
        
        contador--; // Etapa 3: Decrementa o valor de 'contador' em 1 (agora 'contador' é 0)

        System.out.println("\nOperadores de Incremento e Decremento:" + contador++);
        System.out.println("Contador após incremento e decremento: " + contador); // Etapa 4: Exibe o valor final de 'contador' (que é 0)
    }
}


/*
 * ----CONTATENAÇÃO---
 * package operadores;
 * 
 * public class operadores {
 * public static void main(String[] args) {
 * String concatenacao = "?";
 * //concatenacao = "31"
 * concatenacao = 1 + 1 + 1 + "1";
 * System.err.println(concatenacao);
 * //concatenacao = "1111"
 * concatenacao = 1 + "1" + 1 + 1;
 * System.err.println(concatenacao);
 * //concatenacao = "1111"
 * concatenacao = 1 + "1" + 1 + "1";
 * System.err.println(concatenacao);
 * //concatenacao = "1111"
 * concatenacao = "1" + 1 + 1 + 1;
 * System.err.println(concatenacao);
 * //concatenacao = "13"
 * concatenacao = "1" + (1 + 1 + 1);
 * System.err.println(concatenacao);
 * }
 * }
 */
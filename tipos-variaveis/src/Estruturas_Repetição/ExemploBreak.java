package Estruturas_Repetição;

public class ExemploBreak {
    public static void main(String[] args) {
        System.out.println("----Usando o Break--");
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                break;

            System.out.println(numero);
        }
        System.out.println("--- Usando o Continue--");
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                continue;

            System.out.println(numero);
        }
    }
}

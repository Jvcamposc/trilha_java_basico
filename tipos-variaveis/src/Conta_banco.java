//DEFESAFIO

import java.util.Locale;
import java.util.Scanner;

public class Conta_banco {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        //Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("---------CADRASTRO-----");
                System.out.println("Por favor, digite numero da conta:");
                numero = scanner.nextInt();
            
                System.out.println("Por favor, digite o numero da agência");
                agencia = scanner.next();
                
                System.out.println("Por favor, digite o seu nome:");
                nomeCliente = scanner.next();
            
                System.out.println("Por favor, digite o saldo de sua conta: ");
                saldo = scanner.nextDouble();
        }

System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso branco. "+ "\n " + "Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.\n");
    }
}
/*
1-Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:

2-Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.

3-Revise sobre regras de declaração de variáveis
Atributo	Tipo	Exemplo
Numero	Inteiro	1021
Agencia	Texto	067-8
Nome Cliente	Texto	MARIO ANDRADE
Saldo	Decimal	237.48


3-Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:

4-Programa: "Por favor, digite o número da Agência !"
5-Usuário: 1021 (depois ENTER para o próximo campo)

6-Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque". */
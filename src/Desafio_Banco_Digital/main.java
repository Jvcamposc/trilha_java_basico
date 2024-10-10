package Desafio_Banco_Digital;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Banco Digital ---");
        System.out.print("Insira o seu nome: ");
        String nome = input.nextLine();
        System.out.print("Insira o seu CPF: ");
        String cpf = input.nextLine();

        Cliente clienteAtual = new Cliente(nome, cpf);
        System.out.println("\nOlá " + clienteAtual.getNome() + ", vamos criar sua conta!");

        System.out.print("Insira o número da agência: ");
        int numAgencia = input.nextInt();
        System.out.print("Insira o número da conta: ");
        int numConta = input.nextInt();

        Conta contaAtual = new Conta(numAgencia, numConta, clienteAtual);
        System.out.println("\nConta criada com sucesso!");

        int opcaoMenu;
        do {
            System.out.println("\nQual operação deseja realizar?");
            System.out.println("1 - Consultar dados;");
            System.out.println("2 - Consultar saldo;");
            System.out.println("3 - Depositar;");
            System.out.println("4 - Sacar;");
            System.out.println("5 - Sair.");
            opcaoMenu = input.nextInt();

            switch (opcaoMenu) {
                case 1:
                    exibirDadosConta(clienteAtual, contaAtual);
                    break;
                case 2:
                    consultarSaldo(contaAtual);
                    break;
                case 3:
                    realizarDeposito(input, contaAtual);
                    break;
                case 4:
                    realizarSaque(input, contaAtual);
                    break;
                case 5:
                    System.out.println("--- Até logo! ---");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcaoMenu != 5);
        
        input.close();
    }

    private static void exibirDadosConta(Cliente cliente, Conta conta) {
        System.out.println("--- Dados da Conta ---");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Num. Agência: " + conta.getAgencia());
        System.out.println("Num. Conta: " + conta.getNumero());
    }

    private static void consultarSaldo(Conta conta) {
        System.out.println("--- Saldo da Conta ---");
        System.out.printf("Saldo atual da conta: R$ %.2f%n", conta.consultarSaldo());
    }

    private static void realizarDeposito(Scanner input, Conta conta) {
        System.out.println("--- Depositar ---");
        System.out.print("Insira o valor para depósito: ");
        double deposito = input.nextDouble();
        conta.depositar(deposito);
        System.out.printf("Depósito no valor de R$ %.2f realizado com sucesso!%n", deposito);
    }

    private static void realizarSaque(Scanner input, Conta conta) {
        System.out.println("--- Sacar ---");
        System.out.print("Insira o valor para saque: ");
        double saque = input.nextDouble();
        if (saque <= conta.consultarSaldo()) {
            conta.sacar(saque);
            System.out.printf("Saque no valor de R$ %.2f realizado com sucesso!%n", saque);
        } else {
            System.out.println("Valor indisponível na conta!");
        }
    }
}

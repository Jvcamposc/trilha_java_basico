package projeto;

import java.util.Scanner;

public class telecomunicações { // Renomeado para seguir a convenção Java
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        System.out.println("Digite o serviço a ser verificado:");
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        System.out.println("Digite o nome do cliente seguido pelos serviços contratados, separados por vírgulas:");
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        // Verificando se o serviço está na lista de serviços contratados
        for (int i = 1; i < partes.length; i++) {
            if (partes[i].equalsIgnoreCase(servico)) { // Comparação case-insensitive
                contratado = true;
                break;
            }
        }

        // Saída: Sim ou Nao
        if (contratado) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }
        
        scanner.close();
    }
}

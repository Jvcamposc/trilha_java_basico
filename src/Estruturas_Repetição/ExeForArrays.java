package Estruturas_Repetição;

public class ExeForArrays {
    public static void main(String[] args) {
        // Declaração de um array de strings chamado 'alunos' e inicialização com 4
        // nomes
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS " };

        for (String aluno : alunos) {
            System.out.println("Nome do aluno e: " + aluno);
        }
    }
}

/*package Estruturas_Repetição;

public class ExeForArrays {
    public static void main(String[] args) {
        // Declaração de um array de strings chamado 'alunos' e inicialização com 4
        // nomes
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS " };

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " e " + alunos[x]);
        }
    }
}*/

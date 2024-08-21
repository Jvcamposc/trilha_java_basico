package Estruturas_Repetição;

public class ExeForArrays {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS "};

        for(int x=0; x<alunos.length; x++){
            System.out.println("O aluno no indice x=" + x + " e " + alunos[x]);
        }
    }
}

package Getter_Setter;

public class Aluno {
    String nome;
    int idade;

    public String getNome(){
        return nome;
    }

    public void setNome(String newNome){
        nome = newNome; 
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int newIdade){
        this.idade = newIdade;
    }
}

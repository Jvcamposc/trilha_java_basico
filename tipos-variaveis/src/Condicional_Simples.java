//Aula
//Aula explicando IF-ELSE simples
public class Condicional_Simples {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 22.0;

        if (valorSolicitado < saldo) {// Se o valor solicitado for menor que o saldo ele sera subtraido.
            saldo = saldo - valorSolicitado;// 25 - 17 = 8
            System.out.println("Novo saldo: " + saldo);
        } else
            System.out.println("Saldo insuficiente");

        System.out.println(saldo);
    }
}

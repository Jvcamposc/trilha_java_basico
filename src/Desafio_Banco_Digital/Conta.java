package Desafio_Banco_Digital;

public class Conta {
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(int numAgencia, int numConta, Cliente cliente) {
        this.agencia = numAgencia;
        this.numero = numConta;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}

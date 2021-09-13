package LoopsArrays;

public class Conta {
    private int numeroConta;
    private int saldo;
    private Cliente titular;

    public Conta() {
        this.saldo = 1000;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int depositar(int valor) {
        this.saldo += valor;
        return this.saldo;
    }

    public int sacar(int valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            this.saldo -= valor;
        }
        return this.saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}

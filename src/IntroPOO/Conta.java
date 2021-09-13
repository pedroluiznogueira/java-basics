package IntroPOO;

public class Conta {
    private int numeroConta;
    private int  saldo;
    private Cliente titular;

    public Conta() {

    }

    public int depositar(int valor) {
        this.saldo += valor;
        return this.saldo;
    }

    public int saque(int valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
        return this.saldo;
    }
}

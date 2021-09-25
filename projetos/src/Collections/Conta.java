package Collections;

// modelo, não crio mais objeto diretos
public abstract class Conta {

    private String numero;
    private double saldo;
    private Cliente titular;

    // construtor retorna objetos do tipo conta, não especifica retorno
    public Conta() {
        this.saldo = 0;
        this.numero = "1";
    }

    public Conta(String numero) {
        this.saldo = 0;
        this.numero =  numero;
    }

    public Conta(Cliente titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    public double consultarSaldo() {
        return this.saldo;
    }
}

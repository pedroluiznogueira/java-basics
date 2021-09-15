// modelo, não crio mais objeto diretos
public abstract class Conta {

    private String numero;
    private double saldo;
    private Cliente titular;

    // construtor retorna objetos do tipo conta, não especifica retorno
    public Conta(Cliente titular) {
        this.saldo = 0;
        this.numero = "1";
        this.titular = titular;
    }

    public Conta(Cliente titular, String conta) {
        this.saldo = 0;
        this.numero =  numero;
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

    // Sobre escrevendo o equals de Object
    @Override
    public boolean equals(Object objeto) {
        // Se faço referencia ao mesmo objeto em memória
        if (this == objeto) {
            return true;
        } // ambos são contas (só tenho certeza que o primeiro é conta, não o do parâmetro)? e ambos estão preenchidos ?
        else if ((objeto instanceof Conta) && (objeto != null)) {
            // Fazendo casting, pois era do tipo Object apenas
            Conta conta = (Conta) objeto;

            // São o mesmo objeto em memória ? Têm o mesmo número ?
            return this.numero.equals(conta.numero);
        } else {
            return false;
        }
    }
}

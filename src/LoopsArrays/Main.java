package LoopsArrays;

public class Main {
    public static void main(String[] args) {

        // criando objeto do tipo Cliente
        Cliente umClienteUm = new Cliente();

        // setters
        umClienteUm.setNome("pedro");
        umClienteUm.setSobrenome("luiz");

        // criando objeto do tipo Conta
        Conta contaUm = new Conta();

        // setters
        contaUm.setTitular(umClienteUm);

        // métodos
        contaUm.depositar(500);
        contaUm.sacar(300);
        contaUm.sacar(2000);

        // saida de dados
        System.out.println(umClienteUm.getSobrenome());
        System.out.println(contaUm.getSaldo());
    }
}

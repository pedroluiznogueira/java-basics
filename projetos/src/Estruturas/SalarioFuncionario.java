package Estruturas;


import java.time.LocalDate;

public class SalarioFuncionario {

    public static void main(String[] args) {

        int anoInicial = 1995;
        LocalDate anoAtual = LocalDate.now();

        double salarioInicial = 1000;
        double aumentoInicial = 0.015;
        double salarioAtual = salarioInicial;

        // lógica
        int ano = anoInicial + 1;
        salarioAtual = (salarioAtual * aumentoInicial) + salarioAtual;

        while (ano < anoAtual.getYear()) {
            ano++;
            aumentoInicial = 2 * aumentoInicial;
            salarioAtual = (salarioAtual * aumentoInicial) + salarioAtual;
        }

        // saída de dados
        System.out.println("O salário atual do funcionário é: " + salarioAtual);
    }
}
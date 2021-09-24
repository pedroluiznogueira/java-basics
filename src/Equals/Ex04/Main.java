package Equals.Ex04;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

        Funcionario funcionarioUm  = new Funcionario("fulano", 1);
        Funcionario funcionarioDois  = new Funcionario("ciclano", 2);
        Funcionario funcionarioTres  = new Funcionario("beltrano", 3);
        Funcionario funcionarioQuatro  = new Funcionario("deltrano", 4);

        listaFuncionarios.add(funcionarioUm);
        listaFuncionarios.add(funcionarioDois);
        listaFuncionarios.add(funcionarioTres);
        listaFuncionarios.add(funcionarioQuatro);

        for (Funcionario funcionario: listaFuncionarios) {
            System.out.println(funcionario);
        }

        Funcionario funcionarioCinco  = new Funcionario("boo", 4);

        System.out.println(listaFuncionarios.contains(funcionarioCinco));
    }
}

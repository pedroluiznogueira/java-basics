package LoopsArrays;

public class Principal {

    public static void main(String[] args) {

        FuncionarioPessoaFisica gerenteUm = new FuncionarioPessoaFisica();
        FuncionarioPessoaFisica supervisorUm = new FuncionarioPessoaFisica();

        FuncionarioPessoaFisica funcionarioUm = new FuncionarioPessoaFisica();
        FuncionarioPessoaJuridica funcionarioDois = new FuncionarioPessoaJuridica();

        int salarioBaseGerente = gerenteUm.getSalarioBase();
        double bonificacaoGerenteUm = gerenteUm.bonificarGerente();

        int salarioBaseSupervisor = supervisorUm.getSalarioBase();
        double bonificacaoSupervisorUm = supervisorUm.bonificarSupervisor();

        System.out.println(salarioBaseGerente);
        System.out.println(bonificacaoGerenteUm);

        System.out.println(salarioBaseSupervisor);
        System.out.println(bonificacaoSupervisorUm);
        gerenteUm.demitirFuncionario();
        supervisorUm.demitirGerente();
    }
}
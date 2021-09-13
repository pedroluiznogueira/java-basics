package LoopsArrays;

public class FuncionarioPessoaFisica extends Funcionario {
    private int nit;
    private int bonificacao;

    public FuncionarioPessoaFisica() {
        super();
    }

    public double bonificarGerente() {
        int salario = this.getSalarioBase();
        double bonificacao = salario * 1.12;

        return bonificacao;
    }

    public double bonificarSupervisor() {
        int salario = this.getSalarioBase();
        double bonificacao = salario * 1.08;

        return bonificacao;
    }

    public void demitirFuncionario() {
        System.out.println("O funcionario foi demitido");
    }

    public void demitirGerente() {
        System.out.println("O gerente foi demitido");
    }

}

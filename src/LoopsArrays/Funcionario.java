package LoopsArrays;

public abstract class Funcionario {
    private String endereco;
    private String nome;
    private String cpf;
    private String email;
    private String setor;
    private String dataAdmissao;
    private String dataDemissao;
    private int salarioBase;
    private boolean contraCheque;

    public Funcionario() {
        this.salarioBase = 1000;
    }

    public int getSalarioBase() {
        return salarioBase;
    }
}

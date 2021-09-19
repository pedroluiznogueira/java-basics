package Collections.TrabalhandoComStreams;

public class Funcionario {
    private String nome;
    private int valorHora;
    private int qtdHorasTrabalhadas;
    private int salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getQtdHorasTrabalhadas() {
        return qtdHorasTrabalhadas;
    }

    public void setQtdHorasTrabalhadas(int qtdHorasTrabalhadas) {
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String toString() {
        return "{" + this.nome + " " + this.valorHora + " " + this.qtdHorasTrabalhadas + " " + this.salario + "}";
    }
}

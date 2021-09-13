package IntroPOO;

public class FuncionarioClt extends Funcionario {
    private int valorCobrado;
    private int horasTrabalhadas;

    public FuncionarioClt(int s) {
        super(s);
    }

    public int getValorCobrado() {
        return valorCobrado;
    }

    public void setValorCobrado(int valorCobrado) {
        this.valorCobrado = valorCobrado;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int calcularSalario(int h, int v) {
        h = this.horasTrabalhadas;
        v = this.valorCobrado;
        this.salario = h * v;

        return this.salario;
    }
}

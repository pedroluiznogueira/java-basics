package Collections.TrabalhandoComStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestandoMap {

    public static void main(String[] args) {

        // lista de funcionarios
        Funcionario func1 = new Funcionario();
        func1.setNome("João");
        func1.setValorHora(100);
        func1.setQtdHorasTrabalhadas(50);

        Funcionario func2 = new Funcionario();
        func2.setNome("Pedro");
        func2.setValorHora(54);
        func2.setQtdHorasTrabalhadas(90);

        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        funcionarios.add(func1);
        funcionarios.add(func2);

        // usando Collectors.toList
        List<Funcionario> salariosAlterados = funcionarios.stream().map(TestandoMap::calcularSalario).collect(Collectors.toList());

        // faz uma ação e retorna void, e precisa ter algo que herda de object como parametro
        funcionarios.stream().forEach(System.out::println);

        // ja o map aceita um objeto que segue o contrato de Function, passa um método que retorna o mesmo tipo da lista que estou trabalhando, que precisa ser Funcionario
        funcionarios.stream().map(TestandoMap::calcularSalario);
    }

    public static Funcionario calcularSalario(Funcionario funcionario) {
        funcionario.setSalario(funcionario.getQtdHorasTrabalhadas() + funcionario.getValorHora());
        return funcionario;
    }
}

package Collections.TrabalhandoComStreams;

import java.util.ArrayList;
import java.util.List;

public class TestandoForEach {

    public static void main(String[] args) {

        // lista de funcionarios
        Funcionario func1 = new Funcionario();
        func1.setNome("João");
        func1.setValorHora(100);
        func1.setQtdHorasTrabalhadas(50);

        Funcionario func2 = new Funcionario();
        func2.setNome("Pedro");
        func1.setValorHora(100);
        func1.setQtdHorasTrabalhadas(50);

        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        funcionarios.add(func1);
        funcionarios.add(func2);

        // faz uma ação e retorna void, e precisa ter algo que herda de object como parametro
        funcionarios.stream().forEach(System.out::println);
    }
}

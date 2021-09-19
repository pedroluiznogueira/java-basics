package construcoes;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<String> materiais = new HashSet<String>();

        materiais.add("Cimento");
        materiais.add("Argamassa");
        materiais.add("Caibros");
        materiais.add("Cal");
        materiais.add("Pedras");
        materiais.add("Caminhão de Agua");
        materiais.add("Betoneira");
        materiais.add("Serviço de obras A - Arquiteto");
        materiais.add("Serviço de obras B - Chefe de obras");
        materiais.add("Serviço de obras C - Pedreiro");

        materiais.remove("Serviço de obras A - Arquiteto");
        materiais.remove("Argamassa");
        materiais.remove("Caminhão de Água");

        for (String material: materiais) {
            System.out.println(material);
        }
    }

}

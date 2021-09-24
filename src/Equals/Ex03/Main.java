package Equals.Ex03;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Aluno> listaAlunos = new ArrayList<Aluno>();

        Aluno alunoUm = new Aluno("pedro", 1);
        Aluno alunoDois = new Aluno("luiz", 2);
        Aluno alunoTres = new Aluno("nogueira", 3);
        Aluno alunoQuatro = new Aluno("mendes", 4);

        listaAlunos.add(alunoUm);
        listaAlunos.add(alunoDois);
        listaAlunos.add(alunoTres);
        listaAlunos.add(alunoQuatro);

        for (Aluno aluno: listaAlunos) {
            System.out.println(aluno);
        }

        Aluno alunoCinco = new Aluno("fulano", 4);

        // a sobrescrita do método equals afeta o contains, pois ele o usa internamente
        if (listaAlunos.contains(alunoCinco)) {
            System.out.println("esta na lista");
        } else {
            System.out.println("não está na lista");
        }

    }
}

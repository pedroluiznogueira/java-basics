package CollectionsAvancado.Ex01;

import java.util.*;

public class Apelidos {

    public static void main(String[] args) {
        // Utilizando array
        String[] joaoApelidos = {"Juan", "Fissura", "Maromba"};
        String[] miguelApelidos = {"Night Watch", "Bruce Wayne", "Tampinha"};
        String[] mariaApelidos = {"Wonder Woman", "Mary", "Marilene"};
        String[] lucasApelidos = {"Lukinha", "Jorge", "George"};

        Map<String, String[]> dicionarioArray = new HashMap<String, String[]>();
        dicionarioArray.put("Joao", joaoApelidos);
        dicionarioArray.put("Miguel", miguelApelidos);
        dicionarioArray.put("Maria", mariaApelidos);
        dicionarioArray.put("Lucas", lucasApelidos);

        for (String chave: dicionarioArray.keySet()) {
            String[] arrayApelidos = dicionarioArray.get(chave);

            System.out.println("Estes são os apelidos do: " + chave);
            for (String apelido: arrayApelidos) {
                System.out.println(apelido);
            }
        }

        System.out.println("======================================================================");

        // Utilizando arraylist
        List<String> joaoAp =  new ArrayList<String>();
        joaoAp.add("Juan");
        joaoAp.add("Fissura");
        joaoAp.add("Maromba");

        List<String> miguelAp =  new ArrayList<String>();
        miguelAp.add("Night Watch");
        miguelAp.add("Bruce Wayne");
        miguelAp.add("Tampinha");

        List<String> mariaAp =  new ArrayList<String>();
        mariaAp.add("Wonder Woman");
        mariaAp.add("Mary");
        mariaAp.add("Marilene");

        List<String> lucasAp =  new ArrayList<String>();
        lucasAp.add("Lukinha");
        lucasAp.add("George");
        lucasAp.add("George");

        Map<String, List<String>> dicionarioArrayList = new HashMap<String, List<String>>();
        dicionarioArrayList.put("Joao", joaoAp);
        dicionarioArrayList.put("Miguel", miguelAp);
        dicionarioArrayList.put("Maria", mariaAp);
        dicionarioArrayList.put("Lucas", lucasAp);

        for (String chave: dicionarioArrayList.keySet()) {
            List<String> listApelidos = dicionarioArrayList.get(chave);

            System.out.println("Estes são os apelidos do: " + chave);

            for (String apelido: listApelidos) {
                System.out.println(apelido);
            }
        }

        System.out.println("======================== Utilizando forEach ==============================================");

        // Utilizando forEach para imprimir
        for (String chave: dicionarioArrayList.keySet()) {
            List<String> listApelidos = dicionarioArrayList.get(chave);

            System.out.println("Estes são os apelidos do: " + chave);

            listApelidos.stream().forEach(apelido -> Apelidos.mostrarApelidos(apelido));
        }

        System.out.println("======================== Utilizando Method Reference ==============================================");

        // Utilizando forEach para imprimir
        for (String chave: dicionarioArrayList.keySet()) {
            List<String> listApelidos = dicionarioArrayList.get(chave);

            System.out.println("Estes são os apelidos do: " + chave);

            listApelidos.stream().forEach(Apelidos::mostrarApelidos);
        }
    }

    public static void mostrarApelidos(String apelido) {
        System.out.println(apelido);
    }
}

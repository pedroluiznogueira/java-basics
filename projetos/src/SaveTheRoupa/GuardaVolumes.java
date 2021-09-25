package SaveTheRoupa;

import java.util.*;

public class GuardaVolumes {
    private Map<String, List<Peca>> dicionario;
    private String identificador;

    public GuardaVolumes() {
        this.dicionario  = new HashMap<String, List<Peca>>();
    }

    public String guardarPecas(List<Peca> listaPecas) {
        this.identificador = UUID.randomUUID().toString();
        this.dicionario.put(this.identificador, listaPecas);
        return this.identificador;
    }

    public void mostrarPecas() {
        for (String chave: this.dicionario.keySet()) {
            mostrarPecas(chave);
        }
    }

    public void mostrarPecas(String id) {
        List<Peca> pecas = this.dicionario.get(id);
        System.out.println("Este guarda volumes tem identificador igual a: " + id);
        pecas.forEach(System.out::println);
    }

    public void devolverPecas(String id) {
        dicionario.remove(id);
        System.out.println("As peças relacionadas ao id: " + id + " foram removidas");
    }
}

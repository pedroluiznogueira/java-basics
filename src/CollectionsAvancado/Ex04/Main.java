package CollectionsAvancado.Ex04;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("=========== Peças Hering ===========");

        // criando uma lista de pecas da Hering
        List<Peca> pecasHering = new ArrayList<Peca>();

        // criando pecas
        Peca pecaUmH = new Peca("Hering", "camiseta");
        Peca pecaDoisH = new Peca("Hering", "shorts");
        Peca pecaTresH = new Peca("Hering", "calça");

        // adicionando pecas na lista de peca
        pecasHering.add(pecaUmH);
        pecasHering.add(pecaDoisH);
        pecasHering.add(pecaTresH);

        // imprimindo cada peça
        for (Peca peca : pecasHering) {
            System.out.println(peca);
        }

        System.out.println("=========== Peças Renner ===========");

        // criando uma lista de pecas da Renner
        List<Peca> pecasRenner = new ArrayList<Peca>();

        // criando pecas
        Peca pecaUmR = new Peca("Renner", "blusa");
        Peca pecaDoisR = new Peca("Renner", "toca");
        Peca pecaTresR = new Peca("Renner", "meia");

        // adicionando pecas na lista de peca
        pecasRenner.add(pecaUmR);
        pecasRenner.add(pecaDoisR);
        pecasRenner.add(pecaTresR);

        // imprimindo cada peça
        for (Peca peca : pecasRenner) {
            System.out.println(peca);
        }

        // criando guarda volumes
        GuardaVolumes guardaVolumes = new GuardaVolumes();

        // guardando listas de pecas nos guarda volumes
        String idHering = guardaVolumes.guardarPecas(pecasHering);
        String idRenner = guardaVolumes.guardarPecas(pecasRenner);

        System.out.println("======== Pecas do Guarda Volumes ========");
        guardaVolumes.mostrarPecas();

        System.out.println(idHering);
        System.out.println(idRenner);

        System.out.println("======== Puxando Peças pelo Id Único ========");
        guardaVolumes.mostrarPecas(idHering);
        guardaVolumes.mostrarPecas(idRenner);

        System.out.println("======== Removendo Peças pelo Id Único ========");
        guardaVolumes.devolverPecas(idHering);

        System.out.println("======== Pecas do Guarda Volumes Após Remoção ========");
        guardaVolumes.mostrarPecas();
    }
}

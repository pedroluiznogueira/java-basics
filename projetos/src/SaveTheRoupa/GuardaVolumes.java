package SaveTheRoupa;

import java.util.*;

public class GuardaVolumes {

    private Map<Integer, List<Peca>> secoes = new HashMap<>();
    private Integer identificadorAtual = 0;

    public Integer guardarPecas(List<Peca> listaDePecas) {
        identificadorAtual += 1;
        secoes.put(identificadorAtual, listaDePecas);
        return identificadorAtual;
    }

    public void mostrarPecas() {
        for (Integer chave : secoes.keySet()) {
            List<Peca> pecas = secoes.get(chave);
            System.out.println("Chave: " + chave);

            for (Peca peca : pecas) {
                System.out.println("Marca" + peca.getMarca());
                System.out.println("Marca" + peca.getModelo());

            }
        }
    }

    public Integer getIdentificadorAtual() {
        return identificadorAtual;
    }

    public void setIdentificadorAtual(Integer identificadorAtual) {
        this.identificadorAtual = identificadorAtual;
    }
}

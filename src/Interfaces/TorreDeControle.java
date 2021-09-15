package Interfaces;

public class TorreDeControle {
    Voador[] voadores = new Voador[3];

    public void voemTodos() {
        for (int i = 0; i < this.voadores.length; i++) {
            if (this.voadores[i] == null) {
                break;
            } else {
                this.voadores[i].voar();
            }
        }
    }

    public void adicionarVoador(Voador voador) {
        for (int i = 0; i < this.voadores.length; i++) {
            if (this.voadores[i] == null) {
                this.voadores[i] = voador;
                break;
            }
        }
    }
}

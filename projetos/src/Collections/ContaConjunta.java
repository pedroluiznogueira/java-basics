package Collections;

import java.util.ArrayList;
import java.util.List;

public class ContaConjunta extends Conta {
    // recursos de List como um todo, não apenas ArrayList
    private List<Cliente> outrosTitulares = new ArrayList<Cliente>();

    public ContaConjunta(Cliente titular) {
        super(titular);
    }

    public List<Cliente> getOutrosTitulares() {
        return outrosTitulares;
    }

    public void setOutrosTitulares(List<Cliente> outrosTitulares) {
        this.outrosTitulares = outrosTitulares;
    }
}
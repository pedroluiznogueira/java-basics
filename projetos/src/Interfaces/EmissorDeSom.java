public interface EmissorDeSom {

    public String emitirSom();

    // criando metodo na interface, não pode ser públic, não tem encapsulamento, é default
    default void teste() {
        System.out.println("Passando pelo teste");
    }
}

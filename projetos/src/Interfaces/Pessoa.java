public abstract class Pessoa implements EmissorDeSom, Movimentador {
    private String nome;
    private String email;

    public abstract String apresentarDocumento();

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public String retornarString() {
        return "Placeholder";
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Meu nome é " + nome + " e meu email é " + email;
    }

    // Preciso obrigatoriamente sobre escrever na classe abstrata, ela não passa a implementação para as filhas indiretamente

    @Override
    // Esse método vai ser relacionado aos animais
    public String emitirSom() {
        return "Eu estou falando";
    }

    @Override
    public String movimentar() {
        return "Caminhando";
    }

    public void chamandoTeste() {
        // não está disponível dentro da prórpia classe pessoa
    }
}

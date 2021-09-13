package ListaDePessoas;

public abstract class Pessoa {
    private String nome;
    private String email;

    public Pessoa() {
        this.nome = "pedro";
        this.email = "luiz";
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

    public void setEmail(String email) {
        this.email = email;
    }
}

public class PessoaFisica extends Pessoa {

    private String cpf;

    @Override
    public String apresentarDocumento() {
        return "Meu cpf é " + this.cpf;
    }

    public PessoaFisica(String nome, String email) {
        super(nome, email);
        this.cpf = "123.456.678-0";
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Polimorfismo
    @Override
    public String toString() {
        return "Meu nome é: " + getNome() + " e meu email é " + getEmail() + " e meu cpf é " + this.cpf;
    }

    // Polimorfismo
    @Override
    public String retornarString() {
        return "Placeholder pessoaFisica";
    }

    // Algumas literaturas consideram o Overload um polimorfismo
    public String retornarString(String texto) {
        return retornarString() + " " + texto;
    }
}

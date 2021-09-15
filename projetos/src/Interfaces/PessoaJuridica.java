public class PessoaJuridica extends Pessoa {

    private String cnpj;

    @Override
    public String apresentarDocumento() {
        return "Meu cpf é " + this.cnpj;
    }

    public PessoaJuridica(String nome, String email) {
        super(nome, email);
        this.cnpj = "2222222222";
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Polimorfismo
    @Override
    public String toString() {
        return "Meu nome é " + getNome() + " e meu email é " + getEmail() + " e meu cpf é " + this.cnpj;
    }

    // Polimorfismo
    @Override
    public String retornarString() {
        return "Placeholder pessoaJuridica";
    }

}

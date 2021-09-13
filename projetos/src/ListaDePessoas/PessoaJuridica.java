package ListaDePessoas;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica() {
        super();

        this.cnpj = "2222222222";
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}

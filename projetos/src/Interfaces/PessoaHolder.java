public class PessoaHolder extends Pessoa {

    private String xyz;

    // Condiz com o construtor da classe abstrata
    public PessoaHolder(String nome, String email) {
        super(nome, email);
    }

    public String getXyz() {
        return xyz;
    }

    public void setXyz(String xyz) {
        this.xyz = xyz;
    }

    @Override
    public String apresentarDocumento() {
        return "Meu documento é " + this.xyz;
    }
}

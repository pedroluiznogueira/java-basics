package Collections;

public class Cliente {

    private Integer identificador;
    private String nome;
    private String sobrenome;

    public Cliente(String nome, String sobrenome) {
        this.nome  = nome;
        this.sobrenome = sobrenome;
    }

    // ao falar de criação de objeto falamos de construtor

    public String getNome() {

        return this.nome;
    }

    public void setNome(String nome) {

        if (nome == null) {
            System.out.println("Nome inválido");
        } else {
            this.nome = nome;
        }
    }

    public String getSobrenome() {

        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {

        this.sobrenome = sobrenome;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }
}

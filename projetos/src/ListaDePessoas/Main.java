package ListaDePessoas;

public class Main {

    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setCpf("385.950.518-10");
        System.out.println(pessoaFisica.getCpf());
    }
}
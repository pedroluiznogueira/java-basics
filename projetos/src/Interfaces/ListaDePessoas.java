public class ListaDePessoas {

    public static void main(String[] args) {

        // Instanciando objetos
        Pessoa pessoaFisica = new PessoaFisica("Pedro", "pedro@dh.com");
        Pessoa pessoaJuridica = new PessoaJuridica("Luiz", "luiz@dh.com");

        Pessoa[] pessoas = new Pessoa[2];

        pessoas[0] = pessoaFisica;
        pessoas[1] = pessoaJuridica;

        // Chamando o polimorfismo que foi feito
        System.out.println(pessoaFisica.toString());
        System.out.println(pessoaJuridica.toString());

        System.out.println(pessoaFisica.retornarString());
        // o objeto instanciado em que foi feito Overload precisa ser instanciado com a sua classe de origem, e não Pessoa aqui, mas PessoaFisica especificamente
        System.out.println(((PessoaFisica) pessoaFisica).retornarString("overloaded"));
        System.out.println(pessoaJuridica.retornarString());

        // Instanciando um Pet
        Pet pet = new Pet();

        // Instancionado um Pet
        Pet cachorro = new Cachorro();

        // Instanciando um Carro
        Carro carro = new Carro();

        Carro carro1 = new Carro();

        // Relacionado o método da Emissão do Som
        identificarSom(pessoaFisica);
        identificarSom(pessoaJuridica);
        // O método só vai ser diferenciado pelo parâmetro
        identificarSom(pet);
        identificarSom(cachorro);
        identificarSom(carro);

        identificarMovimento(pet);
        identificarMovimento(cachorro);
        identificarMovimento(carro);

        pessoaFisica.apresentarDocumento();
        pessoaJuridica.apresentarDocumento();

        carro1.teste();
    }

//    // Vai ser sobrecarregado
//    public static void identificarSom(Pessoa pessoa) {
//        System.out.println(pessoa.emitirSom());
//    }
//
//    // Sobrecarregando método (não é ideal, um veículo por ex também pode emitir um som)
//    public static void identificarSom(Pet pet) {
//        System.out.println(pet.emitirSom());
//    }

    public static void identificarSom(EmissorDeSom emissom) {
        System.out.println(emissom.emitirSom());
    }

    public static void identificarMovimento(Movimentador movimento) {
        System.out.println(movimento.movimentar());
    }
}

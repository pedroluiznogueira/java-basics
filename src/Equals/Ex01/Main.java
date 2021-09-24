package Equals.Ex01;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoaUm = new Pessoa("pedro", 1234);
        Pessoa pessoaDois = new Pessoa("luiz", 1234);
        Pessoa pessoaTres = new Pessoa("nogueira", 6789);
        pessoaTres = null;

        if (pessoaUm.equals(pessoaTres)) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
    }
}

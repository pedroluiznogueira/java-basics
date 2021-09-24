package Equals.Ex02;

public class Main {

    public static void main(String[] args) {
        Coca latinhaPequena = new Coca(1, 3.50);
        Coca latinhaGrande = new Coca(1, 5.00);


        if (latinhaPequena.equals(latinhaGrande)) {
            System.out.println("latinhas iguais");
        } else {
            System.out.println("latinha diferentes");
        }

    }
}

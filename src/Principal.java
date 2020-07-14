import classes.ConversorDeMoedas;

import java.util.Scanner;

public class Principal {
    private static ConversorDeMoedas conversorDeMoedas;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Este é o Meus dólares, programa que realiza a converção de dólares para reais");
        double cotacaoDoDolar = obterDados("Digite a cotação do dólar:");
        double quantidadeDeDolaresASeremComprados = obterDados("Digite quantos dólares você deseja comprar:");
        conversorDeMoedas = new ConversorDeMoedas(cotacaoDoDolar, quantidadeDeDolaresASeremComprados);
        System.out.printf("Valor a pagar Em reais: %.2f%n", conversorDeMoedas.converter());
    }

    private static double obterDados(String mensagemAoUsuario) {
        System.out.println(mensagemAoUsuario);
        return scanner.nextDouble();
    }
}

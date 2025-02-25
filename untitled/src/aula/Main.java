package aula;

import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        String nomeCompleto;
        int idade;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nome: ");
        nomeCompleto = scanner.nextLine();
        System.out.printf("idade: ");
        idade = scanner.nextInt();
        System.out.printf("0% tem %d anos de idade\n",
                nomeCompleto, idade);
}}
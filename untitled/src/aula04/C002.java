package aula04;

import java.util.Scanner;

public class C002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numero;

        System.out.println("Digite um numero: ");
        numero = scanner.nextInt();

        if(numero % 2 ==0){
            System.out.println("0 numero" + numero+ " e par");
        } else {
            System.out.println("0 numero" + numero+ " e impar");
        }
}
}
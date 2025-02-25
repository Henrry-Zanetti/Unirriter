package aula04;

import java.util.Scanner;

public class C007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero 1: ");
        int n1 = scanner.nextInt();
        System.out.println("Numero 2: ");
        int n2 = scanner.nextInt();

        if (n1 < n2) {
            System.out.println("O numero " + n1 + " e menor que " + n2);
        }else if (n1 == n2){
                System.out.println("O numero " + n1 + " e igual a " + n2);
            } else{
            System.out.println("O numero " + n1 + " e maior que " + n2);
        }
        }

    }


package aula04;

import java.util.Scanner;

public class C022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lado A: ");
        int ladoA = scanner.nextInt();
        System.out.println("Lado B: ");
        int ladoB = scanner.nextInt();
        System.out.println("Lado C: ");
        int ladoC = scanner.nextInt();

        String tipoTriangulo = tipoTriangulo(ladoA, ladoB, ladoC);
        System.out.println("O tipo de triangulo e " + tipoTriangulo);
    }

    private static String tipoTriangulo(int ladoA, int ladoB, int ladoC) {
        String tipo;
        if ((ladoA == ladoB) && (ladoB == ladoC)){
        tipo = "Equilatero";
    } else if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC)){
        tipo = "Isosceles";
    } else {
        tipo = "Escaleno";
        }
        return tipo;
}
}


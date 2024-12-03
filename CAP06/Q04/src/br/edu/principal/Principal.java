package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[8];
        int[] pos = new int[8];
        int[] neg = new int[8];
        int cont_n = 1, cont_p = 1, i;

        for (i = 1; i <= 8; i++) {
            System.out.print("Digite o número " + i + ": ");
            num[i - 1] = scanner.nextInt();

            if (num[i - 1] >= 0) {
                pos[cont_p - 1] = num[i - 1];
                cont_p++;
            } else {
                neg[cont_n - 1] = num[i - 1];
                cont_n++;
            }
        }

        if (cont_n == 1) {
            System.out.println("Vetor de negativos vazio.");
        } else {
            for (i = 1; i <= cont_n - 1; i++) {
                System.out.println("Negativo " + i + ": " + neg[i - 1]);
            }
        }

        if (cont_p == 1) {
            System.out.println("Vetor de positivos vazio.");
        } else {
            for (i = 1; i <= cont_p - 1; i++) {
                System.out.println("Positivo " + i + ": " + pos[i - 1]);
            }
        }

    }
}

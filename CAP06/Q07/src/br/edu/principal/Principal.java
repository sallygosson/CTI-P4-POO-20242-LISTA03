package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vet = new int[8];
        int i, j, z, aux;

        for (i = 0; i < 8; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            aux = scanner.nextInt();

            j = 0;
            while (j < i && vet[j] < aux) {
                j++;
            }

            z = i;
            while (z > j) {
                vet[z] = vet[z - 1];
                z--;
            }

            vet[j] = aux;
        }

        System.out.println("Vetor ordenado:");
        for (i = 0; i < 8; i++) {
            System.out.println(vet[i]);
        }

    }
}

package br.edu.principal;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vet = new int[10];
        int aux, i, j;

        for (i = 0; i < 10; i++) {
            System.out.print("Digite o valor para vet[" + (i + 1) + "]: ");
            vet[i] = scanner.nextInt();
        }

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 9; j++) {
                if (vet[j] < vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }

        System.out.println("Vetor ordenado em ordem decrescente:");
        System.out.println(Arrays.toString(vet));
        for (i = 0; i < 10; i++) {
            System.out.println(vet[i]);
        }

    }
}

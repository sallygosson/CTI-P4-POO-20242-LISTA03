package br.edu.principal;
import br.edu.func.Tools;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor1 = new int[10];
		int[] vetor2 = new int[10];
		for (int i = 0; i < vetor1.length; i++) {
			System.out.print("Digite o número para a posição " + i + " do vetor1: ");
			vetor1[i] = sc.nextInt();
			System.out.print("Digite o número para a posição " + i + " do vetor2: ");
			vetor2[i] = sc.nextInt();
		}
		int[] vetorIntercalado = Tools.intercalarVetores(vetor1, vetor2);
		System.out.println("Vetor1: " + Arrays.toString(vetor1));
		System.out.println("Vetor2: " + Arrays.toString(vetor2));
		System.out.println("Vetor Intercalado: " + Arrays.toString(vetorIntercalado));

			
	}
}

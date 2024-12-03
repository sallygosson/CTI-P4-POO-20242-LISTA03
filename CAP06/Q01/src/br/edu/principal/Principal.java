package br.edu.principal;
import br.edu.func.Tools;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int[] array = new int[9];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 9; i++) {
			System.out.print("Insira um número para a posição " + i + " do array: ");
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < 9; i++) {
			if (Tools.primo(array[i])) {
				System.out.println(array[i] + " na posição " + i);
			}
		}
	}
}

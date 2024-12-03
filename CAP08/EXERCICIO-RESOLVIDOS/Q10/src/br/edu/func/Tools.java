package br.edu.func;

public class Tools {
	public static double fat(int N) {
		int fat = 1;
		for (int i = 1; i <= N; i++) {
			fat *= i;
		}
		return fat;
	}
	public static double somaFat(int N) {
		double soma = 0;
		for (int i = 0; i <= N; i++) {
			soma += (1.0/fat(i));
		}
		return soma;
	}
}

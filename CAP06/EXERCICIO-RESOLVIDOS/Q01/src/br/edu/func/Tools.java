package br.edu.func;

public class Tools {
	public static boolean primo(int num) {
		int divisores = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divisores++;
			}
		}
		if (divisores == 2) {
			return true;
		}
		return false;
	}
}

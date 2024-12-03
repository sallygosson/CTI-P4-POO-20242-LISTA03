package br.edu.func;

public class Tools {
	public static int[] intercalarVetores(int[] vetor1, int[] vetor2) {
		int[] vetorIntercalado = new int[vetor1.length + vetor2.length];
		for (int i = 0; i < vetor1.length + vetor2.length; i++) {
			if (i % 2 == 0) {
				vetorIntercalado[i] = vetor1[i/2];
			}
			else {
				vetorIntercalado[i] = vetor2[(i-1) / 2];
			}
		}
		return vetorIntercalado;
	}
}

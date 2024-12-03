package br.edu.func;

public class Tools {
	 public static int[] maiorMenor(int[] array) {
		 int maior = array[0], menor = array[0];
		 int[] maiorMenor = new int[2];
		 for (int i = 0; i < array.length; i++) {
			 if (array[i] > maior) {
				 maior = array[i];
			 }
			 else if (array[i] < menor) {
				 menor = array[i];
			 }
		 }
		 maiorMenor[0] = maior;
		 maiorMenor[1] = menor;
		 return maiorMenor;
	 }
}
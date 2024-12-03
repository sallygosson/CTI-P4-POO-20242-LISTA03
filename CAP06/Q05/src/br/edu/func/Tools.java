package br.edu.func;

public class Tools {
	public static int[] soma(int[] vetor1, int[] vetor2) {
		int[] vetorSoma = new int[vetor1.length];
		for (int i = 0; i < vetorSoma.length; i++) {
			vetorSoma[i] = vetor1[i] + vetor2[i];	
		}
		return vetorSoma;
	}
	public static int[] produto(int[] vetor1, int[] vetor2) {
		int[] vetorProduto = new int[vetor1.length];
		for (int i = 0; i < vetorProduto.length; i++) {
			vetorProduto[i] = vetor1[i] * vetor2[i];	
		}
		return vetorProduto;
	}
	public static boolean contains(double[] vetor, int num) {
		boolean contem = false;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == num) {
				contem = true;
				break;
			}
		}
		return contem;
	} 
	public static boolean containsInt(int[] vetor, int num) {
		boolean contem = false;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == num) {
				contem = true;
				break;
			}
		}
		return contem;
	}
	public static int[] bubbleSort(int array[]) {
		boolean trocar = false;
		while (true) {
			trocar = false;
			for (int i = 0; i < array.length - 1;	 i++) {
				if (array[i] > array[i + 1]) {
					int aux = array[i];
					array[i] = array[i + 1];
					array[i+1] = aux;
					trocar = true;
				}
			}
			if (trocar == false) {
				break;
			}
		}
		return array;
	}
	public static boolean temParteDecimal(double num) {
		double truncado = (int) num;
		if ((num - truncado) == 0) {
			return false;
		}
		return true;
	}
	public static int[] union(int[] vetor1, int[] vetor2) {
		double[] uniD = new double[vetor1.length + vetor2.length];
		for (int i = 0; i < uniD.length; i++) {
			uniD[i] = 3.5;
		}
		int aux = 0;
		
		for (int i = 0; i < vetor1.length; i++) {
			if (!(Tools.contains(uniD, vetor1[i]))) {
				uniD[aux] = vetor1[i];
				aux ++;
			}
		}
		for (int i = 0; i < vetor2.length; i++) {
			if (!(Tools.contains(uniD, vetor2[i]))) {
				uniD[aux] = vetor2[i];
				aux ++;
			}
		}
		int[] U = new int[aux];
		for (int i = 0; i < U.length; i++ ) {
			U[i] = (int) uniD[i];
		}
		return U;
		
	}
	public static int[] difference(int[] vetor1, int[] vetor2) {
		double[] uniD = new double[vetor1.length + vetor2.length];
		for (int i = 0; i < uniD.length; i++) {
			uniD[i] = 3.5;
		}
		int aux = 0;
		for (int i = 0; i < vetor1.length; i++) {
			if (!(Tools.containsInt(vetor2, vetor1[i]))) {
				uniD[aux] = vetor1[i];
				aux++;
			}
		}
		int[] diff = new int[aux];
		for (int i = 0; i < diff.length; i++) {
			diff[i] = (int) uniD[i];
		}
		return diff;
		
	}
}

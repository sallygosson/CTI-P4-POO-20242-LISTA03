package br.edu.func;

public class Tools {
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
}

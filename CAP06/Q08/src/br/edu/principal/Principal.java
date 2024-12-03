package br.edu.principal;
import java.util.Arrays;

import br.edu.func.Tools;

public class Principal {
	public static void main(String[] args) {
		int[] array = {2,5,1, 0};
		int[] ordenado = Tools.bubbleSort(array);
		System.out.println(Arrays.toString(array));
		
	}
}
package br.edu.principal;

import java.util.Scanner;

import br.edu.func.Tools;

public class Principal {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] numeros = new int[5];
    	for (int i = 0; i < 5; i++) {
    		System.out.print("Digite um número: ");
    		numeros[i] = sc.nextInt();
    	}
    	int[] maiorMenor = Tools.maiorMenor(numeros);
    	System.out.println("O maior número é " + maiorMenor[0]);
    	System.out.println("O menor número é " + maiorMenor[1]);

    }
    
}
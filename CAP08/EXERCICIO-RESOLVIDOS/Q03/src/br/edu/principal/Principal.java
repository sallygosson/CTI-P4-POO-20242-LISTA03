package br.edu.principal;

import java.util.Scanner;
import br.edu.func.Tools;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, result;
		
		while (true) {
			System.out.print("Digite o número para ser a (tem que ser maior que 1): ");
			a = sc.nextInt();
			
			if (a > 1) {
				break;
			}
			
			else {
				System.out.println("Digite novamente! Valor inválido!");
			}
		}
		
		System.out.print("Digite o número para ser b: ");
		b = sc.nextInt();
		
		System.out.print("Digite o número para ser c: ");
		c = sc.nextInt();
		
		result = Tools.SomaDivisores(a, b, c);
		
		System.out.println("A soma dos divisores de " + a + " ,entre " + b + " e " + c + " é igual a: " + result);
		
		
		

	}

}
package br.edu.principal;

import java.util.Scanner;
import br.edu.func.Tools;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, s;
		
		System.out.print("Digite o primeiro número: ");
		n1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		n2 = sc.nextInt();
		
		s = Tools.SomaN(n1, n2);
		
		System.out.println("A soma dos números entre " + n1 + " e " + n2 +" é igual a: " + s);

	}

}
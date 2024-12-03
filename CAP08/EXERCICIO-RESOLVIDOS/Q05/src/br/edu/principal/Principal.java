package br.edu.principal;

import java.util.Scanner;
import br.edu.func.Tools;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pAntigo, pAtual, acrescimo;
		
		System.out.print("Digite o antigo preço do produto: ");
		pAntigo = sc.nextDouble();
		
		System.out.print("Digite o atual preço do produto: ");
		pAtual = sc.nextDouble();
		
		acrescimo = Tools.Porcentagem(pAntigo, pAtual);
		
		System.out.println("O acrescimo no preço foi de: " + acrescimo + "%");
		

	}

}
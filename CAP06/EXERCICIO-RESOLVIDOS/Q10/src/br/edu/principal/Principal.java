package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, pontos, totAp, percAp, i, j;
		String[] gabarito = new String[8], resposta = new String[8];
		
		
		for (i = 0; i < 8; i++) {
			System.out.print("Digite a resposta da " + (i+1) + "° questão: ");
			gabarito[i] = sc.next();
		}
		
		totAp = 0;
		
		for (i = 1; i <= 10; i++) {
			
			System.out.print("Digite o número do " + i + "° aluno: ");
			num = sc.nextInt();
			pontos = 0;
			
			for (j = 0; j < 8; j++) {
				System.out.print("Digite a resposta dada pelo aluno " + num + " à " + (j+1) + "° questão: ");
				resposta[j]= sc.next();
				
				if (resposta[j].equalsIgnoreCase(gabarito[j])) {
					pontos++;
				}
			}
			
			System.out.println("A nota do aluno " + num + " foi de: " + pontos);
			
			if (pontos >= 6) {
				totAp++;
			}
			
		}
		
		percAp = (totAp * 100) / 10;
		System.out.println("O percentual de alunos aprovados é de: " + percAp + "%");
		
		

	}

}
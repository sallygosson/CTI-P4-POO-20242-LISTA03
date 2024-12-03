package br.edu.principal;
import br.edu.func.Tools;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] precosUnitarios = new double[10];
		int[] quantidades = new int[10];
		for (int i = 0; i < precosUnitarios.length; i++) {
			System.out.print("Digite o preço unitário do produto de número " + i + ": ");
			precosUnitarios[i] = sc.nextInt();
			System.out.print("Digite a quantidade do produto de número " + i + ": ");
			quantidades[i] = sc.nextInt();
		}
		Tools.relatorio(precosUnitarios, quantidades);
		int pos = Tools.EncontrarMaisVendido(quantidades);
		System.out.println("O produto mais vendido foi o produto de posição " + pos + "; ele custa R$ " + precosUnitarios[pos]);
	}
}

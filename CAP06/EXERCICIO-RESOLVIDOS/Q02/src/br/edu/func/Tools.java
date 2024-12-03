package br.edu.func;

public class Tools {
	public static void relatorio(double[] precosUnitarios, int[] quantidades) {
		double valorVendas = 0, salario;
		for (int i = 0; i < precosUnitarios.length; i++) {
			double total = (precosUnitarios[i] * quantidades[i]);
			System.out.println("preço unitário: " + precosUnitarios[i] + "; quantidade; " + quantidades[i] + "; total: " + total);
			valorVendas += total;
		}
		System.out.println("Valor total das vendas: R$ " + valorVendas);
		salario = 545 + (0.05 * valorVendas);
		System.out.println("Valor pago ao trabalhador: R$ " + salario);
	}
	public static int EncontrarMaisVendido(int[] quantidades) {
		int maiorPos = 0, maior = quantidades[0];
		for (int i = 0; i < quantidades.length; i++) {
			if (quantidades[i] > maior) {
				maior = quantidades[i];
				maiorPos = i;
			}
		}
		return maiorPos;
	}
}

package br.edu.func;

public class Tools {

	public static double Porcentagem(double antigo, double atual) {
		double result;
		
		result = ((atual - antigo) / antigo) * 100;
		
		return result;
		

	}

}
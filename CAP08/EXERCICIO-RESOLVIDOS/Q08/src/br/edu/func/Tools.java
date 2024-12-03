package br.edu.func;

public class Tools {
	public static int calcularDuracao(int horaInicial, int minutoInicial, int horaFinal, int minutoFinal) 
	{
	        int totalMinutos;
	        if (minutoFinal < minutoInicial) {
	            minutoFinal += 60;
	            horaFinal -= 1;
	        }

	        if (horaFinal < horaInicial) {
	          horaFinal += 24;
	        }

	   
	        totalMinutos = (horaFinal - horaInicial) * 60 + (minutoFinal - minutoInicial);
	        return totalMinutos;
	    }
}

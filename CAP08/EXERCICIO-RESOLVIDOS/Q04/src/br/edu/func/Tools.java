package br.edu.func;

public class Tools {

	public static int[] transformacao(int segundos) {
        int horas, resto, minutos, segundosRestantes;
        horas = segundos / 3600;
        resto = segundos % 3600;
        minutos = resto / 60;
        segundosRestantes = resto % 60;
        
        int[] array = {horas, minutos, segundosRestantes};
      
        return array;
    }

}
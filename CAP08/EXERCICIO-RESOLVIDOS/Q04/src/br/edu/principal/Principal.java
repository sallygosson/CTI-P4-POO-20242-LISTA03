package br.edu.principal;

import java.util.Scanner;

import br.edu.func.Tools;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int segundos;

        System.out.print("Digite o valor em segundos: ");
        int segundos1 = scanner.nextInt();

        int[] conversao = Tools.transformacao(segundos1);
        System.out.println("Horas: " + conversao[0] + ", Minutos: " +conversao[1] + ", Segundos: " + conversao[2]);
}
}
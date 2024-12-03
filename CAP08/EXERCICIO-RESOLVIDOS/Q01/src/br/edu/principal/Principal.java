package br.edu.principal;


import java.util.Scanner;

import br.edu.func.Tools;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, x;

        System.out.print("Digite um número: ");
        num = scanner.nextInt();

        x = Tools.verifica(num);

        if (x == 0) {
            System.out.println("Número positivo.");
        } 
        else {
			System.out.println("Número negativo.");
        }
    }
}

package br.edu.principal;

import java.util.Scanner;

import br.edu.func.Tools;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int N = scanner.nextInt();
        double soma = Tools.somaFat(N);
        System.out.println("O valor da soma dos " + N + " termos da sequência é " + soma);
        
    }
}
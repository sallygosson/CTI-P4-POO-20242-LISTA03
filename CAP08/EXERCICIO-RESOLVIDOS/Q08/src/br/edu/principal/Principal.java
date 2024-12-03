package br.edu.principal;

import java.util.Scanner;

import br.edu.func.Tools;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horaInicial, minutoInicial, horaFinal, minutoFinal, duracao;
        System.out.print("Digite a hora inicial: ");
        horaInicial = scanner.nextInt();

        System.out.print("Digite os minutos iniciais: ");
        minutoInicial = scanner.nextInt();

        System.out.print("Digite a hora final: ");
        horaFinal = scanner.nextInt();

        System.out.print("Digite os minutos finais: ");
        minutoFinal = scanner.nextInt();

        duracao = Tools.calcularDuracao(horaInicial, minutoInicial, horaFinal, minutoFinal);

        System.out.println("A duração do jogo em minutos é: " + duracao);
    }
}
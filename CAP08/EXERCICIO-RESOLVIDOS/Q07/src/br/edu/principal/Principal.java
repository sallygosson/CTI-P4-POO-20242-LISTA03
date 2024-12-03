package br.edu.principal;

import java.util.Scanner;
import br.edu.func.Tools;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3, media;
        String letra;

        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();

        while (true) {
            System.out.print("Digite 'A' para média aritmética ou 'P' para média ponderada: ");
            letra = scanner.next();
            if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("P")) {
                break;
            }
            System.out.println("Entrada inválida. Por favor, digite apenas 'A' ou 'P'.");
        }

        media = Tools.calculaMedia(nota1, nota2, nota3, letra);

        if (letra.equalsIgnoreCase("A")) {
            System.out.println("A média aritmética é: " + media);
        } else { 
            System.out.println("A média ponderada é: " + media);
        }

        scanner.close(); 
        
}
}

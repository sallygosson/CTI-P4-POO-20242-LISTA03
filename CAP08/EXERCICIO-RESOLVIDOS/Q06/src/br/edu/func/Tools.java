package br.edu.func;

import java.util.Scanner;
public class Tools {

	public static void multiplicacao(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j );
            }
            System.out.println(); 
        }
    }

}
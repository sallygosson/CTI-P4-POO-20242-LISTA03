package br.edu.func;

public class Tools {
    public static double calculaMedia(double n1, double n2, double n3, String letra) {
        if (letra.equalsIgnoreCase("A")) {
            return (n1 + n2 + n3) / 3;
        } else {
            return (n1 * 5 + n2 * 3 + n3 * 2) / (5 + 3 + 2);
        }
    }
}
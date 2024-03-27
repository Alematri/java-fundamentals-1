package org.bigliettodeltreno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creazione dello Scanner
        Scanner scan = new Scanner(System.in);

        // Input km
        System.out.print("Quanti km vuoi percorrere? ");
        int km = scan.nextInt();

        // Input età
        System.out.print("Quanti anni hai? ");
        int age = scan.nextInt();

        // Calcolo il prezzo base
        double price = km * 0.21; // Prezzo base (0.21 €/km)

        // Applicazione sconto
        if (age < 18) { // Minorenni (sconto del 20%)
            price -= price * 0.2;
        } else if (age >= 65) { // Over 65 (sconto del 40%)
            price -= price * 0.4;
        }

        // Stampo il risultato e chiudo lo scanner
        System.out.println("Il prezzo del biglietto è: " + price + " €");

        scan.close();
    }
}

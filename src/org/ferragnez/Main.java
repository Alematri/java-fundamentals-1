package org.ferragnez;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] guestList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        Scanner scan = new Scanner(System.in);

        // Richiesta del nome
        System.out.print("Inserisci il tuo nome: ");
        String userName = scan.nextLine();

        // Verifica se il nome dell'utente è presente nella lista
        boolean itsOnTheList = false;
        for (String guest : guestList) {
            if (guest.equalsIgnoreCase(userName)) {
                itsOnTheList = true;
                break;
            }
        }

        // Stampa risultato
        if (itsOnTheList) {
            System.out.println("Benvenuto alla festa!");
        } else {
            System.out.println("Mi dispiace, non sei sulla lista degli invitati.");
        }

        scan.close();
    }
}
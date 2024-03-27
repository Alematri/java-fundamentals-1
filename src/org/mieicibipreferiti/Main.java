package org.mieicibipreferiti;

public class Main {
    public static void main(String[] args) {

        String[] cibiPreferiti = {"Zucchine marinate", "Pizza", "Tiramisù", "Sushi", "N'duja", "Peperoni"};

        // Stampare la lunghezza della classifica
        System.out.println("Lunghezza della classifica: " + cibiPreferiti.length);

        // Stampare il cibo nella 1a posizione
        System.out.println("Il mio cibo top è: " + cibiPreferiti[0]);

        // Stampare il cibo nell'ultima posizione
        System.out.println("Il mio cibo preferito ma non troppo è: " + cibiPreferiti[cibiPreferiti.length - 1]);

        // Calcolo della posizione mediana
        int middle = cibiPreferiti.length / 2;

        // Controllo se l'array è pari o dispari, se è dispari stampo quello centrale se è pari stampo i 2 centrali
        if (cibiPreferiti.length % 2 == 0) {
            String ciboMediano1 = cibiPreferiti[middle - 1];
            String ciboMediano2 = cibiPreferiti[middle];
            System.out.println("I cibi di metà classifica sono: " + ciboMediano1 + " e " + ciboMediano2);
        } else {
            System.out.println("Il cibo di metà classifica è: " + cibiPreferiti[middle]);
        }
    }
}


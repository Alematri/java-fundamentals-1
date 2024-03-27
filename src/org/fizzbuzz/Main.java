package org.fizzbuzz;

public class Main {
    public static void main(String[] args) {
        // Ciclo numeri da 1 a 100
        for (int i = 1; i <= 100; i++) {
            // Verifico se multipli di 3, 5 o entrambi
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz"); // Se multiplo di entrambi 3 e 5, stampa FizzBuzz
            } else if (i % 3 == 0) {
                System.out.println("Fizz"); // Se multiplo di 3, stampa Fizz
            } else if (i % 5 == 0) {
                System.out.println("Buzz"); // Se multiplo di 5, stampa Buzz
            } else {
                System.out.println(i); // Altrimenti stampa il numero
            }
        }
    }
}


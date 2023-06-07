package org.lessons.java.book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il numero di libri da catalogare: ");
        int numBooks = input.nextInt();
        input.nextLine(); // Consuma la nuova riga rimasta nel buffer

        Book[] library = new Book[numBooks]; // Creazione dell'array di libri

        for (int i = 0; i < numBooks; i++) {
            System.out.println("\nInserisci i dati del libro " + (i + 1) + ":");

            try {
                System.out.print("Titolo: ");
                String title = input.nextLine();

                System.out.print("Numero pagine: ");
                int numPages = Integer.parseInt(input.nextLine());
                //input.nextLine(); // Consuma la nuova riga rimasta nel buffer

                System.out.print("Autore: ");
                String author = input.nextLine();

                System.out.print("Editore: ");
                String publisher = input.nextLine();

                // Creazione di un nuovo oggetto Book utilizzando il costruttore personalizzato
                Book book = new Book(title, numPages, author, publisher);

                // Inserimento del libro nell'array
                library[i] = book;
            } catch (Exception error) {
                // Se c'e un errore viene visualizzato il relativo massaggio
                System.out.println("Errore: " + error.getMessage());
                i--; // Ripeti l'iterazione per lo stesso indice
            }
        }

        System.out.println("\nElenco dei libri catalogati:");
        for (Book book : library) {
            System.out.println(book);
        }
    }
}

package Problema_Gemini;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Cerința: Biblioteca Digitală
// Program simplu care memorează într‑o listă cărțile introduse de utilizator
// și într‑o altă listă revistele introduse.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Book> books = new ArrayList<>();
        List<Magazine> magazines = new ArrayList<>();

        boolean running = true;
        while (running) {
            System.out.println("\nWhat document do you want to introduce?");
            System.out.println("1. Book");
            System.out.println("2. Magazine");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");

            String line = scanner.nextLine();
            if (line.isEmpty()) {
                continue;
            }
            char choice = line.charAt(0);

            switch (choice) {
                case '1':
                    System.out.print("Book title: ");
                    String bookTitle = scanner.nextLine();

                    System.out.print("Author: ");
                    String bookAuthor = scanner.nextLine();

                    System.out.print("Id (number): ");
                    int bookId = Integer.parseInt(scanner.nextLine());

                    System.out.print("Page number: ");
                    int pageNumber = Integer.parseInt(scanner.nextLine());

                    System.out.print("Literary genre: ");
                    String literaryGenre = scanner.nextLine();

                    Book book = new Book(bookTitle, bookAuthor, bookId, pageNumber, literaryGenre);
                    books.add(book);
                    System.out.println("Book added to list.");
                    break;

                case '2':
                    System.out.print("Magazine title: ");
                    String magTitle = scanner.nextLine();

                    System.out.print("Author: ");
                    String magAuthor = scanner.nextLine();

                    System.out.print("Id (number): ");
                    int magId = Integer.parseInt(scanner.nextLine());

                    System.out.print("Edition: ");
                    String edition = scanner.nextLine();

                    System.out.print("Brand: ");
                    String brand = scanner.nextLine();

                    Magazine magazine = new Magazine(magTitle, magAuthor, magId, edition, brand);
                    magazines.add(magazine);
                    System.out.println("Magazine added to list.");
                    break;

                case '0':
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        // La final afișăm ce a fost memorat (optional, pentru verificare)
        System.out.println("\nBooks introduced:");
        for (Book b : books) {
            b.showDetails();
            System.out.println();
        }

        System.out.println("Magazines introduced:");
        for (Magazine m : magazines) {
            m.showDetails();
            System.out.println();
        }

        scanner.close();
    }
}

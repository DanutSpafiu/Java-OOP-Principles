package Problema_Gemini;

import java.util.List;
import java.util.Scanner;

//Cerința: Biblioteca Digitală
//Trebuie să creezi un mic program în Java care să gestioneze cărțile și membrii unei biblioteci, respectând cele 4 principii de bază: Încapsulare, Moștenire, Polimorfism și Abstracție.
//Putem afisa membrii, cartiile imprumutate, si mai vedem
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = List.of();
        System.out.println("What document do you want to introduce? \n" +
                "1. Book\n" +
                "2. Magazine\n" +
                "Your choice: " );
        char choice = scanner.nextLine().charAt(0);
    }
}

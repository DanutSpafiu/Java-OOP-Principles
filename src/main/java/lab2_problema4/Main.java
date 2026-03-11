package lab2_problema4;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cate persoane introduci (1 <= n <= 5: )");
        int n = scanner.nextInt();
        scanner.nextLine();
        if(n < 1 || n > 5) {
            throw new IllegalArgumentException("Numarul de persoane nu este valid");
        }

        //Create Person Array
        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Date pentru persoana " + (i + 1) + " ---");

            System.out.println("Nume: ");
            String name = scanner.nextLine();

            String cnp;
            while (true) {
                System.out.println("CNP: ");
                cnp = scanner.nextLine();
                if(Validator_CNP.isValid(cnp)) {
                    break;
                }
                else {
                    System.out.println("CNP invalid. Va rugam introduceti CNP valid.");
                }
            }
            persons[i] = new Person(name, cnp);
        }

        System.out.println("\nPersoanele din lista:");
        for (Person person : persons) {
            System.out.println(person);
        }


    }
}

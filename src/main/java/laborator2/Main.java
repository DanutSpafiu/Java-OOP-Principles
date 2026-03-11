package laborator2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<String> linii = Files.readAllLines(Path.of("src/main/java/laborator2/judete_in.txt"));
        String[] arr = linii.toArray(String[]::new);

        System.out.println("Ultimul judet din lista este: " + arr[arr.length-1]);
        Arrays.sort(arr);
        System.out.println("Judetele ordonate: " + Arrays.toString(arr));

        System.out.println("Acum introduce un judet si iti spun al catelea e in lista ordonata: ");
        String judet = scanner.nextLine();

        int index = Arrays.binarySearch(arr, judet);
        if(index < 0) {
            System.out.println("Judetul nu e in lista");
        } else {
            System.out.println("Judetul e in lista la indexul " + index);
        }

    }
}

package org.salsa;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah kata: ");
        int numOfWords = scanner.nextInt();
        scanner.nextLine();

        List<String> strArray = new ArrayList<>();

        for (int i = 0; i < numOfWords; i++) {
            System.out.print("Masukkan kata ke-" + (i + 1) + ": ");
            strArray.add(scanner.nextLine());
        }

        scanner.close();

        Count.countCharacters(strArray);
    }
}




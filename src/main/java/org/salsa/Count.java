package org.salsa;
import java.util.*;

public class Count {
    public static void countCharacters(List<String> strArray) {
        // Membuat HashMap untuk menghitung jumlah huruf (character)
        Map<Character, Integer> charCount = new HashMap<>();

        // Iterasi setiap kata (String) pada array untuk menghitung jumlah huruf
        for (String str : strArray) {
            for (char c : str.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        // Urutkan berdasarkan jumlah huruf, lalu urutkan berdasarkan alphabet
        List<Map.Entry<Character, Integer>> sortedChars = new ArrayList<>(charCount.entrySet());
        sortedChars.sort((c1, c2) -> {
            // Membandingkan huruf berdasarkan jumlah kemunculannya, lalu urutkan dari yang terbesar ke terkecil
            int compare = c2.getValue().compareTo(c1.getValue());
            if (compare == 0) {
                // Jika jumlah huruf sama, bandingkan huruf berdasarkan alphabet, lalu urutkan secara ascending
                return c1.getKey().compareTo(c2.getKey());
            }
            return compare;
        });

        // Cetak huruf yang sudah di sorting
        System.out.println("Output: ");
        for (Map.Entry<Character, Integer> entry : sortedChars) {
            System.out.print(entry.getKey());
        }
    }
}




package example;

import java.util.Scanner;

public class Splitter {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Enter a sentence specified by spaces only: ");
        String[] words = line.nextLine().split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        line.close();
    }
}

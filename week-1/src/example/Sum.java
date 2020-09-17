package example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter some integers");

        int sum = 0;
        String[] numbers = s.nextLine().split(" ");

        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);
        }

        System.out.println("Sum = " + sum);

        s.close();
    }
}

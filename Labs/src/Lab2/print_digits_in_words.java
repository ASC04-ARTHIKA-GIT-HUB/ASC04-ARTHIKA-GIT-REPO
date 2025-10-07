package Lab2;

import java.util.Scanner;

public class print_digits_in_words {
    public static void printDigitsInWords(int number) {
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        String numStr = String.valueOf(number);
        for (char digit : numStr.toCharArray()) {
            System.out.print(words[digit - '0'] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();


        if (number >= 100 && number <= 999) {
            printDigitsInWords(number);
        } else {
            System.out.println("enter the number: ");
        }
    }
}

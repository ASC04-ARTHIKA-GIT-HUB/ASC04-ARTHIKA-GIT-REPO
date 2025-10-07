package Lab2;

import java.util.Scanner;

public class Largest_num_md {

    public static int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        System.out.println("Enter number b: ");
        System.out.println("Enter number c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largestnum = largest(a, b, c);
        System.out.println("the Largest number is: " + largestnum);

    }
}
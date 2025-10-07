package Lab1;

public class Multiplication {

        public void printTableForLoop(int n) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }

        public void printTableWhileLoop(int n) {
            int i = 1;
            while (i <= 10) {
                System.out.println(n + " x " + i + " = " + (n * i));
                i++;
            }
        }

        public void printTableDoWhileLoop(int n) {
            int i = 1;
            do {
                System.out.println(n + " x " + i + " = " + (n * i));
                i++;
            } while (i <= 10);
        }

        public static void main(String[] args) {
            Multiplication mt = new Multiplication();

            System.out.println("Using for loop:");
            mt.printTableForLoop(2);

            System.out.println("\nUsing while loop:");
            mt.printTableWhileLoop(2);

            System.out.println("\nUsing do-while loop:");
            mt.printTableDoWhileLoop(2);
        }
    }



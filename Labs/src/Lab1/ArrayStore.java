package Lab1;

import java.util.*;

public class ArrayStore {
    private int[] arr = new int[10];

    public void acceptInput(Scanner sc) {
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void displayUsingForLoop() {
        System.out.println("Array (for loop):");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void displayUsingWhileLoop() {
        System.out.println("Array (while loop):");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    public void sortArray() {
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public int countOccurrences(int number) {
        int count = 0;
        for (int value : arr) {
            if (value == number) {
                count++;
            }
        }
        return count;
    }

    public void insertAtPosition(int number, int position) {
        if (position < 0 || position > arr.length) {
            System.out.println("Invalid position.");
            return;
        }

        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position) {
                newArr[i] = number;
            } else {
                newArr[i] = arr[j++];
            }
        }
        arr = newArr;
        System.out.println("Array after insertion: " + Arrays.toString(arr));
    }

    public int[] removeDuplicates() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int value : arr) {
            set.add(value);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int val : set) {
            result[i++] = val;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayStore store = new ArrayStore();

        store.acceptInput(sc);
        store.displayUsingForLoop();
        store.displayUsingWhileLoop();
        store.sortArray();

        System.out.print("Enter number to count occurrences: ");
        int num = sc.nextInt();
        System.out.println("Occurrences of " + num + ": " + store.countOccurrences(num));

        System.out.print("Enter number to insert: ");
        int numberToInsert = sc.nextInt();
        System.out.print("Enter position to insert at (0 to " + store.arr.length + "): ");
        int pos = sc.nextInt();
        store.insertAtPosition(numberToInsert, pos);

        int[] noDuplicates = store.removeDuplicates();
        System.out.println("Array without duplicates: " + Arrays.toString(noDuplicates));
    }
}


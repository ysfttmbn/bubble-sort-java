package sorting;

import java.util.Scanner;

public class BubbleSortTasks {

    // Versi dasar
    public static void bubbleSortBasic(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Versi berkurang tiap pass
    public static void bubbleSortReducedComparison(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Versi terurut/agak terurut
    public static void bubbleSortOptimized(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    // Print array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // MAIN
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan elemen array :");
        String line = scanner.nextLine();
        String[] tokens = line.trim().split("\\s+");
        int[] data = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            data[i] = Integer.parseInt(tokens[i]);
        }

        System.out.println("Sebelum diurutkan:");
        printArray(data);

        // bubbleSortBasic(data);              // Versi 1
        // bubbleSortReducedComparison(data);  // Versi 2
        bubbleSortOptimized(data);             // Versi 3

        System.out.println("Setelah diurutkan:");
        printArray(data);

        scanner.close();
    }
}

// The Collation Method is not a specific sorting algorithm. It refers to the
// way strings are sorted based on their collation order, which defines the
// order in which characters are compared.

// In Java, you can use the Collator class from the java.text package to perform
// collation-based sorting. Here's an example Java program that demonstrates how
// to use the Collator class to sort an array of strings:

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class CollationSort {
    public static void main(String[] args) {
        String[] arr = { "apple", "Orange", "banana", "Pineapple" };

        System.out.println("Before sorting:");
        printArray(arr);

        collationSort(arr);

        System.out.println("After sorting:");
        printArray(arr);
    }

    public static void collationSort(String[] arr) {
        Collator collator = Collator.getInstance(Locale.getDefault());
        Arrays.sort(arr, collator);
    }

    public static void printArray(String[] arr) {
        for (String str : arr) {
            System.out.println(str);
        }
        System.out.println();
    }
}
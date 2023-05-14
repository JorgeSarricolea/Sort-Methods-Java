// Here's an example of a Java program that demonstrates the Radix Sort algorithm to sort an array of integers:

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = { 170, 45, 75, 90, 802, 24, 2, 66 };

        System.out.println("Before sorting:");
        printArray(arr);

        radixSort(arr);

        System.out.println("After sorting:");
        printArray(arr);
    }

    public static void radixSort(int[] arr) {
        int max = getMax(arr);

        // Perform counting sort for every digit, starting from the least significant to
        // the most significant
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        int i;

        // Initialize count array
        for (i = 0; i < 10; i++) {
            count[i] = 0;
        }

        // Store count of occurrences in count[]
        for (i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // Change count[i] so that count[i] contains the actual position of this digit
        // in output[]
        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to arr[] so that arr[] contains the sorted numbers
        // according to the current digit
        for (i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
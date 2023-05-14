// Here's an example of a Java program that demonstrates the Shell Sort algorithm to sort an array of integers:

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 12, 1, 6 };

        System.out.println("Before sorting:");
        printArray(arr);

        shellSort(arr);

        System.out.println("After sorting:");
        printArray(arr);
    }

    public static void shellSort(int[] arr) {
        int n = arr.length;

        // Start with a large gap, then reduce the gap in each iteration
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Perform insertion sort on sub-arrays defined by the gap
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;

                // Shift elements of the sub-array towards right
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                arr[j] = temp;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

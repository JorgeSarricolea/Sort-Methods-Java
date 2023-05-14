// The "Direct Merge Method" is not a well-known sorting algorithm. However, I
// can provide an example of the Merge Sort algorithm, which is a widely used
// sorting algorithm. Here's a Java program that demonstrates the Merge Sort
// algorithm:

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 12, 1, 6 };

        System.out.println("Before sorting:");
        printArray(arr);

        mergeSort(arr);

        System.out.println("After sorting:");
        printArray(arr);
    }

    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;

            // Divide the array into two halves
            int[] left = new int[mid];
            System.arraycopy(arr, 0, left, 0, mid);

            int[] right = new int[arr.length - mid];
            System.arraycopy(arr, mid, right, 0, arr.length - mid);

            // Recursively sort the two halves
            mergeSort(left);
            mergeSort(right);

            // Merge the sorted halves
            merge(arr, left, right);
        }
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Compare elements from left and right sub-arrays and merge them in sorted
        // order
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy any remaining elements from the left sub-array
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy any remaining elements from the right sub-array
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
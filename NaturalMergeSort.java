// The Natural Merge Sort is a variation of the Merge Sort algorithm that takes
// advantage of pre-sorted sub-arrays within the given array. Here's a Java
// program that demonstrates the Natural Merge Sort algorithm:

public class NaturalMergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 12, 1, 6 };

        System.out.println("Before sorting:");
        printArray(arr);

        naturalMergeSort(arr);

        System.out.println("After sorting:");
        printArray(arr);
    }

    public static void naturalMergeSort(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int left, mid, right;

        do {
            left = 0;
            while (left < n) {
                mid = findMid(arr, left, n);
                if (mid == n) {
                    break;
                }
                right = findMid(arr, mid, n);
                merge(arr, temp, left, mid, right);
                left = right;
            }
        } while (!isSorted(arr));
    }

    public static int findMid(int[] arr, int left, int n) {
        int mid = left + 1;
        while (mid < n && arr[mid] >= arr[mid - 1]) {
            mid++;
        }
        return mid;
    }

    public static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left, j = mid, k = left;

        while (i < mid && j < right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i < mid) {
            temp[k++] = arr[i++];
        }

        while (j < right) {
            temp[k++] = arr[j++];
        }

        System.arraycopy(temp, left, arr, left, right - left);
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
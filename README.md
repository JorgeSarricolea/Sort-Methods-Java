# Sort-Methods-Java
In this repository you can find the different sorting methods with an example of each one programmed in Java.

## Description
Sorting methods play a crucial role in data structures and are fundamental tools in computer science and programming. They enable efficient organization and retrieval of data, which is vital in various applications and algorithms. Sorting methods determine the arrangement of elements in a data structure, such as arrays or lists, based on a specific criterion. This arrangement facilitates searching, merging, and other operations on the data, leading to enhanced performance and functionality.

### Bubble Sort
Bubble Sort is a simple yet commonly used sorting algorithm. It belongs to the category of comparison-based sorting methods and works by repeatedly swapping adjacent elements if they are in the wrong order until the entire list is sorted. Bubble Sort gets its name from the way smaller elements "bubble" to the top of the list during each iteration.

### Collation Sort
Collation sort, also known as linguistic sort or natural sort, is a type of sorting method that aims to arrange strings or text data in a way that reflects the natural order of human language. Unlike traditional sorting algorithms that rely solely on character codes or ASCII values, collation sort takes into account linguistic rules and conventions to determine the order of strings.

In many languages, sorting based on character codes or ASCII values may not produce the desired results. For example, consider a list of words: "apple," "banana," "cherry," and "date." If sorted using character codes, the order would be: "apple," "banana," "cherry," "date." However, in natural language order, the correct sequence is: "apple," "banana," "cherry," "date."

Collation sort addresses this issue by considering language-specific rules for sorting. It takes into account factors such as letter case (uppercase or lowercase), diacritical marks (accents or umlauts), and special characters. The sorting order is determined based on the linguistic rules and conventions of the given language.

Collation sort is commonly used in applications involving string sorting, such as databases, file systems, and text processing. It ensures that the sorting order aligns with human expectations and facilitates easier searching, browsing, and comparing of text data.

### Merge Sort
Merge Sort is a popular and efficient divide-and-conquer sorting algorithm. It works by recursively dividing the input list into smaller halves, sorting them individually, and then merging them back together to obtain a sorted list. Merge Sort's efficiency and stability make it a preferred choice for sorting large datasets.

Here's how the Merge Sort algorithm works:

Divide: The algorithm starts by dividing the input list into two halves, roughly equal in size. This process continues recursively until the sublists become small enough to be considered sorted (typically when they contain only one element).

Conquer: After the recursive division, the algorithm begins merging the smaller sublists back together. This is done by comparing the elements from the two sublists and selecting the smaller element to place in the final sorted list. The process continues until all elements from both sublists are merged.

Merge: The merging process ensures that the elements are combined in a sorted order. It compares the elements from the two sublists, selects the smallest element, and adds it to the final sorted list. The process continues until all elements from both sublists are merged.

Recurse: Steps 2 and 3 are applied recursively to the remaining sublists until the entire list is merged and sorted.

### Natural Merge Sort
Natural Merge Sort, also known as Bottom-Up Merge Sort, is a variation of the Merge Sort algorithm that takes advantage of pre-existing order in the data to improve efficiency. It is particularly effective when dealing with data that is already partially sorted or contains subsequences that are sorted.

The Natural Merge Sort algorithm works as follows:

Initially, the list of elements is divided into individual sublists of size 1, treating each element as a separate sorted sublist.

The algorithm then starts merging adjacent sorted sublists, combining them into larger sorted sublists. It compares the first elements of each sublist and merges them into a single sorted sublist. This process continues until all sublists are merged.

After the initial merge, the algorithm scans the merged list to identify any remaining sorted subsequences. It detects and merges these subsequences into larger sorted sublists.

Steps 2 and 3 are repeated iteratively until the entire list is sorted. The algorithm repeatedly merges adjacent sorted subsequences until there is only one sorted sublist remaining.

The key feature of Natural Merge Sort is its ability to detect and utilize pre-existing order within the data. When a sublist is already sorted, it avoids unnecessary comparisons and merging. This optimization significantly improves the algorithm's efficiency, especially when dealing with partially sorted data or data with existing sorted subsequences.

### Quick Sort
Quick Sort is a highly efficient sorting algorithm that follows a divide-and-conquer approach. It is known for its average-case time complexity of O(n log n) and its general effectiveness in practice. Quick Sort works by selecting a pivot element and partitioning the array around the pivot, ensuring that elements smaller than the pivot are placed before it and elements greater than the pivot are placed after it. The algorithm then recursively applies this process to the subarrays formed by the partition until the entire array is sorted.

Here's how the Quick Sort algorithm works:

Select a pivot element from the array. The pivot can be chosen in various ways, such as picking the first, last, or middle element of the array.

Partition the array by rearranging its elements such that all elements smaller than the pivot are placed before it, and all elements greater than the pivot are placed after it. This process is often referred to as the partition step.

Recursively apply steps 1 and 2 to the subarrays formed by the partition. This means selecting new pivots and partitioning each subarray until the subarrays become small enough to be considered sorted trivially (e.g., subarrays of size 0 or 1).

Finally, combine the sorted subarrays to obtain the fully sorted array.

The efficiency of Quick Sort mainly depends on the choice of the pivot and the partitioning process. Ideally, the pivot should be selected in a way that evenly splits the array into two roughly equal-sized partitions. This balanced partitioning ensures a more efficient sorting process. However, the actual selection of the pivot can be implemented in different ways, and various strategies, such as the random selection of the pivot or using the median-of-three method, are commonly employed to improve the efficiency of Quick Sort.

Quick Sort offers several advantages:

Efficient Average-Case Performance: Quick Sort has an average-case time complexity of O(n log n), making it one of the fastest sorting algorithms in practice. Its efficiency is attributed to its ability to quickly partition and sort subarrays.

In-Place Sorting: Quick Sort can be implemented as an in-place sorting algorithm, meaning it does not require additional memory beyond the original array. This feature makes it memory-efficient, especially when sorting large datasets.

Tail Recursion Optimization: Quick Sort can be optimized using tail recursion, which helps eliminate recursive function calls and reduces the space complexity of the algorithm.

Ease of Implementation: The basic idea behind Quick Sort is relatively simple and intuitive. It can be implemented using a few lines of code and is widely supported in programming languages and libraries.

### Radix Sort
Radix Sort is a linear time complexity sorting algorithm that sorts elements based on their digit-by-digit representation. It is particularly useful for sorting integers or strings with fixed-length representations. Radix Sort works by sorting the elements from the least significant digit (rightmost digit) to the most significant digit (leftmost digit).

Here's how the Radix Sort algorithm works:

Determine the maximum number of digits or characters among the elements to be sorted. This step is necessary to establish the number of passes required for the sorting process.

Starting from the least significant digit (rightmost digit), perform a stable sort based on that digit. This can be done using any stable sorting algorithm, such as Counting Sort or Insertion Sort.

Repeat step 2 for each subsequent digit, moving from right to left until the most significant digit is sorted.

By sorting the elements digit by digit, Radix Sort ensures that the elements are ultimately arranged in the correct order.

Radix Sort can be applied in two variants:

Least Significant Digit (LSD) Radix Sort: This is the most common variant of Radix Sort. It starts sorting from the least significant digit and moves towards the most significant digit. LSD Radix Sort is suitable when the elements have the same number of digits or characters.

Most Significant Digit (MSD) Radix Sort: In this variant, the sorting starts from the most significant digit and moves towards the least significant digit. MSD Radix Sort is often used when the elements have varying lengths or when sorting strings.

Radix Sort offers several advantages:

Efficiency: Radix Sort has a linear time complexity of O(nk), where n is the number of elements to be sorted and k is the average number of digits or characters in the elements. This makes it efficient for large datasets, especially when k is relatively small.

Stability: Radix Sort is a stable sorting algorithm. It preserves the relative order of elements with equal values during the sorting process.

Suitable for Fixed-Length Representations: Radix Sort is particularly well-suited for sorting integers or strings with fixed-length representations, where the number of digits or characters remains constant.

### Shell Sort
Shell Sort, also known as Shell's method, is an efficient sorting algorithm that improves upon the insertion sort algorithm by comparing and swapping elements that are far apart. It belongs to the category of insertion-based sorting methods and is known for its ability to quickly sort elements even in large datasets.

The Shell Sort algorithm works as follows:

Choose a gap sequence, which determines the intervals between the elements that will be compared and swapped during each iteration. Common gap sequences include the original sequence proposed by Donald Shell (e.g., n/2, n/4, n/8, ..., 1) and other variants like the Knuth sequence or Sedgewick sequence.

Start with the largest gap and compare elements that are distance "gap" apart. If the elements are in the wrong order, swap them.

Continue comparing and swapping elements with the chosen gap until the entire array is partially sorted based on that gap.

Reduce the gap and repeat steps 2 and 3 until the gap becomes 1. The final pass with a gap of 1 is equivalent to performing an ordinary insertion sort on the nearly sorted array.

The idea behind Shell Sort is to move elements that are far apart closer to their correct positions, gradually reducing the gap until the final pass with a gap of 1, which provides the final sorting of the array.

Shell Sort offers several advantages:

Efficiency: Shell Sort provides an improvement over the standard insertion sort algorithm. By comparing and swapping elements that are far apart, it reduces the number of comparisons and exchanges required, resulting in improved efficiency. Although it does not have a guaranteed worst-case time complexity, it typically performs better than simple quadratic algorithms like insertion sort.

In-Place Sorting: Shell Sort is an in-place sorting algorithm, meaning it sorts the elements within the original array without requiring additional memory.

Simplicity: Shell Sort is relatively easy to understand and implement. It builds upon the insertion sort algorithm by introducing the concept of gap sequences.

## Getting Started
Download or clone the repository to your local computer if you need all the codes. If you only want to check one or some specific ones, feel free to view them and use them to help you solve your doubts.

## Contributing
While contributions to this repository are welcome. If you would like to contribute, feel free to fork this repository and submit a pull request.

## Credits
This algorithms were programmed by [Jorge Sarricolea](https://jorgesarricolea.com), if you have any specific code questions or would like to chat about programming, feel free to contact me on [WhatsApp](https://wa.me/529381095593).

/*
 * Sorting in Java :- Either sorting elements from highest to lowest value
 * (descending order) or from lowest to highest value (ascending order).
 * 
 * Types of Sorting :- These are the most common types of sortings.
 * 1. Bubble sort :- This technique works by repeatedly swapping the adjacent
 * elements if they are in the wrong order. This algorithm is not suitable for
 * large data sets as its average and worst-case time complexity is quiet high
 * i.e. TC = O(n^2).
 * 
 * Algorithm :-
 * 
 * i. Traverse from left and compare adjacent elements and the higher one is
 * placed at right side.
 * ii. In this way, the largest element is moved to the rightmost end at first.
 * iii. This process is then continued ton find the second largest and place it
 * and so on until the data is sorted.
 * 
 * e.g. is shown below.
 */

// class BubbleSorting {
// public static void printArray(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }

// public static void main(String[] args) {
// int arr[] = { 7, 8, 3, 1, 2 };
// // Bubble sort
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr.length - i - 1; j++) {
// if (arr[j] > arr[j + 1]) {
// // Swap
// int temp = arr[j];
// arr[i = j] = arr[j + 1];
// arr[j + 1] = temp;
// }
// }
// }
// printArray(arr);
// }
// }
/*---------------------------------------------------------------- */

/*
 * 2. Selection sort :- This is a simple and efficient sorting that works by
 * repeatedly selecting the smallest (or largest) element from the unsorted
 * portion of the list and moving it to the sorted portion of the list. TC = O(n
 * ^ 2).
 * 
 * Algorithm :-
 * The algorithm repeatedly selects the smallest (or largest) element from the
 * unsorted portion of the list and swaps it with the first element of the
 * unsorted part. This process is repeated for the remaining unsorted portion
 * until the entire list is sorted.
 * 
 * e.g. is shown below.
 */

// class SelectionSort {
// public static void printArray(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }

// public static void main(String[] args) {
// int arr[] = { 7, 8, 3, 1, 2 };

// // Selection sort
// for (int i = 0; i < arr.length - 1; i++) {
// int smallest = i;
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[smallest] > arr[j]) {
// smallest = j;
// }
// }
// int temp = arr[smallest];
// arr[smallest] = arr[i];
// arr[i] = temp;
// }
// printArray(arr);
// }
// }
/*---------------------------------------------------------------- */

/*
 * 3. Insertion sort :- This is a simple sorting algorithm that works similar to
 * the way you sort playing cards in your hands. The array is virtually split
 * into a sorted and an unsorted part. Values from the unsorted part are picked
 * and placed at the correct position in the sorted part. TC = O(n ^ 2).
 * 
 * Algorithm :-
 * To sort an array of size N in ascending order iterate over the array and
 * compare the current element (key) to its predecessor, if the key element is
 * smalller than its predecessor, compare it to the elements before. Move the
 * greater elements one position up to make space for the swapped element.
 * 
 * e.g. is shown below.
 */

// class InsertionSort {
// public static void printArray(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }

// public static void main(String[] args) {
// int arr[] = { 7, 8, 3, 1, 2 };

// // Insertion sort
// for (int i = 1; i < arr.length; i++) {
// int current = arr[i];
// int j = i - 1;
// while (j >= 0 && current < arr[j]) {
// arr[j + 1] = arr[j];
// j--;
// }
// // placement
// arr[j + 1] = current;
// }
// printArray(arr);
// }
// }
/*---------------------------------------------------------------- */

/*
 * 4. Merge sort :- This is a sorting algorithm that works by dividing an array
 * (divide and conquer) into smaller subarrays, sorting each subarray, and then
 * merging the sorted subarrays back together to form the final sorted array. TC
 * = O(nlogn).
 * 
 * Algorithm :-
 * Merge sort is a recursive algorithm that continuously splits the
 * array in half until it cannot be further divided i.e. the array has only one
 * element left (an array with one element is always sorted). Then the sorted
 * subarrays are merged into one sorted array.
 * 
 * e.g. is shown below.
 */

// class MergeSort {
// public static void conquer(int arr[], int si, int mid, int ei) {
// // TC for conquer = O(n)
// int merged[] = new int[ei - si + 1];

// int idx1 = si; // This is tracking the 1st array.
// int idx2 = mid + 1; // This is tracking the second array.
// int x = 0; // This is tracking the merged array.

// while (idx1 <= mid && idx2 <= ei) {
// if (arr[idx1] <= arr[idx2]) {
// // merged[x] = arr[idx1];
// // x++; idx1++;
// // These two lines can also be written as;
// merged[x++] = arr[idx1++];
// } else {
// merged[x++] = arr[idx2++];
// }
// }

// // If either of the condition is false in above while loop the either of the
// // below while loop will execute.
// while (idx1 <= mid) {
// merged[x++] = arr[idx1++];
// }

// while (idx2 <= ei) {
// merged[x++] = arr[idx2++];
// }

// // To copy the elements of merged array into original array.
// for (int i = 0, j = si; i < merged.length; i++, j++) {
// arr[j] = merged[i];
// }
// }

// public static void divide(int arr[], int si, int ei) {
// // TC for divide = O(logn)
// if (si >= ei) {
// return;
// }

// // int mid = (si + ei) / 2; // But this formula causes TC to increase so we
// use;
// int mid = si + (ei - si) / 2;
// divide(arr, si, mid);
// divide(arr, mid + 1, ei);
// conquer(arr, si, mid, ei);
// }

// public static void main(String[] args) {
// // Overall TC = O(nlogn)

// int arr[] = { 6, 3, 9, 5, 2, 8 };
// int n = arr.length;

// divide(arr, 0, n - 1);

// // Print
// for (int i = 0; i < n; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }
// }
/*---------------------------------------------------------------- */

/*
 * 5. Quick sort :- This sorting algorithm is based on the Divide and Conquer
 * algorithm that picks an element as a pivot and partitions the given array
 * around the picked pivot by placing the pivot in its correct position in the
 * sorted array. Average TC = O(nlogn) and Worst TC = O(n^2). The worst TC
 * occurs when the array which we are trying to sort is already sorted either in
 * ascending order or descending order.
 * 
 * Algorithm :-
 * The key process in quickSort is a partition(). The target of partitions is to
 * place the pivot (any element can be chosen to be a pivot) at its correct
 * position in the sorted array and put all smaller elements to the left of the
 * pivot, and all greater elements to the right of the pivot.
 * Partition is done recursively on each side of the pivot after the pivot is
 * placed in its correct position and this is finally sorts the array.
 * 
 * Choice of Pivot :-
 * i. Always pick the first element as a pivot.
 * ii. Always pick the last element as a pivot (most commonly used).
 * iii. Pick a random element as a pivot.
 * iv. Pick the middle as the pivot.
 * 
 * Partition Algorithm :-
 * The logic is simple, we start from the leftmost element and keep track of the
 * index of smaller (or equal) elements as i. While traversing, if we find a
 * smaller element, we swap the current element with arr[i]. Otherwise, we
 * ignore the current element.
 * 
 * e.g. is shown below.
 */

// class QuickSort {
// public static int partition(int arr[], int low, int high) {
// int pivot = arr[high];
// int i = low - 1;

// for (int j = low; j < high; j++) {
// if (arr[j] < pivot) {
// i++;

// // Swap
// int temp = arr[i];
// arr[i] = arr[j];
// arr[j] = temp;
// }
// }
// i++;
// int temp = arr[i];
// arr[i] = pivot;
// arr[high] = temp;
// return i; // Pivot index
// }

// public static void quickSort(int arr[], int low, int high) {
// if (low < high) {
// int pidx = partition(arr, low, high);

// quickSort(arr, low, pidx - 1);
// quickSort(arr, pidx + 1, high);
// }
// }

// public static void main(String[] args) {
// int arr[] = { 6, 3, 9, 5, 2, 8 };
// int n = arr.length;

// quickSort(arr, 0, n - 1);

// // Print
// for (int i = 0; i < n; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }
// }

/*
 * But why do we use Quick sort then instead of Merge sort???
 * => Because the worst TC of Quick sort may be O(n^2), but it does not take any
 * extra memory like Merge sort. When we have extra memory which we can use then
 * we can use Merge sort to save time but if we want to save memory then it's
 * better to use Quick sort.
 */
/*---------------------------------------------------------------- */
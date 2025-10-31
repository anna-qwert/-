public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int currentValue = arr[i];
            int position = i;
            
            // Move elements of arr[0..i-1] that are greater than currentValue
            // to one position ahead of their current position
            while (position > 0 && arr[position - 1] > currentValue) {
                arr[position] = arr[position - 1];
                position--;
            }
            
            // Place current element at its correct position
            arr[position] = currentValue;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        
        System.out.println("Original array: ");
        printArray(arr);
        
        insertionSort(arr);
        
        System.out.println("Sorted array: ");
        printArray(arr);
    }
    
    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

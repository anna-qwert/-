public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            
            // Разделение массива на левую и правую половину
            int[] left = new int[mid];
            int[] right = new int[arr.length - mid];
            
            System.arraycopy(arr, 0, left, 0, mid);
            System.arraycopy(arr, mid, right, 0, arr.length - mid);
            
            // Рекурсивно сортируем обе половины
            mergeSort(left);
            mergeSort(right);
            
            // Объединяем отсортированные половины
            merge(arr, left, right);
        }
    }
    
    private static void merge(int[] arr, int[] left, int[] right) {
        int l = 0, r = 0, k = 0;
        
        while (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                arr[k++] = left[l++];
            } else {
                arr[k++] = right[r++];
            }
        }
        
        // Остаточные элементы
        while (l < left.length) arr[k++] = left[l++];
        while (r < right.length) arr[k++] = right[r++];
    }
    
    // Тестирование
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Исходный массив:");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
        
        mergeSort(arr);
        
        System.out.println("Отсортированный массив:");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }
}

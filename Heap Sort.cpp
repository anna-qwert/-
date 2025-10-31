#include <iostream>
using namespace std;

void heapify(int arr[], int n, int root) {
    int largest = root;
    int leftChild = 2*root + 1;
    int rightChild = 2*root + 2;
    
    if (leftChild < n && arr[leftChild] > arr[largest])
        largest = leftChild;
    
    if (rightChild < n && arr[rightChild] > arr[largest])
        largest = rightChild;
    
    if (largest != root) {
        swap(arr[root], arr[largest]);
        heapify(arr, n, largest);
    }
}

void heapSort(int arr[], int n) {
    // Строим max-heap
    for (int i = n / 2 - 1; i >= 0; i--)
        heapify(arr, n, i);
    
    // Извлекаем элементы из кучи
    for (int i=n-1; i>=0; i--) {
        swap(arr[0], arr[i]);
        heapify(arr, i, 0);
    }
}

// Тестирование
int main() {
    int arr[] = {12, 11, 13, 5, 6, 7};
    int n = sizeof(arr)/sizeof(arr[0]);
    
    cout << "Исходный массив:";
    for(auto val : arr) cout << " " << val;
    cout << "\n";
    
    heapSort(arr, n);
    
    cout << "Отсортированный массив:";
    for(auto val : arr) cout << " " << val;
    cout << "\n";
    
    return 0;
}

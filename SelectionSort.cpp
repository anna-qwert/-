#include <iostream>
using namespace std;                           

void selectionSort(int* arr, const int n) {
    for(int i = 0; i < n-1; i++) {
        int m = i;
        for(int j = i+1; j < n; j++)
            if(arr[j] < arr[m]) m = j;
        if(m != i) swap(arr[i], arr[m]);
    }
}

int main() {
    int arr[] = {64, 25, 12, 22, 11};
    const int n = sizeof(arr)/sizeof(int);
    
    cout << "Original array:\n";
    for(const int x : arr) cout << x << ' ';
    
    selectionSort(arr, n);
    
    cout << "\nSorted array:\n";
    for(const int x : arr) cout << x << ' ';
    return 0;
}

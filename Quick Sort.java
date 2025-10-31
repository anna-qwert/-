function quickSort(arr, start, end) {
    if (start >= end) return;
    
    // Выбор опорного элемента (обычно крайнего правого)
    let pivot = arr[end];
    let pIndex = start;
    
    // Движение по массиву
    for (let i = start; i < end; i++) {
        if (arr[i] <= pivot) {
            [arr[pIndex], arr[i]] = [arr[i], arr[pIndex]];
            pIndex++;
        }
    }
    
    // Поместить опорный элемент на свою позицию
    [arr[pIndex], arr[end]] = [arr[end], arr[pIndex]];
    
    // Рекурсивно обрабатываем левую и правую стороны
    quickSort(arr, start, pIndex - 1);
    quickSort(arr, pIndex + 1, end);
}

// Тестирование
const arr = [10, 7, 8, 9, 1, 5];
console.log("Исходный массив:", arr);
quickSort(arr, 0, arr.length - 1);
console.log("Отсортированный массив:", arr);

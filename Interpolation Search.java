function interpolationSearch(arr, target) {
    let low = 0;
    let high = arr.length - 1;
    
    while ((arr[low] <= target) && (arr[high] >= target)) {
        if (low === high || arr[low] === arr[high]) {
            if (arr[low] === target) return low;
            return -1;
        }
        
        // Формула расчета позиции
        let pos = low + Math.floor(((target - arr[low]) * (high - low)) /
                                 (arr[high] - arr[low]));
        
        if (arr[pos] === target) return pos;
        if (arr[pos] < target) low = pos + 1;
        else high = pos - 1;
    }
    
    if (low < arr.length && arr[low] === target) return low;
    return -1;
}

// Тестирование
const arr = [10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100];
const target = 85;
console.log(`Индекс элемента ${target}:`, interpolationSearch(arr, target));

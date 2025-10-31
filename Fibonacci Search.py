import math

def fibonacci_search(arr, target):
    # Генерируем необходимые числа Фибоначчи
    fib_num = []
    a, b = 0, 1
    while b < len(arr):
        fib_num.append(b)
        a, b = b, a+b
    
    # Обратный ход по массиву
    idx = len(fib_num)-1
    offs = -1
    
    while idx >= 0:
        i = min(offs+fib_num[idx], len(arr)-1)
        
        if arr[i] < target:
            offs = i
            idx -= 1
        elif arr[i] > target:
            idx -= 1
        else:
            return i
    
    return -1

# Тестирование
arr = [10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100]
target = 85
print(f"Индекс элемента {target}:", fibonacci_search(arr, target))

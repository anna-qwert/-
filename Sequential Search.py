def sequential_search(arr, target):
    for index, element in enumerate(arr):
        if element == target:
            return index
    return -1

# Тестирование
arr = [3, 5, 2, 7, 9, 1, 4]
target = 7
print(f"Индекс элемента {target}:", sequential_search(arr, target))

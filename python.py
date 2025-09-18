# Создание массива строк с разными значениями
string_list = ["Hello", "World", "Python", "Programming", "Language"]

# Вывод элементов
print("=== МАССИВ СТРОК ===")
print("Элементы:", string_list)
print("Размер:", len(string_list))
print("Первый элемент:", string_list[0])
print("Последний элемент:", string_list[-1])

# Добавление новых элементов
string_list.append("New")
string_list.append("Elements")

print("\nПосле добавления:", string_list)


# Используем список как стек
stack = []

print("Добавляем элементы в стек...")
stack.append("Первый")
print("Добавлен:", stack[-1])

stack.append("Второй")
print("Добавлен:", stack[-1])

stack.append("Третий")
print("Добавлен:", stack[-1])

# Информация о стеке
print("\nРазмер стека:", len(stack))
print("Верхний элемент:", stack[-1])

# Извлечение из стека
print("\nИзвлекаем элементы...")
while stack:
    top_element = stack.pop()
    print("Извлекаем:", top_element)
    if stack:
        print("Новый верхний:", stack[-1])
    else:
        print("Стек пуст!")

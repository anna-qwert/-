#include <iostream>
#include <vector>
#include <string>

int main() {
    // Создание массива строк с разными значениями
    std::vector<std::string> string_array = {
        "Hello", 
        "World", 
        "C++", 
        "Programming", 
        "Language",
        "2024",
        "OpenAI",
        "Artificial",
        "Intelligence"
    };

    // Вывод всех элементов массива
    std::cout << "=== МАССИВ СТРОК ===" << std::endl;
    std::cout << "Все элементы:" << std::endl;
    for(int i = 0; i < string_array.size(); i++) {
        std::cout << "[" << i << "]: " << string_array[i] << std::endl;
    }

    // Информация о массиве
    std::cout << "\n=== ИНФОРМАЦИЯ О МАССИВЕ ===" << std::endl;
    std::cout << "Размер массива: " << string_array.size() << " элементов" << std::endl;
    std::cout << "Первый элемент: " << string_array.front() << std::endl;
    std::cout << "Последний элемент: " << string_array.back() << std::endl;

    // Добавление новых элементов
    string_array.push_back("Machine");
    string_array.push_back("Learning");

    std::cout << "\n=== ПОСЛЕ ДОБАВЛЕНИЯ НОВЫХ ЭЛЕМЕНТОВ ===" << std::endl;
    std::cout << "Новый размер: " << string_array.size() << " элементов" << std::endl;
    std::cout << "Обновленный массив: ";
    for(const auto& str : string_array) {
        std::cout << str << " ";
    }

    return 0;
}

#include <iostream>
#include <stack>
#include <string>

int main() {
    // Создание стека строк
    std::stack<std::string> string_stack;

    // Добавление элементов в стек (PUSH)
    std::cout << "Добавляем элементы в стек..." << std::endl;
    string_stack.push("Первый");
    std::cout << "Добавлен: " << string_stack.top() << std::endl;
    
    string_stack.push("Второй");
    std::cout << "Добавлен: " << string_stack.top() << std::endl;
    
    string_stack.push("Третий");
    std::cout << "Добавлен: " << string_stack.top() << std::endl;

    // Информация о стеке
    std::cout << "\nТекущий размер стека: " << string_stack.size() << std::endl;
    std::cout << "Верхний элемент: " << string_stack.top() << std::endl;

    // Извлечение элементов из стека (POP)
    std::cout << "\nИзвлекаем элементы из стека..." << std::endl;
    while(!string_stack.empty()) {
        std::cout << "Извлекаем: " << string_stack.top() << std::endl;
        string_stack.pop();
        
        if(!string_stack.empty()) {
            std::cout << "Новый верхний элемент: " << string_stack.top() << std::endl;
        } else {
            std::cout << "Стек пуст!" << std::endl;
        }
    }

    return 0;
}

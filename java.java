import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создание массива строк с разными значениями
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList(
            "Hello", "World", "Java", "Programming", "Language"
        ));

        // Вывод элементов
        System.out.println("=== МАССИВ СТРОК ===");
        System.out.println("Элементы: " + stringList);
        System.out.println("Размер: " + stringList.size());
        System.out.println("Первый элемент: " + stringList.get(0));
        System.out.println("Последний элемент: " + stringList.get(stringList.size() - 1));

        // Добавление новых элементов
        stringList.add("New");
        stringList.add("Elements");

        System.out.println("\nПосле добавления: " + stringList);
    }
}

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Создание стека
        Stack<String> stack = new Stack<>();

        // Добавление в стек
        System.out.println("Добавляем элементы в стек...");
        stack.push("Первый");
        System.out.println("Добавлен: " + stack.peek());
        
        stack.push("Второй");
        System.out.println("Добавлен: " + stack.peek());
        
        stack.push("Третий");
        System.out.println("Добавлен: " + stack.peek());

        // Информация о стеке
        System.out.println("\nРазмер стека: " + stack.size());
        System.out.println("Верхний элемент: " + stack.peek());

        // Извлечение из стека
        System.out.println("\nИзвлекаем элементы...");
        while(!stack.isEmpty()) {
            System.out.println("Извлекаем: " + stack.pop());
            if(!stack.isEmpty()) {
                System.out.println("Новый верхний: " + stack.peek());
            } else {
                System.out.println("Стек пуст!");
            }
        }
    }
}

package tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Task #1

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }

        // Task #2

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner2.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        // Task #3

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int num : numbers) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }

        // Task #4
        // Ответ: данная скобочная последовательность не является правильной, так как нарушено условие сбалансированности скобок - количество открывающих скобок должно быть равно количеству закрывающих скобок.        //
        // Чтобы сделать данную последовательность правильной, необходимо изменить последний символ "]" на ")" или удалить его, тогда получится следующая правильная скобочная последовательность: [((())()(()))].


    }
}
package Homework1;
import java.util.Scanner;
public class Homework1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean f = true;
        while (f) {
            System.out.println("Укажите номер задачи:");
            System.out.println("1 - Треугольное число, факториал");
            System.out.println("2 - Простые числа от 1 до 1000");
            System.out.println("3 - Калькулятор");
            System.out.println("0 - Завершение работы приложения");
            int no = Integer.parseInt(scanner.nextLine());
            System.out.println(" ");
            switch (no) {

                case 1:
                    work1();
                    break;
                case 2:
                    work2();
                    break;
                case 3:
                    System.out.println("Выбран калькулятор");
                    calculator();
                    break;
                case 0:
                    System.out.println("Завершение работы приложения.");
                    f = false;
                    break;
                default:
                    System.out.println("Некорректный номер задачи,\nповторите попытку ввода.");
                    break;
            }
        }
    }

    // Вычисляет N-ое треугольное число, факториал N
    public static void work1() {
        int factorial = 1;
        System.out.println("Будет вычислено N-ое треугольное число, факториал N:");
        System.out.print("Введите число N:");
        int n = Integer.parseInt(scanner.nextLine());
        int triangle = n * (n + 1) / 2;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.printf("Треугольное число N-ой степени = %d\n", triangle);
        System.out.printf("Факториал числа N = %d\n", factorial);
    }

    // Выводит простые числа от 1 до 1000
    public static void work2() {
        for (int i = 2; i <= 1000; i++) {
            boolean flag = false;
            if (i % 2 == 0 & i != 2)
                continue;
            else {
                for (int j = 3; j < i; j += 2) {
                    if (i % j == 0) {
                        flag = true;
                        break;
                    }
                }
                if (flag == false)
                    System.out.printf("%d\n", i);

            }

        }
    }

    // Простой калькулятор
    public static void calculator() {
        double result = 0;
        System.out.println("Введите число 1:");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите число 2:");
        double num2 = Double.parseDouble(scanner.nextLine());
        System.out.printf("Выберите требуюмую операцию:\n1-сложение\n2-вычитание\n3-умножение\n4-деление\n");
        int state = Integer.parseInt(scanner.nextLine());
        while (state != 1 & state != 2 & state != 3 & state != 4) {
            System.out.println("Некорректный номер задачи,\nповторите попытку ввода.");
            state = Integer.parseInt(scanner.nextLine());
        }
        switch (state) {
            case 1:
                System.out.println("Выбрано сложение!");
                result = num1 + num2;
                System.out.printf("Результат сложения: %.2f\n", result);
                break;
            case 2:
                System.out.println("Выбрано вычитание!");
                result = num1 - num2;
                System.out.printf("Результат вычитания: %.2f\n", result);
                break;
            case 3:
                System.out.println("Выбрано умножение!");
                result = num1 * num2;
                System.out.printf("Результат умножения: %.2f\n", result);
                break;
            case 4:
                System.out.println("Выбрано деление!");
                result = num1 / num2;
                System.out.printf("Результат деления: %.2f\n", result);
                break;
        }
    }
}

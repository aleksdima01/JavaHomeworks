package Homework4;

import java.io.IOException;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.File;

public class Homework4 {
    static Scanner scanner = new Scanner(System.in);
    static Logger logger = Logger.getLogger(Homework4.class.getName());
    static Random random = new Random();
    static ArrayList<ArrayList<Object>> bigList=new ArrayList<>();
    static Deque deque=new ArrayDeque();

    public static void main(String[] args) throws IOException {
        boolean f = true;
        while (f) {
            System.out.println("Укажите номер задачи:");
            System.out.println("1 - Reverse ArrayList");
            System.out.println("2 - Калькулятор с регистрацией действий");
            System.out.println("3 - Удаление последнего действия калькулятора");
            //System.out.println("4 - Задача про студентов!");
            System.out.println("0 - Завершение работы приложения");
            int no = Integer.parseInt(scanner.nextLine());
            System.out.println(" ");
            switch (no) {

                case 1:
                    reverseList();
                    break;
                case 2:
                    System.out.println("Выбран калькулятор с регистрацией действий!");
                    calculator();
                    break;
                case 3:
                    System.out.println("Удаление последнего действия из калькулятора!");
                    deleting();
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

    public static void reverseList() {
        LinkedList<Integer> myLinkedlist = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            myLinkedlist.add(random.nextInt(51));}
        System.out.println(myLinkedlist);
        Stack<Integer> stackInt = new Stack<>();
        stackInt.addAll(myLinkedlist);
        myLinkedlist.clear();
        while (!stackInt.empty())
            myLinkedlist.add(stackInt.pop());
        System.out.println(myLinkedlist);
    }
    public static void calculator() throws IOException {

        double result = 0;
        boolean y=true;
        FileHandler fh = new FileHandler ("src/main/java/Homework4/ActionsLog.txt");
        logger.setLevel(Level.INFO);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        System.out.println("Введите число 1:");
        double num1 = Double.parseDouble(scanner.nextLine());
        logger.log(Level.INFO, "First number: " + num1);
        System.out.println("Введите число 2:");
        double num2 = Double.parseDouble(scanner.nextLine());
        logger.log(Level.INFO, "Second number: " + num2);
        System.out.printf("Выберите требуюмую операцию:\n1-сложение\n2-вычитание\n3-умножение\n4-деление\n");
        int state = Integer.parseInt(scanner.nextLine());
        String action=null;
        while (state != 1 & state != 2 & state != 3 & state != 4) {
            System.out.println("Некорректный номер задачи,\nповторите попытку ввода.");
            state = Integer.parseInt(scanner.nextLine());
        }
        switch (state) {
            case 1:
                System.out.println("Выбрано сложение!");
                action="Сложение";
                logger.log(Level.INFO, "Operation sum!");
                result = num1 + num2;
                System.out.printf("Результат сложения: %.2f\n", result);
                logger.log(Level.INFO, "Result: " + result);
                break;
            case 2:
                System.out.println("Выбрано вычитание!");
                action="Вычитание";
                logger.log(Level.INFO, "Operation subtraction!");
                result = num1 - num2;
                System.out.printf("Результат вычитания: %.2f\n", result);
                logger.log(Level.INFO, "Result: " + result);
                break;
            case 3:
                System.out.println("Выбрано умножение!");
                action="Умножение";
                logger.log(Level.INFO, "Operation multiplication!");
                result = num1 * num2;
                System.out.printf("Результат умножения: %.2f\n", result);
                logger.log(Level.INFO, "Result: " + result);
                break;
            case 4:
                System.out.println("Выбрано деление!");
                action="Деление";
                logger.log(Level.INFO, "Operation division!");
                result = num1 / num2;
                System.out.printf("Результат деления: %.3f\n", result);
                logger.log(Level.INFO, "Result: " + result);
                break;
        }

        ArrayList list=new ArrayList<>();
        list.add(num1);
        list.add(num2);
        list.add(action);
        list.add(result);
        bigList.add(list);
        deque.addLast(list);
        System.out.printf("Операции калькулятора: %s\n",bigList);
           }

    public static void deleting() {
        if (deque.isEmpty())
            System.out.println("Действий у калькулятора не было! Сначала совершите действие калькулятором!");
        else {
            deque.pollLast();
            bigList.clear();
            bigList.addAll(deque);
            System.out.println(deque);
        }
    }
}
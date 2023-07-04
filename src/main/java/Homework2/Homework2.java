package Homeworks;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.*;
import org.json.JSONObject;

public class Homework2 {
    static Scanner scanner = new Scanner(System.in);
    static Logger logger = Logger.getLogger(Homework2.class.getName());

    public static void main(String[] args) throws IOException {
        boolean f = true;
        while (f) {
            System.out.println("Укажите номер задачи:");
            System.out.println("1 - String Builder");
            System.out.println("2 - Сортировка пузырьком с логированием");
            System.out.println("3 - Калькулятор с логгированием");
            System.out.println("0 - Завершение работы приложения");
            int no = Integer.parseInt(scanner.nextLine());
            System.out.println(" ");
            switch (no) {

                case 1:
                    sql();
                    break;
                case 2:
                    System.out.println("Выбрана сортировка пузырьком с логированием!");
                    bubbleLog();
                    break;
                case 3:
                    System.out.println("Выбран калькулятор с логгированием!");
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

    public static void bubbleLog() throws IOException {
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("src/main/java/Homework2/HW2bubblelog.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        int[] array = { 9, 9, 7, 6, 4, 5, 5, 3, 2, 8, 1, 1 };
        int box = 0;
        for (int j = 0; j < array.length; j++) {

            for (int i = 0; i + 1 < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    box = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = box;

                }
                logger.log(Level.INFO, "Array at this step: " + Arrays.toString(array));
            }
        }
        System.out.println(Arrays.toString(array));
    }

     public static void sql() {
     String inputString = " select * from students where ";
     System.out.print(inputString);
     StringBuilder parameters = new StringBuilder();
     String json = "{\"name\":\"Ivanov\", \"country\":\"Russia\",\"city\":\"Moscow\", \"age\":\"null\"}";

     JSONObject jsonObject = new JSONObject(json);

     for (String key : jsonObject.keySet()) {
     String value = jsonObject.getString(key);
     if (!value.equals("null")) {
     if (parameters.length() > 0) {
     parameters.append(" AND ");
     }
     parameters.append(key).append(" = '").append(value).append("'");
     }
     }

     System.out.println(parameters.toString());

     }



    public static void calculator() throws IOException {
        double result = 0;
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("src/main/java/Homework2/CalcLog.txt");
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
        while (state != 1 & state != 2 & state != 3 & state != 4) {
            System.out.println("Некорректный номер задачи,\nповторите попытку ввода.");
            state = Integer.parseInt(scanner.nextLine());
        }
        switch (state) {
            case 1:
                System.out.println("Выбрано сложение!");
                logger.log(Level.INFO, "Operation sum!");
                result = num1 + num2;
                System.out.printf("Результат сложения: %.2f\n", result);
                logger.log(Level.INFO, "Result: " + result);
                break;
            case 2:
                System.out.println("Выбрано вычитание!");
                logger.log(Level.INFO, "Operation subtraction!");
                result = num1 - num2;
                System.out.printf("Результат вычитания: %.2f\n", result);
                logger.log(Level.INFO, "Result: " + result);
                break;
            case 3:
                System.out.println("Выбрано умножение!");
                logger.log(Level.INFO, "Operation multiplication!");
                result = num1 * num2;
                System.out.printf("Результат умножения: %.2f\n", result);
                logger.log(Level.INFO, "Result: " + result);
                break;
            case 4:
                System.out.println("Выбрано деление!");
                logger.log(Level.INFO, "Operation division!");
                result = num1 / num2;
                System.out.printf("Результат деления: %.2f\n", result);
                logger.log(Level.INFO, "Result: " + result);
                break;
        }
    }
}

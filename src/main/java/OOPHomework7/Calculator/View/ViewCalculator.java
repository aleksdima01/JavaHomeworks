package OOPHomework7.Calculator.View;

import OOPHomework7.Calculator.Model.CalcOperations;
import OOPHomework7.Calculator.Model.ICalculableFactory;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            int primaryArg = promptInt("Введите первый аргумент: ");
            CalcOperations calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, -, =) : ");
                if (cmd.equals("*")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
                if (cmd.equals("-")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");


            while (!cmd.equalsIgnoreCase("y") && !cmd.equalsIgnoreCase("n")) {
                System.out.println("Введена неверная команда! Повторите ввод");
                cmd = prompt("Еще посчитать (Y/N)?");
            }

            if (cmd.equalsIgnoreCase("Y")) {
                continue;
            }
            if (cmd.equalsIgnoreCase("N")) {
                System.out.println("Выход!");
                break;
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}

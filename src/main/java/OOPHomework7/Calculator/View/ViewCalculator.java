package OOPHomework7.Calculator.View;

import OOPHomework7.Calculator.Model.CalcOperations;
import OOPHomework7.Calculator.Model.ICalculableFactory;
import OOPHomework7.Calculator.Model.NumberComplex;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            int primaryArgReal = promptInt("Введите вещественную часть первого аргумента: ");
            int primaryArgImaginary = promptInt("Введите мнимую часть первого аргумента: ");
            CalcOperations calculator = calculableFactory.create(new NumberComplex(primaryArgReal, primaryArgImaginary));
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, -, =) : ");
                if (cmd.equals("*")) {
                    int argReal = promptInt("Введите вещественную часть второго аргумента: ");
                    int argImaginary = promptInt("Введите мнимую часть второго аргумента: ");
                    calculator.multi(new NumberComplex(argReal, argImaginary));
                    continue;
                }
                if (cmd.equals("+")) {
                    int argReal = promptInt("Введите вещественную часть второго аргумента: ");
                    int argImaginary = promptInt("Введите мнимую часть второго аргумента: ");
                    calculator.sum(new NumberComplex(argReal, argImaginary));
                    continue;
                }
                if (cmd.equals("=")) {
                    NumberComplex result = calculator.getResult();
                    System.out.println(result);
                    break;
                }
                if (cmd.equals("-")) {
                    int argReal = promptInt("Введите вещественную часть второго аргумента: ");
                    int argImaginary = promptInt("Введите мнимую часть второго аргумента: ");
                    calculator.diff(new NumberComplex(argReal, argImaginary));
                    continue;
                }
                if (cmd.equals("/")) {
                    int argReal = promptInt("Введите вещественную часть второго аргумента: ");
                    int argImaginary = promptInt("Введите мнимую часть второго аргумента: ");
                    calculator.div(new NumberComplex(argReal, argImaginary));
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

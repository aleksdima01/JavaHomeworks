package OOPHomework7.Calculator.Model;

import OOPHomework7.Calculator.Logger.ConsoleLogger;

/**
 * Класс, переопределяющий поведение операций калькулятора с логированием.
 */

public class CalculatorWithLogger implements CalcOperations {

    private CalcOperations decorated;
    private ConsoleLogger logger;

    public CalculatorWithLogger(CalcOperations decorated, ConsoleLogger logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public CalcOperations sum(NumberComplex arg) {
        NumberComplex firstArg = decorated.getResult();
        System.out.println("");
        logger.log(String.format("Первое комплексное число: " + firstArg));
        logger.log(String.format("Второе комплексное число: " + arg));
        CalcOperations result = decorated.sum(arg);
        logger.log(String.format("Вызова метода sum произошел"));
        return result;
    }

    @Override
    public CalcOperations multi(NumberComplex arg) {
        NumberComplex firstArg = decorated.getResult();
        System.out.println("");
        logger.log(String.format("Первое комплексное число: " + firstArg));
        logger.log(String.format("Второе комплексное число: " + arg));
        CalcOperations result = decorated.multi(arg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public CalcOperations diff(NumberComplex arg) {
        NumberComplex firstArg = decorated.getResult();
        System.out.println("");
        logger.log(String.format("Первое комплексное число: " + firstArg));
        logger.log(String.format("Второе комплексное число: " + arg));
        CalcOperations result = decorated.diff(arg);
        logger.log(String.format("Вызова метода difference произошел"));
        return result;
    }

    @Override
    public CalcOperations div(NumberComplex arg) {
        NumberComplex firstArg = decorated.getResult();
        System.out.println("");
        logger.log(String.format("Первое комплексное число: " + firstArg));
        logger.log(String.format("Второе комплексное число: " + arg));
        CalcOperations result = decorated.div(arg);
        logger.log(String.format("Вызова метода division произошел"));
        return result;
    }

    @Override
    public NumberComplex getResult() {
        NumberComplex result = decorated.getResult();
        logger.log(String.format("Получен результат: %s", result));
        System.out.print("Результат: ");
        return result;
    }
}

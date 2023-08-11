package OOPHomework7.Calculator.Model;

import OOPHomework7.Calculator.Logger.Loggable;

public class CalcOperationsLogger implements CalcOperations {

    private CalcOperations decorated;
    private Loggable logger;

    public CalcOperationsLogger(CalcOperations decorated, Loggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public CalcOperations sum(int arg) {
        int firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода sum с параметром %d", firstArg, arg));
        CalcOperations result = decorated.sum(arg);
        logger.log(String.format("Вызова метода sum произошел"));
        return result;
    }

    @Override
    public CalcOperations multi(int arg) {
        int firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода multi с параметром %d", firstArg, arg));
        CalcOperations result = decorated.multi(arg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public int getResult() {
        int result = decorated.getResult();
        logger.log(String.format("Получение результата %d", result));
        return result;
    }
}

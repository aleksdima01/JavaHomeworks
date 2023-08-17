package OOPHomework7.Calculator.Logger;

import OOPHomework7.Calculator.Model.*;

/**
 * Класс, создающий новый экземпляр калькулятора с логированием, переопределяя поведение интерфейса.
 */
public class LogCalculableFactory implements ICalculableFactory {

    private ConsoleLogger logger;

    public LogCalculableFactory(ConsoleLogger logger) {
        this.logger = logger;
    }

    @Override
    public CalcOperations create(NumberComplex primaryArg) {
        return new CalculatorWithLogger(new Calculator(primaryArg), logger);
    }
}

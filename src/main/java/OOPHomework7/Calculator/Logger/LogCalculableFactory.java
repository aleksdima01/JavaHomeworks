package OOPHomework7.Calculator.Logger;

import OOPHomework7.Calculator.Model.*;

public class LogCalculableFactory implements ICalculableFactory {

    private Loggable logger;

    public LogCalculableFactory(Loggable logger) {
        this.logger = logger;
    }

    @Override
    public CalcOperations create(NumberComplex primaryArg) {
        return new CalcOperationsLogger(new Calculator(primaryArg), logger);
    }
}

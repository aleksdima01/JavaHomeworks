package OOPHomework7.Calculator.Logger;

import OOPHomework7.Calculator.Model.CalcOperations;
import OOPHomework7.Calculator.Model.Calculator;
import OOPHomework7.Calculator.Model.ICalculableFactory;
import OOPHomework7.Calculator.Model.CalcOperationsLogger;

public class LogCalculableFactory implements ICalculableFactory {

    private Loggable logger;

    public LogCalculableFactory(Loggable logger) {
        this.logger = logger;
    }

    @Override
    public CalcOperations create(int primaryArg) {
        return new CalcOperationsLogger(new Calculator(primaryArg), logger);
    }
}

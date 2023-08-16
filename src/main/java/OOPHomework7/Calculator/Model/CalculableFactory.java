package OOPHomework7.Calculator.Model;

public class CalculableFactory implements ICalculableFactory {
    public CalcOperations create(NumberComplex primaryArg) {
        return new Calculator(primaryArg);
    }
}

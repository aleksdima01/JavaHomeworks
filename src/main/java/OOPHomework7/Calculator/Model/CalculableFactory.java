package OOPHomework7.Calculator.Model;

/**
 * Класс, создающий новый экземпляр калькулятора, переопределяя поведение интерфейса.
 */
public class CalculableFactory implements ICalculableFactory {
    public CalcOperations create(NumberComplex primaryArg) {
        return new Calculator(primaryArg);
    }
}

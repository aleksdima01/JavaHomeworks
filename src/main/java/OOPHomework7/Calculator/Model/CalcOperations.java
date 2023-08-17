package OOPHomework7.Calculator.Model;

/**
 * Интерфейс, создающий операций калькулятора
 */
public interface CalcOperations {
    CalcOperations sum(NumberComplex arg);

    CalcOperations multi(NumberComplex arg);

    CalcOperations diff(NumberComplex arg);

    CalcOperations div(NumberComplex arg);

    NumberComplex getResult();
}

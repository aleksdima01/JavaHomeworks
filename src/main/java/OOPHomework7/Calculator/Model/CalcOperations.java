package OOPHomework7.Calculator.Model;

public interface CalcOperations {
    CalcOperations sum(NumberComplex arg);

    CalcOperations multi(NumberComplex arg);

    CalcOperations diff(NumberComplex arg);

    CalcOperations div(NumberComplex arg);

    NumberComplex getResult();
}

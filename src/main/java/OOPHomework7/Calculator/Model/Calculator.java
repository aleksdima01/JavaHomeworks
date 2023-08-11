package OOPHomework7.Calculator.Model;

public final class Calculator implements CalcOperations {

    private int primaryArg;

    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public CalcOperations sum(int arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public CalcOperations multi(int arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public int getResult() {
        return primaryArg;
    }
}

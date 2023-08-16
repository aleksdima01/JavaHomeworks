package OOPHomework7.Calculator.Model;

public final class Calculator implements CalcOperations {

    // private int primaryArg;
    private NumberComplex complexNumber;

    public Calculator(NumberComplex primaryArg) {
        this.complexNumber = primaryArg;
    }

    @Override
    public CalcOperations sum(NumberComplex arg) {
        complexNumber = new NumberComplex(complexNumber.getReal() + arg.getReal(), complexNumber.getImaginary() + arg.getImaginary());
        return this;
    }

    @Override
    public CalcOperations multi(NumberComplex arg) {
        complexNumber = new NumberComplex((complexNumber.getReal() * arg.getReal()) - (complexNumber.getImaginary() * arg.getImaginary()), (complexNumber.getImaginary() * arg.getReal()) + (complexNumber.getReal() * arg.getImaginary()));
        return this;
    }

    @Override
    public CalcOperations diff(NumberComplex arg) {
        complexNumber = new NumberComplex(complexNumber.getReal() - arg.getReal(), complexNumber.getImaginary() - arg.getImaginary());
        return this;
    }

    @Override
    public CalcOperations div(NumberComplex arg) {
        complexNumber = new NumberComplex(((complexNumber.getReal() * arg.getReal()) + (complexNumber.getImaginary() * arg.getImaginary())) / (arg.getReal() * arg.getReal() + arg.getImaginary() * arg.getImaginary()), ((complexNumber.getImaginary() * arg.getReal()) - (complexNumber.getReal() * arg.getImaginary())) / (arg.getReal() * arg.getReal() + arg.getImaginary() * arg.getImaginary()));
        return this;
    }


    @Override
    public NumberComplex getResult() {
        return complexNumber;
    }
}

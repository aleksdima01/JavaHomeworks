package OOPHomework7.Calculator.Model;

/**
 * Интерфейс на основании которого будет создан экземпляр калькулятора.
 */
public interface ICalculableFactory {
    CalcOperations create(NumberComplex primaryArg);

}

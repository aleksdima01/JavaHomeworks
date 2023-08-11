package OOPHomework7.Calculator;

import OOPHomework7.Calculator.Logger.ConsoleLogger;
import OOPHomework7.Calculator.Logger.LogCalculableFactory;
import OOPHomework7.Calculator.Model.ICalculableFactory;
import OOPHomework7.Calculator.View.ViewCalculator;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculableFactory(new ConsoleLogger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}

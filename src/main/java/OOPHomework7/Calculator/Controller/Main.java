package OOPHomework7.Calculator.Controller;

import OOPHomework7.Calculator.Logger.ConsoleLogger;
import OOPHomework7.Calculator.Logger.LogCalculableFactory;
import OOPHomework7.Calculator.Model.CalculableFactory;
import OOPHomework7.Calculator.Model.ICalculableFactory;
import OOPHomework7.Calculator.View.ViewCalculator;

public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableWithLogging = new LogCalculableFactory(new ConsoleLogger());
        ViewCalculator view = new ViewCalculator(calculableWithLogging);
        view.run();
    }

}

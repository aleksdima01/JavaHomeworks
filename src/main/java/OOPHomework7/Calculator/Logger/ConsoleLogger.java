package OOPHomework7.Calculator.Logger;

import Homework4.Homework4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Класс, задающий поведение логера.
 */
public class ConsoleLogger {


    private Logger logger = Logger.getLogger(Homework4.class.getName());

    public void log(String message) {
        logger.log(Level.INFO, message);
    }
}

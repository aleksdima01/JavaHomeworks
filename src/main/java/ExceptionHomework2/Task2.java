package ExceptionHomework2;

public class Task2 {
    public static void main(String[] args) {


//        try {
//            int d = 0;                                  //Задание переменных в блоке try
//            double catchedRes1 = intArray[8] / d;       // Деление на ноль! +не инициализирован массив + Если int делить на int то не будет double
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }

//Исправленный код
        int d = 0;
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}

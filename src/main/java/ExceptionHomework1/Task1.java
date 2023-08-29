package ExceptionHomework1;

public class Task1 {
    static class Answer {
        public static void arrayOutOfBoundsException() {
            // Напишите свое решение ниже
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
            int result = 0;
            for (int i = 0; i < array.length + 1; i++) {
                result += array[i];

            }
            System.out.println(result);
        }

        public static void divisionByZero() {
            // Напишите свое решение ниже
            int a = 3;
            int b = 0;
            int result = a / b;
        }

        public static void numberFormatException() {
            // Напишите свое решение ниже
            Integer number = new Integer("one");
        }
    }


    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}


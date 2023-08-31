package ExceptionHomework2;

public class Task3 {
//    public static void main(String[] args) throws Exception{    //Здесь нет необходимости писать обход исключений, так как используется try-catch.
//        try {
//            int a = 90;                                         //Инициализацию переменных необходимо убрать из блока try
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = {1, 2};
//            abc[3] = 9;
//        } catch (Throwable ex) {                               //Обобщенный класс ошибок надо проверять последним, лучше заменить на Exception
//            System.out.println("Что-то пошло не так...");
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        }                                                                       //Стоит добавить проверку деления на 0

//
//    }
//
//    public static void printSum(Integer a, Integer b) throws FileNotFoundException {                //Здесь нет необходимости писать обход исключения отсутствия файла, так как не работаем с файлом.
//        System.out.println(a + b);
//    }
//}

    //Исправленный код
    public static void main(String[] args) {
        int a = 90;
        int b = 2;
        int[] abc = {1, 2};
        try {
            printSum(23, 234);
            System.out.println(a / b);
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль");
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
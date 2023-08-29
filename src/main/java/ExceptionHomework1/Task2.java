package ExceptionHomework1;

import java.util.Arrays;

public class Task2 {
    static class Answer {
        public int[] subArrays(int[] a, int[] b) {


            // TODO: 29.08.2023 Задача на вычитание
            // Введите свое решение ниже
//
//            if (a.length == b.length) {
//                int[] resultArray = new int[a.length];
//                if (a.length == b.length) {
//                    for (int i = 0; i < a.length; i++) {
//                        int result = a[i] - b[i];
//                        resultArray[i] = result;
//                    }
//                }
//                return resultArray;
//            } else {
//                int[] resultArray = new int[1];
//                resultArray[0] = 0;
//                return resultArray;
//            }

            // TODO: 29.08.2023 Задача на деление

            if (a.length == b.length) {
                int[] resultArray = new int[a.length];
                if (a.length == b.length) {
                    try {
                        for (int i = 0; i < a.length; i++) {
                            int result = a[i] / b[i];
                            resultArray[i] = result;
                        }
                    } catch (RuntimeException e) {
                        System.out.println("Exception");
                    }

                }
                return resultArray;
            } else {
                int[] resultArray = new int[1];
                resultArray[0] = 0;
                return resultArray;
            }
        }
    }


    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{4, 12, 6};
            b = new int[]{1, 4, 0};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer ans = new Answer();
        String itresume_res = Arrays.toString(ans.subArrays(a, b));
        System.out.println(itresume_res);
    }
}


package ExceptionHomework2;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        input();
    }

    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вещественное число:");
        scanner.useLocale(Locale.US);
        while (!scanner.hasNextFloat()) {
            System.out.println("Введите число!");
            scanner.next();
        }
        System.out.print(Float.parseFloat(scanner.next()));
    }
}

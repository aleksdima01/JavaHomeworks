package ExceptionHomework2;

import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        input();
    }

    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите данные:");
        scanner.useLocale(Locale.US);
        String line = scanner.nextLine();
        if (line.trim().equals("")) {
            throw new RuntimeException("Нельзя вводить пустую строку!");
        }
        System.out.println(line);
    }
}




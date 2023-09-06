package ExceptionHomework3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Parsing {
    private String input;

    public ArrayList parsing() {
        Scanner scanner = new Scanner(System.in);
        ArrayList list = new ArrayList<>();
        System.out.println("Введите данные о пользователе через пробел в формате: Фамилия Имя Отчество датарождения(dd.mm.yyyy) номертелефона пол(m/f):");
        input = scanner.nextLine();
        String[] parsing = input.split(" ");
        for (String line : parsing) {
            list.add(line);
        }
        if (list.size() != 6) {
            System.out.println("Неправильно введено количество входных данных");
            {
                throw new RuntimeException();
            }
        }
        System.out.println(list);
        return list;
    }
}

package Homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/*Написать простой класс Телефонный Справочник (с помощью HashMap), который хранит в себе список фамилий и телефонных номеров.
        В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
        Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        тогда при запросе такой фамилии должны выводиться все телефоны.

        ***Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
        взаимодействие с пользователем через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника.*/
public class Homework5 {

    public static void main(String[] args) {
        String[] contacts = {
                "Григорьев 4678456",
                "Фокин 3489589",
                "Шестаков 3457903",
                "Хохлов 95390294",
                "Шубин 1235759",
                "Гущина 4834532",
                "Брагина 8524577",
                "Афанасьева 8630734",
                "Рыбакова 8704360",
                "Лазарева 8703457",
                "Бирюков 7864324",
                "Копылов 9974523",
                "Горбунов 6750245",
                "Лыткин 4357678",
                "Соколов 3457897"
        };
        myHashMap(contacts);
    }

    public static void myHashMap(String[] contacts) {
        HashMap<List<String>, Integer> book = new HashMap<>();
        for (String contact : contacts) {
            String[] studentParts = contact.split(" ");
           int a = Integer.parseInt(studentParts[1]);
            ArrayList<String> lst = new ArrayList<>();
            lst.add(studentParts[0]);
            System.out.println(lst);
            book.put(lst,a);

        }
        System.out.println(book);

    }
}



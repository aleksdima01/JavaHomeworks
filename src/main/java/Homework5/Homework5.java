package Homework5;

import java.util.ArrayList;
import java.util.HashMap;

/*Написать простой класс Телефонный Справочник (с помощью HashMap), который хранит в себе список фамилий и телефонных номеров.
        В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
        Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        тогда при запросе такой фамилии должны выводиться все телефоны.

        ***Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
        взаимодействие с пользователем через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника.*/
public class Homework5 {


   public static HashMap<String,ArrayList<Integer>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        add(Phones.person1);
        add(Phones.person2);
        add(Phones.person3);
        add(Phones.person4);
        add(Phones.person5);
        add(Phones.person6);
        add(Phones.person7);
        add(Phones.person8);
        add(Phones.person9);
        add(Phones.person10);
        add("Ефремов",7432050);
        add("Ефремов",7432050);

        System.out.println(phoneBook);

        get("Петров");
        get("Брагина");
        get("Фокин");
        get("Ефремов");

    }


    public static void add(Phones phones) {
        if (phoneBook.containsKey(phones.getName())){
            phoneBook.get(phones.getName()).add(phones.getPhoneNumber());
        }
        else {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(phones.getPhoneNumber());
            phoneBook.put(phones.getName(),numbers);
        }
    }
    public static void add(String name,Integer number) {
        if (phoneBook.containsKey(name)){
            if (phoneBook.get(name).contains(number)) {
                System.out.println("Вы пытаетесь добавить такой же номер телефона в контакт!\nВведите другой номер номер телефона!");
            }
            else {
                phoneBook.get(name).add(number);
            }
        }
        else {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(number);
            phoneBook.put(name,numbers);
        }
    }

    public static void get(String name) {
        if (phoneBook.get(name) == null )
            System.out.println("Такого контакта нет!");
        else {
            System.out.println("Запрошенный вами контакт и его номера:");
            System.out.printf("%s %s\n", name, phoneBook.get(name));
        }
    }
}



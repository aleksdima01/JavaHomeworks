package ExceptionHomework3;

import java.util.Scanner;

public class Program {
    static ListUsers allUsers = new ListUsers();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean f = true;
        while (f) {
            System.out.println("Укажите номер задачи:");
            System.out.println("1 - Добавить пользователя");
            System.out.println("2 - Показать пользователей");
            System.out.println("3 - Создание файла с пользователями");
            System.out.println("0 - Завершение работы приложения");
            int no = Integer.parseInt(scanner.nextLine());
            System.out.println(" ");
            switch (no) {

                case 1:
                    System.out.println("Выбрано добавление пользователя!");
                    User user = new User();
                    user.CreateUser();
                    allUsers.addUser(user);
                    break;
                case 2:
                    System.out.println("Выбран показ пользователей!");
                    System.out.println(allUsers);
                    break;
                case 3:
                    System.out.println("Создание файла с пользователями!");
                    FileSave fileSave = new FileSave();
                    if (allUsers.getUsers().size() == 0) {
                        System.out.println("Вы еще не добавили пользователя!");
                    } else {
                        fileSave.saveFile(allUsers);
                    }
                    break;
                case 0:
                    System.out.println("Завершение работы приложения.");
                    f = false;
                    break;
                default:
                    System.out.println("Некорректный номер задачи,\nповторите попытку ввода.");
                    break;
            }
        }
    }
}

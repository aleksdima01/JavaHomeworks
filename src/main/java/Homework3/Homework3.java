package Homework3;

import java.util.*;

public class Homework3 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
      static ArrayList<Integer> myList = new ArrayList<>();

        public static void main(String[] args) {
        createList();
        boolean f = true;
        while (f) {
            System.out.println("Укажите желаемое действие со списком:");
            System.out.println("1 - Удалить из списка чётные числа");
            System.out.println("2 - Найти минимальное значение");
            System.out.println("3 - Найти максимальное значение");
            System.out.println("4 - Найти среднее значение");
            System.out.println("0 - Завершение работы приложения");
            int no = Integer.parseInt(scanner.nextLine());
            System.out.println(" ");
            switch (no) {
                case 1:
                    System.out.println("Выбрано удаление четных элементов!");
                    deleting(myList);
                    break;
                case 2:
                    System.out.println("Поиск минимального значения!");
                    findMin(myList);
                    break;
                case 3:
                    System.out.println("Поиск максимального значения!");
                    findMax(myList);
                    break;
                case 4:
                    System.out.println("Поиск среднего значения!");
                    findAvg(myList);
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


    private static void createList() {

        for (int i = 0; i < 20; i++) {
            myList.add(random.nextInt(51));
        }
        System.out.println("Начальный список: " + myList+"\n");

    }
    public static void deleting(ArrayList list) {
        ArrayList <Integer> copyList=new ArrayList<>(myList);
        Iterator iterator = copyList.iterator();
        while (iterator.hasNext()){
            if((int)iterator.next() % 2 == 0)
                iterator.remove();
        }
        System.out.println(copyList);
        System.out.println();
    }
        public static void findMin(ArrayList list) {
            System.out.println(Collections.min(list));
            System.out.println();
        }
        public static void findMax(ArrayList list) {
            System.out.println(Collections.max(list));
            System.out.println();
        }
        public static void findAvg(ArrayList list) {
            double sum=0;
            double result=0;
            Iterator iterator = list.iterator();
            while (iterator.hasNext())
               sum+=(int)iterator.next();
            result=sum/list.size();
            System.out.println(result);
            System.out.println();
        }
}
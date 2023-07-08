package Homework4;
import java.util.*;
public class Homework4 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {
task1();
    }

    public static void task1() {
        LinkedList<Integer>mylinkedList=new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            mylinkedList.add(random.nextInt(51));
        }
        System.out.println("Начальный список: " + mylinkedList+"\n");
    }
}

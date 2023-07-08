package Homework4;
import java.util.*;
public class Homework4 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        reverseList();
    }

    public static void reverseList() {
        LinkedList<Integer> myLinkedlist = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            myLinkedlist.add(random.nextInt(51));}
        System.out.println(myLinkedlist);
        Stack<Integer> stackInt = new Stack<>();
        stackInt.addAll(myLinkedlist);
        myLinkedlist.clear();
        while (!stackInt.empty())
            myLinkedlist.add(stackInt.pop());
        System.out.println(myLinkedlist);
    }
}
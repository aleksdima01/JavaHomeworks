package Homework6;

import java.util.HashSet;

public class Homework6 {
    public static void main(String[] args) {
        mySet();
    }

    public static void mySet() {
        HashSet<Cats> hashSet = new HashSet<>();
        hashSet.add(new Cats("Петрушка", 7));
        hashSet.add(new Cats("Петрушка", 7));
        hashSet.add(new Cats("Петрушка", 7));
        hashSet.add(new Cats("Черныш", 3));
        hashSet.add(new Cats("Косматый", 6));
        System.out.println("HashSet Cats:" + hashSet);
        System.out.println(new Cats("Перепел", 7).equals(new Cats("Перепел", 7)));
        System.out.println(new Cats("Забияка", 5).hashCode());
    }


}


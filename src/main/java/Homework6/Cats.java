package Homework6;

import java.util.Objects;

public class Cats {
    String name;
    Integer age;

    public Cats(String name, Integer age) {
        this.name = name;
        this.age=age;
    }

    @Override
    public String toString() {
        return  "{name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cats cats = (Cats) o;
        return Objects.equals(name, cats.name) && Objects.equals(age, cats.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
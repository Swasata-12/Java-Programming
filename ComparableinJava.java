// A class that wants to define a natural order for its instances must implement the Comparable interface and override the compareTo() method. The type parameter T should be the class itself (e.g., class MyClass implements Comparable<MyClass>). The compareTo(T o) method takes another object of the same type as an argument and returns an int value based on the comparison.This method defines the default way in which objects of that class will be sorted when using sorting utilities like Arrays.sort() or Collections.sort(), which rely on the Comparable interface for sorting.

import java.util.ArrayList;

class Person1 implements Comparable<Person1> {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Person1 o) {
        return this.age - o.age;
    }

}

public class ComparableinJava {
    public static void main(String[] args) {
        ArrayList<Person1> list = new ArrayList<>();
        list.add(new Person1("Swasata", 25));
        list.add(new Person1("Abhirup", 45));
        list.add(new Person1("Atanu", 10));
        System.out.println("Before sorting: " + list);
        list.sort(null);
        System.out.println("After sorting: " + list);
    }
}

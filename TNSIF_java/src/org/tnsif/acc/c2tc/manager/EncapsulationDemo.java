package org.tnsif.acc.c2tc.manager;

class Human {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {
        Human obj = new Human();

        obj.setAge(26);
        obj.setName("ABC");

        // Print the actual values
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
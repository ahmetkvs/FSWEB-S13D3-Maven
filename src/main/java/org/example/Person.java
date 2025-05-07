package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    String[] hobbies;
    boolean isMarried;
    double height;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age,
                  String[] hobbies, boolean isMarried, double height){
        this(firstName,lastName,age);
        this.hobbies = hobbies;
        this.isMarried = isMarried;
        this.height = height;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isTeen() {
        if(this.age <= 19 && this.age >= 13){
            return true;
        } else {
            return false;
        }
    }
}

package com.me;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

   Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

     public void setFirstName(String name) {
        this.firstName = name;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String name1) {
        this.lastName = name1;
    }
    public String getLastName() {
        return lastName;
    }

     public String getFullName() {
        return firstName +" " + lastName;
    }

    public void setAge(int a) {
        this.age = a;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen() {
        if (age <= 20 && age>= 10) {
            return true;
        } else {
            return false;
        }
    }

}

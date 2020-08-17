package com.me;
public class Test {

    public static void main(String[] args) {
        Person myObject = new Person("Mihran", "Mirza", 14);
        Person myObject1 = new Person("Abdul-Rehman", "Mirza", 12);
        Person myObject2 = new Person("Toufeeq","Mirza",40);

        System.out.println(myObject.getFullName()+ " " +myObject.getAge());
        System.out.println(myObject1.getFullName()+ " " +myObject1.getAge());
        System.out.println(myObject2.getFullName()+ " " +myObject2.getAge());

    }
}

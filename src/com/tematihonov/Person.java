package com.tematihonov;

public class Person {
    String fullname;
    String position;
    String email;
    String phone;
    double salary;
    int age;

    Person (String fullname, String position, String email, String phone, double salary, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getInfo(){
        return "ФИО: " + fullname + "\n" + "Должность: " + position + "\n" + "E-mail: " + email + "\n" + "Телефон: " + phone + "\n" + "Зарплата: " + salary + " руб." + "\n" + "Возраст: " + age + "\n";
    }
}

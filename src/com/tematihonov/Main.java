package com.tematihonov;

public class Main {

    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Тихонов Артем Геннадьевич", "Инженер", "temaTihonov@yandex.ru", "89997771234", 100000, 24);
        persArray[1] = new Person("Жуков Владимир Владимирович", "Директор", "JUK@rambler.ru", "88005553535", 525000, 45);
        persArray[2] = new Person("Базанов Дитрий Олегович", "Охранник", "chopzapyatminut@gmail.com", "89220008888", 25000.500, 50);
        persArray[3] = new Person("Губин Альберт Евстафьевич", "Бухгалтер", "chitaembysto@mail.ru", "88005002000", 75000.123, 32);
        persArray[4] = new Person("Собакин Сергей Вадимович", "Начальник склада НПМ", "hranimdolgo@yahoo.com", "89992229354", 45000, 28);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) System.out.println(persArray[i].getInfo());

        }
    }
}

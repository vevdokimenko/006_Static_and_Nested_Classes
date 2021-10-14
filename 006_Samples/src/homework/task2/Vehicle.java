package homework.task2;

/*
* Создать класс Vehicle с методом print.
* В классе Vehicle, создайте внутренний класс Wheel и Door,
* которые также должны содержать метод print.
* Создайте экземпляры классов Wheel и Door.
* */

public class Vehicle {
    void print() {}

    class Wheel {
        void print() {}
    }

    class Door {
        void print() {}
    }

    public static void main(String[] args) {
        Wheel wheel = new Vehicle().new Wheel();
        Door door = new Vehicle().new Door();
    }
}

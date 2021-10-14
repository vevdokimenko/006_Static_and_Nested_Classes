package homework.task3;

/*
* Создать класс Distance с полем distance типа double и методом print.
* В классе Distance, создайте статический класс Converter с методами,
* которые будут конвертировать расстояние в разные единицы измерения
* (к примеру, из метров в километры, из километров в мили, и так далее).
* */

public class Distance {
    static double distance;
    void print() {}

    public Distance() {
        Distance.distance = 1000.0;
    }

    public Distance(double distance) {
        Distance.distance = distance;
    }

    static class Converter {
        /** Returns a distance in kilometers (double) */
        double metersToKilometers() {
            return distance / 1000.0;
        }

        /** Returns a distance in meters (double) */
        double kilometersToMeters() {
            return distance * 1000.0;
        }

        /** Returns a distance in miles (double) */
        double kilometersToMiles() {
            return distance / 1.609;
        }

        /** Returns a distance in kilometers (double) */
        double milesToKilometers() {
            return distance * 1.609;
        }
    }

    public static void main(String[] args) {
        Distance distance = new Distance(10);
        Converter converter = new Converter();

        System.out.println(converter.metersToKilometers());
        System.out.println(converter.kilometersToMeters());
        System.out.println(converter.kilometersToMiles());
        System.out.println(converter.milesToKilometers());
    }
}

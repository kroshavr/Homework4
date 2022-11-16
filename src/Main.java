public class Main {
    public static void main(String[] args) {
        // Задание 1
        int age = 7;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Вам еще нет 18 лет!");
        }
        //Задание 2
        int age2 = 19;
        if (age2 >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age2 >= 18) {
            System.out.println("Человек учится в университете");
        }
        if (age2 >= 24) {
            System.out.println("Человек работает");
        }
        //Задание 3
        int people = 101;
        int capacity = 102;
        int seatPlace = 60;
        int standingPlace = capacity - seatPlace;
        if (people < 60) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        }
        if (people < 102) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (people >=102) {
            System.out.println("В вагоне нет мест");
        }
    }
}
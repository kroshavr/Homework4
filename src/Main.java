public class Main {
    public static void main(String[] args) {
        // Задание 1
        int age = 7;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Вам еще нет 18 лет!");
        }
        //Задание 2
        int age2 = 26;
        if (age2 >= 7 && age2 < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        else if (age2 >=18 && age2 < 24) {
            System.out.println("Человек учится в университете");
        }
        else {
            System.out.println("Человек работает");
        }

        //Задание 3
        int people = 105;
        if (people < 60) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        }
        else if (people >= 60 && people < 102) {
            System.out.println("В вагоне есть стоячие места");
        }
        else {
            System.out.println("В вагоне нет мест");
        }
    }
}
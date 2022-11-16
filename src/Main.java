public class Main {
    public static void main(String[] args) {
        // Задание 4
        int age = 7;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Вам еще нет 18 лет!");
        }
        //Задание 5
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

        //Задание 6
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
        //Задание 7
        int age3 = 24;
        if (age3 >= 2 && age3 <=6) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в детский сад");
        }
        else if (age3 >= 7 && age3 <= 18) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в школу");
        }
        else if (age3 > 18 && age3 < 24) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в университет");
        }
        else {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить на работу");
        }
        //Задание 8
        int age4 = 18;
        if (age4 <= 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        }
        else if (age4 > 5 && age4 < 14) {
            System.out.println("Ребенок может кататься на аттракционе только в сопровождении взрослого");
        }
        else {
            System.out.println("Ребенок может кататься на аттракционе без сопровождения взрослого");
        }
        //Задание 9 наибольшее число
        int one = 1;
        int two = 2;
        int free = 3;
        if (one > two && one > free) {
            System.out.println(one);
        }
        else if (two > one && two > free) {
            System.out.println(two);
        }
        else {
            System.out.println(free);
        }

    }
}
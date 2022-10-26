import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {

        //Домашнее задание - 3
        //Задание 1
        Scanner scanAge = new Scanner(System.in);
        System.out.print("Введите возраст человека: ");
        int age = scanAge.nextInt();


        if(2 <= age && age <= 6){
            System.out.println("Если возраст человека равен " + age + " то нужно пойти в детский сад");
        } else if (7 <= age && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " то нужно пойти в школу");
        } else if (18 <= age && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то пора в университет");
        } else if (24 <= age && age <= 64){
            System.out.println("Если возраст человека равен " + age + " то пора идти на работу");
        } else if (age >= 65) {
            System.out.println("Если возраст человека равен " + age + " то пора на пенсию!");
        }

        //Теперь покатаемся на аттракционах
        //Задание 2
        Scanner scanAgeChild = new Scanner(System.in);
        System.out.print("\nВведите возраст Вашего ребёнка: ");
        int ageChild = Math.abs(scanAgeChild.nextInt());
        System.out.println("Возраст ребёнка: " + ageChild + " лет.");

        if (ageChild >= 0 && ageChild <= 5){
            System.out.println("Ваш ребёнок не может кататься на аттракционе\n");
        } else if (ageChild > 5 && ageChild <= 14) {
            System.out.println("Можно кататься, только в сопровождении взрослого\n");
        } else {
            System.out.println("Можно кататься без сопровождения взрослого\n");
        }

        //Теперь ищем самое большое чило!
        //Задание 3
        Scanner num = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int one = num.nextInt();
        System.out.print("Введите второе число: ");
        int two = num.nextInt();
        System.out.print("Введите третье число: ");
        int three = num.nextInt();

        if(two > one && two > three){
            System.out.println("Число " + two + " больше всех");
        } else if (one > two && one > three){
            System.out.println("Число " + one + " больше всех");
        } else {
            System.out.println("Число " + three + " больше всех");
        }

    }
}

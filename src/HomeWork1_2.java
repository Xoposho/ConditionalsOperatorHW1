import java.util.Scanner;

public class HomeWork1_2 {
    public static void main(String[] args) {

        //Домашнее задание - 1, 2
        Scanner scanMyAge = new Scanner(System.in);
        //Задание 1
        System.out.print("Введите Ваш возраст: ");
        int age = scanMyAge.nextInt();
        System.out.println(age >= 18 ? "Поздравляем. Вы совершеннолетний!\n" : "Вам нет 18. Нужно немного подождать. :(\n");

        Scanner scanChildAge = new Scanner(System.in);
        //Задание 2
        System.out.print("Введите возраст ребёнка: ");
        int childrenAge = scanChildAge.nextInt();

            if (childrenAge >= 7 && childrenAge < 18){
                System.out.println("Ребёнок уже ходит в школу!\n");
            } else if (childrenAge >= 18 && childrenAge < 24){
                System.out.println("Закончил в школу - можно и в университет!\n");
            } else if (childrenAge >= 24) {
                System.out.println("Пора на работу!\n");
            }
            else {
                System.out.println("Нужно немного подрасти\n");
            }



        Scanner scanTrainPlace = new Scanner(System.in);
        //Задание 3
        System.out.print("Введите количество занятых мест: ");
        int trainPlace = scanTrainPlace.nextInt();

            if (trainPlace >= 60 && trainPlace <= 102){
                System.out.println("Есть только " + (102 - trainPlace) + " сидячих мест.");
            } else if (trainPlace <= 60 && trainPlace >= 0) {
                System.out.println("Есть " + (60 - trainPlace) + " стоячих и " + (102 - 60) + " сидячих места.");
            } else if (trainPlace > 102) {
                System.out.println("Мест больше нет");
            }
    }
}
package src;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Задача 1: Вывести последнюю цифру числа.
        System.out.println("Введите число");
        int num = scanner.nextInt();
        System.out.println("Последняя цифра вашего числа " + num%10);

        //Задача 2: Найти сумму цифр ab + cd числа abcd.
        System.out.println("Введите четырехзначное число");
        int abcd = scanner.nextInt();
        System.out.println("Сумма цифр ab + cd равна: " + (abcd%100 + abcd/100));

        //Задача 3: Вывести 3юю цифру 5ти-значного числа.
        System.out.println("Введите 5-ти значное число");
        int num3 = scanner.nextInt();
        System.out.println("3-я цифра числа: " + (num3/100)%10);

        //Задача 4: Вывести длину отрезка, проходящей через две точки.
        int a = 3, b = 10;
        System.out.println("Длина отрезка ab: " + (b-a));

    }
}
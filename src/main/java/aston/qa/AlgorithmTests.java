package aston.qa;

import java.util.*;

public class AlgorithmTests {

    public static void task1() {
        System.out.println("Введите число от 1 до 10");
        Scanner scan = new Scanner(System.in);
        int numberInput = scan.nextInt();
        if (numberInput > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Пока");
        }}

    public static void task2() {
        System.out.println("Введите имя, допустим, Вячеслав");
        Scanner scan = new Scanner(System.in);
        String nameInput = scan.nextLine();
        if (nameInput.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }}

    public static void task3() {
        int[] numbers = {1,99,100,33,56,3};

        for (int a: numbers)
            if (a % 3 ==0)
            {System.out.println(a);}}


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
}

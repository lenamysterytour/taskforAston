package aston.qa;

import java.util.*;

public class AlgorithmTests {

    public static void task1() {

        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Введите число от 1 до 10");
            int numberInput = scan.nextInt();
            if (numberInput > 7) {
                System.out.println("Привет");
            } else {
                System.out.println("Пока");
            }
        } catch (InputMismatchException e) {
            System.err.println("Ошибка ввода, введите число цифрами2");
        }
    }

    public static void task2() {


        System.out.println("Введите имя, допустим, Вячеслав");
        Scanner scan1 = new Scanner(System.in);
        String nameInput = scan1.nextLine();
        if (nameInput.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public static void task3() {
        int[] numbers = {1, 99, 100, 33, 56, 3};

        for (int a : numbers)
            if (a % 3 == 0) {
                System.out.println(a);
            }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
}







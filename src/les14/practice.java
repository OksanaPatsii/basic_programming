package les14;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
          /* 1
        Запросить у пользователя два целых числа
        Вывести на консоль сумму этих чисел
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie erste Zahl");
        int x = scanner.nextInt();

        System.out.println("Geben Sie zweite Zahl");
        int y = scanner.nextInt();

        int sum = x + y;

//        scanner.close();

        System.out.println("Die Summe dieser Zahlen ist " + sum);

         /* 2
        Запросить у пользователя его имя и возраст
        Вывести на консоль информацию о пользователе
         */



        System.out.println("Bitte geben Sie Ihren Namen an");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println("Bitte geben Sie Ihr Alter an");
        int age = scanner.nextInt();

       // scanner.close();
        System.out.println("Ihr Name ist " + name);
        System.out.println("Sie sind " + age + " Jahre alt");


        /*   3
        Запросите у пользователя:
        - название товара
        - цену
        - количество (вес)

        Напечатать на консоли название товара и его стоимость (цена * количество (вес))

        Что делаем:
        - подключаем Scanner
        - печатаем приглашение ввести название товара
        - используем метод сканера nextLine() для ввода текста с клавиатуры
        и сохраняем введенную информацию в переменной типа String

        - печатаем приглашение ввести цену товара
        - используем метод сканера nextDouble() для ввода цены с клавиатуры
        и сохраняем введенную информацию в переменной типа double

        - печатаем приглашение ввести количество (вес) товара
        - используем метод сканера nextDouble() для ввода веса с клавиатуры
        и сохраняем введенную информацию в переменной типа double

        - вычисляем итоговую стоимость товара

        - печатаем название и стоимость

         */

        System.out.println("Geben Sie den Produktnamen an");
        scanner.nextLine();
        String productName = scanner.nextLine();

        System.out.println("Geben Sie den Preis des Produkts ein");
        double price = scanner.nextDouble();

        System.out.println("Geben Sie Menge (Gewicht) ein");
        double weight = scanner.nextDouble();

        double productCost = price * weight;

        System.out.println("Produkt " + productName + " kostet " + productCost);

        scanner.close();

    }

}

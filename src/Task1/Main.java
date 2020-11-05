package Task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyCollection collection = new MyCollection();
        Scanner sc = new Scanner(System.in);

        int x;
        int command;
        System.out.println("1 - добавление\n" +
                "2 - удаление\n" +
                "3 - поиск элемента по значению\n" +
                "4 - поиск элемента по индексу\n" +
                "5 - поиск максимального элемента\n" +
                "6 - поиск минимального элемента\n" +
                "7 - поиск среднего арифметического всех элементов");
        while (true) {
            command = sc.nextInt();
            switch (command) {
                case 1:
                    x = sc.nextInt();
                    collection.Add(x);
                    break;
                case 2:
                    x = sc.nextInt();
                    collection.Remove(x);
                    break;
                case 3:
                    x = sc.nextInt();
                    collection.valueSearch(x);
                    break;
                case 4:
                    x = sc.nextInt();
                    System.out.println(collection.indexSearch(x));
                    break;
                case 5:
                    x = 0;
                    System.out.println(collection.maximum(x));
                    break;
                case 6:
                    x = 0;
                    System.out.println(collection.minimum(x));
                    break;
                case 7:
                    System.out.println(collection.Average());
                    break;
                default:
                    System.out.println("There is no such command");
                    break;
            }
        }
    }
}


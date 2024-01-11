import java.util.Scanner;

public class Calculator {
    public static void calculate() {
        System.out.println("На сколько человек необходимо разделить счет?");
        Scanner sc = new Scanner(System.in);
        int person = getPerson();
        String list = "";
        String product;
        double price;
        double sum = 0.0;
        String finish;
        while (true) {
            System.out.println("Введите продукт");
            product = sc.nextLine();
            while (true) {
                System.out.println("Введите цену продукта");
                if (sc.hasNextDouble()) {
                    price = sc.nextDouble();
                    if (price < 0)
                        System.out.println("Некорректные данные");
                    if (price >= 0)
                        break;
                } else {
                    System.out.println("Неверный ввод, введите цифры");
                    sc.next();
                }
            }
            sc.nextLine();
            list = list + "\n" + product;
            sum = sum + price;
            System.out.println("Товар успешно добавлен!");
            System.out.println("Хотите ли добавить еще товар?");
            finish = sc.nextLine();
            if (finish.equalsIgnoreCase("завершить")) {
                break;
            }
        }
        System.out.println("Добавленные товары:" + list);
        sum = sum / person;
        String form = Formatter.rubl(sum);
        System.out.println(String.format("%.2f", sum) + " " + form);
    }

    public static int getPerson() {
        int person;
        while (true) {
            Scanner sc = new Scanner(System.in);
            person = sc.nextInt();
            sc.nextLine();
            if (person == 1) {
                System.out.println("Нет смысла ничего считать и делить\nНа сколько человек необходимо разделить счет?");
            }
            if (person < 1) {
                System.out.println("некорректное значение для подсчёта\nНа сколько человек необходимо разделить счет?");
            }
            if (person > 1)
                break;
        }
        return person;
    }
}


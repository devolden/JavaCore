package tasks.taskImpl;

import java.util.Scanner;

/**
 * 8. На спектакль в кассу театра было выделено определенное
 * количество билетов, и продажа осуществлялась до тех пор, пока не
 * были проданы все билеты.
 * Напишите класс, который сначала принимает с клавиатуры
 * количество билетов, переданных в кассу. Затем класс принимает с
 * клавиатуры серию чисел, каждое из которых указывает на число
 * билетов, которое желает приобрести покупатель.
 * Если нет возможности продать очередному покупателю требуемое
 * им число билетов, принимается заказ от следующего покупателя.
 * Класс должен вывести в консоль:
 * ● Какое число покупателей приобрели билеты
 * ● Какому числу покупателей было отказано в продаже билетов
 */
public class TaskN8 {
    public void task() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество билетов:");
        int quantityTicket = scanner.nextInt();
        int countCustomers = 0;
        int countRefusals = 0;
        while (quantityTicket >= 0) {
            System.out.print("Сколько билетов желает приобрести:");
            int ticket = scanner.nextInt();
            System.out.print("Кассир: ");
            String yesOrNo = new Scanner(System.in).nextLine();
            if (yesOrNo.equalsIgnoreCase("no")) {
                countRefusals++;
                System.out.println("Sorry Мы не можем вам дать билеты!!");
            } else {
                System.out.println("Ваши билеты: " + ticket);
                quantityTicket = quantityTicket - ticket;
                countCustomers++;
                System.out.println("Следуюшие !!");
            }
        }
        System.out.println("Sorry, Билеты закончились!!");
        System.out.println("Число покупателей который приобрели билеты: " + countCustomers);
        System.out.println("Число покупателей было отказано в продаже билетов: " + countRefusals);

    }
}

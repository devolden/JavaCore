package tasks.taskImpl;
/***
 * 5. Напишите класс, который принимает с клавиатуры целое число
 *      любой длины и выводит на экран:
 *     ● в первой строке - все четные цифры этого числа, через пробел
 *     ● во второй строке - все нечетные цифры этого числа, через
 *     пробел
 *     Например, для числа 765873 в первой строке будет выведены числа
 *     6 8, а во второй строке 7 5 7 3
 *     - Нельзя использовать массив
 */

import java.util.Scanner;

public class TaskN5 {
    public void task() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        String evenDigits = "";
        String oddDigits = "";

        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenDigits = digit + " " + evenDigits;
            } else {
                oddDigits = digit + " " + oddDigits;
            }
            number /= 10;
        }

        System.out.println("Четные цифры: " + evenDigits.trim());
        System.out.println("Нечетные цифры: " + oddDigits.trim());
    }
}

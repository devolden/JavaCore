package tasks.taskImpl;

import java.util.Scanner;

/***
 * 6. Напишите класс, который принимает с клавиатуры целое
 *     положительное число любой длины, а затем выводит его первую
 *     цифру.
 *     Например, для числа 7659 на экран будет выведено 7.
 */

public class TaskN6 {
    public void task(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        String string = Integer.toString(number);
        System.out.println("Первая цифра: " + string.charAt(0));

    }
}

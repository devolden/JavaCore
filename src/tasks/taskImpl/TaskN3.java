package tasks.taskImpl;

import java.util.Scanner;

/**
 * 3. Напишите класс, который принимает с консоли для переменной X
 * целое положительное число, а затем дополнительно будет
 * спрашивать ещё числа, эти числа будут должны вычитаться из
 * переменной x, вы будете вводить числа до тех пор пока X не будет
 * отрицательным или равен 0.
 * - используйте while loop
 */
public class TaskN3 {
    public void task() {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        while (true) {
            int scanNum = scanner.nextInt();
            if (scanNum <= 0) {
                break;
            }
            x += scanNum;
        }
        System.out.println(x);
    }
}

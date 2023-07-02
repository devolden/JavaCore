package tasks.taskImpl;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 11. Напишите класс, который заполняет случайными двузначными
 * числами массив, размер которого вводится с клавиатуры.
 * После заполнения класс должен вывести на экран значения
 * массива следующим образом:
 * ● в первой строке – четные значения, содержащиеся в массиве
 * ● во второй строке – нечетные значения, содержащиеся в
 * массиве
 */
public class TaskN11 {
    public void task() {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            int i1 = random.nextInt(10, 99);
            array[i] = i1;
        }
        System.out.println(Arrays.toString(array));
        System.out.print("Нечетные числы:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(" " + array[i]);
            }
        }
        System.out.print("\nЧетные числы:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(" " + array[i]);
            }
        }
    }

}

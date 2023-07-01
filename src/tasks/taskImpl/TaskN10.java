package tasks.taskImpl;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 10. Напишите класс, который заполняет случайными двузначными
 *         числами массив, размер которого вводится с клавиатуры.
 *     После заполнения класс должен вывести на экран значения
 *     массива следующим образом:
 *         ● в первой строке - первую половину массива
 *         ● во второй строке - вторую половину массива
 */

public class TaskN10 {
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
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array.length/2==i){
                System.out.println();
            }
            System.out.print(","+array[i]);
        }

    }

}

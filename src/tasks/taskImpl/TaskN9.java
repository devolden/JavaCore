package tasks.taskImpl;

import java.util.Random;
import java.util.Scanner;

/**
 * 9. Напишите класс, который заполняет случайными
 * четырехзначными числами массив, размер которого вводится с
 * клавиатуры.
 * После заполнения класс должен вывести на экран значения
 * массива в одной строке, начиная с конца массива ( с последнего
 * индекса).
 */
public class TaskN9 {
    public void task() {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            int i1 = random.nextInt(1000, 9999);
            array[i] = i1;
            System.out.print(" " + i1);
        }
        System.out.println("\n____________________________________________");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }
    }
}

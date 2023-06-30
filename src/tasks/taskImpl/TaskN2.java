package tasks.taskImpl;

import tasks.Tasks;

import java.util.Random;

/**
 * 2. Напишите класс, который генерирует 20 рандомных целых чисел
 * из диапазона -50 до +50, и определяет наименьшее число и
 * наибольшее число.
 * - Нельзя использовать массив
 */
public class TaskN2 implements Tasks {
    public void task() {
        int minNum = 0;
        int maxNum = 0;
        for (int i = 0; i < 20; i++) {
            int ranNum = new Random().nextInt(-50, 50);
            System.out.print(ranNum+" ");
            if (ranNum > maxNum) {
                maxNum = ranNum;
            } else if (ranNum < minNum) {
                minNum = ranNum;
            }
        }
        System.out.println("\nminNum = " + minNum);
        System.out.println("maxNum = " + maxNum);
    }

}
